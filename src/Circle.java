public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Circle (){
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        double S = 3.14*Math.pow(this.radius,2);
        return S;

    }
    public double getArea1(){
        return getArea();
    }


}
class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(0.1, "red");
        System.out.println(circle.getArea1());
        Circle circle1= new Circle();


    }
}

