import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private static final String REGEX="^[A-Z]+[0-9]{4}+[G-M]+$";
    public static boolean validateClass(String regex){
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher= pattern.matcher(regex);
        return matcher.matches();
    }
}
