package rendering;

import rendering.objects.Point2D;
import rendering.objects.Vector2D;

public class ArithmeticCalculation {

    public static Point2D point_vector_add(Point2D point, Vector2D vector) {
        return new Point2D(point.getX() + vector.getX(), point.getY() + vector.getY());
    }

    public static Point2D point_vector_substract(Point2D point, Vector2D vector) {
        return new Point2D(point.getX() - vector.getX(), point.getY() - vector.getY());
    }

    public static Vector2D vector_scalar_multiply(Vector2D vector, double scalar) {
        return new Vector2D(vector.getX() * scalar, vector.getY() * scalar);
    }

    public static double vector_vector_multiply(Vector2D v1, Vector2D v2) {
        return v1.getX() * v2.getX() + v1.getY() * v2.getY();
    }

    public static double vector_vector_angle(Vector2D vector1, Vector2D vector2) {
        return Math.acos(vector_vector_multiply(vector1, vector2) / (vector1.getLenght() * vector2.getLenght()));
    }
}