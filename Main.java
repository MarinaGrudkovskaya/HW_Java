package gb_Java.HW;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Wind", 126);
        Laptop laptop2 = new Laptop("Wind", 256);
        Laptop laptop3 = new Laptop("hp", 126);
        Laptop laptop4 = new Laptop("hp", 526);
        Laptop laptop5 = new Laptop("hp", 256);

        Set<Laptop> laptops = new HashSet<>();

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);

        System.out.println("Выберете парамтры: ");
        System.out.println(LaptopService.text);
        Scanner isScanner = new Scanner(System.in);
        int userParametr = isScanner.nextInt();

        List<String> userParametrList = new ArrayList<>(2);
        LaptopService.AskParametrUser(userParametr, isScanner, userParametrList);


        Set<Laptop> userLaptops = LaptopService.GetForUserLaptops(laptops, userParametrList);

        System.out.println("Вам подойдут следующие модели -> ");

        LaptopService.printUserLaptop(userLaptops);


    }

    }


