import java.util.Scanner;

public class AreaCalculator {

    public static double calculateArea(float radius){
        return 3.14159f*radius*radius;
    }
    public static double calculateArea(float length,float breadth){
        return length*breadth;
    }
    public static double calculateArea(double base, double height){
        return (float) (0.5*base*height);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator ac = new AreaCalculator();
        float radius= sc.nextFloat();
        float length=sc.nextFloat();
        float breadth= sc.nextFloat();
        double base=sc.nextDouble();
        double height= sc.nextDouble();
        System.out.printf("%.2f\n",ac.calculateArea(radius));
        System.out.printf("%.2f\n",ac.calculateArea(length,breadth));
        System.out.printf("%.2f\n",ac.calculateArea(base,height));
  
    }
}
