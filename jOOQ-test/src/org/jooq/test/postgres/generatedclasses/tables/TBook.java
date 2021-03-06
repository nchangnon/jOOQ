/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TBook extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = 2096870446;

	/**
	 * The singleton instance of public.t_book
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.TBook T_BOOK = new org.jooq.test.postgres.generatedclasses.tables.TBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord.class;
	}

	/**
	 * The table column <code>public.t_book.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>public.t_book.author_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT t_book__fk_t_book_author_id
	 * FOREIGN KEY (author_id)
	 * REFERENCES public.t_author (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord, java.lang.Integer> AUTHOR_ID = createField("author_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>public.t_book.co_author_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT t_book__fk_t_book_co_author_id
	 * FOREIGN KEY (co_author_id)
	 * REFERENCES public.t_author (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("co_author_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>public.t_book.details_id</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord, java.lang.Integer> DETAILS_ID = createField("details_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>public.t_book.title</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>public.t_book.published_in</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord, java.lang.Integer> PUBLISHED_IN = createField("published_in", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>public.t_book.language_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT t_book__fk_t_book_language_id
	 * FOREIGN KEY (language_id)
	 * REFERENCES public.t_language (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord, org.jooq.test.postgres.generatedclasses.enums.TLanguage> LANGUAGE_ID = createField("language_id", org.jooq.impl.SQLDataType.INTEGER.asMasterDataType(org.jooq.test.postgres.generatedclasses.enums.TLanguage.class), this);

	/**
	 * The table column <code>public.t_book.content_text</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord, java.lang.String> CONTENT_TEXT = createField("content_text", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The table column <code>public.t_book.content_pdf</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord, byte[]> CONTENT_PDF = createField("content_pdf", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * The table column <code>public.t_book.status</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord, org.jooq.test.postgres.generatedclasses.enums.UBookStatus> STATUS = createField("status", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(org.jooq.test.postgres.generatedclasses.enums.UBookStatus.class), this);

	public TBook() {
		super("t_book", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	public TBook(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord> getMainKey() {
		return org.jooq.test.postgres.generatedclasses.Keys.PK_T_BOOK;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord>>asList(org.jooq.test.postgres.generatedclasses.Keys.PK_T_BOOK);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord, ?>>asList(org.jooq.test.postgres.generatedclasses.Keys.T_BOOK__FK_T_BOOK_AUTHOR_ID, org.jooq.test.postgres.generatedclasses.Keys.T_BOOK__FK_T_BOOK_CO_AUTHOR_ID);
	}

	@Override
	public org.jooq.test.postgres.generatedclasses.tables.TBook as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.TBook(alias);
	}
}
