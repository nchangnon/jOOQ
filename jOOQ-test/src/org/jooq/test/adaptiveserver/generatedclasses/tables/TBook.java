/**
 * This class is generated by jOOQ
 */
package org.jooq.test.adaptiveserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class TBook extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = -382448607;

	/**
	 * The singleton instance of t_book
	 */
	public static final org.jooq.test.adaptiveserver.generatedclasses.tables.TBook T_BOOK = new org.jooq.test.adaptiveserver.generatedclasses.tables.TBook();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord> __RECORD_TYPE = org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord, java.lang.Integer> ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord, java.lang.Integer>("id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord, java.lang.Integer> AUTHOR_ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord, java.lang.Integer>("author_id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord, java.lang.Integer> CO_AUTHOR_ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord, java.lang.Integer>("co_author_id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord, java.lang.Integer> DETAILS_ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord, java.lang.Integer>("details_id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord, java.lang.String> TITLE = new org.jooq.impl.TableFieldImpl<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord, java.lang.String>("title", org.jooq.impl.SQLDataType.VARCHAR, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord, java.lang.Integer> PUBLISHED_IN = new org.jooq.impl.TableFieldImpl<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord, java.lang.Integer>("published_in", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord, java.lang.Integer> LANGUAGE_ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord, java.lang.Integer>("language_id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord, java.lang.String> CONTENT_TEXT = new org.jooq.impl.TableFieldImpl<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord, java.lang.String>("content_text", org.jooq.impl.SQLDataType.CLOB, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord, byte[]> CONTENT_PDF = new org.jooq.impl.TableFieldImpl<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord, byte[]>("content_pdf", org.jooq.impl.SQLDataType.BINARY, T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("t_book", org.jooq.test.adaptiveserver.generatedclasses.Dbo.DBO);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord> getMainKey() {
		return org.jooq.test.adaptiveserver.generatedclasses.Keys.pk_t_book;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.adaptiveserver.generatedclasses.tables.records.TBookRecord>>asList(org.jooq.test.adaptiveserver.generatedclasses.Keys.pk_t_book);
	}
}