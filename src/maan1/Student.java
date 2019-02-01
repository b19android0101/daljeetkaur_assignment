package maan1;
import java.io.BufferedReader;
import java.io.IOException;
	import java.io.InputStreamReader;
	public class Student {
	    String roll_no;//instance variables
	    String name;
	    char grade;
	    double eng_marks;
	    double maths_marks;
	    double sci_marks,average,total_marks;
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
	     void cal_average()
	    {
	        average=(int)(eng_marks+maths_marks+sci_marks)/3;
	    }
	    void  find_grade()
	    {
	    	if(average>=85 )
	    	{
	    		System.out.println(name+" "+average);
	 System.out.println("A+ GRADE");
	    	}
	    	else if(average>=70 && average<85)
	    	{
	       		System.out.println(name+" "+average);
	       	 System.out.println("A GRADE");
	       	    	}	
	    	else if(average>=50 && average<70)
	    	{
	       		System.out.println(name+" "+average);
	       	 System.out.println("B GRADE");
	    	}
	    	else if(average>=40 && average<50)
	    	{
	       		System.out.println(name+" "+average);
	       	  System.out.println("C GRADE");
	    	}
	    }
	    
	    
	    public static void main(String[] args)throws  IOException
	    {
	        Student  s1=new Student();
	        Student  s2=new Student();
	        Student s3=new Student();
	        {
	        s1.cal_total_marks();
	        s2.cal_total_marks();
	        s3.cal_total_marks();
	        s1.cal_average();
	        s2.cal_average();
	        s3.cal_average();
	        s1.find_grade();
	        s2.find_grade();
	        s3.find_grade();
	    }
	    }
	    }
	        
	        
	       
	        


