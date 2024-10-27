
import java.util.InputMismatchException;
import java.util.Scanner;

public class Car {
                                            // დავალება #1

    private String model;
    private int year;
    private double price;

    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;

        if (year <= 2000 || year >= 2024) {
            System.out.println("Please enter years between 2000-2024");
        }
        if (price < 0) {
            System.out.println("Please enter positive number");
        }
    }


                                                 // დავალება #1 სკანერით

//    public Car() {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter car model: ");
//        model = scanner.nextLine();
//        System.out.println("Enter car producing year (enter only integer between 2000-2024): ");
//        year = scanner.nextInt();
//
//        while (true) {
//            try {
//
//                if (year < 2000 || year > 2024) {
//                    System.out.println("Please enter years between 2000-2024");
//                    year = scanner.nextInt();
//                } else {
//                    break;
//                }
//            } catch (Exception e) {
//
//            }
//        }
//        System.out.println("Enter car price (in integer): ");
//
//        while (true) {
//            try {
//                price = scanner.nextInt();
//                if (price < 0 ) {
//                    System.out.println("Please enter positive number");
//                    scanner.nextInt();
//                } else {
//                    break;
//                }
//            } catch(InputMismatchException e){
//                System.out.println("Error. price is not correct. Please enter number instead of letters and symbols ");
//                scanner.next();
//            }
//        }
//    }



                                             // დავალება #2
//
//    public Car(String model, int year, double price) {
//        this.model = model;
//        this.year = year;
//        this.price = price;
//    }
//
//    public Car(String carBrand) {
//
//        this(carBrand, 2005, 50000);
//    }

    public static void main(String[] args) {

                                                // დავალება #1


        Car car = new Car("BMW", 2010, 30000);
        System.out.println("\n 1.Car brand is " + car.model + ", year is " + car.year + " and price is " + car.price + "\n");

        Car car1 = new Car("Toyota", 1989, 20000);
        System.out.println("2.Car brand is " + car1.model  + ", year is " + car1.year + " and price is " + car1.price + "\n");

        Car car2 = new Car("Nissan", 2015, -20000);
        System.out.println("3.Car brand is " + car2.model  + ", year is " + car2.year + " and price is " + car2.price + "\n");

        Car car3 = new Car("Mercedes", 1999,-10000 );
        System.out.println("4.Car brand is " + car3.model  + ", year is " + car3.year + " and price is " + car3.price + "\n");

                                                // დავალება #1 სკანერით
//        Car car4 = new Car();
//        System.out.println("\n Your car brand is " + car4.model + ", year is " + car4.year + " and price is " + car4.price + "$");

                                                    // დავალება #2

//        Car car5 = new Car("BMW", 2010,80000);
//        Car car6 = new Car("Mercedes");
//
//        System.out.println("Car brand is " + car5.model + ", year is " + car5.year + " and price is " + car5.price + "$!\n");
//        System.out.println("Car brand is " + car6.model + ", year is " + car6.year + " and price is " + car6.price + "$!\n");
    }


}



