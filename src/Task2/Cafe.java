package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    ArrayList<String> coffeeMenu = new ArrayList<String>();



    public void loadMenuData (){
        File file = new File("C:\\Users\\Lukas\\IdeaProjects\\Torsdags Opgaver\\Torsdags Opgave 5\\src\\Task2\\coffees.txt");
        try {
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()) {
                coffeeMenu.add(fileReader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}
