public class Tables extends Furniture{
    String shape;
    String material;
    String dimesion;

    public Tables(int uniqueID, String name, double price, int stockQuantity, double tax, String material, String dimensions, ProductType pt, String shape, String material1, String dimesion) {
        super(uniqueID, name, price, stockQuantity, tax, material, dimensions, pt);
        this.shape = shape;
        this.material = material1;
        this.dimesion = dimesion;
    }

    @Override
    public String toString() {
        return "Tables{" +
                "shape='" + shape + '\'' +
                ", material='" + material + '\'' +
                ", dimesion='" + dimesion + '\'' +
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
