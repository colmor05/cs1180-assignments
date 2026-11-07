class Car {
    String color;
    int year;

    Car(String carColor, int carYear) {
        color = carColor;
        year = carYear;
    }

    void drive() {
        System.out.println("Vroom! the " + color + " car is driving");
    }
}