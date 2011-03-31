/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;


import java.sql.SQLException;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.postgres.generatedclasses.tables.TBookStore;
import org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TBookStoreRecord extends UpdatableRecordImpl<TBookStoreRecord> {

	private static final long serialVersionUID = -813923801;

	/**
	 * An uncommented item
	 */
	public void setName(String value) {
		setValue(TBookStore.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getName() {
		return getValue(TBookStore.NAME);
	}

	/**
	 * An uncommented item
	 */
	public List<TBookToBookStoreRecord> getTBookToBookStoreList() throws SQLException {
		return create()
			.selectFrom(TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(TBookToBookStore.BOOK_STORE_NAME.equal(getValue(TBookStore.NAME)))
			.fetch()
			.getRecords();
	}

	public TBookStoreRecord(Configuration configuration) {
		super(configuration, TBookStore.T_BOOK_STORE);
	}
}
