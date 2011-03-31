/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.procedures;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.StoredProcedureImpl;
import org.jooq.test.hsqldb.generatedclasses.Public;
import org.jooq.util.hsqldb.HSQLDBDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class PArrays2 extends StoredProcedureImpl {

	private static final long serialVersionUID = 1465351573;


	/**
	 * An uncommented item
	 */
	public static final Parameter<Long[]> IN_ARRAY = new ParameterImpl<Long[]>(SQLDialect.HSQLDB, "IN_ARRAY", HSQLDBDataType.BIGINT.getArrayDataType());

	/**
	 * An uncommented item
	 */
	public static final Parameter<Long[]> OUT_ARRAY = new ParameterImpl<Long[]>(SQLDialect.HSQLDB, "OUT_ARRAY", HSQLDBDataType.BIGINT.getArrayDataType());

	/**
	 * No further instances allowed
	 */
	public PArrays2() {
		super(SQLDialect.HSQLDB, "P_ARRAYS2", Public.PUBLIC);

		addInParameter(IN_ARRAY);
		addOutParameter(OUT_ARRAY);
	}

	public void setInArray(Long[] value) {
		setValue(IN_ARRAY, value);
	}

	public Long[] getOutArray() {
		return getValue(OUT_ARRAY);
	}
}
