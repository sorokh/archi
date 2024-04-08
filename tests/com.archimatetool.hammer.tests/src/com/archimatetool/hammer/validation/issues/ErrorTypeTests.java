/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.hammer.validation.issues;

import org.junit.jupiter.api.BeforeEach;

@SuppressWarnings("nls")
public class ErrorTypeTests extends AbstractIssueTypeTests {
    
    @BeforeEach
    public void runOnceBeforeEachTest() {
        issueType = new ErrorType("error", "description", "explanation", null);
    }
    
}
