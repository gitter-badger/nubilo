/**
 * Copyright 2013-2014 Juergen Fickel <steinpfeffer@gmx.de>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.steinpfeffer.nubilo.users;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mutabilitydetector.unittesting.MutabilityAssert.assertImmutable;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Component test for {@link DefaultGroup}.
 * 
 * @author Juergen Fickel
 * @since 1.0.0
 */
// CHECKSTYLE:OFF
public final class DefaultGroupTest {

    @Ignore("Test is irrelevant for functionality.")
    @Test
    public void testToString() {
        final Group group = DefaultGroup.getInstance("foobar", "Foo Bar");
        System.out.println(group);
    }

    @Test(expected = IllegalArgumentException.class)
    public void tryToCreateInstanceWithNullName() {
        DefaultGroup.getInstance(null);
    }

    @Test
    public void displayNameIsNameIfNotProvided() {
        final String name = "Foo";
        final Group group = DefaultGroup.getInstance(name);
        assertThat(group.getDisplayName()).isEqualTo(name);
    }

    @Test
    public void displayNameIsNameIfNullProvided() {
        final String name = "Foo";
        final Group group = DefaultGroup.getInstance(name, null);
        assertThat(group.getDisplayName()).isEqualTo(name);
    }

    @Test
    public void displayNameIsNameIfEmptyStrngProvided() {
        final String name = "Foo";
        final Group group = DefaultGroup.getInstance(name, "");
        assertThat(group.getDisplayName()).isEqualTo(name);
    }

    @Test
    public void groupIsImmutable() {
        assertImmutable(DefaultGroup.class);
    }

}
// CHECKSTYLE:ON
