/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.procedures;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.StoredProcedureImpl;
import org.jooq.test.oracle.generatedclasses.Test;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class PAuthorExists extends StoredProcedureImpl {

	private static final long serialVersionUID = 1L;


	/**
	 * An uncommented item
	 */
	public static final Parameter<String> AUTHOR_NAME = new ParameterImpl<String>(SQLDialect.ORACLE, "AUTHOR_NAME", String.class);

	/**
	 * An uncommented item
	 */
	public static final Parameter<BigDecimal> RESULT = new ParameterImpl<BigDecimal>(SQLDialect.ORACLE, "RESULT", BigDecimal.class);

	/**
	 * No further instances allowed
	 */
	public PAuthorExists() {
		super(SQLDialect.ORACLE, "P_AUTHOR_EXISTS", Test.TEST);

		addInParameter(AUTHOR_NAME);
		addOutParameter(RESULT);
	}

	public void setAuthorName(String value) {
		setValue(AUTHOR_NAME, value);
	}

	public BigDecimal getResult() {
		return getValue(RESULT);
	}
}