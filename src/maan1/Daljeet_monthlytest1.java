package maan1;

public class Daljeet_monthlytest1 
{
	public static void  main(String[ ] args){
		int [] a={20,30,40,50,10};
		int k=22,flag=0;
		System.out.println( "Enter search element "+k);
		for(int i=0;i<5;i++)
		{
			if(k==a[i])
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println( "element is found");
		}
		else
		{
			System.out.println("element is not found");
		}
	}

}
