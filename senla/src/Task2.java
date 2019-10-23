import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*
Необходимо написать рекурсивный алгоритм, который находит
числа Фибоначчи в пределах от 1 до N. N – вводится вручную во
время выполнения программы.
 */
//Поиск чисел Фибоначчи

public class Task2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isTrue = true;
        while (isTrue) {
            try {
                System.out.print("Введите пределы поиска от 1 до N.\nN = ");
                int n = Integer.parseInt(reader.readLine());
                if(n==1) {
                    System.out.println(1);
                    break;
                }
                while (n < 1) {
                    System.out.println("Повторите ввод. Вы ввели недопустимое значение");
                    n = Integer.parseInt(reader.readLine());
                }
                System.out.println("Числа Фибоначчи в пределах от 1 до " + n + " :");
                for (Integer integer : fibonacci(n)) {
                    System.out.print(integer + " ");
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Вы ввели символы. Должно быть число больше 1");
                System.exit(13);
            }
            isTrue = false;
        }
    }
    public static ArrayList<Integer> fibonacci(int n){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        for (int i = 2; i < n; i++) {
            if((list.get(i-1) + list.get(i-2)) < n)
            list.add(i, list.get(i-1) + list.get(i-2));
            else break;
        }
        return list;
    }
}
