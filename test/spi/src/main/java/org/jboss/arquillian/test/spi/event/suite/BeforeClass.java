/*
 * JBoss, Home of Professional Open Source
 * Copyright 2009 Red Hat Inc. and/or its affiliates and other contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.arquillian.test.spi.event.suite;

import org.jboss.arquillian.test.spi.LifecycleMethodExecutor;

/**
 * Event fired Before the Class execution.
 *
 * @author <a href="mailto:aslak@conduct.no">Aslak Knutsen</a>
 */
public class BeforeClass extends ClassLifecycleEvent {

    /**
     * @param testClass
     *     The source for this BeforeClass event
     */
    public BeforeClass(Class<?> testClass) {
        super(testClass);
    }

    /**
     * @param testClass
     *     The source for this BeforeClass event
     * @param executor
     *     A call back when the LifecycleMethod represented by this event should be invoked
     */
    public BeforeClass(Class<?> testClass, LifecycleMethodExecutor executor) {
        super(testClass, executor);
    }
}