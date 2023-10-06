package Task2;

import java.io.File;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.loadMenuData();
        for(String menu: cafe.coffeeMenu){
            System.out.print(menu + "\n");
    }

    }
}
