import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Необходимо написать программу, которая проверяет слово на
"палиндромность". Слово для проверки вводится вручную во
время выполнения программы.
 */
public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите слово, которое необходимо проверить на полиндромность:");
        String s = reader.readLine();
        int l = s.length();
        for (int i = 0; i < l; i++) {
            if(!s.substring(i,i+1).equalsIgnoreCase(s.substring(l-i-1,l-i))) {
                System.out.println("Ваше слово не является полиндромом");
                System.exit(13);
            } else continue;
        } System.out.println("Ваше слово является полиндромом");
    }
}
