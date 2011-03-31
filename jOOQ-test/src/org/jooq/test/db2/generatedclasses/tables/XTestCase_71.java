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
import org.jooq.test.db2.generatedclasses.tables.records.XTestCase_71Record;
import org.jooq.util.db2.DB2DataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XTestCase_71 extends UpdatableTableImpl<XTestCase_71Record> {

	private static final long serialVersionUID = -915376429;

	/**
	 * The singleton instance of X_TEST_CASE_71
	 */
	public static final XTestCase_71 X_TEST_CASE_71 = new XTestCase_71();

	/**
	 * The class holding records for this type
	 */
	private static final Class<XTestCase_71Record> __RECORD_TYPE = XTestCase_71Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<XTestCase_71Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<XTestCase_71Record, Integer> ID = new TableFieldImpl<XTestCase_71Record, Integer>(SQLDialect.DB2, "ID", DB2DataType.INTEGER, X_TEST_CASE_71);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [LUKAS.X_TEST_CASE_71.TEST_CASE_64_69_ID]
	 * REFERENCES X_TEST_CASE_64_69 [LUKAS.X_TEST_CASE_64_69.ID]
	 * </pre></code>
	 */
	public static final TableField<XTestCase_71Record, Short> TEST_CASE_64_69_ID = new TableFieldImpl<XTestCase_71Record, Short>(SQLDialect.DB2, "TEST_CASE_64_69_ID", DB2DataType.SMALLINT, X_TEST_CASE_71);

	/**
	 * No further instances allowed
	 */
	private XTestCase_71() {
		super(SQLDialect.DB2, "X_TEST_CASE_71", Lukas.LUKAS);
	}

	/*
	 * static initialiser
	 */
	static {
		X_TEST_CASE_71.addToMainUniqueKey(ID);
	}
}
