package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Необходимо написать программу, которая определяет
пересекаются ли два отрезка. Координаты отрезков вводятся
вручную во время выполнения программы.
 */
public class Task3_1 {
    public static class Point {
        double x, y;
        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
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

        Point A = new Point(x1, y1);
        Point B = new Point(x2, y2);
        Point C = new Point(x3, y3);
        Point D = new Point(x4, y4);
        System.out.println((intersection(A, B, C, D)));
    }
    public static String intersection(Point a, Point b, Point c, Point d) {
        double com = (b.x - a.x) * (d.y - c.y) - (b.y - a.y) * (d.x - c.x);
        if (com == 0) return "Отрезки не пересекаются. Они параллельны";
        double rH = (a.y - c.y) * (d.x - c.x) - (a.x - c.x) * (d.y - c.y);
        double sH = (a.y - c.y) * (b.x - a.x) - (a.x - c.x) * (b.y - a.y);
        double r = rH / com;
        double s = sH / com;
        if (r >= 0 && r <= 1 && s >= 0 && s <= 1)
            return "Отрезки пересекаются";
        else
            return "Отрезки не пересекаются";
    }
}
