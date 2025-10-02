import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> ht = new HashMap<>();
        ht.put("Температура", 23.5);
        ht.put("Процент", 87.2);
        ht.put("Скидка", 15.0);

        for (var entry : ht.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
