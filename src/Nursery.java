/**
 * ADD YOUR NAMES HERE WITH CORRECT @author
 * Nursery.java
 * CIS 36B, Lab 8
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Nursery implements Catalogue<Plant> { //update to inherit from Catalogue

    private Plant[] plants = new Plant[20]; //set to 20 for testing purposes
    private int numPlants = 0;

    public static void main(String[] args) {
        System.out.println("Nursery Stock Prototype\n");
        Nursery n = new Nursery();
        String choice = "";
        try {
            Scanner input = new Scanner(new File("/home/naveed/PlantStore/src/nursery_stock.txt"));
            n.populateCatalogue(input);
//            n.printMenu();
//
//            while(!choice.equalsIgnoreCase("X")) {
//
//                choice = input.nextLine();
//
//                if(choice.equalsIgnoreCase("V")) {
//
//                } else if(choice.equalsIgnoreCase("A")) {
//                    System.out.println("\nSelect one of the following:");
//                    System.out.println("\n1. Tree");
//                    System.out.println("2. Perennial");
//                    System.out.println("3. Bulb");
//                    System.out.print("\nEnter your choice: ");
//                    choice = input.nextLine();
//                    Plant p;
//                    if(choice.equals("1")) { //Tree
//
//
//                    } else if (choice.equals("2")) { //Perennial
//
//
//                    } else { //Bulb
//
//                    }
//
//                    System.out.println("\nBelow is the current inventory:\n");
//
//                    System.out.print("\nEnter the location to insert a new plant: ");
//                    int loc = Integer.parseInt(input.nextLine());
//                    try {
//
//                    } catch () {
//
//                    } catch () {
//
//                    }
//                } else if(choice.equalsIgnoreCase("R")) {
//
//                    try {
//
//                    } catch () {
//
//                    }
//                } else if(choice.equalsIgnoreCase("F")) {
//
//
//                } else if(choice.equalsIgnoreCase("X")){
//                    input.close();
//                    System.out.println("\n\nGoodbye!");
//                } else {
//                    System.out.println("\nInvalid menu option.\n");
//                }
//            }

        } catch (IOException e) {
            System.out.println("Cannot open file nursery_stock.txt.\n\nGoodbye!");
        }

    }

    @Override
    public void populateCatalogue(Scanner input) throws IOException {
        try {

            int index = 0;
            while (input.hasNextLine()) {
                String className = input.nextLine();
                if (className.equals("Perennial")) {
                    Perennial p = new Perennial();
                    String[] attributes = new String[4];
                    for (int i = 0; i < 4; i++) {
                        attributes[i] = input.nextLine();
                    }
                    p.setName(attributes[0]);
                    p.setPrice(Double.parseDouble(attributes[1]));
                    p.setLowWater(attributes[2].equals("low water"));
                    p.setNative(attributes[3].equals("native"));

                    plants[index] = p;
                    index++;

                }else if(className.equals("Tree")){
                    Tree t = new Tree();
                    String[] attributes = new String[5];
                    for (int i = 0; i < 4; i++) {
                        attributes[i] = input.nextLine();
                    }
                    t.setName(attributes[0]);
                    t.setPrice(Double.parseDouble(attributes[1]));
                    t.setLowWater(attributes[2].equals("low water"));
                    t.setNative(attributes[3].equals("native"));
                    t.setDeciduous();
                    plants[index] = p;
                    index++;
                }
            }
        } catch (Exception e) {

        }
    }

    @Override
    public int binarySearch(Plant plant) {
        return 0;
    }

    @Override
    public void bubbleSort() {

    }

    @Override
    public void printMenu() {

    }

    @Override
    public void printStock() {

    }

    @Override
    public void addElement(Plant element, int index) throws IndexOutOfBoundsException, IllegalStateException {

    }

    @Override
    public Plant removeElement(int index) throws IndexOutOfBoundsException {
        return null;
    }
}