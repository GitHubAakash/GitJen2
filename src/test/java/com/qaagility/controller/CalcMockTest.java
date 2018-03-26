package com.qaagility.controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
 
@RunWith(MockitoJUnitRunner.class)
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
