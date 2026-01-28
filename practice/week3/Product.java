public class Product {
    String strname;
    double dprice;
    int stock;
    static int productCount;

    public Product(){}

    public Product(String strname, double dprice, int stock){
        productCount = 0;
        this.strname = strname;
        this.dprice = dprice;
        this.stock = stock;
        
    }
}
