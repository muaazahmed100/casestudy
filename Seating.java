public class Seating extends Furniture{
    String material;
    String dimension;
    String loadCapacity;

    public Seating(int uniqueID, String name, double price, int stockQuantity, double tax, String material, String dimensions, ProductType pt, String material1, String dimension, String loadCapacity) {
        super(uniqueID, name, price, stockQuantity, tax, material, dimensions, pt);
        this.material = material1;
        this.dimension = dimension;
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Seating{" +
                "material='" + material + '\'' +
                ", dimension='" + dimension + '\'' +
                ", loadCapacity='" + loadCapacity + '\'' +
                ", material='" + material + '\'' +
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
