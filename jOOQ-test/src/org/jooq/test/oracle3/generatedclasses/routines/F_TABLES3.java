/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class F_TABLES3 extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_TABLE> {

	private static final long serialVersionUID = -213716511;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_TABLE> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_TABLE.class));

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_TABLE> IN_TABLE = createParameter("IN_TABLE", org.jooq.impl.SQLDataType.VARCHAR.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_TABLE.class));

	/**
	 * Create a new routine call instance
	 */
	public F_TABLES3() {
		super(org.jooq.SQLDialect.ORACLE, "F_TABLES3", org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.impl.SQLDataType.VARCHAR.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_TABLE.class));

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_TABLE);
	}

	/**
	 * Set the <code>IN_TABLE</code> parameter to the routine
	 */
	public void setIN_TABLE(org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_TABLE value) {
		setValue(IN_TABLE, value);
	}

	/**
	 * Set the <code>IN_TABLE</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setIN_TABLE(org.jooq.Field<org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_TABLE> field) {
		setField(IN_TABLE, field);
	}
}