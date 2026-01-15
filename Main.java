public class Main {
    public static void main(String[] args){
        Car obj1 = new Car();
        obj1.brand = "Honda";
        obj1.engine = "V6";
        obj1.model = "NSX";
        obj1.condition = "New";
        obj1.price = 40000;

        Car obj2 = new Car();
        obj2.brand = "Mazda";
        obj2.engine = "Rotary Engine";
        obj2.model = "Rx7";
        obj2.condition = "New";
        obj2.price = 100000;


        obj1.printDetails();
        obj2.printDetails();

    }
}


