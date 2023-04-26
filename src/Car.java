public class Car {
    int modelYear;
    String modelName;
    public  Car(int year, String name){
        this.modelYear = year;
        this.modelName = name;
    }

    public static void main(String[] args) {
        Car car = new Car(1973, "Volvo");
        System.out.println(car.modelYear + " " + car.modelName);
    }
}

//    // Create a fullThrottle() method
//    public  void fullThrottle() {
//        System.out.println("The car is going as fast as it can!");
//    }
//
//    // Create a speed() method and add a parameter
//    public static void speed(int maxSpeed) {
//        System.out.println("Max speed is: " + maxSpeed);
//    }
//
//    // Inside main, call the methods on the myCar object
//    public static void main(String[] args) {
//        Car myCar = new Car();     // Create a myCar object
//        Car.speed(200);      // Call the fullThrottle() method
//        speed(200); // Call the speed() method
//        myCar.fullThrottle();
//    }
//}