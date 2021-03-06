/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TBooleans extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord> {

	private static final long serialVersionUID = 951599018;

	/**
	 * The singleton instance of DBA.t_booleans
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.TBooleans T_BOOLEANS = new org.jooq.test.sybase.generatedclasses.tables.TBooleans();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord> getRecordType() {
		return org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord.class;
	}

	/**
	 * The table column <code>DBA.t_booleans.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>DBA.t_booleans.one_zero</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_10> ONE_ZERO = createField("one_zero", org.jooq.impl.SQLDataType.INTEGER.asConvertedDataType(new org.jooq.test._.converters.Boolean_10_Converter()), this);

	/**
	 * The table column <code>DBA.t_booleans.true_false_lc</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_TF_LC> TRUE_FALSE_LC = createField("true_false_lc", org.jooq.impl.SQLDataType.VARCHAR.asConvertedDataType(new org.jooq.test._.converters.Boolean_TF_LC_Converter()), this);

	/**
	 * The table column <code>DBA.t_booleans.true_false_uc</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_TF_UC> TRUE_FALSE_UC = createField("true_false_uc", org.jooq.impl.SQLDataType.VARCHAR.asConvertedDataType(new org.jooq.test._.converters.Boolean_TF_UC_Converter()), this);

	/**
	 * The table column <code>DBA.t_booleans.yes_no_lc</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_YES_NO_LC> YES_NO_LC = createField("yes_no_lc", org.jooq.impl.SQLDataType.VARCHAR.asConvertedDataType(new org.jooq.test._.converters.Boolean_YES_NO_LC_Converter()), this);

	/**
	 * The table column <code>DBA.t_booleans.yes_no_uc</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_YES_NO_UC> YES_NO_UC = createField("yes_no_uc", org.jooq.impl.SQLDataType.VARCHAR.asConvertedDataType(new org.jooq.test._.converters.Boolean_YES_NO_UC_Converter()), this);

	/**
	 * The table column <code>DBA.t_booleans.y_n_lc</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_YN_LC> Y_N_LC = createField("y_n_lc", org.jooq.impl.SQLDataType.CHAR.asConvertedDataType(new org.jooq.test._.converters.Boolean_YN_LC_Converter()), this);

	/**
	 * The table column <code>DBA.t_booleans.y_n_uc</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_YN_UC> Y_N_UC = createField("y_n_uc", org.jooq.impl.SQLDataType.CHAR.asConvertedDataType(new org.jooq.test._.converters.Boolean_YN_UC_Converter()), this);

	/**
	 * The table column <code>DBA.t_booleans.vc_boolean</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord, java.lang.Boolean> VC_BOOLEAN = createField("vc_boolean", org.jooq.impl.SQLDataType.BIT, this);

	/**
	 * The table column <code>DBA.t_booleans.c_boolean</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord, java.lang.Boolean> C_BOOLEAN = createField("c_boolean", org.jooq.impl.SQLDataType.BIT, this);

	/**
	 * The table column <code>DBA.t_booleans.n_boolean</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord, java.lang.Boolean> N_BOOLEAN = createField("n_boolean", org.jooq.impl.SQLDataType.BIT, this);

	public TBooleans() {
		super("t_booleans", org.jooq.test.sybase.generatedclasses.Dba.DBA);
	}

	public TBooleans(java.lang.String alias) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, org.jooq.test.sybase.generatedclasses.tables.TBooleans.T_BOOLEANS);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord> getMainKey() {
		return org.jooq.test.sybase.generatedclasses.Keys.T_BOOLEANS__PK_T_BOOLEANS;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TBooleansRecord>>asList(org.jooq.test.sybase.generatedclasses.Keys.T_BOOLEANS__PK_T_BOOLEANS);
	}

	@Override
	public org.jooq.test.sybase.generatedclasses.tables.TBooleans as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.TBooleans(alias);
	}
}
