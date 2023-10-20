import java.util.Scanner;
public class InventoryMechanism extends Functions{
    Product[] pro;
    Product[] outofStock=new Product[100];
    Scanner sc=new Scanner(System.in);
    ProductType pt;
    int countarray=0;
    int count=0;
    int store=0;


    public InventoryMechanism(int capacity) {
        pro=new Product[capacity];
    }
    public boolean add(Object obj){
        Product p=(Product) obj;
        for (int i=0;i<count;i++) {
            if (p.uniqueID == pro[i].uniqueID) {
                System.out.println("Unique ID cannot be same");
                break;
            }
        }
         if (countarray<pro.length){
            pro[countarray++]=p;
            count++;
            return true;

        }
        else
            return false ;
    }
    public Product search(Object obj){
        Product p=(Product) obj;
        int store=0;
        for (int i=0;i<pro.length;i++){
            if (pro[i].equals(p)){
                store=i;
                break;
            }
        }
        return pro[store];

    }
int j=0;
public void remove(Object obj) {
    Product p = (Product) obj;
    for (int i=0;i<countarray;i++){
        if(p.equals(pro[i])){
            pro[i]=null;
            for(int j=i;j<countarray;j++){
                pro[i]=pro[i+1];
            }
            pro[countarray--]=null;
        }
    }
}
    public Product searchByName(String name){
        for(int i=0;i<countarray;i++){
            if(pro[i].name.equalsIgnoreCase(name)){
                return pro[i];
            }
        }
        return null;
    }

    public void display(){
        int counter=0;
        while (pro[counter]!=null){
            System.out.println(pro[counter]);
            counter++;
        }

    }
    public void report(){

        System.out.println("items that are out of stock:");
        if (outofStock[0]==null)
            System.out.println("There are no out of stock items");
        for( int i=0;i<store;i++){
                System.out.println(outofStock[i].name+": "+outofStock[i].stockQuantity);
        }
        System.out.println("items that are in danger of out of stock:");
        for (int i=0;i<countarray;i++){
               if (pro[i].stockQuantity<5)
                    System.out.println(pro[i].name+": "+pro[i].stockQuantity);
        }
    }
    public void updateProductSmartphone(int uniqueID,String name, double price, int stockQuantity, double tax, String powerConsumption, String warranty, String operatingSystem, String cameraResolution, String storageCapacity,ProductType pt){
        for (int i=0;i<countarray;i++){
            if(pro[i].uniqueID==uniqueID){
                Smartphone product = (Smartphone) pro[i];
                product.name=name;
                product.price=price;
                product.stockQuantity=stockQuantity;
                product.tax=tax;
                product.powerConsumption=powerConsumption;
                product.warranty=warranty;
                product.operatingSystem=operatingSystem;
                product.cameraResolution=cameraResolution;
                product.storageCapacity=storageCapacity;
                product.p=pt;
            }
        }
    }
    public void updateProductLaptop(int uniqueID,String name, double price, int stockQuantity, double tax, String powerConsumption, String warranty, String processorType, String ramSize, String screenDimension,ProductType pt){
        for (int i=0;i<countarray;i++){
            if(pro[i].uniqueID==uniqueID){
                Laptop product = (Laptop) pro[i];
                product.name=name;
                product.price=price;
                product.stockQuantity=stockQuantity;
                product.tax=tax;
                product.powerConsumption=powerConsumption;
                product.warranty=warranty;
                product.processorType=processorType;
                product.ramSize=ramSize;
                product.screenDimension=screenDimension;
                product.p=pt;
            }
        }
    }
    public void updateProductSeating(int uniqueID, String name, double price, int stockQuantity, double tax, String material, String dimensions, ProductType pt, String dimension, String loadCapacity){
        for (int i=0;i<countarray;i++){
            if(pro[i].uniqueID==uniqueID){
                Seating product = (Seating) pro[i];
                product.name=name;
                product.price=price;
                product.stockQuantity=stockQuantity;
                product.tax=tax;
                product.dimension=dimension;
                product.material=material;
                product.dimensions=dimensions;
                product.loadCapacity=loadCapacity;
                product.p=pt;
            }
        }
    }
    public void updateProductTables(int uniqueID, String name, double price, int stockQuantity, double tax, String material, String dimensions, ProductType pt, String shape, String dimesion){
        for (int i=0;i<countarray;i++){
            if(pro[i].uniqueID==uniqueID){
                Tables product = (Tables) pro[i];
                product.name=name;
                product.price=price;
                product.stockQuantity=stockQuantity;
                product.tax=tax;
                product.material=material;
                product.dimensions=dimensions;
                product.shape=shape;
                product.dimesion=dimesion;
                product.p=pt;
            }
        }
    }
}
