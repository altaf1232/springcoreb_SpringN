package com.springcoreb;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
       
       ApplicationContext context= new ClassPathXmlApplicationContext("department.xml");
        //here is first Bean Class
        Department departmenta=(Department)context.getBean("deparment1");
        //here is Second Bean class
        Department departmentb=(Department)context.getBean("deparment2");
        System.out.println(departmenta);
        System.out.println(departmentb);
       
           
    }
}
