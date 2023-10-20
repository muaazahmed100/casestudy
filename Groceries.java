public class Groceries extends Product{
    String expDates;
    String nutValues;
    public Groceries(int uniqueID,String name, double price, int stockQuantity, double tax, String expDates, String nutValues,ProductType pt) {
        super(uniqueID,name, price, stockQuantity, tax,pt);
        this.expDates = expDates;
        this.nutValues = nutValues;
    }

    @Override
    public String toString() {
        return "Groceries{" +
                "expDates='" + expDates + '\'' +
                ", nutValues='" + nutValues + '\'' +
                ", uniqueID=" + uniqueID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", counter=" + counter +
                ", tax=" + tax +
                ", p=" + p +
                '}';
    }
}
