/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.tables.records;


import java.sql.SQLException;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.oracle.generatedclasses.tables.XTestCase_85;
import org.jooq.test.oracle.generatedclasses.tables.XUnused;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XTestCase_85Record extends UpdatableRecordImpl<XTestCase_85Record> {

	private static final long serialVersionUID = -1471146866;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(XTestCase_85.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(XTestCase_85.ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.X_TEST_CASE_85.X_UNUSED_ID, TEST.X_TEST_CASE_85.X_UNUSED_NAME]
	 * REFERENCES X_UNUSED [TEST.X_UNUSED.ID, TEST.X_UNUSED.NAME]
	 * </pre></code>
	 */
	public void setXUnusedId(Integer value) {
		setValue(XTestCase_85.X_UNUSED_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.X_TEST_CASE_85.X_UNUSED_ID, TEST.X_TEST_CASE_85.X_UNUSED_NAME]
	 * REFERENCES X_UNUSED [TEST.X_UNUSED.ID, TEST.X_UNUSED.NAME]
	 * </pre></code>
	 */
	public Integer getXUnusedId() {
		return getValue(XTestCase_85.X_UNUSED_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.X_TEST_CASE_85.X_UNUSED_ID, TEST.X_TEST_CASE_85.X_UNUSED_NAME]
	 * REFERENCES X_UNUSED [TEST.X_UNUSED.ID, TEST.X_UNUSED.NAME]
	 * </pre></code>
	 */
	public XUnusedRecord getXUnused() throws SQLException {
		return create()
			.selectFrom(XUnused.X_UNUSED)
			.where(XUnused.ID.equal(getValue(XTestCase_85.X_UNUSED_ID)))
			.and(XUnused.NAME.equal(getValue(XTestCase_85.X_UNUSED_NAME)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.X_TEST_CASE_85.X_UNUSED_ID, TEST.X_TEST_CASE_85.X_UNUSED_NAME]
	 * REFERENCES X_UNUSED [TEST.X_UNUSED.ID, TEST.X_UNUSED.NAME]
	 * </pre></code>
	 */
	public void setXUnusedName(String value) {
		setValue(XTestCase_85.X_UNUSED_NAME, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [TEST.X_TEST_CASE_85.X_UNUSED_ID, TEST.X_TEST_CASE_85.X_UNUSED_NAME]
	 * REFERENCES X_UNUSED [TEST.X_UNUSED.ID, TEST.X_UNUSED.NAME]
	 * </pre></code>
	 */
	public String getXUnusedName() {
		return getValue(XTestCase_85.X_UNUSED_NAME);
	}

	public XTestCase_85Record(Configuration configuration) {
		super(configuration, XTestCase_85.X_TEST_CASE_85);
	}
}
