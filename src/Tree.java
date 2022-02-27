/**
 * Name:
 * Course Name:
 * Activity Number:
 */


public class Tree extends Perennial {
    private boolean isDeciduous;
    private int numGallons;


    public Tree() {
        this("No Name",-1, false, false, false, 0);
    }

    public Tree(String _name, double _price, boolean _lowWater, boolean _isNative, boolean _isDeciduous, int _numGallons) {
        super(_name, _price, _lowWater, _isNative);
        this.isDeciduous = _isDeciduous;
        this.numGallons = _numGallons;
    }

    public Tree(Tree other) {
        this.setName(other.getName());
        this.setPrice(other.getPrice());
        this.setLowWater(other.getLowWater());
        this.setNative(other.getNative());
        this.isDeciduous = other.isDeciduous;
        this.numGallons = other.numGallons;
    }

    public boolean getDeciduous() {
        return isDeciduous;
    }

    public void setDeciduous(boolean deciduous) {
        isDeciduous = deciduous;
    }

    public int getNumGallons() {
        return numGallons;
    }

    public void setNumGallons(int numGallons) {
        this.numGallons = numGallons;
    }

    @Override
    public String toString() {
        return super.toString() + ", isDeciduous: " + isDeciduous + ", numGallons: " + numGallons;
    }
}
