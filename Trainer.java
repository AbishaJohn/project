public class Trainer
{
String dept,inst;
private int Salary=10000;
public Trainer(String dept,String inst)
{
this.dept=dept;
this.inst=inst;
}

public static void main(String[] args)
{
Trainer kumar=new Trainer("CSE","payilagam");
	System.out.println(kumar.dept);
	System.out.println(kumar.inst);
	kumar.training("CSE","payilagam");
}

public int getSalary()
{
return this.Salary;
}
public void training(String dept,String inst)
{
System.out.println("training");
}
}