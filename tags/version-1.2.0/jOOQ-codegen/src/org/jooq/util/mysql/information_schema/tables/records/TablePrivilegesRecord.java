/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.information_schema.tables.records;

import org.jooq.Result;
import org.jooq.impl.RecordImpl;
import org.jooq.util.mysql.information_schema.tables.TablePrivileges;


/**
 * This class is generated by jOOQ.
 */
public class TablePrivilegesRecord extends RecordImpl {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 */
	public void setGrantee(String value) {
		setValue(TablePrivileges.GRANTEE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getGrantee() {
		return getValue(TablePrivileges.GRANTEE);
	}

	/**
	 * An uncommented item
	 */
	public void setTableCatalog(String value) {
		setValue(TablePrivileges.TABLE_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableCatalog() {
		return getValue(TablePrivileges.TABLE_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setTableSchema(String value) {
		setValue(TablePrivileges.TABLE_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableSchema() {
		return getValue(TablePrivileges.TABLE_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setTableName(String value) {
		setValue(TablePrivileges.TABLE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableName() {
		return getValue(TablePrivileges.TABLE_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setPrivilegeType(String value) {
		setValue(TablePrivileges.PRIVILEGE_TYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getPrivilegeType() {
		return getValue(TablePrivileges.PRIVILEGE_TYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setIsGrantable(String value) {
		setValue(TablePrivileges.IS_GRANTABLE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getIsGrantable() {
		return getValue(TablePrivileges.IS_GRANTABLE);
	}

	public TablePrivilegesRecord(Result result) {
		super(result);
	}
}