/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.enums;



/**
 * This class is generated by jOOQ.
 */
public enum ProcSecurityType implements org.jooq.Enum {

	INVOKER("INVOKER"),

	DEFINER("DEFINER"),

	;

	private final String literal;

	private ProcSecurityType(String literal) {
		this.literal = literal;
	}

	@Override
	public String getName() {
		return "proc_security_type";
	}

	@Override
	public String getLiteral() {
		return literal;
	}
}