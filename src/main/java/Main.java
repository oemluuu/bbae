import rendering.ArithmeticCalculation;
import rendering.objects.Vector2D;

public class Main extends ArithmeticCalculation {

    public static void main(String[] args) {
        Vector2D v = new Vector2D(3, 0);
        System.out.println(v.getRadAngle());
    }
}