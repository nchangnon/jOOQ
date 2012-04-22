/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.6"},
                            comments = "This class is generated by jOOQ")
public class Sys extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -2003889206;

	/**
	 * The singleton instance of SYS
	 */
	public static final Sys SYS = new Sys();

	/**
	 * No further instances allowed
	 */
	private Sys() {
		super("SYS");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.util.oracle.sys.tables.AllArguments.ALL_ARGUMENTS,
			org.jooq.util.oracle.sys.tables.AllColComments.ALL_COL_COMMENTS,
			org.jooq.util.oracle.sys.tables.AllCollTypes.ALL_COLL_TYPES,
			org.jooq.util.oracle.sys.tables.AllConsColumns.ALL_CONS_COLUMNS,
			org.jooq.util.oracle.sys.tables.AllConstraints.ALL_CONSTRAINTS,
			org.jooq.util.oracle.sys.tables.AllObjects.ALL_OBJECTS,
			org.jooq.util.oracle.sys.tables.AllProcedures.ALL_PROCEDURES,
			org.jooq.util.oracle.sys.tables.AllSequences.ALL_SEQUENCES,
			org.jooq.util.oracle.sys.tables.AllTabCols.ALL_TAB_COLS,
			org.jooq.util.oracle.sys.tables.AllTabComments.ALL_TAB_COMMENTS,
			org.jooq.util.oracle.sys.tables.AllTypeAttrs.ALL_TYPE_ATTRS,
			org.jooq.util.oracle.sys.tables.AllTypes.ALL_TYPES);
	}
}
