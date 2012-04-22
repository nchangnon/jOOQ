/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
public class FilmList extends org.jooq.impl.TableImpl<org.jooq.examples.mysql.sakila.tables.records.FilmListRecord> {

	private static final long serialVersionUID = -179046730;

	/**
	 * The singleton instance of sakila.film_list
	 */
	public static final org.jooq.examples.mysql.sakila.tables.FilmList FILM_LIST = new org.jooq.examples.mysql.sakila.tables.FilmList();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.FilmListRecord> __RECORD_TYPE = org.jooq.examples.mysql.sakila.tables.records.FilmListRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.FilmListRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmListRecord, java.lang.Short> FID = createField("FID", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmListRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmListRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmListRecord, java.lang.String> CATEGORY = createField("category", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmListRecord, java.math.BigDecimal> PRICE = createField("price", org.jooq.impl.SQLDataType.DECIMAL, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmListRecord, java.lang.Short> LENGTH = createField("length", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmListRecord, org.jooq.examples.mysql.sakila.enums.FilmListRating> RATING = createField("rating", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.examples.mysql.sakila.enums.FilmListRating.class), this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmListRecord, java.lang.String> ACTORS = createField("actors", org.jooq.impl.SQLDataType.VARCHAR, this);

	public FilmList() {
		super("film_list", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	public FilmList(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.FilmList.FILM_LIST);
	}

	@Override
	public org.jooq.examples.mysql.sakila.tables.FilmList as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.FilmList(alias);
	}
}
