package com.company;
class EmployeeMain{
    //    int id;
    private String name;
    private int  Salary;
//    public EmployeeMain(String myname,int salary){
//        name=myname;
//        Salary=salary;
//
//    }
//    public EmployeeMain(){
//        name="Vishal";
//        Salary=5000;
//    }
    public void setSalary(int s){
        Salary=s;
    }
    public int getSalary(){
        return Salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }

}

public class access_constructor {
    public static void main(String[] args) {
//        EmployeeMain vishal=new EmployeeMain("Vishal",5000);
        EmployeeMain vishal=new EmployeeMain();
        vishal.setSalary(5000);
        System.out.println(vishal.getSalary());
        vishal.setName("vishal");
        System.out.println(vishal.getName());

    }
}
