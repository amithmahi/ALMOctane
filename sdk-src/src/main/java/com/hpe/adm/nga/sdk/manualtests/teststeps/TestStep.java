/*
 * © Copyright 2016-2020 Micro Focus or one of its affiliates.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hpe.adm.nga.sdk.manualtests.teststeps;

/**
 * A normal test step
 */
public class TestStep extends AbstractTestStep {
    /**
     * The Prefix of a normal test step
     */
    public static final String PREFIX = "- ";

    /**
     * Constructor
     *
     * @param testStep the step
     */
    public TestStep(final String testStep) {
        super(testStep);
    }

    @Override
    String getTestStepPrefix() {
        return PREFIX;
    }
}