import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/*
Необходимо написать программу, которая вычисляет простые
числа в пределах от 1 до N. N – вводится вручную во время
выполнения программы.
 */
public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isTrue = true;
        while (isTrue) {
            try {
                System.out.print("Введите пределы поиска от 1 до N.\nN = ");
                int n = Integer.parseInt(reader.readLine());
                while (n <= 1) {
                    System.out.println("Повторите ввод. Вы ввели недопустимое значение");
                    n = Integer.parseInt(reader.readLine());
                }
                for (Integer integer : prime(n)) {
                    System.out.print(integer + " ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели символы. Должно быть число больше 1");
                System.exit(13);
            }
            isTrue = false;
        }
    }

    public static ArrayList<Integer> prime(int num) {
        Set<Integer> set = new HashSet<>();
        for (int n = 2; n <= num; n++) {
            int j = 0;
            for (int i = 2; i <= n; i++) {
                if (i * i <= n && j != 1) {
                    if (n % i == 0) {
                        j = 1;
                    }
                } else if (j != 1) set.add(n);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println("Простые числа в пределах от 1 до " + num + " :");
            return list;
    }
}
