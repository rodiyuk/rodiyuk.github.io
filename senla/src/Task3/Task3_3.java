package Task3;

import java.awt.geom.Line2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Необходимо написать программу, которая определяет
пересекаются ли два отрезка. Координаты отрезков вводятся
вручную во время выполнения программы.
 */
public class Task3_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите координаты первого отрезка(AB):\nКоординаты точки А(x1;y1): ");
        double x1 = Integer.parseInt(reader.readLine());
        double y1 = Integer.parseInt(reader.readLine());
        System.out.println("Координаты точки B(x2;y2): ");
        double x2 = Integer.parseInt(reader.readLine());
        double y2 = Integer.parseInt(reader.readLine());
        System.out.println("Введите координаты второго отрезка(CD):\nКоординаты точки C(x3;y3): ");
        double x3 = Integer.parseInt(reader.readLine());
        double y3 = Integer.parseInt(reader.readLine());
        System.out.println("Координаты точки D(x4;y4): ");
        double x4 = Integer.parseInt(reader.readLine());
        double y4 = Integer.parseInt(reader.readLine());
        
        Line2D line1 = new Line2D.Double(x1, y1, x2, y2);
        Line2D line2 = new Line2D.Double(x3, y3, x4, y4);
        boolean result = line2.intersectsLine(line1);
        if(result)
            System.out.println("Отрезки пересекаются");
        else System.out.println("Отрезки не пересекаются");
    }
}
