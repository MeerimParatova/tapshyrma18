public class Main {
    public static void main(String[] args) {

        Cow cow = new Cow(85, 12, "female", "Alamal");
        Sheep sheep = new Sheep(27, 4, "male", "Barash");
        Horse horse = new Horse (45, 8,"male", "Karakoz");

        Farm farm = new Farm("KR,Jalalabad", "5 cows", "2 horses", "3 sheep");
        Farm farm1 = new Farm ("KR, Jalalabad", "1 cows", "1 horse", "1 sheep" );

        System.out.println(cow);
        System.out.println(sheep);
        System.out.println(horse);
        System.out.println(farm);
        System.out.println(farm1);

    }
}