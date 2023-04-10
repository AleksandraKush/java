package hometask06;

import java.util.ArrayList;


public class task {
    public task(String[] args) {

        ArrayList<nb> laptops = new ArrayList<>();
        laptops.add(new nb("Asus", "VivoBook PRO 15", "Blue", 15.6, "AMD Ryzen 5 5600H", 16, 512, false, 66999));
        laptops.add(new nb("Apple", "MacBook Air", "Silver", 13.3, "Apple M1", 8, 256, true, 83699));
        laptops.add(new nb("HUAWEI", "MateBook D16", "Black", 16, "Intel Core i7-12700H", 16, 512, false, 79999));
        filterByColor(laptops, "Black");
        filterByMinRAM(laptops, 8);
    }

    public static void filterByColor(ArrayList<nb> laptops, String value) {
        laptops.removeIf(laptop -> (!(laptop.color.equals(value))));
        laptops.forEach(nb::printInfo);
    }

    public static void filterByMinRAM(ArrayList<nb> laptops, int value) {
        laptops.removeIf(laptop -> (laptop.RAM < value));
        laptops.forEach(nb::printInfo);
    }
}