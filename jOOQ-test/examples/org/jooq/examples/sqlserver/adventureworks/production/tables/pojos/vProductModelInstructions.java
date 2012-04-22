/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "vProductModelInstructions", schema = "Production")
public class vProductModelInstructions implements java.io.Serializable {

	private static final long serialVersionUID = 2019298195;

	private java.lang.Integer    ProductModelID;
	private java.lang.String     Name;
	private java.lang.String     Instructions;
	private java.lang.Integer    LocationID;
	private java.math.BigDecimal SetupHours;
	private java.math.BigDecimal MachineHours;
	private java.math.BigDecimal LaborHours;
	private java.lang.Integer    LotSize;
	private java.lang.String     Step;
	private java.lang.String     rowguid;
	private java.sql.Timestamp   ModifiedDate;

	@javax.persistence.Column(name = "ProductModelID", nullable = false, precision = 10)
	public java.lang.Integer getProductModelID() {
		return this.ProductModelID;
	}

	public void setProductModelID(java.lang.Integer ProductModelID) {
		this.ProductModelID = ProductModelID;
	}

	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return this.Name;
	}

	public void setName(java.lang.String Name) {
		this.Name = Name;
	}

	@javax.persistence.Column(name = "Instructions")
	public java.lang.String getInstructions() {
		return this.Instructions;
	}

	public void setInstructions(java.lang.String Instructions) {
		this.Instructions = Instructions;
	}

	@javax.persistence.Column(name = "LocationID", precision = 10)
	public java.lang.Integer getLocationID() {
		return this.LocationID;
	}

	public void setLocationID(java.lang.Integer LocationID) {
		this.LocationID = LocationID;
	}

	@javax.persistence.Column(name = "SetupHours", precision = 9, scale = 4)
	public java.math.BigDecimal getSetupHours() {
		return this.SetupHours;
	}

	public void setSetupHours(java.math.BigDecimal SetupHours) {
		this.SetupHours = SetupHours;
	}

	@javax.persistence.Column(name = "MachineHours", precision = 9, scale = 4)
	public java.math.BigDecimal getMachineHours() {
		return this.MachineHours;
	}

	public void setMachineHours(java.math.BigDecimal MachineHours) {
		this.MachineHours = MachineHours;
	}

	@javax.persistence.Column(name = "LaborHours", precision = 9, scale = 4)
	public java.math.BigDecimal getLaborHours() {
		return this.LaborHours;
	}

	public void setLaborHours(java.math.BigDecimal LaborHours) {
		this.LaborHours = LaborHours;
	}

	@javax.persistence.Column(name = "LotSize", precision = 10)
	public java.lang.Integer getLotSize() {
		return this.LotSize;
	}

	public void setLotSize(java.lang.Integer LotSize) {
		this.LotSize = LotSize;
	}

	@javax.persistence.Column(name = "Step", length = 1024)
	public java.lang.String getStep() {
		return this.Step;
	}

	public void setStep(java.lang.String Step) {
		this.Step = Step;
	}

	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return this.rowguid;
	}

	public void setrowguid(java.lang.String rowguid) {
		this.rowguid = rowguid;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}
