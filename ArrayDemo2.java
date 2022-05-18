package array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDemo2 ad=new ArrayDemo2();
//ad.second_max();
//ad.second_min();
//ad.second_max_negative();//use wrapper class object for maximum value
//ad.second_min_negative();//use wrapper class object for maximum value
ad.wrapperclass();//converting primitive datatype into corresponding wrapper class
	}

	private void wrapperclass() {
		// TODO Auto-generated method stub
		int no1=10;
		Integer i=5;
		i=no1;
		System.out.println(i.intValue());
		System.out.println(i.floatValue());
	}

	private void second_min_negative() {
		// TODO Auto-generated method stub
		int[] m= {-3,-5,-7,-4,-9};
		int min=Integer.MAX_VALUE;int smin=Integer.MAX_VALUE;
		for(int i=0;i<m.length;i++)
		{
			if(m[i]<min)
			{
				smin=min;
				min=m[i];
			}
			else if(m[i]>smin)
			{
				smin=m[i];
			}
		}
			System.out.println("minimum"+min);
			System.out.println("sminimum"+smin);
		
	}

	private void second_max_negative() {
		// TODO Auto-generated method stub
		int[] m= {-3,-5,-7,-4,-9};
		int max=Integer.MIN_VALUE;int smax=Integer.MIN_VALUE;
		for(int i=0;i<m.length;i++)
		{
			if(m[i]>max)
			{
				smax=max;
				max=m[i];
			}
			else if(m[i]>smax)
			{
				smax=m[i];
			}
		}
			System.out.println("maaximum"+max);
			System.out.println("maximum"+smax);
		
		
	}

	private void second_min() {
		// TODO Auto-generated method stub
		int[] m= {56,67,98,90,65};
		int min=100;int smin=100;
		for(int i=0;i<m.length;i++)
		{
			if(m[i]<min)
			{
				smin=min;
				min=m[i];
			}
			else if(m[i]<smin)
			{
				smin=m[i];
			}
		}
		System.out.println("mimimum mark is"+min);
		System.out.println("second mimimum mark is"+smin);
		
	}

	private void second_max() {
		// TODO Auto-generated method stub
		int[] marks= {45,78,98,90,56};
		int max=0;int smax=0;
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]>max)
			{
				smax=max;
				max=marks[i];
			}
			else if(marks[i]>smax)
			{
				smax=marks[i];
			}
			
		}
		System.out.println("maxmimu marks"+max);
		System.out.println("second maximum"+smax);

	}

}
