public class Bulb extends Plant{
    private int numBulbs;
    private String season;

    private Bulb(){

    }

    private Bulb(String _name, double _price, int _numBulb, String _season){
        super(_name, _price);
        this.numBulbs = _numBulb;
        this.season = _season;
    }

    private Bulb(Bulb other){
        this.numBulbs = other.numBulbs;
        this.season = other.season;
        this.setName(other.getName());
        this.setPrice(other.getPrice());
    }

    public int getNumBulbs() {
        return numBulbs;
    }

    public void setNumBulbs(int numBulbs) {
        this.numBulbs = numBulbs;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return super.toString()+", numBulb: "+numBulbs+", season: "+season;
    }
}
