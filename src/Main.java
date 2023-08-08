
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);

        result.addAll(set2);
        Set<Integer> tmp = new HashSet<>(set1);
        tmp.retainAll(set2);
        result.removeAll(tmp);

        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);

        Set<Integer> result = symmetricDifference(set1, set2);
        System.out.println(result);
    }
}

