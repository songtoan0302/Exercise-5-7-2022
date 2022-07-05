package PointAverage;

import java.util.Arrays;
import java.util.OptionalDouble;

/**
 * @author toanns
 */
public class PointAverage {

    public void execute(int arrayPoint[]) {
        checkPointAverage(average(arrayPoint));
    }

    private double average(int arrayPoint[]) {
        OptionalDouble average = Arrays.stream(arrayPoint).average();
        return average.getAsDouble();
    }

    private void checkPointAverage(double averagePoint) {
        if (averagePoint >= 0 && averagePoint <= 4)
            System.out.println("Yếu");
        else if (averagePoint >= 5 && averagePoint <= 6)
            System.out.println("Trung Bình");
        else if (averagePoint >= 7 && averagePoint <= 8)
            System.out.println("Khá");
        else if (averagePoint >= 9 && averagePoint <= 10)
            System.out.println("Giỏi");
    }
}
