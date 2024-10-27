public class Car1 {

        private String brand;
        private int year;
        private int price;


        public Car1(String carBrand, int carYear, int carPrice) {
            this.brand = carBrand;
            this.year = carYear;
            this.price = carPrice;

        }

        public Car1(String carBrand) {
            this(carBrand, 2005, 50000);
        }

        public static void main(String[] args) {
            Car1 car1 = new Car1("Mercedes");
            Car1 car1_2 = new Car1("BMW", 2010,80000);

            System.out.println("Task6.Car brand is " + car1.brand + ", year is " + car1.year + " and price is " + car1.price + "$!");
            System.out.println("Task6.Car brand is " + car1_2.brand + ", year is " + car1_2.year + " and price is " + car1_2.price + "$!");
        }

}
