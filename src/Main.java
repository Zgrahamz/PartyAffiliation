// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String pParty;

        System.out.println("Enter party affiliation: D, R, I, Other");
        pParty = sca.nextLine();

        if(Objects.equals(pParty, "D")) {
            System.out.println("You get a Democratic Donkey");
        } else if(Objects.equals(pParty, "R")) {
            System.out.println("You get a Republican Elephant");
        } else if(Objects.equals(pParty, "I")) {
            System.out.println("You get an Independent Man");
        } else {
            System.out.println("You have transcended reality");
        }
    }
}