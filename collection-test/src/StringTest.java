import java.util.HashMap;
import java.util.Map;

public class StringTest {
    public static void main(String[] args) {
//        String str = "abc";
//        String newString = strAppend(str);
//        System.out.println(newString);
        StringBuffer string1 = new StringBuffer("a");
        StringBuffer string2 = new StringBuffer("ab");

        Map<StringBuffer, Integer> map = new HashMap<>();
        map.put(string1,1);
        map.put(string2,2);
        System.out.println(map.toString());
        StringBuffer string3 = string1;
        string3.append("b");
        System.out.println(map.toString());

    }

//    public static String strAppend(String str){
//        str += "ddd";
//        return str;
//
//
//    }
}
