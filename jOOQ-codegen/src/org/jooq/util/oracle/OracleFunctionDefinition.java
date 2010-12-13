/**
 * Copyright (c) 2009, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name of the "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.jooq.util.oracle;

import static org.jooq.util.oracle.sys.tables.AllArguments.ALL_ARGUMENTS;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jooq.Result;
import org.jooq.util.AbstractFunctionDefinition;
import org.jooq.util.ColumnDefinition;
import org.jooq.util.Database;
import org.jooq.util.DefaultColumnDefinition;
import org.jooq.util.InOutDefinition;
import org.jooq.util.oracle.sys.tables.AllArguments;
import org.jooq.util.oracle.sys.tables.records.AllArgumentsRecord;

/**
 * @author Lukas Eder
 */
public class OracleFunctionDefinition extends AbstractFunctionDefinition {

    private ColumnDefinition       returnValue;
    private List<ColumnDefinition> inParameters;
    private final BigDecimal       objectId;

	public OracleFunctionDefinition(Database database, String name, String comment, BigDecimal objectId) {
		super(database, name, comment);
		
		this.objectId = objectId;
	}

	private void init() throws SQLException {
	    inParameters = new ArrayList<ColumnDefinition>();
	    
	    Result<AllArgumentsRecord> result = create().selectFrom(ALL_ARGUMENTS)
            .where(AllArguments.OWNER.equal(getSchemaName())
            .and(AllArguments.OBJECT_NAME.equal(getName()))
            .and(AllArguments.OBJECT_ID.equal(objectId)))
            .orderBy(AllArguments.POSITION.ascending()).fetch();
	    
	    for (AllArgumentsRecord record : result) {
	        String inOut = record.getInOut();
            String paramName = record.getArgumentName();
            String paramType = record.getDataType();
            int position = record.getPosition().intValue();
            
            String type = OracleDataType.valueOf(paramType).getType().getCanonicalName();
            ColumnDefinition column = new DefaultColumnDefinition(
                getDatabase(), getName(), paramName, position, type,
                null);
            
	        if (InOutDefinition.getFromString(inOut) == InOutDefinition.OUT) {
	            returnValue = column;
	        } else {
	            inParameters.add(column);
	        }
	    }
	}
	
	@Override
	public ColumnDefinition getReturnValue() throws SQLException {
	    if (returnValue == null) {
	        init();
	    }
	    
		return returnValue;
	}
    
    @Override
    public final List<ColumnDefinition> getInParameters() throws SQLException {
        if (inParameters == null) {
            init();
        }
        
        return inParameters;
    }
}