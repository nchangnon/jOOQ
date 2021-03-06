/**
 * Copyright (c) 2009-2012, Lukas Eder, lukas.eder@gmail.com
 *                          Christopher Deckers, chrriis@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
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
 * . Neither the name "jOOQ" nor the names of its contributors may be
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
package org.jooq.tools.debug.impl;

import java.util.ArrayList;
import java.util.List;

import org.jooq.tools.debug.Action;
import org.jooq.tools.debug.Processor;

/**
 * A default implementation for the {@link Processor} type
 *
 * @author Christopher Deckers
 * @author Lukas Eder
 */
class ProcessorImpl extends AbstractDebuggerObject implements Processor {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = -1575906853348333417L;

    private List<ActionImpl>  before           = new ArrayList<ActionImpl>();
    private List<ActionImpl>  instead          = new ArrayList<ActionImpl>();
    private List<ActionImpl>  after            = new ArrayList<ActionImpl>();

    @Override
    public synchronized Action newBefore() {
        return delegate(this, new ActionImpl(), before);
    }

    @Override
    public synchronized Action[] before() {
        return before.toArray(new Action[before.size()]);
    }

    @Override
    public synchronized Action newInstead() {
        return delegate(this, new ActionImpl(), instead);
    }

    @Override
    public synchronized Action[] instead() {
        return instead.toArray(new Action[instead.size()]);
    }

    @Override
    public synchronized Action newAfter() {
        return delegate(this, new ActionImpl(), after);
    }

    @Override
    public synchronized Action[] after() {
        return after.toArray(new Action[after.size()]);
    }
}
