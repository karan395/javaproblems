import java.util.*;

public class findsubsets {

    public static void printsub(ArrayList<Integer> subsset) {

        for (int i = 0; i < subsset.size(); i++) {

            System.out.print(subsset.get(i) + "  ");
        }
        System.out.println();

    }

    public static void findsubset(int n, ArrayList<Integer> subset) {

        if (n == 0) {

            printsub(subset);
            return;
        }
        /// add hoga

        subset.add(n);
        findsubset(n - 1, subset);

        /// add nhi hoga

        subset.remove(subset.size() - 1);
        findsubset(n - 1, subset);

    }

    public static void main(String[] args) {
        ArrayList<Integer> subset = new ArrayList<>();

        int n = 3;
        findsubset(n, subset);
    }
}
