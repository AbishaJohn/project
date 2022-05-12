package practiceprogram;

public class Patternprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Patternprogram pp=new Patternprogram();
//pp.printstar();
//pp.printstarc();
//pp.printstare();
//pp.printstare1();
//pp.printstar8();
//pp.printstar1();
//pp.printstar3();
//pp.printstarT();

	}
	

	private void printstarT() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
		for(int col=1;col<=7;col++)
		{
			if(row==1||col==7)
			{
			System.out.print("* ");
		}
		
		
		else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	

	}
	

	private void printstar3() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			if(row==1||row==3||row==5)
			{
			for(int col=1;col<=5;col++)
			{
				
				System.out.print("* ");
			}
			}
			
			else
			{
				for(int col=1;col<=5;col++)
				{
					if(col==5)
					{
		
				System.out.print("* ");
				
				}
				System.out.print("  ");
			}
		}System.out.println();
		
		}
	
			}
			
		
	

	

	private void printstar1() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
		for(int col=1;col<=1;col++)
		{
			System.out.print("* ");
		}
		System.out.println();
		}
	}



	private void printstar8() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			if (row==1||row==3||row==5)
		{
		for(int col=1;col<=5;col++)
		
		{
			System.out.print("* ");
		}	
		
		}
	else
		for(int col=1;col<=5;col++)
		{
			if(col==1||col==5)
		
			
		{
			System.out.print("* ");
		}
		
			else
			{
			System.out.print("  ");
		}
	}System.out.println();
		}
		}

	private void printstare1() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			if(row==1||(row==5)||(row==9))
			{
		for(int col=1;col<=9;col++)
		{
			System.out.print("* ");
		}
		
	}
		else
		{
			for(int col=1;col<=2;col++)
			{
			System.out.print("* ");
		}
		}
			System.out.println();
		
		}
	}
	private void printstare() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			if(row==1||row==5||row==9)
			{
		for(int col=1;col<=9;col++)
		{
			System.out.print("* ");
		}
			}
		else
		{
			System.out.println("* ");
		}
		System.out.println();
	}
		}
	private void printstarc() {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++)
		{
			if((row==1)||(row==9))
			{
		for(int col=1;col<=9;col++)
		{
			System.out.print("* ");
	
	}
		}
		else
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}
	private void printstar() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++)
		{
		for(int col=1;col<=7;col++)
		{
			System.out.print("* ");
			
		}
		System.out.println();
	
		}

	}
}
