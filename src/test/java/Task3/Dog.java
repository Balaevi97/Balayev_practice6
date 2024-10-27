package Task3;

public class Dog extends Mammal{
    public String breed1;
    public String breed2;
    public String breed3;
    public String breed4;

    public Dog () {
        super();
        this.breed1 = "German Shepherd";
        this.breed2 = "Husky";
        this.breed3 = "French Bulldog";
        this.breed4 = "Golden Retriever";
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("ეს არის ყველა სახეობის ცხოველი რომელიც Animal კლასში არის გაწერილი: " + dog.species1 + ", " + dog.species2 + ", " + dog.species3 + ", " + dog.species4 + ".");
        System.out.println("ეს არის ყველა საკვების სახეობა რომელიც Mammal კლასში არის გაწერილი: " + dog.diet1 + ", " + dog.diet2 + ", " + dog.diet3 + ", " + dog.diet4 + ".");
        System.out.println("ეს არის ყველა ძაღლის სახეობა რომელიც Dog კლასში არის გაწერილი: " + dog.breed1 + ", " + dog.breed2 + ", " + dog.breed3 + ", " + dog.breed4 + ".\n");

        System.out.println(dog.breed1 + " is one of the most popular " + dog.species1 + " breed, which loves to eat " + dog.diet4 + ".");

    }
}
