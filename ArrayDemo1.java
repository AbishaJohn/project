package array;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDemo1 ad=new ArrayDemo1();
//ad.petrol_price();// highest price
//ad.lowest_price();
ad.add_marks();//highest mark
ad.lowestmark();

	}

	private void lowestmark() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the subject");
		int count=sc.nextInt();
		int[] marks=new int[count];
		
		for(int i=0;i<=marks.length-1;i++)
		{
		System.out.println("Enter the subject name");
		String subject=sc.next();
		}
		int total=0;
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter the mark");
		
			marks[i]=sc.nextInt();
			int lowest=marks[0];
			if(marks[i]<lowest)
			{
				lowest=marks[i];
				int index=0;
				
				index=i;
				
				}
		
			total=total+marks[i];
			System.out.println("total"+total);
			System.out.println("scored"+lowest);
			
		
		
		
	}
	}

	private void add_marks() {
		// TODO Auto-generated method stub
		int[]marks= {90,78,98,67,98};
		String[] subjects= {"Tamil","English","Maths","Science","Social"};
		int highest=marks[0];
		int index=0;
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]>highest)
			{
				highest=marks[i];
				index=i;
				
			}
		}
			System.out.println("scored" + highest+"in"+subjects[index]);
	
		
		
	}

	private void lowest_price() {
		// TODO Auto-generated method stub
		int[] petrol_price= {100,101,102,99,105};
		int index=0;
		int lowest=petrol_price[0];
		for(int i=0;i<petrol_price.length;i++)
		{
			if(petrol_price[i]<lowest)
				lowest=petrol_price[i];
			index=i;
		}
		System.out.println("Lowest Price is"+lowest);
		System.out.println("day is"+index);
	}

	private void petrol_price() {
		// TODO Auto-generated method stub
		int[] petrol_price= {100,101,102,99,105};
		int highest=petrol_price[0];
		for(int i=0;i<petrol_price.length;i++)
		{
		if(petrol_price[i]>highest)
		{
			highest=petrol_price[i];
		}
		}
	System.out.println("Highest price is"+highest);
	}
	}



