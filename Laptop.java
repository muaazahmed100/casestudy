public class Laptop extends Electronics{
    String processorType;
    String ramSize;
    String screenDimension;

    public Laptop(int uniqueID,String name, double price, int stockQuantity, double tax, String powerConsumption, String warranty, String processorType, String ramSize, String screenDimension,ProductType pt) {
        super(uniqueID,name, price, stockQuantity, tax, powerConsumption, warranty,pt);
        this.processorType = processorType;
        this.ramSize = ramSize;
        this.screenDimension = screenDimension;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processorType='" + processorType + '\'' +
                ", ramSize='" + ramSize + '\'' +
                ", screenDimension='" + screenDimension + '\'' +
                ", powerConsumption='" + powerConsumption + '\'' +
                ", warranty='" + warranty + '\'' +
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
