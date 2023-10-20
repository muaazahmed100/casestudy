public class Product {
    int uniqueID;
    String name;
    double price;
     int stockQuantity;
    int counter=0;
    double tax;
    ProductType p;
    


    public Product(int uniqueID,String name, double price, int stockQuantity, double tax,ProductType pt) {
        this.uniqueID=uniqueID;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.tax = tax;
        this.p=pt;

    }



    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", tax=" + tax +
                '}';
    }
    public boolean equals (Object obj){
        Product p=(Product) obj;
        if (p.name.equalsIgnoreCase(this.name)&&p.uniqueID==this.uniqueID&&p.p.equals(this.p))
            return true;
        else
            return false;
    }
}
