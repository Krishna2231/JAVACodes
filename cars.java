public class cars
{
    String color="Red";
    String brand="Honda City";
    int speed=190;
    void show_cars()
    {
        System.out.println("The color is :"+color);
        System.out.println("The Brand is :"+brand);
        System.out.println("The speed is :"+speed+ " km/h");
    }
    void accelerate(int new_sp)
    {
        speed=speed+new_sp;
        System.out.println("New speed is "+ speed+" km/h");
    }
   cars(String color, String brand, int speed)
    {
    this.color=color;
    this.brand=brand;
    this.speed=speed;

    }

}