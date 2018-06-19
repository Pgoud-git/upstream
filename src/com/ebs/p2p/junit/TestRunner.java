package com.ebs.p2p.junit;

import org.junit.runner.*;
import org.junit.runner.notification.Failure;
import com.ebs.p2p.bo.TestEmployeeBO;

public class TestRunner{

public static final void main(String[] args){

      Result result = JUnitCore.runClasses(TestEmployeeBO.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful());

}//end of main

}//end of class