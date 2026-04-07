public class Rectangle {
    double length;
    double width;
    Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    double getArea()
    {
        return (length * width);

    }
    double getPerimeter()
    {
        return(2 * (length + width));
    }

    boolean isSquire()
    {
        return length == width;
    }

    void showInfo()
    {
        System.out.println("Length is :" + length);
        System.out.println("Width is  :" + width);
        System.out.println("Area is   :" + getArea());
        System.out.println("Perimeter is :" + getPerimeter());
        System.out.println("Is it Squire :" + isSquire());
    }
    
}
