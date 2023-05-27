import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("abcd2023111111102023");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            String result = input.replace("2023", "happy new year");
            System.out.println("Result: " + result);
        } else {
            System.out.println("The entered string is not 'abcd2023111111102023'.");
        }

        scanner.close();
    }
}
