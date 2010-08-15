/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.tables;

import java.sql.Timestamp;

import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.mysql.mysql.Mysql;


/**
 * This class is generated by jOOQ.
 *
 * Procedure privileges
 */
public class ProcsPriv extends TableImpl {

	private static final long serialVersionUID = 6763320129495369387L;

	/**
	 * The singleton instance of procs_priv
	 */
	public static final ProcsPriv PROCS_PRIV = new ProcsPriv();

	/**
	 * An uncommented item
	 */
	public static final TableField<String> HOST = new TableFieldImpl<String>("Host", String.class, PROCS_PRIV);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> DB = new TableFieldImpl<String>("Db", String.class, PROCS_PRIV);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> USER = new TableFieldImpl<String>("User", String.class, PROCS_PRIV);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> ROUTINE_NAME = new TableFieldImpl<String>("Routine_name", String.class, PROCS_PRIV);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> ROUTINE_TYPE = new TableFieldImpl<String>("Routine_type", String.class, PROCS_PRIV);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> GRANTOR = new TableFieldImpl<String>("Grantor", String.class, PROCS_PRIV);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> PROC_PRIV = new TableFieldImpl<String>("Proc_priv", String.class, PROCS_PRIV);

	/**
	 * An uncommented item
	 */
	public static final TableField<Timestamp> TIMESTAMP = new TableFieldImpl<Timestamp>("Timestamp", Timestamp.class, PROCS_PRIV);

	/**
	 * No further instances allowed
	 */
	private ProcsPriv() {
		super("procs_priv", Mysql.MYSQL);
	}
}