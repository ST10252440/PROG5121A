package Circle;

public class Circle {
    
    double radius;
    double diameter;
    double area;
    
    public Circle() {
        radius = 1;
        calculate_circle_values();
    }

    public void set_radius(Double radius) {
        this.radius = radius;
        calculate_circle_values();
    }

    public double get_radius() {
        return radius;
    }

    public void calculate_circle_values() {
        diameter = (radius*2);
        area = (Math.pow(radius, 2)) * Math.PI;
    }
}