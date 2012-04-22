/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
public class SalesByFilmCategory extends org.jooq.impl.TableImpl<org.jooq.examples.mysql.sakila.tables.records.SalesByFilmCategoryRecord> {

	private static final long serialVersionUID = 1034750250;

	/**
	 * The singleton instance of sakila.sales_by_film_category
	 */
	public static final org.jooq.examples.mysql.sakila.tables.SalesByFilmCategory SALES_BY_FILM_CATEGORY = new org.jooq.examples.mysql.sakila.tables.SalesByFilmCategory();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.SalesByFilmCategoryRecord> __RECORD_TYPE = org.jooq.examples.mysql.sakila.tables.records.SalesByFilmCategoryRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.SalesByFilmCategoryRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SalesByFilmCategoryRecord, java.lang.String> CATEGORY = createField("category", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SalesByFilmCategoryRecord, java.math.BigDecimal> TOTAL_SALES = createField("total_sales", org.jooq.impl.SQLDataType.DECIMAL, this);

	public SalesByFilmCategory() {
		super("sales_by_film_category", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	public SalesByFilmCategory(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.SalesByFilmCategory.SALES_BY_FILM_CATEGORY);
	}

	@Override
	public org.jooq.examples.mysql.sakila.tables.SalesByFilmCategory as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.SalesByFilmCategory(alias);
	}
}
