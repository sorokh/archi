/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.model.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.archimatetool.model.IArchimateFactory;
import com.archimatetool.model.IArchimatePackage;
import com.archimatetool.model.IDiagramModel;
import com.archimatetool.model.ISketchModel;


public class SketchModelTests extends DiagramModelTests {
    
    private ISketchModel sm;
    
    @Override
    protected IDiagramModel getDiagramModel() {
        sm = IArchimateFactory.eINSTANCE.createSketchModel();
        return sm;
    }
    
    
    // ---------------------------------------------------------------------------------------------
    // Tests
    // ---------------------------------------------------------------------------------------------
    
    @Test
    public void testGetBackground() {
        assertEquals(1, sm.getBackground());
        sm.setBackground(2);
        assertEquals(2, sm.getBackground());
    }

    @Test
    public void testGetChildren() {
        CommonTests.testList(sm.getChildren(), IArchimatePackage.eINSTANCE.getSketchModelActor());
        CommonTests.testList(sm.getChildren(), IArchimatePackage.eINSTANCE.getSketchModelSticky());
        CommonTests.testList(sm.getChildren(), IArchimatePackage.eINSTANCE.getDiagramModelGroup());
    }

}
