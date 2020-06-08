public class Circle2 {
    private double radius;

    public Circle2(){
    }
    public Circle2(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    public String toString() {
        return "Circle[radius=" + radius
                + "Circumference" + this.getCircumference() + "]";
    }
}
