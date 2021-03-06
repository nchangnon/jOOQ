/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.oracle.sys.packages.dbms_xplan;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class BuildPlanXml extends org.jooq.impl.AbstractRoutine<java.lang.Object> {

	private static final long serialVersionUID = 1835687262;


	/**
	 * The procedure parameter <code>SYS.DBMS_XPLAN.BUILD_PLAN_XML.RETURN_VALUE</code>
	 * <p>
	 * The SQL type of this item (UNDEFINED, XMLTYPE) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.util.oracle.OracleDataType.getDefaultDataType("UNDEFINED"));

	/**
	 * The procedure parameter <code>SYS.DBMS_XPLAN.BUILD_PLAN_XML.TABLE_NAME</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> TABLE_NAME = createParameter("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, true);

	/**
	 * The procedure parameter <code>SYS.DBMS_XPLAN.BUILD_PLAN_XML.STATEMENT_ID</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> STATEMENT_ID = createParameter("STATEMENT_ID", org.jooq.impl.SQLDataType.VARCHAR, true);

	/**
	 * The procedure parameter <code>SYS.DBMS_XPLAN.BUILD_PLAN_XML.PLAN_ID</code>
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> PLAN_ID = createParameter("PLAN_ID", org.jooq.impl.SQLDataType.NUMERIC, true);

	/**
	 * The procedure parameter <code>SYS.DBMS_XPLAN.BUILD_PLAN_XML.FORMAT</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> FORMAT = createParameter("FORMAT", org.jooq.impl.SQLDataType.VARCHAR, true);

	/**
	 * The procedure parameter <code>SYS.DBMS_XPLAN.BUILD_PLAN_XML.FILTER_PREDS</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> FILTER_PREDS = createParameter("FILTER_PREDS", org.jooq.impl.SQLDataType.VARCHAR, true);

	/**
	 * The procedure parameter <code>SYS.DBMS_XPLAN.BUILD_PLAN_XML.PLAN_TAG</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> PLAN_TAG = createParameter("PLAN_TAG", org.jooq.impl.SQLDataType.VARCHAR, true);

	/**
	 * The procedure parameter <code>SYS.DBMS_XPLAN.BUILD_PLAN_XML.REPORT_REF</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> REPORT_REF = createParameter("REPORT_REF", org.jooq.impl.SQLDataType.VARCHAR, true);

	/**
	 * Create a new routine call instance
	 */
	public BuildPlanXml() {
		super("BUILD_PLAN_XML", org.jooq.examples.oracle.sys.Sys.SYS, org.jooq.examples.oracle.sys.packages.DbmsXplan.DBMS_XPLAN, org.jooq.util.oracle.OracleDataType.getDefaultDataType("UNDEFINED"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(TABLE_NAME);
		addInParameter(STATEMENT_ID);
		addInParameter(PLAN_ID);
		addInParameter(FORMAT);
		addInParameter(FILTER_PREDS);
		addInParameter(PLAN_TAG);
		addInParameter(REPORT_REF);
	}

	/**
	 * Set the <code>TABLE_NAME</code> parameter IN value to the routine
	 */
	public void setTableName(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.BuildPlanXml.TABLE_NAME, value);
	}

	/**
	 * Set the <code>TABLE_NAME</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setTableName(org.jooq.Field<java.lang.String> field) {
		setField(TABLE_NAME, field);
	}

	/**
	 * Set the <code>STATEMENT_ID</code> parameter IN value to the routine
	 */
	public void setStatementId(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.BuildPlanXml.STATEMENT_ID, value);
	}

	/**
	 * Set the <code>STATEMENT_ID</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setStatementId(org.jooq.Field<java.lang.String> field) {
		setField(STATEMENT_ID, field);
	}

	/**
	 * Set the <code>PLAN_ID</code> parameter IN value to the routine
	 */
	public void setPlanId(java.lang.Number value) {
		setNumber(org.jooq.examples.oracle.sys.packages.dbms_xplan.BuildPlanXml.PLAN_ID, value);
	}

	/**
	 * Set the <code>PLAN_ID</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setPlanId(org.jooq.Field<? extends java.lang.Number> field) {
		setNumber(PLAN_ID, field);
	}

	/**
	 * Set the <code>FORMAT</code> parameter IN value to the routine
	 */
	public void setFormat(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.BuildPlanXml.FORMAT, value);
	}

	/**
	 * Set the <code>FORMAT</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setFormat(org.jooq.Field<java.lang.String> field) {
		setField(FORMAT, field);
	}

	/**
	 * Set the <code>FILTER_PREDS</code> parameter IN value to the routine
	 */
	public void setFilterPreds(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.BuildPlanXml.FILTER_PREDS, value);
	}

	/**
	 * Set the <code>FILTER_PREDS</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setFilterPreds(org.jooq.Field<java.lang.String> field) {
		setField(FILTER_PREDS, field);
	}

	/**
	 * Set the <code>PLAN_TAG</code> parameter IN value to the routine
	 */
	public void setPlanTag(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.BuildPlanXml.PLAN_TAG, value);
	}

	/**
	 * Set the <code>PLAN_TAG</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setPlanTag(org.jooq.Field<java.lang.String> field) {
		setField(PLAN_TAG, field);
	}

	/**
	 * Set the <code>REPORT_REF</code> parameter IN value to the routine
	 */
	public void setReportRef(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.BuildPlanXml.REPORT_REF, value);
	}

	/**
	 * Set the <code>REPORT_REF</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setReportRef(org.jooq.Field<java.lang.String> field) {
		setField(REPORT_REF, field);
	}
}
