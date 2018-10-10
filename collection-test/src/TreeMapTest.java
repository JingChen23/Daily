import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Bob", 3);
        treeMap.put("Chanler", 1);
        treeMap.put("Adam", 2);
        System.out.println(treeMap.pollFirstEntry());
        System.out.println(treeMap.pollFirstEntry());

    }
}
