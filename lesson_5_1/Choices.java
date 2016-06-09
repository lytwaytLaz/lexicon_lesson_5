package lesson_5_1;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-09
 */
public class Choices
{
    public String a = new String();
    public String b = new String();
    String c = new String();
    String d = new String();

    public Choices(String a, String b, String c, String d)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

        Map<String, String> choices = new TreeMap<>();
        choices.put("A", this.a);
        choices.put("B", this.b);
        choices.put("C", this.c);
        choices.put("D", this.d);
    }



}
