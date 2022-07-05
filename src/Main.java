import PointAverage.PointAverage;
import QuadraticEquation2.QuadraticEquation2;

import java.util.Scanner;

/**
 * @author toanns
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        System.out.println("Nhập vào các hệ số của phương trình bậc 2! ");
        System.out.println("Nhập vào a: ");
        float a=scanner.nextFloat();
        System.out.println("Nhập vào b: ");
        float b=scanner.nextFloat();
        System.out.println("Nhập vào c: ");
        float c=scanner.nextFloat();

        QuadraticEquation2 quadraticEquation2=new QuadraticEquation2();
        quadraticEquation2.execute(a,b,c);

        int arrayPoint[]={3,6,3,8,6};
        System.out.println();
        System.out.println("Kết quả của điểm trung bình: ");
        PointAverage pointAverage=new PointAverage();
        pointAverage.execute(arrayPoint);

    }

}
