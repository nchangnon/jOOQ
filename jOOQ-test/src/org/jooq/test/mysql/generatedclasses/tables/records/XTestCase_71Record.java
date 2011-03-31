/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.records;


import java.sql.SQLException;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.mysql.generatedclasses.tables.XTestCase_64_69;
import org.jooq.test.mysql.generatedclasses.tables.XTestCase_71;


/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XTestCase_71Record extends UpdatableRecordImpl<XTestCase_71Record> {

	private static final long serialVersionUID = 1199487416;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(XTestCase_71.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(XTestCase_71.ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.x_test_case_71.TEST_CASE_64_69_ID]
	 * REFERENCES x_test_case_64_69 [test.x_test_case_64_69.ID]
	 * </pre></code>
	 */
	public void setTestCase_64_69Id(Integer value) {
		setValue(XTestCase_71.TEST_CASE_64_69_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.x_test_case_71.TEST_CASE_64_69_ID]
	 * REFERENCES x_test_case_64_69 [test.x_test_case_64_69.ID]
	 * </pre></code>
	 */
	public Integer getTestCase_64_69Id() {
		return getValue(XTestCase_71.TEST_CASE_64_69_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.x_test_case_71.TEST_CASE_64_69_ID]
	 * REFERENCES x_test_case_64_69 [test.x_test_case_64_69.ID]
	 * </pre></code>
	 */
	public XTestCase_64_69Record getXTestCase_64_69() throws SQLException {
		return create()
			.selectFrom(XTestCase_64_69.X_TEST_CASE_64_69)
			.where(XTestCase_64_69.ID.equal(getValue(XTestCase_71.TEST_CASE_64_69_ID)))
			.fetchOne();
	}

	public XTestCase_71Record(Configuration configuration) {
		super(configuration, XTestCase_71.X_TEST_CASE_71);
	}
}
