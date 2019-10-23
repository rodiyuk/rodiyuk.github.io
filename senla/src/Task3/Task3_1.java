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

        if (x1 > x2) {
            double tmpX = x1, tmpY = y1;
            x1 = x2;
            y1 = y2;
            x2 = tmpX;
            y2 = tmpY;
        }
        if (x3 > x4) {
            double tmpX = x3, tmpY = y3;
            x3 = x4;
            y3 = y4;
            x4 = tmpX;
            y4 = tmpY;
        }
        //Определяем угловой коэффициент в уравнении прямой
        double k1, k2;
        double x = 1, y, b1, b2;
        if (y1 == y2) {
            k1 = 0;
        } else k1 =  (y2 - y1) / (x2 - x1);
        if (y3 == y4) {
            k2 = 0;
        } else k2 =  (y4 - y3) / (x4 - x3);
        //Проверим отрезки на параллельность
        if (k1 == k2) {
            System.out.println("Отрезки параллельны.");
            System.exit(14);
        } else {
            b1 = y1 - k1 * x1;
            b2 = y3 - k2 * x3;
            //Проверяем или прямые имеют точку пересечения
            if ((k1 * x + b1) == (k2 * x + b2)) {
                x = (b2 - b1) / (k1 - k2);
                y = k1 * x + b1;
                //точка пересечения прямых может лежать вне отрезков, принадлежащих этим прямым.
                //Таким образом, если отрезки пересекаются, то,
                if (((x1 <= x4) && (x4 <= x2)) || ((x1 <= x3) && (x3 <= x2))) {
                    System.out.printf("Отрезки пересекаются. Точка пересечения P(%.2f;%.2f)", x, y);
                }
            } else System.out.println("Отрезки не пересекаются");
        }
    }
}
