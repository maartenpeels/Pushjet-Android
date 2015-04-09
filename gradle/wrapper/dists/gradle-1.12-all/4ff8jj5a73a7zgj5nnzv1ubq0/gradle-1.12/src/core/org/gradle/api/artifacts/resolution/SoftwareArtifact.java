/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.api.artifacts.resolution;

import org.gradle.api.GradleException;
import org.gradle.api.Incubating;
import org.gradle.api.Nullable;

import java.io.File;

/**
 * An artifact of a software component.
 *
 * @since 1.12
 */
@Incubating
public interface SoftwareArtifact {
    /**
     * The file for the artifact. If resolving the artifact caused a failure, that failure will be rethrown.
     *
     * @return the file for the artifact
     */
    File getFile() throws GradleException;

    /**
     * Returns the failure that occurred when the artifact was resolved, or {@code null} if no failure occurred.
     *
     * @return the failure that occurred when the artifact was resolved, or {@code null} if no failure occurred
     */
    @Nullable
    GradleException getFailure();
}
