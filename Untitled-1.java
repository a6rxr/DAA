import java.util.*;

class Main {
    public static void main(String[] args) {
        String[] arr = {"Ramesh", "Mahesh", "Mahesh", "Ramesh"};

        // Count frequency
        Map<String, Integer> freq = new HashMap<>();
        for (String s : arr) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }

        // Put unique strings into a list
        List<String> list = new ArrayList<>(freq.keySet());

        // Sort by frequency, then alphabetically
        Collections.sort(list, (a, b) -> {
            int f1 = freq.get(a);
            int f2 = freq.get(b);
            if (f1 != f2)
                return f1 - f2;  // ascending frequency
            return a.compareTo(b);  // alphabetical
        });

        System.out.println(list);
    }
}
