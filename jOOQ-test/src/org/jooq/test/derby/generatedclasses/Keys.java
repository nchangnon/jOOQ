/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the TEST schema
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({"unchecked"})
public class Keys extends org.jooq.impl.AbstractKeys {

	// IDENTITY definitions
	public static final org.jooq.Identity<org.jooq.test.derby.generatedclasses.tables.records.TBookStoreRecord, java.lang.Integer> IDENTITY_T_BOOK_STORE = createIdentity(org.jooq.test.derby.generatedclasses.tables.TBookStore.T_BOOK_STORE, org.jooq.test.derby.generatedclasses.tables.TBookStore.ID);

	// UNIQUE and PRIMARY KEY definitions
	public static final org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.TAuthorRecord> PK_T_AUTHOR = createUniqueKey(org.jooq.test.derby.generatedclasses.tables.TAuthor.T_AUTHOR, org.jooq.test.derby.generatedclasses.tables.TAuthor.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.TBookRecord> PK_T_BOOK = createUniqueKey(org.jooq.test.derby.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.derby.generatedclasses.tables.TBook.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.TBookStoreRecord> UK_T_BOOK_STORE_NAME = createUniqueKey(org.jooq.test.derby.generatedclasses.tables.TBookStore.T_BOOK_STORE, org.jooq.test.derby.generatedclasses.tables.TBookStore.NAME);
	public static final org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.TBookToBookStoreRecord> PK_B2BS = createUniqueKey(org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME, org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.BOOK_ID);
	public static final org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.XUnusedRecord> PK_X_UNUSED = createUniqueKey(org.jooq.test.derby.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.derby.generatedclasses.tables.XUnused.ID, org.jooq.test.derby.generatedclasses.tables.XUnused.NAME);
	public static final org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.XUnusedRecord> UK_X_UNUSED_ID = createUniqueKey(org.jooq.test.derby.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.derby.generatedclasses.tables.XUnused.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_64_69Record> PK_X_TEST_CASE_64_69 = createUniqueKey(org.jooq.test.derby.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.derby.generatedclasses.tables.XTestCase_64_69.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_71Record> PK_X_TEST_CASE_71 = createUniqueKey(org.jooq.test.derby.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.derby.generatedclasses.tables.XTestCase_71.ID);
	public static final org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_85Record> PK_X_TEST_CASE_85 = createUniqueKey(org.jooq.test.derby.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.derby.generatedclasses.tables.XTestCase_85.ID);

	// FOREIGN KEY definitions
	public static final org.jooq.ForeignKey<org.jooq.test.derby.generatedclasses.tables.records.TBookRecord, org.jooq.test.derby.generatedclasses.tables.records.TAuthorRecord> FK_T_BOOK_AUTHOR_ID = createForeignKey(PK_T_AUTHOR, org.jooq.test.derby.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.derby.generatedclasses.tables.TBook.AUTHOR_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.derby.generatedclasses.tables.records.TBookRecord, org.jooq.test.derby.generatedclasses.tables.records.TAuthorRecord> FK_T_BOOK_CO_AUTHOR_ID = createForeignKey(PK_T_AUTHOR, org.jooq.test.derby.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.derby.generatedclasses.tables.TBook.CO_AUTHOR_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.derby.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.derby.generatedclasses.tables.records.TBookStoreRecord> FK_B2BS_BS_NAME = createForeignKey(UK_T_BOOK_STORE_NAME, org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME);
	public static final org.jooq.ForeignKey<org.jooq.test.derby.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.derby.generatedclasses.tables.records.TBookRecord> FK_B2BS_B_ID = createForeignKey(PK_T_BOOK, org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.derby.generatedclasses.tables.TBookToBookStore.BOOK_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.derby.generatedclasses.tables.records.XUnusedRecord, org.jooq.test.derby.generatedclasses.tables.records.XUnusedRecord> FK_X_UNUSED_SELF = createForeignKey(PK_X_UNUSED, org.jooq.test.derby.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.derby.generatedclasses.tables.XUnused.ID_REF, org.jooq.test.derby.generatedclasses.tables.XUnused.NAME_REF);
	public static final org.jooq.ForeignKey<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_64_69Record, org.jooq.test.derby.generatedclasses.tables.records.XUnusedRecord> FK_X_TEST_CASE_64_69 = createForeignKey(UK_X_UNUSED_ID, org.jooq.test.derby.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.derby.generatedclasses.tables.XTestCase_64_69.UNUSED_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_71Record, org.jooq.test.derby.generatedclasses.tables.records.XTestCase_64_69Record> FK_X_TEST_CASE_71 = createForeignKey(PK_X_TEST_CASE_64_69, org.jooq.test.derby.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.derby.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID);
	public static final org.jooq.ForeignKey<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_85Record, org.jooq.test.derby.generatedclasses.tables.records.XUnusedRecord> FK_X_TEST_CASE_85 = createForeignKey(PK_X_UNUSED, org.jooq.test.derby.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.derby.generatedclasses.tables.XTestCase_85.X_UNUSED_ID, org.jooq.test.derby.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME);

	/**
	 * No instances
	 */
	private Keys() {}
}