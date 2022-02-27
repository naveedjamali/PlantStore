/*
 * Catalogue.java
 * @author
 * CIS 36B, Lab 8
 */

import java.io.IOException;
import java.util.Scanner;

public interface Catalogue<T extends Comparable<T>> { //indicates that the type T will have a compareTo method
    /**
     * Reads from a file and populates the catalogue
     * @param input the Scanner used to read in the data
     */
    void populateCatalogue(Scanner input) throws IOException;

    /**
     * Searches for an element in the catalogue
     * @param t the element to locate
     * @return the location of the element in
     * the catalogue
     */
    int binarySearch(T t);

    /**
     * Sorts the catalogue into
     * ascending order using the
     * bubble sort algorithm
     */
    void bubbleSort();

    /**
     * Prints a menu of options to interact
     * with the catalogue
     */
    void printMenu();

    /**
     * Prints out the current catalogue
     */
    void printStock();

    /**
     * Inserts an element into the catalogue
     * @param element the new element to insert
     * @param index the location to insert the element
     * @throws IndexOutOfBoundsException when the index < 0 
     * or index > numElements
     * @throws IllegalStateException when the catalogue is full
     */
    void addElement(T element, int index) throws IndexOutOfBoundsException, IllegalStateException;

    /**
     * Removes an element from the catalogue
     * @param index the location of the element in the catalogue
     * @throws IndexOutOfBoundsException when the index < 0 
     * or index >= numElements
     * @return the removed element
     */
    T removeElement(int index) throws IndexOutOfBoundsException;

}