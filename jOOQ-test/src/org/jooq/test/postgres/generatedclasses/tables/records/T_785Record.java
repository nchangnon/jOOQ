/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_785", schema = "public")
public class T_785Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.T_785Record> {

	private static final long serialVersionUID = 1198635796;

	/**
	 * The table column <code>public.t_785.id</code>
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_785.T_785.ID, value);
	}

	/**
	 * The table column <code>public.t_785.id</code>
	 */
	@javax.persistence.Column(name = "id", precision = 32)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_785.T_785.ID);
	}

	/**
	 * The table column <code>public.t_785.name</code>
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_785.T_785.NAME, value);
	}

	/**
	 * The table column <code>public.t_785.name</code>
	 */
	@javax.persistence.Column(name = "name", length = 50)
	public java.lang.String getName() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_785.T_785.NAME);
	}

	/**
	 * The table column <code>public.t_785.value</code>
	 */
	public void setValue(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_785.T_785.VALUE, value);
	}

	/**
	 * The table column <code>public.t_785.value</code>
	 */
	@javax.persistence.Column(name = "value", length = 50)
	public java.lang.String getValue() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_785.T_785.VALUE);
	}

	/**
	 * Create a detached T_785Record
	 */
	public T_785Record() {
		super(org.jooq.test.postgres.generatedclasses.tables.T_785.T_785);
	}
}
