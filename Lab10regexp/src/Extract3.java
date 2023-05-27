import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Extract3 {
    public static void main(String[] args) {
        try {
            String text = new String(Files.readAllBytes(Paths.get("E:/my projects/2cemester/AhmedLabs/Ahmed's Algo/Lab10regexp/src/Input2.txt")));
            Pattern pattern = Pattern.compile("[-+]?[0-9]*[.,]?[0-9]+");

            Matcher matcher = pattern.matcher(text);
            ArrayList<Double> numbers = new ArrayList<>();
            double sum = 0, maxNumber = Double.NEGATIVE_INFINITY;
            int maxNumberIndex = -1;

            while (matcher.find()) {
                String match = matcher.group();
                // replace comma with dot if present
                match = match.replace(',', '.');
                double number = Double.parseDouble(match);
                numbers.add(number);

                // update sum and check for max number
                sum += number;
                if (number > maxNumber) {
                    maxNumber = number;
                    maxNumberIndex = numbers.size() - 1;
                }
            }

            // Print results
            System.out.println("Extracted numbers: " + numbers);
            System.out.println("Sum of numbers: " + sum);
            System.out.println("Maximum number: " + maxNumber);
            // adding 1 because ordinal number starts from 1, not 0
            System.out.println("Ordinal number of maximum: " + (maxNumberIndex + 1));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
