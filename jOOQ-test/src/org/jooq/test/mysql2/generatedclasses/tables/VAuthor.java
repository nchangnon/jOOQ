/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
public class VAuthor extends org.jooq.impl.TableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.VAuthorRecord> {

	private static final long serialVersionUID = -1025704033;

	/**
	 * The singleton instance of test2.v_author
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.VAuthor V_AUTHOR = new org.jooq.test.mysql2.generatedclasses.tables.VAuthor();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.VAuthorRecord> __RECORD_TYPE = org.jooq.test.mysql2.generatedclasses.tables.records.VAuthorRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.VAuthorRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * The author ID
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The author's first name
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VAuthorRecord, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The author's last name
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VAuthorRecord, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The author's date of birth
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The author's year of birth
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The author's address
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VAuthorRecord, java.lang.String> ADDRESS = createField("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR, this);

	public VAuthor() {
		super("v_author", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);
	}

	public VAuthor(java.lang.String alias) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.test.mysql2.generatedclasses.tables.VAuthor.V_AUTHOR);
	}

	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.VAuthor as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.VAuthor(alias);
	}
}
