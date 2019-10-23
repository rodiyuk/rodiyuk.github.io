import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Необходимо написать рекурсивный алгоритм для нахождения НОД
и НОК двух чисел. Два числа вводятся вручную во время
выполнения программы.
 */
public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите первое число: ");
            int a = Integer.parseInt(reader.readLine());
            System.out.print("Введите второе число: ");
            int b = Integer.parseInt(reader.readLine());
            System.out.printf("Наибольший общий делитель чисел %d и %d: %d\n", a, b, nod(a, b));
            System.out.printf("Наименьшее общее кратное чисел %d и %d: %d\n", a, b, nok(a, b));
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели текст. Должны быть числа");
        }
    }

    public static int nod(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) listA.add(i);
        }
        for (int i = 1; i <= b; i++) {
            if (b % i == 0) listB.add(i);
        }
        for (int i = listA.size() - 1; i > 0; i--) {
            for (int j = 0; j < listB.size(); j++) {
                if (listA.get(i).equals(listB.get(j)))
                    return listA.get(i);
            }
        }
        return 1;
    }

    public static int nok(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int max;
        int min;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        for (int i = 1; i <= max; i++) {
            if ((max * i) % min == 0)
                return max * i;
        }
        return 1;
    }
}
