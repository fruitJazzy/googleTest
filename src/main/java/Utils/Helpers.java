package Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Renat on 23.06.2016.
 */
public class Helpers {
    public static String parseString(String text, String sub) {
        Pattern p = Pattern.compile(sub);
        Matcher m = p.matcher(text);
        return  m.find()? m.group() : "";
    }
}
