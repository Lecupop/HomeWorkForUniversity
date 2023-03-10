package HomeWork.TriangeSidesHomeWork;
import java.lang.Math;
public class Controller {
    static double Sformul(Sides m) {
        return (double) (m.x + m.y + m.z) / 2;
    }

    static double Area(Sides m) {
        return (double) Math.sqrt(((m.x + m.y + m.z) / 2)*(((m.x + m.y + m.z) / 2)-m.x)*(((m.x + m.y + m.z) / 2)-m.y)*(((m.x + m.y + m.z) / 2)-m.z));
    }
}
