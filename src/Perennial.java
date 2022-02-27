/**
 * Name:
 * Course Name:
 * Activity Number:
 */


public class Perennial extends Plant {
    private boolean lowWater;
    private boolean isNative;

    /**
     * Default Constructor<br>
     *
     */
    public Perennial() {
        this("No Name", -1, false, false);
    }

    /**
     * Constructor which initializes attributes with values provided by the user
     * @param _name
     * @param _price
     * @param _lowWater
     * @param _isNative
     */
    public Perennial(String _name, double _price, boolean _lowWater, boolean _isNative) {
        super(_name, _price);
        this.isNative = _isNative;
        this.lowWater = _lowWater;
    }

    /**
     * Copy Constructor, create an exact copy of other object.
     * @param other
     */
    public Perennial(Perennial other) {
        this.setName(other.getName());
        this.setPrice(other.getPrice());
        this.lowWater = other.lowWater;
        this.isNative = other.isNative;

    }

    /**
     * returns lowWater property of the class
     * @return
     */
    public boolean getLowWater() {
        return lowWater;
    }

    /**
     * sets the lowWater property of the class
     * @param lowWater
     */
    public void setLowWater(boolean lowWater) {
        this.lowWater = lowWater;
    }

    public boolean getNative() {
        return isNative;
    }

    public void setNative(boolean aNative) {
        isNative = aNative;
    }

    @Override
    public String toString() {
        return super.toString() + ", lowWater: " + lowWater + ", isNative: " + isNative;
    }
}
