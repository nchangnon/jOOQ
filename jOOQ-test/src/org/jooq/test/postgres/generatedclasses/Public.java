/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.impl.SchemaImpl;
import org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord;
import org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class Public extends SchemaImpl {

	private static final long serialVersionUID = 2146794933;

	/**
	 * The singleton instance of public
	 */
	public static final Public PUBLIC = new Public();

	/**
	 * No further instances allowed
	 */
	private Public() {
		super(SQLDialect.POSTGRES, "public");
	}

	/*
	 * instance initialiser
	 */
	{
		addMapping("public.u_address_type", UAddressTypeRecord.class);
		addMapping("public.u_street_type", UStreetTypeRecord.class);
	}
}
