import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 5, 2, 8, 9, 8, 5, 6, 7, 6, 2, 10, 8}; // Örnek bir dizi

        // Frekansları saklamak için bir Map oluşturuyoruz
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Dizideki her bir sayının frekansını hesaplıyoruz
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Her bir sayının frekansını ekrana yazdırıyoruz
        System.out.println("Dizideki elemanların frekansları:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();
            System.out.println(number + " : " + frequency);
        }
    }
}
