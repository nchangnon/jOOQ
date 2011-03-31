/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.hsqldb.generatedclasses.Public;
import org.jooq.test.hsqldb.generatedclasses.tables.records.TBookToBookStoreRecord;
import org.jooq.util.hsqldb.HSQLDBDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TBookToBookStore extends UpdatableTableImpl<TBookToBookStoreRecord> {

	private static final long serialVersionUID = -1133228236;

	/**
	 * The singleton instance of T_BOOK_TO_BOOK_STORE
	 */
	public static final TBookToBookStore T_BOOK_TO_BOOK_STORE = new TBookToBookStore();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TBookToBookStoreRecord> __RECORD_TYPE = TBookToBookStoreRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TBookToBookStoreRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME]
	 * REFERENCES T_BOOK_STORE [PUBLIC.T_BOOK_STORE.NAME]
	 * </pre></code>
	 */
	public static final TableField<TBookToBookStoreRecord, String> BOOK_STORE_NAME = new TableFieldImpl<TBookToBookStoreRecord, String>(SQLDialect.HSQLDB, "BOOK_STORE_NAME", HSQLDBDataType.CHARACTERVARYING, T_BOOK_TO_BOOK_STORE);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [PUBLIC.T_BOOK_TO_BOOK_STORE.BOOK_ID]
	 * REFERENCES T_BOOK [PUBLIC.T_BOOK.ID]
	 * </pre></code>
	 */
	public static final TableField<TBookToBookStoreRecord, Integer> BOOK_ID = new TableFieldImpl<TBookToBookStoreRecord, Integer>(SQLDialect.HSQLDB, "BOOK_ID", HSQLDBDataType.INTEGER, T_BOOK_TO_BOOK_STORE);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookToBookStoreRecord, Integer> STOCK = new TableFieldImpl<TBookToBookStoreRecord, Integer>(SQLDialect.HSQLDB, "STOCK", HSQLDBDataType.INTEGER, T_BOOK_TO_BOOK_STORE);

	/**
	 * No further instances allowed
	 */
	private TBookToBookStore() {
		super(SQLDialect.HSQLDB, "T_BOOK_TO_BOOK_STORE", Public.PUBLIC);
	}

	/*
	 * static initialiser
	 */
	static {
		T_BOOK_TO_BOOK_STORE.addToMainUniqueKey(BOOK_STORE_NAME);
		T_BOOK_TO_BOOK_STORE.addToMainUniqueKey(BOOK_ID);
	}
}