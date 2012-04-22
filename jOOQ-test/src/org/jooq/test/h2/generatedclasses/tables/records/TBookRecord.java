/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
public class TBookRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = -1133478228;

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TBook.ID, value);
	}

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TBook.ID);
	}

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.records.TBookToBookStoreRecord> fetchTBookToBookStoreList() {
		return create()
			.selectFrom(org.jooq.test.h2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.h2.generatedclasses.tables.TBookToBookStore.BOOK_ID.equal(getValue(org.jooq.test.h2.generatedclasses.tables.TBook.ID)))
			.fetch();
	}

	/**
	 * The author ID in entity 'author'
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_AUTHOR_ID
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES PUBLIC.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TBook.AUTHOR_ID, value);
	}

	/**
	 * The author ID in entity 'author'
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_AUTHOR_ID
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES PUBLIC.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TBook.AUTHOR_ID);
	}

	/**
	 * The author ID in entity 'author'
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_AUTHOR_ID
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES PUBLIC.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public org.jooq.test.h2.generatedclasses.tables.records.TAuthorRecord fetchTAuthorByAuthorId() {
		return create()
			.selectFrom(org.jooq.test.h2.generatedclasses.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.h2.generatedclasses.tables.TAuthor.ID.equal(getValue(org.jooq.test.h2.generatedclasses.tables.TBook.AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_CO_AUTHOR_ID
	 * FOREIGN KEY (CO_AUTHOR_ID)
	 * REFERENCES PUBLIC.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TBook.CO_AUTHOR_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_CO_AUTHOR_ID
	 * FOREIGN KEY (CO_AUTHOR_ID)
	 * REFERENCES PUBLIC.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TBook.CO_AUTHOR_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_CO_AUTHOR_ID
	 * FOREIGN KEY (CO_AUTHOR_ID)
	 * REFERENCES PUBLIC.T_AUTHOR (ID)
	 * </pre></code>
	 */
	public org.jooq.test.h2.generatedclasses.tables.records.TAuthorRecord fetchTAuthorByCoAuthorId() {
		return create()
			.selectFrom(org.jooq.test.h2.generatedclasses.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.h2.generatedclasses.tables.TAuthor.ID.equal(getValue(org.jooq.test.h2.generatedclasses.tables.TBook.CO_AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TBook.DETAILS_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TBook.DETAILS_ID);
	}

	/**
	 * The book's title
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TBook.TITLE, value);
	}

	/**
	 * The book's title
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TBook.TITLE);
	}

	/**
	 * The year the book was published in
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TBook.PUBLISHED_IN, value);
	}

	/**
	 * The year the book was published in
	 */
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TBook.PUBLISHED_IN);
	}

	/**
	 * The language of the book
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_LANGUAGE_ID
	 * FOREIGN KEY (LANGUAGE_ID)
	 * REFERENCES PUBLIC.T_LANGUAGE (ID)
	 * </pre></code>
	 */
	public void setLanguageId(org.jooq.test.h2.generatedclasses.enums.TLanguage value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TBook.LANGUAGE_ID, value);
	}

	/**
	 * The language of the book
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_T_BOOK_LANGUAGE_ID
	 * FOREIGN KEY (LANGUAGE_ID)
	 * REFERENCES PUBLIC.T_LANGUAGE (ID)
	 * </pre></code>
	 */
	public org.jooq.test.h2.generatedclasses.enums.TLanguage getLanguageId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TBook.LANGUAGE_ID);
	}

	/**
	 * Some textual content of the book
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TBook.CONTENT_TEXT, value);
	}

	/**
	 * Some textual content of the book
	 */
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TBook.CONTENT_TEXT);
	}

	/**
	 * Some binary content of the book
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.TBook.CONTENT_PDF, value);
	}

	/**
	 * Some binary content of the book
	 */
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.TBook.CONTENT_PDF);
	}

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(org.jooq.test.h2.generatedclasses.tables.TBook.T_BOOK);
	}
}
