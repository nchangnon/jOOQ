/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle2.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class DateAsTimestampP_976 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -206106253;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> DATE_AS_TIMESTAMP_I = createParameter("I", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> DATE_AS_TIMESTAMP_O = createParameter("O", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * Create a new routine call instance
	 */
	public DateAsTimestampP_976() {
		super("P_976", org.jooq.test.oracle2.generatedclasses.DateAsTimestampTest.DATE_AS_TIMESTAMP_TEST);

		addInParameter(DATE_AS_TIMESTAMP_I);
		addOutParameter(DATE_AS_TIMESTAMP_O);
	}

	/**
	 * Set the <code>I</code> parameter to the routine
	 */
	public void setI(java.sql.Timestamp value) {
		setValue(DATE_AS_TIMESTAMP_I, value);
	}

	public java.sql.Timestamp getO() {
		return getValue(DATE_AS_TIMESTAMP_O);
	}
}
