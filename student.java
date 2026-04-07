public class student {
    
    String name;
    int age;
    double marks;
    void displayinfo()
    {
        System.out.println("Name is :"+ name);
        System.out.println("Age is :"+ age);
        System.out.println(" marks is :"+ marks);
    }
    student(String name,int age,double marks)
    {
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    void check_result()
    {
        if(marks>45)
        {
            System.out.println("You are pass :");
        }
        else
            System.out.println("You are fail : ");
    }
    double getPercentage(double totmarks)
    {
return (marks/totmarks)*100;
    }
}

