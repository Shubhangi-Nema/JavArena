import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<WMA> wmaAppList = new ArrayList<>();
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 3, 5));
        wmaAppList.add(new WMA("Banking", "Balaji", 5));
        wmaAppList.add(new WMA("OLS", "Sandeep Shetty", 8));
        wmaAppList.add(new WMA("SRE", "Sridhar ganpati", 7));
    Comparator<WMA> comparator = new Comparator<WMA>() {
        @Override
        public int compare(WMA o1, WMA o2) {
            return o1.compareTo(o2);
        }
    };
        Collections.sort(list);
        Collections.sort(wmaAppList,comparator);
        System.out.println(wmaAppList);
        Collections.sort(wmaAppList);
        System.out.println(wmaAppList);

    }


}