/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt.u_author_type;

/**
 * This class is generated by jOOQ.
 */
public class LOAD extends org.jooq.impl.AbstractRoutine<java.lang.Void> implements java.lang.Cloneable {

	private static final long serialVersionUID = -793108144;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE> SELF = createParameter("SELF", org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE.U_AUTHOR_TYPE.getDataType());

	/**
	 * Create a new routine call instance
	 */
	public LOAD() {
		super("LOAD", org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE.U_AUTHOR_TYPE);

		addInOutParameter(SELF);
	}

	/**
	 * Set the <code>SELF</code> parameter to the routine
	 */
	public void setSELF(org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE value) {
		setValue(SELF, value);
	}

	public org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE getSELF() {
		return getValue(SELF);
	}
}
