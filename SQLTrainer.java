public class SQLTrainer extends Trainer
{
public SQLTrainer(String dept,String inst)
{
super(dept,inst);
System.out.println("welcome");
}
public static void main(String[] args)
{
SQLTrainer ram=new SQLTrainer("java","payilagam");
System.out.println(ram.inst);
System.out.println(ram.dept);
int Salary=ram.getSalary();
System.out.println(Salary);
ram.training("CSE","payilagam");
}
}
