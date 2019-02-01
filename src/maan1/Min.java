package maan1;

import java.util.Scanner;

public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		int i,min;
		Scanner s=new Scanner(System.in);
		System.out.println("enter 5 numbers in array");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		min=arr[0];
		for(i=1;i<arr.length;i++)
			{
			if(arr[i]<min)
			{
				min=arr[i];
			}
	}
			System.out.println("min no is"+min);
	}
	}


