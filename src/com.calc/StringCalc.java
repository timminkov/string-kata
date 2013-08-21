import sun.misc.Regexp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 8/21/13
 * Time: 1:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalc {
    public int add(String numbers) {
        String delimiter = new String("(\\D+)");
        String comparison = new String();
        if (numbers.startsWith("[")) {

        }
        else if (numbers.startsWith("\\D")) {

        }
        try {
            int sum = 0;
            String[] moreNumbers = (numbers.split("(\\D+)"));
            for (String number : moreNumbers) {
                sum += Integer.parseInt(number);
            }
            return sum;
        }
        catch (NumberFormatException num) {
            return 0;
        }
    }
}
