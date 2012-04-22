/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class TBookRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = -1296099813;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TBook.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TBook.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.cubrid.generatedclasses.tables.records.TBookToBookStoreRecord> fetchTBookToBookStoreList() {
		return create()
			.selectFrom(org.jooq.test.cubrid.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.cubrid.generatedclasses.tables.TBookToBookStore.BOOK_ID.equal(getValue(org.jooq.test.cubrid.generatedclasses.tables.TBook.ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_author_id
	 * FOREIGN KEY (author_id)
	 * REFERENCES DBA.t_author (id)
	 * </pre></code>
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TBook.AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_author_id
	 * FOREIGN KEY (author_id)
	 * REFERENCES DBA.t_author (id)
	 * </pre></code>
	 */
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TBook.AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_author_id
	 * FOREIGN KEY (author_id)
	 * REFERENCES DBA.t_author (id)
	 * </pre></code>
	 */
	public org.jooq.test.cubrid.generatedclasses.tables.records.TAuthorRecord fetchTAuthorByAuthorId() {
		return create()
			.selectFrom(org.jooq.test.cubrid.generatedclasses.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.cubrid.generatedclasses.tables.TAuthor.ID.equal(getValue(org.jooq.test.cubrid.generatedclasses.tables.TBook.AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_co_author_id
	 * FOREIGN KEY (co_author_id)
	 * REFERENCES DBA.t_author (id)
	 * </pre></code>
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TBook.CO_AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_co_author_id
	 * FOREIGN KEY (co_author_id)
	 * REFERENCES DBA.t_author (id)
	 * </pre></code>
	 */
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TBook.CO_AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_co_author_id
	 * FOREIGN KEY (co_author_id)
	 * REFERENCES DBA.t_author (id)
	 * </pre></code>
	 */
	public org.jooq.test.cubrid.generatedclasses.tables.records.TAuthorRecord fetchTAuthorByCoAuthorId() {
		return create()
			.selectFrom(org.jooq.test.cubrid.generatedclasses.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.cubrid.generatedclasses.tables.TAuthor.ID.equal(getValue(org.jooq.test.cubrid.generatedclasses.tables.TBook.CO_AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TBook.DETAILS_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TBook.DETAILS_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TBook.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TBook.TITLE);
	}

	/**
	 * An uncommented item
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TBook.PUBLISHED_IN, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TBook.PUBLISHED_IN);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_language_id
	 * FOREIGN KEY (language_id)
	 * REFERENCES DBA.t_language (id)
	 * </pre></code>
	 */
	public void setLanguageId(org.jooq.test.cubrid.generatedclasses.enums.TLanguage value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TBook.LANGUAGE_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book__fk_t_book_language_id
	 * FOREIGN KEY (language_id)
	 * REFERENCES DBA.t_language (id)
	 * </pre></code>
	 */
	public org.jooq.test.cubrid.generatedclasses.enums.TLanguage getLanguageId() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TBook.LANGUAGE_ID);
	}

	/**
	 * An uncommented item
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TBook.CONTENT_TEXT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TBook.CONTENT_TEXT);
	}

	/**
	 * An uncommented item
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TBook.CONTENT_PDF, value);
	}

	/**
	 * An uncommented item
	 */
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TBook.CONTENT_PDF);
	}

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(org.jooq.test.cubrid.generatedclasses.tables.TBook.T_BOOK);
	}
}
