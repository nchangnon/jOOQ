/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_785", schema = "TEST")
public class T_785Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.T_785Record> {

	private static final long serialVersionUID = -887371594;

	/**
	 * The table column <code>TEST.T_785.ID</code>
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.T_785.T_785.ID, value);
	}

	/**
	 * The table column <code>TEST.T_785.ID</code>
	 */
	@javax.persistence.Column(name = "ID", precision = 7)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.T_785.T_785.ID);
	}

	/**
	 * The table column <code>TEST.T_785.NAME</code>
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.T_785.T_785.NAME, value);
	}

	/**
	 * The table column <code>TEST.T_785.NAME</code>
	 */
	@javax.persistence.Column(name = "NAME", length = 50)
	public java.lang.String getName() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.T_785.T_785.NAME);
	}

	/**
	 * The table column <code>TEST.T_785.VALUE</code>
	 */
	public void setValue(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.T_785.T_785.VALUE, value);
	}

	/**
	 * The table column <code>TEST.T_785.VALUE</code>
	 */
	@javax.persistence.Column(name = "VALUE", length = 50)
	public java.lang.String getValue() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.T_785.T_785.VALUE);
	}

	/**
	 * Create a detached T_785Record
	 */
	public T_785Record() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.T_785.T_785);
	}
}
