public class areaCalculator {
    public static void main(String[] args) {
        System.out.println(area(3));
        System.out.println(area(3,5));
    }

    public static double area (double radius){
        double result;
        double pi = 3.14159265359;
        if(radius < 0){
               result = -1;
           }
        else{
            result = radius * radius * pi;
        }
        return result;
    }

    public static double area (double x, double y){
        double result;
        if(x < 0 || y < 0) {
            result = -1;
        }
        else{
            result = x*y;
        }
        return result;
    }
}
