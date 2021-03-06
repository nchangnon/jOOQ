/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.cubrid.demodb;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class Public extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 1580670013;

	/**
	 * The singleton instance of PUBLIC
	 */
	public static final Public PUBLIC = new Public();

	/**
	 * No further instances allowed
	 */
	private Public() {
		super("PUBLIC");
	}

	@Override
	public final java.util.List<org.jooq.Sequence<?>> getSequences() {
		return java.util.Arrays.<org.jooq.Sequence<?>>asList(
			org.jooq.examples.cubrid.demodb.Sequences.EVENT_NO,
			org.jooq.examples.cubrid.demodb.Sequences.STADIUM_NO);
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.examples.cubrid.demodb.tables.Athlete.ATHLETE,
			org.jooq.examples.cubrid.demodb.tables.Code.CODE,
			org.jooq.examples.cubrid.demodb.tables.Event.EVENT,
			org.jooq.examples.cubrid.demodb.tables.Game.GAME,
			org.jooq.examples.cubrid.demodb.tables.History.HISTORY,
			org.jooq.examples.cubrid.demodb.tables.Nation.NATION,
			org.jooq.examples.cubrid.demodb.tables.Olympic.OLYMPIC,
			org.jooq.examples.cubrid.demodb.tables.Participant.PARTICIPANT,
			org.jooq.examples.cubrid.demodb.tables.Record.RECORD,
			org.jooq.examples.cubrid.demodb.tables.Stadium.STADIUM);
	}
}
