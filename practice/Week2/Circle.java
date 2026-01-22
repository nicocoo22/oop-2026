package Week2;

public class Circle {

    double radius;
    static final double PI = 3.14;

    public Circle(){
    }
     public Circle(double radius) {
            this.radius = radius;
        }
        public double getArea() {
            return PI * radius * radius;
        }
}
