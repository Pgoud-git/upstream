package com.ebs.p2p.bo;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.*;
import com.ebs.p2p.model.Employee;

public class TestEmployeeBO{

Employee emp = new Employee(1, "Praveen", 40, 8000);
EmployeeBO empBO = new EmployeeBO();

@Test
public void testCalculateYearlySal(){

double yearlySal = empBO.calculateYearlySal(emp);
assertEquals(96000, yearlySal,  0.0);
}

@Test
public void testCalculateAppraisal(){

double appraisal = empBO.calculateAppraisal(emp);
assertEquals(96000, appraisal,0.0);

}

}//end of class
