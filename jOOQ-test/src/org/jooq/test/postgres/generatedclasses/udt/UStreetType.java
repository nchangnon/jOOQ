/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.udt;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.UDTField;
import org.jooq.impl.UDTFieldImpl;
import org.jooq.impl.UDTImpl;
import org.jooq.test.postgres.generatedclasses.Public;
import org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord;
import org.jooq.util.postgres.PostgresDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class UStreetType extends UDTImpl<UStreetTypeRecord> {

	private static final long serialVersionUID = -73233358;

	/**
	 * The singleton instance of u_street_type
	 */
	public static final UStreetType U_STREET_TYPE = new UStreetType();

	/**
	 * The class holding records for this type
	 */
	private static final Class<UStreetTypeRecord> __RECORD_TYPE = UStreetTypeRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<UStreetTypeRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final UDTField<UStreetTypeRecord, String> STREET = new UDTFieldImpl<UStreetTypeRecord, String>(SQLDialect.POSTGRES, "street", PostgresDataType.CHARACTERVARYING, U_STREET_TYPE);

	/**
	 * An uncommented item
	 */
	public static final UDTField<UStreetTypeRecord, String> NO = new UDTFieldImpl<UStreetTypeRecord, String>(SQLDialect.POSTGRES, "no", PostgresDataType.CHARACTERVARYING, U_STREET_TYPE);

	/**
	 * No further instances allowed
	 */
	private UStreetType() {
		super(SQLDialect.POSTGRES, "u_street_type", Public.PUBLIC);
	}
}
