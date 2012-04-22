/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
public class FTables3 extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle.generatedclasses.test.udt.records.UStringTableRecord> {

	private static final long serialVersionUID = -556574856;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UStringTableRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UStringTableRecord.class));

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UStringTableRecord> IN_TABLE = createParameter("IN_TABLE", org.jooq.impl.SQLDataType.VARCHAR.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UStringTableRecord.class));

	/**
	 * Create a new routine call instance
	 */
	public FTables3() {
		super("F_TABLES3", org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.impl.SQLDataType.VARCHAR.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UStringTableRecord.class));

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_TABLE);
	}

	/**
	 * Set the <code>IN_TABLE</code> parameter to the routine
	 */
	public void setInTable(org.jooq.test.oracle.generatedclasses.test.udt.records.UStringTableRecord value) {
		setValue(IN_TABLE, value);
	}

	/**
	 * Set the <code>IN_TABLE</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setInTable(org.jooq.Field<org.jooq.test.oracle.generatedclasses.test.udt.records.UStringTableRecord> field) {
		setField(IN_TABLE, field);
	}
}
