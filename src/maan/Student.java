package maan;
import java.io.BufferedReader;

import java.io.IOException;
	import java.io.InputStreamReader;

	public class Student {
	    String roll_no;//instance variables
	    String name;
	    char grade;
	    double eng_marks;
	    double maths_marks;
	    double sci_marks,Average,total_marks;
	    BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
	    Student() throws IOException
	    {
	        System.out.println("Enter roll_no.");
	        roll_no=s.readLine();
	        System.out.println("Enter eng_marks");
	        eng_marks=Double.parseDouble(s.readLine());
	        System.out.println("Enter maths_marks");
	        maths_marks=Double.parseDouble(s.readLine());
	        System.out.println("Enter sci_marks");
	        sci_marks=Double.parseDouble(s.readLine());
	        System.out.println("Enter name");
	        name=s.readLine();
	    }
	    void  cal_total_marks()
	    {
	    total_marks=	(int)(eng_marks+maths_marks+sci_marks);
	    }
	     void  Average ()
	    {
	        Average=(int)(eng_marks+maths_marks+sci_marks)/3;
	    }
	    void  grade()
	    {
	    	if(Average>=85 )
	    	{
	    		System.out.println(name+" "+Average);
	 System.out.println("A+ grade");
	    	}
	    	else if(Average>=70 && Average<85)
	    	{
	       		System.out.println(name+" "+Average);
	       	 System.out.println("A grade");
	       	    	}	
	    	else if(Average>=50 && Average<70)
	    	{
	       		System.out.println(name+" "+Average);
	       	 System.out.println("b grade");
	    	}
	    	else if(Average>=40 && Average<50)
	    	{
	       		System.out.println(name+" "+Average);
	       	    System.out.println("c grade");
	    	}
	    	}
	    
	    public  void main (String[] args) throws IOException
	    {
	        Student s1=new Student();
	        Student s2=new Student();
	        s1.cal_total_marks();
	        s2 .cal_total_marks();
	        s1.Average();
	        s2 .Average();
	       s1.grade();	        
           s2.grade();	  
	    }
	    }
	    
  

