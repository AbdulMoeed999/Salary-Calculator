import java.util.Scanner;
class Salary{
public static void main(String args[])
{ 
 Scanner in=new Scanner(System.in);
 System.out.print("Enter Your Salary :"    );
 int salary=in.nextInt();
 if(salary>=10000)
{	 
  int bonus=(salary*10)/100;
  System.out.println("Your Salary is " + salary);
  salary=salary+bonus;
  System.out.println("Your bonus is " + bonus);
  System.out.println("Your total Salary is " + salary);
}
else
{
  int bonus=(salary*5)/100;
  salary=salary+bonus;
  System.out.println("Your total Salary is " + salary);
} 
}
}