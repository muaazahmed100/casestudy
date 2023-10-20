public class Electronics extends Product{
    String powerConsumption;
    String warranty;



    public Electronics(int uniqueID,String name, double price, int stockQuantity, double tax, String powerConsumption, String warranty,ProductType pt) {
        super(uniqueID,name, price, stockQuantity, tax,pt);
        this.powerConsumption = powerConsumption;
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "powerConsumption='" + powerConsumption + '\'' +
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
