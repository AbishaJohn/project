package While;

public class BasicProgram2 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
BasicProgram2 bp=new BasicProgram2();
//bp.Leastcommonmultiple();
//bp.Greatestcommonmultiple();
//bp.primeno();
//bp.prime20();
//bp.factorial();
//bp.reverseanumberandpalindrome();
//bp.printingsquarenumber();
//bp.reversenumber();
//bp.decimaltobinary();
//bp.binarytodecimal();
//bp.factorial54321();
//bp.armstrong();// 153
//bp.strongnum();
bp.neonnum();


	}


	private void neonnum() {
		// TODO Auto-generated method stub
		int num=9;
		int sqr=num*num;
		int sum=0;
		while(sqr>0)
		{
			int rem=sqr%10;
			sum=sum+rem;
			sqr=sqr/10;
		}
		System.out.println(sum);
		if(sum==num)
		{
			System.out.println("neon");
		}
		else
		{
			System.out.println("not neon");
		}
	}
			
	


	private void strongnum() {
		// TODO Auto-generated method stub
		int no=145;
		int sum=0;
		int rem=no%10;
		int fact=1;
		int no2=rem;
		
		while(no2>0)
		{
		
		fact=no2*fact;
		no2--;
		
		}
	  sum=sum+fact;
		no=no/10;
		System.out.println(sum);
	}


	private void armstrong() {
		// TODO Auto-generated method stub
		int no=153;
		int no2=no;
		int arm=0;
		do
		{
			int rem=no%10;
			arm=arm+(rem*rem*rem);
			no=no%10;
		
		}
		while(no>0);
		if(no2==arm)
		{
		
		System.out.println(arm);
		
	}
	}


	private void factorial54321() {
		// TODO Auto-generated method stub
		int num=5;int i=num;
		int fact=1;
		
		while(i>0)
		{
		while(num>0)
		{
			fact=num*fact;
			num--;
		
		}
		System.out.println(fact);
	    i--;
	
	}
		
	}


	private void binarytodecimal() {
		// TODO Auto-generated method stub
		int binary=011;
		int no=0;
		while(binary>0)
		{
		int rem=binary%10;
		int i=0;
		 no=(no+(rem*Math.pow(2, i)));
		
		binary=binary/10;
		
		i++;
		}
		System.out.println(no);
	}

	private void decimaltobinary() {
		// TODO Auto-generated method stub
		int no=8;
		String binary="";
		while(no>0)
		{
		int rem=no%2;   //0 0 0 1
		binary=rem+binary;   // 1 0 0 0 
		no=no/2;    // 4 2 0
		
	}
		System.out.println(binary);
	}
	private void reversenumber() {
		// TODO Auto-generated method stub
		int no=5678;
		while(no>0)
		{
		int rem=no%10;
		no=no/10;
		
		System.out.println(rem);
		}
		
	}

	private void printingsquarenumber() {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=5)
		{
			System.out.println(Math.pow(i,i));
			i++;
		}
	}

	private void reverseanumberandpalindrome() {
		// TODO Auto-generated method stub
		int no=56765;
		int no1=no;
		int total=0;
          while(no>0)
          {
		int rem=no%10;
		total=((total*10)+rem);
		no=no/10;
          }
         
		System.out.println(total);
		if(no1==total)
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

	private void factorial() {
		// TODO Auto-generated method stub
		int no=5;
		int fact=1;
		while(no>0)
		{
		fact=fact*no;
		no--;
		}
		System.out.println(fact);
	}

	private void prime20() {
		// TODO Auto-generated method stub
		
	}

	private void primeno() {
		// TODO Auto-generated method stub
		int no=15;
		int i=2;
		boolean prime=true;
		while(i<no)
		{
		if(no%i==0)
		{
			prime=false;
		
		
			System.out.println(" not prime no");
		
			i++;
		}
		}
		if(prime==true)
		{
				System.out.println("prime no");
		}
	
		
	}
	
		
		
	
	
	private void Greatestcommonmultiple() {
		// TODO Auto-generated method stub
		int no1=12;int no2=30;
		int Gcd=0;
		int min=no1<no2?no1:no2;
		while(true)
		{
		if((no1%min==0) && (no2%min==0))
		{
			System.out.println("Gcd is"  + min);
break;
		}
		min--;
		}
	}

	private void Leastcommonmultiple() {
		// TODO Auto-generated method stub
		int no1=3;
		int no2=5;
		int lcm = 0;
		int max=no1>no2?no1:no2;
		while(true)
		{
		if((max%no1==0) && (max%no2==0))
		{
			System.out.println("lcm is"  + max);
			break;
			
		}
		max++;
		
		
		}
	}

}
