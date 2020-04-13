package rendering.objects;

public class Vector2D {

    double x, y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D(Point2D start, Point2D end) {
        this.x = end.getX() - start.getX();
        this.y = end.getY() - start.getY();
    }

    //Kartesisch

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    //Polar

    public double getRadAngle() {
        return (y / Math.abs(y) * Math.acos(x / getLenght()) + Math.PI * 2) % (Math.PI * 2);
    }

    public double getLenght() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }


}