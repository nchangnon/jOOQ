/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class T_986_1Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sybase.generatedclasses.tables.records.T_986_1Record> {

	private static final long serialVersionUID = 380632509;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.t_986_1.REF]
	 * REFERENCES x_unused [dba.x_unused.ID]
	 * </pre></code>
	 */
	public void setRef(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.T_986_1.T_986_1.REF, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.t_986_1.REF]
	 * REFERENCES x_unused [dba.x_unused.ID]
	 * </pre></code>
	 */
	public java.lang.Integer getRef() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.T_986_1.T_986_1.REF);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [dba.t_986_1.REF]
	 * REFERENCES x_unused [dba.x_unused.ID]
	 * </pre></code>
	 */
	public org.jooq.test.sybase.generatedclasses.tables.records.XUnusedRecord fetchXUnused() {
		return create()
			.selectFrom(org.jooq.test.sybase.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.sybase.generatedclasses.tables.XUnused.X_UNUSED.ID.equal(getValue(org.jooq.test.sybase.generatedclasses.tables.T_986_1.T_986_1.REF)))
			.fetchOne();
	}

	/**
	 * Create a detached T_986_1Record
	 */
	public T_986_1Record() {
		super(org.jooq.test.sybase.generatedclasses.tables.T_986_1.T_986_1);
	}
}