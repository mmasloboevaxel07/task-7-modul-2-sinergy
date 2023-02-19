package seven;

import java.util.*;

public class HomeWork7 {
    public static void main(String[] args) {
        // Task 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два слова для сравнения:");
        System.out.println(task1(scanner.nextLine(), scanner.nextLine()) ? "Введеные Вами слова одинаковые" : "Введенные Вами слова различны");

        // Task 2
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            integerList.add(random.nextInt(0, 100));
        }
        System.out.println("Список чисел: " + integerList);
        System.out.println("Количество нечетных чисел из списка: " + integerList.stream().filter(i -> i % 2 != 0).count());

        // Task 3
        List<String> words = Arrays.asList("Bill", "Jack", "Bob", "Jill", "Mark", "Ann", "Ben", "Alice", "Alex");
        System.out.println("Введите букву:");
        char c = scanner.next().toLowerCase().charAt(0);
        words.stream().filter(word -> word.toLowerCase().charAt(0) == c).forEach(System.out::println);
    }

    public static boolean task1(String str1, String str2) {
        boolean isEquals = true;
        if (str1.length() != str2.length()) isEquals = false;
        else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)){
                    isEquals = false;
                    break;
                }
            }
        }
        return isEquals;
    }
}