import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Extract4 {
    public static void main(String[] args) {
        // RGB color in hexadecimal form
        testRegex("#FFFFFF", "^#([A-Fa-f0-9]{6})$");
        // Date in the format dd/mm/yyyy, starting from 1600 to 9999
        testRegex("29/02/2000", "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(1[6-9][0-9]{2}|[2-9][0-9]{3})$");
        // Valid E-mail address according to RFC number 2822
        testRegex("mail@mail.ru", "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        // IP address in decimal form
        testRegex("127.0.0.1", "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|[0-9])$");
    }

    public static void testRegex(String testString, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(testString);
        if (matcher.matches()) {
            System.out.println(testString + " matches the pattern " + regex);
        } else {
            System.out.println(testString + " does not match the pattern " + regex);
        }
    }
}
