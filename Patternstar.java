package patternnumber;

public class Patternstar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Patternstar ps=new Patternstar();
		 ps.starandat1();
		 ps.printstarat2();
		 ps.printstarat3();
	}

	private void printstarat3() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int star=5;star>row;star--)
			  {
				  System.out.print(" *");
			  }
		  
		  for(int at=1;at<=row;at++)
		  {
			  System.out.print(" @ ");
		  }
		  System.out.println();
		}
		
	}

	private void printstarat2() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int star=5;star>row;star--)
			  {
				  System.out.print("* ");
			  }
		  
		  for(int at=1;at<=row;at++)
		  {
			  System.out.print("@ ");
		  }
		  System.out.println();
		}
	}

	private void starandat1() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++)
		{
			for(int at=1;at<row;at++)
			{
				System.out.print("@ ");
			}
				for(int star=5;star>=row;star--)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
	}

	
	}

	
