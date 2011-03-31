/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.procedures;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.StoredProcedureImpl;
import org.jooq.test.postgres.generatedclasses.Public;
import org.jooq.test.postgres.generatedclasses.udt.UAddressType;
import org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord;
import org.jooq.util.postgres.PostgresDataType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class PEnhanceAddress1 extends StoredProcedureImpl {

	private static final long serialVersionUID = -1239989411;


	/**
	 * An uncommented item
	 */
	public static final Parameter<UAddressTypeRecord> ADDRESS = new ParameterImpl<UAddressTypeRecord>(SQLDialect.POSTGRES, "address", UAddressType.U_ADDRESS_TYPE.getDataType());

	/**
	 * An uncommented item
	 */
	public static final Parameter<String> NO = new ParameterImpl<String>(SQLDialect.POSTGRES, "no", PostgresDataType.CHARACTERVARYING);

	/**
	 * No further instances allowed
	 */
	public PEnhanceAddress1() {
		super(SQLDialect.POSTGRES, "p_enhance_address1", Public.PUBLIC);

		addInParameter(ADDRESS);
		addOutParameter(NO);
	}

	public void setAddress(UAddressTypeRecord value) {
		setValue(ADDRESS, value);
	}

	public String getNo() {
		return getValue(NO);
	}
}