import java.util.Objects;

public class Smartphone extends Electronics{
    String operatingSystem;
    String cameraResolution;
    String storageCapacity;

    public Smartphone(int uniqueID,String name, double price, int stockQuantity, double tax, String powerConsumption, String warranty, String operatingSystem, String cameraResolution, String storageCapacity,ProductType pt) {
        super(uniqueID,name, price, stockQuantity, tax, powerConsumption, warranty,pt);
        this.operatingSystem = operatingSystem;
        this.cameraResolution = cameraResolution;
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String toString() {
        return "Smartphone= " +
                "operatingSystem='" + operatingSystem + '\'' +
                ", cameraResolution='" + cameraResolution + '\'' +
                ", storageCapacity='" + storageCapacity + '\'' +
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
    }//String name, double price, int stockQuantity,                                double tax, String powerConsumption,                                                                           String warranty, String operatingSystem,                                          String cameraResolution, String storageCapacity,ProductType pt

}
