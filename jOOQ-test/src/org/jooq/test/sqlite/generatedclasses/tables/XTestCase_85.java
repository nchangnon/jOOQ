/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record;
import org.jooq.util.sqlite.SQLiteDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XTestCase_85 extends UpdatableTableImpl<XTestCase_85Record> {

	private static final long serialVersionUID = 2131852718;

	/**
	 * The singleton instance of x_test_case_85
	 */
	public static final XTestCase_85 X_TEST_CASE_85 = new XTestCase_85();

	/**
	 * The class holding records for this type
	 */
	private static final Class<XTestCase_85Record> __RECORD_TYPE = XTestCase_85Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<XTestCase_85Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<XTestCase_85Record, Integer> ID = new TableFieldImpl<XTestCase_85Record, Integer>(SQLDialect.SQLITE, "id", SQLiteDataType.INT, X_TEST_CASE_85);

	/**
	 * An uncommented item
	 */
	public static final TableField<XTestCase_85Record, Integer> X_UNUSED_ID = new TableFieldImpl<XTestCase_85Record, Integer>(SQLDialect.SQLITE, "x_unused_id", SQLiteDataType.INT, X_TEST_CASE_85);

	/**
	 * An uncommented item
	 */
	public static final TableField<XTestCase_85Record, String> X_UNUSED_NAME = new TableFieldImpl<XTestCase_85Record, String>(SQLDialect.SQLITE, "x_unused_name", SQLiteDataType.VARCHAR, X_TEST_CASE_85);

	/**
	 * No further instances allowed
	 */
	private XTestCase_85() {
		super(SQLDialect.SQLITE, "x_test_case_85");
	}

	/*
	 * static initialiser
	 */
	static {
		X_TEST_CASE_85.addToMainUniqueKey(ID);
	}
}
