package gb_Java.HW;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//// методы или один метод поиска ноутбуков по заданным параметрам

public class LaptopService {
    protected static String text = "Введите цифру, соответствующую необходимому критерию:\n" +
            1 + "- OS(операционная система)\n" +
            2 + "- Memory(размер памяти)\n";
    protected static String text1 = "Выберете тип операционной системы:\n" +
            1 + " - Wind\n" +
            2 + " - hp\n";

    protected static String text2 = "Выберете размер памяти:\n" +
            "126\n" +
            "526\n" +
            "256\n";

    protected static String text3 = "продолжаем выбирать y- 1/n - 0:\n";

    // метод запрашивает параметры у пользователя
    public static void AskParametrUser(int userParametr, Scanner isScanner, List<String> userParametrList) {
        switch (userParametr) {
            case 1:
                System.out.println(text1);
                int userCriteria1 = isScanner.nextInt();
                switch (userCriteria1) {
                    case 1:
                        userParametrList.add(0, "Wind");
                        userParametrList.add(1, null);
                        break;
                    case 2:
                        userParametrList.add(0, "hp");
                        userParametrList.add(1, null);
                        break;
                }
                break;
            case 2:
                System.out.println(text2);
                Integer userCriteria2 = isScanner.nextInt();
                userParametrList.add(0, null);
                userParametrList.add(1, userCriteria2.toString());

                break;
        }
    }

    // метод отбирает ноутбуки по параметрам
    public static Set<Laptop> GetForUserLaptops(Set<Laptop> laptops, List<String> userParametrList) {
        Set<Laptop> userLaptops = new HashSet<>();

        for (Laptop laptop : laptops) {
            Integer laptopMemory = laptop.getMemory();
            String laptopMemoryString = laptopMemory.toString();
            if ((laptop.getModel()).equals(userParametrList.get(0))) {
                userLaptops.add(laptop);
            }
            if (laptopMemoryString.equals(userParametrList.get(1))) {
                userLaptops.add(laptop);
            }
        }
        return userLaptops;
    }

    // метод вывода результата на экран
    public static void printUserLaptop(Set<Laptop> userLaptops) {
        for (Laptop laptop : userLaptops) {
            System.out.println("модель: " + laptop.getModel() + ", размер памяти: " + laptop.getMemory());
        }

    }
}


