package Circle;

public class TestCircle {
    public static void main(String[] args) throws Exception {
        Circle circSmall = new Circle();
        Circle circBig = new Circle();
        Circle circUnset = new Circle();
        
        circSmall.set_radius(0.05);
        circBig.set_radius(5.0);

        System.out.println(circBig.get_radius() + " " +circBig.diameter + " " +circBig.area);
        System.out.println(circSmall.get_radius() + " " + circSmall.diameter + " " + circSmall.area);
        System.out.println(circUnset.get_radius() + " " + circUnset.diameter + " " +circUnset.area);
    }
}
