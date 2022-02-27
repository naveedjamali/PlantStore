/**
 * Name:
 * Course Name:
 * Activity Number:
 */

import java.util.Objects;

public abstract class Plant implements Comparable<Plant> {
    private String name;
    private double price;

    /**
     * Default constructor<br>
     * Creates an object of Plant class,
     *
     * initializes <b>name = "No Name"</b>, and <b>price = -1</b>;
     */
    public Plant() {
        this("No Name", -1);
    }

    /**
     * Creates an object of Plant class, requires two arguments
     * @param _name
     * @param _price
     */
    public Plant(String _name, double _price) {
        this.name = _name;
        this.price = _price;
    }

    /**
     * returns Plant.name attribute
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the <b>name</b> attribute of the class <b>Plant</b>
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * returns the price attribute of class <b>Plant</b>
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     * sets the <b>price</b> attribute of the class <b>Plant</b>
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Stringify the object of class <b>Plant</b>
     * e.g. <b>Name: Rose, price = 100</b>
     */
    @Override
    public String toString() {
        return "Name: " + name + ", price: " + price;
    }

    /**
     * Compares the objects of class plant with the object provided in the parameters.
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return Double.compare(plant.price, price) == 0 && Objects.equals(name, plant.name);
    }

    /**
     * Compares the object of plant with the another object of Plant
     * @param p
     * @return
     */
    @Override
    public int compareTo(Plant p) {
        if(this.name.equals(p.name)){
            if(this.price==p.price){
                return 1;
            }
        }

        return 0;
    }
}
