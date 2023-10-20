public class Main{
    public static void main(String[] args) {

        InventoryMechanism im=new InventoryMechanism(10);

        im.add(new Smartphone(1,"iphone",100,10,10,"100 MW","10 years","Apple","64 mp","128 Gb",ProductType.ELECTRONICS));
        im.add(new Smartphone(2,"Oneplus 9",200,20,20,"200 MW","10 years","Android","200 mp","256 Gb",ProductType.ELECTRONICS));
        im.add(new Seating(3,"sofa",2000,10,200,"fiber","3d",ProductType.FURNITURE,"wood","3d","10 tons"));
        im.add(new Tables(4,"sofa",2000,3,200,"fiber","3d",ProductType.FURNITURE,"wood","3d","10 tons"));
        im.add(new Tables(5,"table",2000,1,200,"fiber","3d",ProductType.FURNITURE,"wood","3d","10 tons"));
       im.updateProductSmartphone(2,"oneplus 10pro",300,30,200,"200","20 years","Android","64mp","120 GB",ProductType.ELECTRONICS);
        im.display();
        im.report();
    }
}