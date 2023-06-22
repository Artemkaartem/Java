
package HomeWorkSeminar5;

import java.util.HashMap;

public class Home {
    public static void main(String[] args) {
        HashMap<Integer, String> human = new HashMap<>();
        human.put(4, "Иванов");
        human.put(8, "Петров");
        human.put(167, "Иванов ");
        human.put(342, "Павлов");
        human.put(6, "Сергеев");
        human.put(18, "Кузьмин");
        human.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println(human);

        human.computeIfPresent(4, (k, v) -> v + ' ');
        human.computeIfPresent(8, (k, v) -> v + ' ');
        human.computeIfPresent(167, (k, v) -> v + ' ');
        human.computeIfPresent(342, (k, v) -> v + ' ');
        human.computeIfPresent(6, (k, v) -> v + ' ');
        human.computeIfPresent(18, (k, v) -> v + ' ');
        System.out.println(human);
        human.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println(human);

        HashMap<Integer, String> humanSec = new HashMap<>();
        humanSec.put(342, "Иван");
        humanSec.put(18, "Василий");
        humanSec.put(167, "Александр");
        humanSec.put(8, "Сергей");
        humanSec.put(4, "Павел");
        humanSec.put(6, "Роман");
        System.out.println(humanSec);

        for (Integer item : human.keySet()) {
            human.merge(item, humanSec.getOrDefault(item, ""), (newVal, tempVal) -> newVal + tempVal);
        }
        System.out.println(human);
        human.forEach((k, v) -> System.out.println(k + " " + v));
    }
    
}
   