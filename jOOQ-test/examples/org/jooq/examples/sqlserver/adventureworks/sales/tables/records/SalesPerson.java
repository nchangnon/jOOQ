/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "SalesPerson", schema = "Sales")
public class SalesPerson extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesPerson> {

	private static final long serialVersionUID = -1753312800;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_SalesPerson_Employee_SalesPersonID
	 * FOREIGN KEY (SalesPersonID)
	 * REFERENCES HumanResources.Employee (EmployeeID)
	 * </pre></code>
	 */
	public void setSalesPersonID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson.SalesPersonID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_SalesPerson_Employee_SalesPersonID
	 * FOREIGN KEY (SalesPersonID)
	 * REFERENCES HumanResources.Employee (EmployeeID)
	 * </pre></code>
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "SalesPersonID", unique = true, nullable = false)
	public java.lang.Integer getSalesPersonID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson.SalesPersonID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_SalesPerson_SalesTerritory_TerritoryID
	 * FOREIGN KEY (TerritoryID)
	 * REFERENCES Sales.SalesTerritory (TerritoryID)
	 * </pre></code>
	 */
	public void setTerritoryID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson.TerritoryID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_SalesPerson_SalesTerritory_TerritoryID
	 * FOREIGN KEY (TerritoryID)
	 * REFERENCES Sales.SalesTerritory (TerritoryID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "TerritoryID")
	public java.lang.Integer getTerritoryID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson.TerritoryID);
	}

	/**
	 * An uncommented item
	 */
	public void setSalesQuota(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson.SalesQuota, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "SalesQuota")
	public java.math.BigDecimal getSalesQuota() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson.SalesQuota);
	}

	/**
	 * An uncommented item
	 */
	public void setBonus(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson.Bonus, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "Bonus", nullable = false)
	public java.math.BigDecimal getBonus() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson.Bonus);
	}

	/**
	 * An uncommented item
	 */
	public void setCommissionPct(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson.CommissionPct, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "CommissionPct", nullable = false)
	public java.math.BigDecimal getCommissionPct() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson.CommissionPct);
	}

	/**
	 * An uncommented item
	 */
	public void setSalesYTD(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson.SalesYTD, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "SalesYTD", nullable = false)
	public java.math.BigDecimal getSalesYTD() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson.SalesYTD);
	}

	/**
	 * An uncommented item
	 */
	public void setSalesLastYear(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson.SalesLastYear, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "SalesLastYear", nullable = false)
	public java.math.BigDecimal getSalesLastYear() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson.SalesLastYear);
	}

	/**
	 * An uncommented item
	 */
	public void setrowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson.rowguid, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson.rowguid);
	}

	/**
	 * An uncommented item
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson.ModifiedDate, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson.ModifiedDate);
	}

	/**
	 * Create a detached SalesPerson
	 */
	public SalesPerson() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPerson.SalesPerson);
	}
}