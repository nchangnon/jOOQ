/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_725LobTest extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.T_725LobTestRecord> {

	private static final long serialVersionUID = -498368558;

	/**
	 * The singleton instance of t_725_lob_test
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.T_725LobTest T_725_LOB_TEST = new org.jooq.test.mysql2.generatedclasses.tables.T_725LobTest();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.T_725LobTestRecord> __RECORD_TYPE = org.jooq.test.mysql2.generatedclasses.tables.records.T_725LobTestRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.T_725LobTestRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_725LobTestRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_725LobTestRecord, byte[]> LOB = createField("LOB", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * No further instances allowed
	 */
	private T_725LobTest() {
		super("t_725_lob_test", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);
	}

	/**
	 * No further instances allowed
	 */
	private T_725LobTest(java.lang.String alias) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.test.mysql2.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.T_725LobTestRecord> getMainKey() {
		return org.jooq.test.mysql2.generatedclasses.Keys.KEY_t_725_lob_test_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.T_725LobTestRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.T_725LobTestRecord>>asList(org.jooq.test.mysql2.generatedclasses.Keys.KEY_t_725_lob_test_PRIMARY);
	}

	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.T_725LobTest as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.T_725LobTest(alias);
	}
}