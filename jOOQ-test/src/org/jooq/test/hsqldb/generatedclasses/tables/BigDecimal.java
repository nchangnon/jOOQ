/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class BigDecimal extends org.jooq.impl.TableImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.BigDecimalRecord> {

	private static final long serialVersionUID = -1808587839;

	/**
	 * The singleton instance of BIG_DECIMAL
	 */
	public static final org.jooq.test.hsqldb.generatedclasses.tables.BigDecimal BIG_DECIMAL = new org.jooq.test.hsqldb.generatedclasses.tables.BigDecimal();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.BigDecimalRecord> __RECORD_TYPE = org.jooq.test.hsqldb.generatedclasses.tables.records.BigDecimalRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.BigDecimalRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.BigDecimalRecord, java.lang.Integer> ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.BigDecimalRecord, java.lang.Integer>("ID", org.jooq.impl.SQLDataType.INTEGER, BIG_DECIMAL);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.BigDecimalRecord, java.math.BigDecimal> OTHER = new org.jooq.impl.TableFieldImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.BigDecimalRecord, java.math.BigDecimal>("OTHER", org.jooq.impl.SQLDataType.DECIMAL, BIG_DECIMAL);

	/**
	 * No further instances allowed
	 */
	private BigDecimal() {
		super("BIG_DECIMAL", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);
	}
}