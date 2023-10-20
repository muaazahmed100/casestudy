public class Furniture extends Product{
    String material;
    String dimensions;

    public Furniture(int uniqueID,String name, double price, int stockQuantity, double tax,String material,String dimensions,ProductType pt){
        super(uniqueID,name, price, stockQuantity, tax,pt);
        this.material=material;
        this.dimensions=dimensions;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "material='" + material + '\'' +
                ", dimensions='" + dimensions + '\'' +
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
