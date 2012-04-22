/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.cubrid.demodb.tables;

/**
 * This class is generated by jOOQ.
 */
public class Record extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.cubrid.demodb.tables.records.RecordRecord> {

	private static final long serialVersionUID = 1689962507;

	/**
	 * The singleton instance of PUBLIC.record
	 */
	public static final org.jooq.examples.cubrid.demodb.tables.Record RECORD = new org.jooq.examples.cubrid.demodb.tables.Record();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.cubrid.demodb.tables.records.RecordRecord> __RECORD_TYPE = org.jooq.examples.cubrid.demodb.tables.records.RecordRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.cubrid.demodb.tables.records.RecordRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.RecordRecord, java.lang.Integer> HOST_YEAR = createField("host_year", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.RecordRecord, java.lang.Integer> EVENT_CODE = createField("event_code", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.RecordRecord, java.lang.Integer> ATHLETE_CODE = createField("athlete_code", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.RecordRecord, java.lang.String> MEDAL = createField("medal", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.RecordRecord, java.lang.String> SCORE = createField("score", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.RecordRecord, java.lang.String> UNIT = createField("unit", org.jooq.impl.SQLDataType.VARCHAR, this);

	public Record() {
		super("record", org.jooq.examples.cubrid.demodb.Public.PUBLIC);
	}

	public Record(java.lang.String alias) {
		super(alias, org.jooq.examples.cubrid.demodb.Public.PUBLIC, org.jooq.examples.cubrid.demodb.tables.Record.RECORD);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.cubrid.demodb.tables.records.RecordRecord> getMainKey() {
		return org.jooq.examples.cubrid.demodb.Keys.RECORD__PK_RECORD_HOST_YEAR_EVENT_CODE_ATHLETE_CODE_MEDAL;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.cubrid.demodb.tables.records.RecordRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.cubrid.demodb.tables.records.RecordRecord>>asList(org.jooq.examples.cubrid.demodb.Keys.RECORD__PK_RECORD_HOST_YEAR_EVENT_CODE_ATHLETE_CODE_MEDAL);
	}

	@Override
	public org.jooq.examples.cubrid.demodb.tables.Record as(java.lang.String alias) {
		return new org.jooq.examples.cubrid.demodb.tables.Record(alias);
	}
}
