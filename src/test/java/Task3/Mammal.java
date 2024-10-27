package Task3;

public class Mammal extends Animals{
    public String diet1;
    public String diet2;
    public String diet3;
    public String diet4;

    public Mammal () {
        super();
        this.diet1 = "grass";
        this.diet2 = "fruit";
        this.diet3 = "vegetables";
        this.diet4 = "meat";

        System.out.println(species4 + " eats " + diet1);
        System.out.println(species3 + " eats " + diet3);
        System.out.println(species2 + " eats " + diet2);
        System.out.println(species1 + " eats " + diet4 + "\n");
    }
}
