package com.ebs.p2p.model;

public class Employee{
private int id;
private String name;
private int age;
private double sal;

public Employee(int pId, String pName, int pAge, double pSal){
	id = pId;
	name = pName;
	age = pAge;
	sal = pSal;
}

public int getId(){
	return id;
}

public void setId(int pId){
	id = pId;
}

public String getName(){
return name;
}

public void setName(String pName){
	name = pName;
}

public int getAge(){
return age;
}

public void setAge(int pAge){
	age = pAge;
}

public double getSal(){
return sal;
}

public void setSal(double pSal){
	sal = pSal;
}

}// end of class