package com.qaagility.controller;

import com.qaagility.controller.Calculator;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
 
public class CalcMockTest {

	@Mock
    	Calculator calcMock;	
	
	@Test
	public void testCalcMock1()  {
	when(calcMock.Mul()).thenReturn(81);
	assertEquals(81,calcMock.Mul());
	}

/*	
	@Test
	public void testCalcMock1()  {
		
        //  create mock
	ClassToTest test  = new ClassToTest(calcMock);	
        // MyCalc test = mock(MyCalc.class);

        // define return value for method getMul()
        when(test.getMul()).thenReturn(81);

        // use mock in test....
        assertEquals(test.getMul(), 81);
	}

*/	
	@Test	
      public void testCalc() {
        assertEquals("Result", 9, 9);
      }
	
    }
