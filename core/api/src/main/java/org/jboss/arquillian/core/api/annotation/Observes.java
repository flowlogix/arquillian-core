/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010 Red Hat Inc. and/or its affiliates and other contributors
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
package org.jboss.arquillian.core.api.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * <pre>
 * {@code
 * public void listen(@Observes SomeEvent event) {
 *     // do something..
 * }
 * }
 * </pre>
 * <p>
 * In case more observers observe the same event, they are ordered as they appear on classpath.
 * If you need to reorder them, you can use {@code precedence} value. The higher the {@code precedence} is,
 * the sooner the observer is executed.
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 */
@Documented
@Retention(RUNTIME)
@Target(ElementType.PARAMETER)
public @interface Observes {

    int precedence() default 0;
}
