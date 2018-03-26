package com.qaagility.controller;

import static org.mockito.Mockito.*;
 
public class CalcMockTest {

	@Mock
    	MyCalc calcMock;	

	
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

	
	
    }
