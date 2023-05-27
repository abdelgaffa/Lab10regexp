import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extract2 {
    public static void main(String[] args) {
        File file = new File("E:/my projects/2cemester/AhmedLabs/Ahmed'sAlgo/Lab10regexp/src/Input.txt");

        try (Scanner scanner = new Scanner(file)) {
            StringBuilder sb = new StringBuilder();
            Pattern pattern = Pattern.compile("\\b\\d+\\b");
            boolean firstMatch = true;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Matcher matcher = pattern.matcher(line);

                while (matcher.find()) {
                    if (firstMatch) {
                        firstMatch = false;
                    } else {
                        sb.append(",");
                    }
                    sb.append(matcher.group());
                }
            }

            System.out.println(sb.toString());
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
