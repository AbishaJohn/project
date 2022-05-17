package array;

import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysDemo ad=new ArraysDemo();
		ad.printmarks();
		ad.printnumbers();
		ad.getMarks(); //using Scanner class
		ad.printno();
		
	}
		private void printno() ////without using new keyword we can create an array,we can declared the variable directly
		{
		// TODO Auto-generated method stub
		int[]no= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<no.length;i++)
		{
			System.out.println(no[i]);
		}
		
	}
		
		private void getMarks() {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the subject");
			int count=sc.nextInt();
			int[] marks=new int[count];
			int total=0;
			
			for(int i=0;i<marks.length;i++)
			{
				System.out.println("Enter the marks");
				marks[i]=sc.nextInt();
				
			}
			for(int i=0;i<marks.length;i++)
			{
				System.out.println(marks[i]);
				total=total+marks[i];
			}
			System.out.println("Total is"+total);
			System.out.println("percentage is"+total/count);
		
	}
		private void printnumbers() {
		// TODO Auto-generated method stub
			boolean[] bo=new boolean[3];
			for(int i=0;i<bo.length;i++)
			{
				System.out.println(bo[i]);
			}
		int[]numbers=new int[10];
		numbers[0]=1;
		numbers[1]=2;
		numbers[2]=3;
		numbers[3]=4;
		numbers[4]=5;
		numbers[5]=6;
		numbers[6]=7;
		numbers[7]=8;
		numbers[8]=9;
		numbers[9]=10;
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
	}
		private void printmarks() {
		// TODO Auto-generated method stub
			int[] marks=new int[5];
			marks[0]=50;
			marks[1]=60;
			marks[2]=70;
			marks[3]=98;
			marks[4]=87;
			for(int i=0;i<marks.length;i++)
			{
			System.out.println(marks[i]);
			

		}
		}
	}
		

