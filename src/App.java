import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("====================\n");

        String[] list1 = new String[] { "morango", "uva", "acerola", "manga" };
        String[] list2 = new String[] { "melancia", "acerola", "morango", "kiwi" };
        List<String> duplicates = new ArrayList<>();

        for (int i = 0; i < list1.length; i++) {
            String currentItemList1 = list1[i];

            for (int j = 0; j < list2.length; j++) {
                String currentItemList2 = list2[j];

                if (currentItemList1.equals(currentItemList2)) {
                    duplicates.add(currentItemList1);
                    break;
                }
            }
        }

        System.out.println("Lista 1: " + Arrays.toString(list1));
        System.out.println("Lista 2: " + Arrays.toString(list2));
        System.out.println("Itens duplicados: " + duplicates.toString());

        System.out.println("\n====================");
    }
}
