public class Class12 {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("Red", 2024);
        Car car2 = new Car("Blue", 2018);

        System.out.println("Car 1 is a " + car1.color + " made in " + car1.year);
        car1.drive();
        System.out.println("Car 2 is a " + car2.color + " made in " + car2.year);
        car2.drive();
    }
}
