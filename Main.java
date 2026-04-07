public class Main
{
public static void main(String[] args)
{
student s1=new student("krishna",38, 90);
student s2=new student("Amit",13,45);
student s3=new student("Sumit",23,46);
cars c2=new cars("Red","Honda City",190);
c2.show_cars();
c2.accelerate(40);
cars c1=new cars("Yellow","Toyata",200);
c1.show_cars();
c1.accelerate(50);
System.out.println("<-------------------Details are here ------------>");
s1.displayinfo();
s1.check_result();
double percentage1=s1.getPercentage(200);
System.out.println("Your percentage is : "+ percentage1);
//System.out.println()
s2.displayinfo();
s2.check_result();
double percentage2=s2.getPercentage(200);
System.out.println("Your percentage is : "+ percentage2);
s3.displayinfo();
s3.check_result();
double percentage3=s3.getPercentage(200);
System.out.println("Your percentage is : "+ percentage3);

System.out.println("<---------------Banking process start ----------------->");
bankAccount b1=new bankAccount("Maurya","987654321",2000);
//b1.deposit(2000);

b1.show_ballance();
b1.deposit(4000);

System.out.println("<----------Employee Class is being called --------->");
Employee e1=new Employee("Maurya","Software Support",300000);
Employee e2=new Employee("Chandra","Tech Support",500000);
e1.showsalaryslip();
e2.showsalaryslip();

System.out.println("<----------Rectangle Class is being called --------->");
Rectangle R1=new Rectangle(200.0,100.0);
Rectangle R2=new Rectangle(20.0,20.0);
R1.showInfo();
R2.showInfo();

System.out.println("<----------Library Class is being called --------->");
Library l1=new Library("kcm","Kasari masari",2009);
l1.issueBook("Raj");
l1.returnBook();

System.out.println("<----------context is being called --------->");
SimpleContext context=new SimpleContext();
context.put("Name","Maurya");
String rtr=context.get("Name");
System.out.println("The Value of the key is :"+ rtr);

}
}