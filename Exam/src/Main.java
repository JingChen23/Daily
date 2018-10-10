import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<int[]> list= new LinkedList<>();
        while (in.hasNextInt()) {//注意while处理多个case
            int[] relation = new int[2];
            relation[0] = in.nextInt();
            relation[1] = in.nextInt();
            list.add(relation);
        }

        if (list.size()== 1) System.out.println(1);
        if (list.size()== 0) System.out.println(0);
        Main main = new Main();
        int root = main.findRoot(list);
        System.out.println(getDepth(root, list));
    }

    public static int getDepth(int root, List<int[]> list){
        List<Integer> sons = findSon(list , root);
        if (sons.size() == 0) return 1;
        if (sons.size()==1) return getDepth(sons.get(0), list)+1;
        else return Math.max(getDepth(sons.get(0), list),getDepth(sons.get(1), list))+1;
    }

    public static int findRoot(List<int[]> list){
        Set<Integer> set = new HashSet<>();
        for(int[] aa : list){
           set.add(aa[1]);
        }
        for(int[] aa : list){
            if (!set.contains(aa[0])){
                return aa[0];
            }
        }
        return 0;
    }

    public static List findSon(List<int[]> list , int father){
        List<Integer> sons = new ArrayList<>();
        for(int[] aa : list){
            if (aa[0] == father){
                sons.add(aa[1]);
            }
        }
        return sons;
    }
}