/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "CountryRegion", schema = "Person")
public class CountryRegion implements java.io.Serializable {

	private static final long serialVersionUID = -126439025;

	private java.lang.String   CountryRegionCode;
	private java.lang.String   Name;
	private java.sql.Timestamp ModifiedDate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "CountryRegionCode", unique = true, nullable = false, length = 3)
	public java.lang.String getCountryRegionCode() {
		return this.CountryRegionCode;
	}

	public void setCountryRegionCode(java.lang.String CountryRegionCode) {
		this.CountryRegionCode = CountryRegionCode;
	}

	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return this.Name;
	}

	public void setName(java.lang.String Name) {
		this.Name = Name;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}
