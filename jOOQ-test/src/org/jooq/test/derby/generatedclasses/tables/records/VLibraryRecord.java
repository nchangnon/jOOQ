/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class VLibraryRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.derby.generatedclasses.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = -479725794;

	/**
	 * An uncommented item
	 */
	public void setAuthor(java.lang.String value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.VLibrary.AUTHOR, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getAuthor() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.VLibrary.AUTHOR);
	}

	/**
	 * An uncommented item
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.derby.generatedclasses.tables.VLibrary.TITLE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.derby.generatedclasses.tables.VLibrary.TITLE);
	}

	/**
	 * Create a detached VLibraryRecord
	 */
	public VLibraryRecord() {
		super(org.jooq.test.derby.generatedclasses.tables.VLibrary.V_LIBRARY);
	}
}
