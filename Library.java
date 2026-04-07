public class Library {
    String author;
    int year;
    String title;
    boolean isAvaialable;

    Library(String author, String title, int year)
    {
    this.author=author;
    this.title=title;
    this.year=year;
    this.isAvaialable=true;

    }

    void issueBook(String studentName)
    {
        if(isAvaialable)
        {
       isAvaialable=false;
       System.out.println(title +" Issue to Student "+ studentName);

        }
        else{
            System.out.println("Sorry! Book "+title+" is already issue :");
        }
    }

    void returnBook()
    {
    isAvaialable=true;
    System.out.println("The books " +title+  " has been returnd successfully :");

    }

    
}
