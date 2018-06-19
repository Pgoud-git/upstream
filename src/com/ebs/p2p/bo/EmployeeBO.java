package com.ebs.p2p.bo;

import com.ebs.p2p.model.Employee;

public class EmployeeBO{

public double calculateYearlySal(Employee emp){

double yearlySal = 0;

yearlySal = emp.getSal() * 12;

return yearlySal;

}

public double calculateAppraisal(Employee emp){

double appraisal = 0;

if ( emp.getSal() < 10000 ) {
appraisal = 500;
} else {
appraisal = 1000;
}




return appraisal;

}

}// end of class