/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.db2.generatedclasses.Lukas;
import org.jooq.test.db2.generatedclasses.tables.records.TBookToBookStoreRecord;
import org.jooq.util.db2.DB2DataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TBookToBookStore extends UpdatableTableImpl<TBookToBookStoreRecord> {

	private static final long serialVersionUID = -46426019;

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
	 * FOREIGN KEY [LUKAS.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME]
	 * REFERENCES T_BOOK_STORE [LUKAS.T_BOOK_STORE.NAME]
	 * </pre></code>
	 */
	public static final TableField<TBookToBookStoreRecord, String> BOOK_STORE_NAME = new TableFieldImpl<TBookToBookStoreRecord, String>(SQLDialect.DB2, "BOOK_STORE_NAME", DB2DataType.VARCHAR, T_BOOK_TO_BOOK_STORE);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.T_BOOK_TO_BOOK_STORE.BOOK_ID]
	 * REFERENCES T_BOOK [LUKAS.T_BOOK.ID]
	 * </pre></code>
	 */
	public static final TableField<TBookToBookStoreRecord, Integer> BOOK_ID = new TableFieldImpl<TBookToBookStoreRecord, Integer>(SQLDialect.DB2, "BOOK_ID", DB2DataType.INTEGER, T_BOOK_TO_BOOK_STORE);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookToBookStoreRecord, Integer> STOCK = new TableFieldImpl<TBookToBookStoreRecord, Integer>(SQLDialect.DB2, "STOCK", DB2DataType.INTEGER, T_BOOK_TO_BOOK_STORE);

	/**
	 * No further instances allowed
	 */
	private TBookToBookStore() {
		super(SQLDialect.DB2, "T_BOOK_TO_BOOK_STORE", Lukas.LUKAS);
	}

	/*
	 * static initialiser
	 */
	static {
		T_BOOK_TO_BOOK_STORE.addToMainUniqueKey(BOOK_STORE_NAME);
		T_BOOK_TO_BOOK_STORE.addToMainUniqueKey(BOOK_ID);
	}
}
