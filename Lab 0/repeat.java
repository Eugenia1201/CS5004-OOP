import java.util.ArrayList;
import java.util.List;

public class repeat {
    public static List<Integer> removeRepeat(List<Integer> arr) {
        int size = arr.size();
        List<Integer> repeated = new ArrayList<>();

        for (int i = 0; i < size - 1; i++) {
            int k = i + 1;
            for (int j = k; j < size - 1; j++) {
                if (arr.get(i) == arr.get(j) && !repeated.contains(arr.get(i))) {
                    repeated.add(arr.get(i));
                }
            }
        }
        return repeated;
    }
    
    public static void main(String[] args) {
        List<Integer> list1 = List.of(10, 20, 30, 20, 20, 30, 40, 50, -20, 60, 60, -20, -20);
        List<Integer> result = removeRepeat(list1);
        System.out.println(result);
    }
}
