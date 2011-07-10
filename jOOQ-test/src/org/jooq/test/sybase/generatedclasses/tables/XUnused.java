/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class XUnused extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> {

	private static final long serialVersionUID = -760226025;

	/**
	 * The singleton instance of x_unused
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.XUnused X_UNUSED = new org.jooq.test.sybase.generatedclasses.tables.XUnused();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> __RECORD_TYPE = org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer>("ID", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.String> NAME = new org.jooq.impl.TableFieldImpl<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.String>("NAME", org.jooq.impl.SQLDataType.VARCHAR, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.math.BigDecimal> BIG_INTEGER = new org.jooq.impl.TableFieldImpl<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.math.BigDecimal>("BIG_INTEGER", org.jooq.impl.SQLDataType.DECIMAL, X_UNUSED);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.x_unused.ID_REF, dba.x_unused.NAME_REF]
	 * REFERENCES x_unused [dba.x_unused.ID, dba.x_unused.NAME]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> ID_REF = new org.jooq.impl.TableFieldImpl<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer>("ID_REF", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.x_unused.ID_REF, dba.x_unused.NAME_REF]
	 * REFERENCES x_unused [dba.x_unused.ID, dba.x_unused.NAME]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.String> NAME_REF = new org.jooq.impl.TableFieldImpl<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.String>("NAME_REF", org.jooq.impl.SQLDataType.VARCHAR, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> CLASS = new org.jooq.impl.TableFieldImpl<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer>("CLASS", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> FIELDS = new org.jooq.impl.TableFieldImpl<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer>("FIELDS", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> CONFIGURATION = new org.jooq.impl.TableFieldImpl<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer>("CONFIGURATION", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> U_D_T = new org.jooq.impl.TableFieldImpl<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer>("U_D_T", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> META_DATA = new org.jooq.impl.TableFieldImpl<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer>("META_DATA", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> TYPE0 = new org.jooq.impl.TableFieldImpl<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer>("TYPE0", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> PRIMARY_KEY = new org.jooq.impl.TableFieldImpl<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer>("PRIMARY_KEY", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> PRIMARYKEY = new org.jooq.impl.TableFieldImpl<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer>("PRIMARYKEY", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * No further instances allowed
	 */
	private XUnused() {
		super("x_unused", org.jooq.test.sybase.generatedclasses.Dba.DBA);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord> getMainKey() {
		return org.jooq.test.sybase.generatedclasses.Keys.x_unused_pk_x_unused;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord>>asList(org.jooq.test.sybase.generatedclasses.Keys.x_unused_pk_x_unused, org.jooq.test.sybase.generatedclasses.Keys.x_unused_uk_x_unused_id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord, ?>>asList(org.jooq.test.sybase.generatedclasses.Keys.x_unused_fk_x_unused_self);
	}
}