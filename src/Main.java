import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // a) Создаем списки А и Б
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();

        // b) Считываем 5 строк от пользователя и сохраняем их в список А
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 строк для списка А:");
        for (int i = 0; i < 5; i++) {
            String line = scanner.nextLine();
            listA.add(line);
        }

        // c) Выводим список А
        System.out.println("Список А:");
        for (String item : listA) {
            System.out.println(item);
        }

        // d) Считываем еще 5 строк от пользователя и сохраняем их в список Б
        System.out.println("Введите 5 строк для списка Б:");
        for (int i = 0; i < 5; i++) {
            String line = scanner.nextLine();
            listB.add(line);
        }

        // e) Объединяем списки А и Б в список С
        List<String> listC = new ArrayList<>();
        int size = Math.max(listA.size(), listB.size());
        for (int i = 0; i < size; i++) {
            if (i < listA.size()) {
                listC.add(listA.get(i));
            }
            if (i < listB.size()) {
                listC.add(listB.get(listB.size() - 1 - i));
            }
        }

        // f) Выводим список С
        System.out.println("Список С:");
        for (String item : listC) {
            System.out.println(item);
        }

        // g) Сортируем элементы списка С по длине слова
        Collections.sort(listC, Comparator.comparingInt(String::length));

        // Выводим отсортированный список С
        System.out.println("Отсортированный список С:");
        for (String item : listC) {
            System.out.println(item);
        }
    }
}
