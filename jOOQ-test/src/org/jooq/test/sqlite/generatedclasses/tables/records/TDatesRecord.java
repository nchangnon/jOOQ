/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class TDatesRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sqlite.generatedclasses.tables.records.TDatesRecord> {

	private static final long serialVersionUID = 444581428;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setD(java.sql.Date value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.D, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Date getD() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.D);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (time) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setT(java.lang.Object value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.T, value);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (time) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public java.lang.Object getT() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.T);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (timestamp) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setTs(java.lang.Object value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.TS, value);
	}

	/**
	 * An uncommented item
	 * 
	 * The SQL type of this item (timestamp) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public java.lang.Object getTs() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.TS);
	}

	/**
	 * An uncommented item
	 */
	public void setDInt(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.D_INT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getDInt() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.D_INT);
	}

	/**
	 * An uncommented item
	 */
	public void setTsBigint(java.math.BigInteger value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.TS_BIGINT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.math.BigInteger getTsBigint() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.TS_BIGINT);
	}

	/**
	 * Create a detached TDatesRecord
	 */
	public TDatesRecord() {
		super(org.jooq.test.sqlite.generatedclasses.tables.TDates.T_DATES);
	}
}