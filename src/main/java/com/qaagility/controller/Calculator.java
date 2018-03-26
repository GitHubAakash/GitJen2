package com.qaagility.controller;

public class Calculator {
  int x, y, result;

  public int add(int x, int y) {
    result = x + y;
    return result;
  
  }

  //method tobe implemented
  public int mul(int x, int y) {
    //Calling add methos just for fun
    System.out.println("Calling add for fun!"); 	
    int temp = add(x,y);
     System.out.println("Called add for fun!"); 	
    
    //Implementation of the method is pending
    return result;
  
  }
  
  
  }
