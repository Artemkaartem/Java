/* 
Задание

Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение*/

package HomeWorkSeminar3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            int a = r.nextInt(0,100);
            list.add(a);
        }
        System.out.println("Дан список "+ list);
        even(list);
        System.out.println("Список без четных чисел "+ list);
        minMax(list);
        averageValue(list);
    }
    public static void even(ArrayList<Integer> list){
        for (int i = list.size() - 1; i >= 0; i--) {
            int even = list.get(i) % 2;
            if (even == 0) {
                list.remove(i);
            }
        }
    }
    public static void minMax(ArrayList<Integer> list) {
        int min = list.get(0);
        int max = list.get(0);
        for (int i = 0; i <= list.size() - 1; i++) {
            int num = list.get(i);
            if(num > min){
                max = num;
            }
            if (num > max) {
                min = num;
            }
        }
        System.out.println("Минимальное значение равно " + min);
        System.out.println("Максимальное значение равно " + max);
    }
    public static void averageValue (ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i <= list.size() - 1; i++) {
            int num = list.get(i);
            sum += num;
        }
        int result = sum / list.size();
        System.out.println("Среднее значение равно " + result);
    }
}
