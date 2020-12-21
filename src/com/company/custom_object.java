package com.company;
class Employee{
//    int id;
    String name;
    int Salary;
    /*public void printDetails(){
        System.out.println("My id is"+id);
        System.out.println("and my name is "+name);
    }*/
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

public class custom_object {
    public static void main(String[] args) {
       /* System.out.println("The is custome class");
        Employee vishal=new Employee();
        Employee harry=new Employee();
        vishal.id=10;
        harry.id=11;
        vishal.name="Harry";
        harry.name="Vishal";
        vishal.printDetails();
        harry.printDetails();
        Employee vishal=new Employee();
        vishal.setName("Code with harry");
        System.out.println(vishal.getName());
        vishal.Salary=30;
        System.out.println(vishal.getSalary());*/
    }
}
