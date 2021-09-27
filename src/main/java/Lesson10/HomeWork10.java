package Lesson10;

import java.util.*;

public class HomeWork10 {

    public static void main(String[] args) {

        String[] wordsArray = {
                "Кот", "Пес", "Жираф", "Слон", "Тигр",
                "Лев", "Кот", "Панда", "Медведь", "Выдра",
                "Слон", "Обезьяна", "Гепард", "Косуля", "Олень",
                "Лама", "Обезьяна", "Барс", "Хомячок", "Енот"
        };

        Set<String> set = new HashSet<>();
        for (int i = 0; i < wordsArray.length; i++) {
            set.add(wordsArray[i]);
        }
        System.out.println("Уникальные слова: " + set);

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < wordsArray.length; i++) {
            map.put(wordsArray[i], map.getOrDefault(wordsArray[i], 0) + 1);
        }
        System.out.println("Кол-во повторений слов: " + map);
        System.out.println(" ");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Волков", 44699);
        phoneBook.add("Волков", 41065);
        phoneBook.add("Иванов", 42102);
        phoneBook.add("Казаков", 45633);
        phoneBook.get("Волков");
    }
}
