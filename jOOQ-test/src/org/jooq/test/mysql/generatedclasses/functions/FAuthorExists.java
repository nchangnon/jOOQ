/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.functions;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.SQLDialect;
import org.jooq.Select;
import org.jooq.impl.ParameterImpl;
import org.jooq.impl.StoredFunctionImpl;
import org.jooq.test.mysql.generatedclasses.Test;
import org.jooq.util.mysql.MySQLDataType;


/**
 * This class is generated by jOOQ.
 *
 * Check existence of an author
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class FAuthorExists extends StoredFunctionImpl<Integer> {

	private static final long serialVersionUID = 910647576;


	/**
	 * An uncommented item
	 */
	public static final Parameter<String> AUTHOR_NAME = new ParameterImpl<String>(SQLDialect.MYSQL, "author_name", MySQLDataType.VARCHAR);

	/**
	 * No further instances allowed
	 */
	public FAuthorExists() {
		super(SQLDialect.MYSQL, "f_author_exists", Test.TEST, MySQLDataType.INT);

		addInParameter(AUTHOR_NAME);
	}

	/**
	 * Set the <code>author_name</code> parameter to the function
	 */
	public void setAuthorName(String value) {
		setValue(AUTHOR_NAME, value);
	}

	/**
	 * Set the <code>author_name</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link Field} in a {@link Select} statement!
	 */
	public void setAuthorName(Field<String> field) {
		setField(AUTHOR_NAME, field);
	}
}
