import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Character.isDigit;
/*
Необходимо написать программу, которая удаляет из текста числа.
Текст вводится вручную во время выполнения программы.
 */
public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку из которой необходимо убрать все цифры: ");
        String s = reader.readLine();
        String result = "";
        for(char ch : s.toCharArray()){
            if(!isDigit(ch))
                result +=ch;
        }
        if(s.length()!=result.length())
        System.out.println("Итоговая строка: " + result);
        else System.out.println("В вашей строке не было цифр: " + result);
    }
}
