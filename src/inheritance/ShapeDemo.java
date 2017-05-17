package inheritance;

/**
 * Created by Student on 17.05.2017.
 */
public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];
        //shape[0] = new Rectangle2(3,4);
        //shape[1] = new Triangle2(3.1, 3.0);
        for (Shape shape1 : shape) {
            shape1.draw();
        }
    }
}
