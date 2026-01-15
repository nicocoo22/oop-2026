public class Car {
    String brand;
    String engine;
    String model;
    String condition;
    double price;
    
     void printDetails(){
        System.out.printf("""
                %s %s %s for %.2f
                """, condition, brand, model, price);


}
}
