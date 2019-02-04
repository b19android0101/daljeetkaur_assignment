package maan1;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		        // TODO Auto-generated method stub
		                Scanner s=new Scanner(System.in);
		                int q=1;
		                do
		                {
		                System.out.println("Enter two numbers");
		                int x=s.nextInt();
		                int y=s.nextInt();
		                System.out.println("Enter your choice\n 1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
		                int ch=s.nextInt();
		                switch(ch)
		                {
		                case 1:
		                System.out.println(x+y);
		                break;
		                case 2:
		                    System.out.println(x*y);
		                    break;
		                case 3:
		                    System.out.println(x/y);
		                    break;
		                case 4:
		                    System.out.println(x-y);
		                    break;
		                }
		                System.out.println("Press 1 to continue and 0 to quit");
		                q=s.nextInt();
		                }while(q==1);
		                
		    }
}


