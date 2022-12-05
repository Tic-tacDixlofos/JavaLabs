import java.util.Random;
import java.util.Scanner;

public class MyClass2 {
    public static void main (String[] args ){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Heads or Tails");
        String mon = scan.nextLine();

        System.out.println("U choose: "+ mon);

        String[] card = {"Heads", "Tails"};
        int index = (new Random()).nextInt(2);

        if(mon.equals(card[index])){
            System.out.println("U win");
        } else {
            System.out.println("U loose");
        }
    }
}