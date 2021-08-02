package com.lti.hibernate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.lti.inheritance.Bank;
import com.lti.inheritance.ICICI;
import com.lti.inheritance.SBI;
import com.lti.mapping.Course;
import com.lti.mapping.Student;
/*
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
        SessionFactory sFac=cfg.configure().buildSessionFactory();   
       
        //Department d=new Department(70, "Matrix", "USA");
       
        Session s=sFac.openSession();   
        Transaction tx=s.beginTransaction();
       // s.save(d);  //insert
        
        /*Department dep=null;
        dep=s.get(Department.class, 70);
        System.out.println(dep);
        
        dep.setDeptname("Fashion");
        dep.setLocation("Russia");
        
        s.update(dep);*/
        
        /*dep=s.get(Department.class, 70);
        s.delete(dep);*/
        
       /* List<Department> deps= s.createQuery("from Department").list();
        for(Department d1: deps)
        {
        	System.out.println(d1);
        }
        
        tx.commit();
        s.close();
        sFac.close();
       
        System.out.println("Data Saved....");
    }
}
*/

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
        SessionFactory sFac=cfg.configure().buildSessionFactory();   
       
       
        Session s=sFac.openSession();   
        Transaction tx=s.beginTransaction();
       
        /*
        Department d=new Department(62,"RuralDev","India");
        Department d2=new Department(63,"UrbanDev","China");
        s.save(d);
        s.save(d2);
        */
        
        //one to one
       /* Course c1=new Course(201,"Angular",120);
        Course c2=new Course(202,"Maven",45);
        
        Student s1= new Student(1001,"Rahul",c1);
        Student s2= new Student(1002,"Dev",c2);
        
        s.save(s1);
        s.save(s2);
        */
        
        //one to many
       /* Student s1= new Student(101,"Falguni","Female");
        Student s2= new Student(102,"Mahesh","Male");
        Student s3= new Student(103,"Ramya","Female");
        
        Course crs= new Course();
        crs.setCourseid(2001);
        crs.setCourseName("Angular");
        crs.setDuration(120);
        
        Set<Student> sObj= new HashSet<Student>();
        sObj.add(s1);
        sObj.add(s2);
        sObj.add(s3);
        
        crs.setStudents(sObj);
        
        s.save(crs);
        
        */
        
        /*
        //many to many
        Course c1= new Course(100,"Java",200);
        Course c2= new Course(150,"React",100);
        
        Set <Course> courses= new HashSet<Course>();
        courses.add(c1);
        courses.add(c2);
        
        Student s1= new Student(1001,"Paras","male");
        Student s2= new Student(1002,"Prachi","female");
        Student s3= new Student(1003,"Nanda","female");
        
        Set<Student> students= new HashSet<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        
        s1.setCourses(courses);
        s2.setCourses(courses);
        s3.setCourses(courses);
        
        s.save(s1);
        s.save(s2);
        s.save(s3);
        
        */
        
        Bank bank= new Bank(101,"RBI","Delhi");
        ICICI ico= new ICICI(102,"ICICI Bank","Chennai");
        ico.setLombardIndurance("With Higher benefits");
       
        SBI sbi=new SBI(301, "SBI Bank", "Mumbai");
        sbi.setCarLoanInt("10.67/annum");
       
        s.save(bank);
        s.save(ico);
        s.save(sbi);
       
      
        
        tx.commit();
        s.close();
        sFac.close();
       
        System.out.println("Data Saved....");
    }
}
