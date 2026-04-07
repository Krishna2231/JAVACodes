public class Employee {
    String empname="Krishna";
    String department ="Software Support";
    double basicsalary=200000;
    
    Employee(String empname, String department, double basicsalary)
    {
        this.empname= empname;
        this.basicsalary= basicsalary;
        this.department= department;

    }

    double calculatenetsalary()
    {
        double hra= basicsalary * 0.20;
        double ta= basicsalary * 0.10;
        double deduction= basicsalary * 0.12;

        return basicsalary + hra + ta - deduction;
    }

    void showsalaryslip()
    {
        double hra= basicsalary * 0.20;
        double ta= basicsalary * 0.10;
        double deduction= basicsalary * 0.12;
        double netsal= calculatenetsalary();

        System.out.println("<-----------Salary Slip ------------>");
        System.out.println("Employee Name :"+empname);
        System.out.println("Department   :"+department);
        System.out.println("Basic Salary :"+basicsalary);
        System.out.println("HRA :"+hra);
        System.out.println("TA :"+ta);
        System.out.println("Deduction :"+deduction);
        System.out.println("Net salary :"+netsal);
    }
}
