/**
 * Copyright (c) 2009, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name of the "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.jooq;

/**
 * This intermediate interface provides a higher-level specification for
 * {@link SelectQuery} objects. This is necessary, because combined select
 * statements cannot have their select fields modified, unless the result is put
 * in an inner select construct, transforming it into a more specific
 * SelectQuery again.
 * 
 * @author Lukas Eder
 */
public interface ResultProviderQuery extends Query {

	/**
	 * Return the result generated by a previous call to execute();
	 * 
	 * @return The result or <code>null</code> if no call to execute() was done
	 *         previously.
	 */
	Result getResult();

	/**
	 * Combine this ResultProvider with another one, using the
	 * {@link CombineOperator#UNION} operator.
	 * 
	 * @param other
	 *            The ResultProvider to combine this one with
	 * @return
	 * @see #combine(ResultProviderQuery, CombineOperator)
	 */
	ResultProviderQuery combine(ResultProviderQuery other);

	/**
	 * Combine this ResultProvider with another one, using the given operator.
	 * 
	 * @param other
	 *            The ResultProvider to combine this one with�
	 * @param operator
	 *            The combine operator
	 * @return
	 */
	ResultProviderQuery combine(ResultProviderQuery other, CombineOperator operator);

	/**
	 * @return This result provider as a Table object
	 */
	Table asTable();

	/**
	 * @return This result provider as a Field<?> object
	 */
	Field<?> asField();
}