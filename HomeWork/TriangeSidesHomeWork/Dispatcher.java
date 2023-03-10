package HomeWork.TriangeSidesHomeWork;

public class Dispatcher {
        public static void main(String[] args){
           Sides m1 = new Sides(2,4,3);
           m1.x = 4;
           m1.y = 8;
           m1.z = 5;
           double Summ = Controller.Sformul(m1);
            System.out.println("Сума сторін");
            View.display(Summ);
            if(m1.x + m1.y > m1.z & m1.x + m1.z > m1.y & m1.y + m1.z > m1.x){
                double TriangleArea = Controller.Area(m1);
                System.out.println("Площа трикутника");
                View.display(TriangleArea);
            }else{
                System.out.println("Вхідні данні не відповідають умовам задачі");
            }
    }

}


