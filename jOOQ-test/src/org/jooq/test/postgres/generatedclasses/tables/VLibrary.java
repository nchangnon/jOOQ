/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;


import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.test.postgres.generatedclasses.Public;
import org.jooq.test.postgres.generatedclasses.tables.records.VLibraryRecord;


/**
 * This class is generated by jOOQ.
 */
public class VLibrary extends TableImpl<VLibraryRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of v_library
	 */
	public static final VLibrary V_LIBRARY = new VLibrary();

	/**
	 * The class holding records for this table
	 */
	private static final Class<VLibraryRecord> RECORD_TYPE = VLibraryRecord.class;

	/**
	 * The class holding records for this table
	 */
	@Override
	public Class<VLibraryRecord> getRecordType() {
		return RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<String> AUTHOR = new TableFieldImpl<String>("author", String.class, V_LIBRARY);

	/**
	 * An uncommented item
	 */
	public static final TableField<String> TITLE = new TableFieldImpl<String>("title", String.class, V_LIBRARY);

	/**
	 * No further instances allowed
	 */
	private VLibrary() {
		super("v_library", Public.PUBLIC);
	}

}