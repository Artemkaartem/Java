package HomeWorkSeminar4;

import java.util.ArrayList;
import java.util.Scanner;

public class home {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ФИО, возраст, пол или 1 для выхода: ");
        ArrayList<String> fname = new ArrayList<>();
        ArrayList<String> sname = new ArrayList<>();
        ArrayList<String> lname = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();
       while (true){
           String in = input.nextLine();
           if(in.toLowerCase().equals("1")) break;
           String[] str = in.split(" ");
           id.add(age.size());
           fname.add(str[0]);
           sname.add(str[1]);
           lname.add(str[2]);
           age.add(Integer.valueOf(str[3]));
           gender.add(str[4].toLowerCase().contains("м"));

       }
       input.close();

        for (int i = 0; i < fname.size()-1; i++) {
            int max = age.get(id.get(i));
            int index = i;
            for (int j = i+1; j < fname.size(); j++) {
                if(age.get(id.get(j))< max){
                    index = j;
                    max = age.get(id.get(j));
                }
            }
            if (index != i){
               int tmp = id.get(i);
               id.set(i,id.get(index));
               id.set(index,tmp);
            }
        }
        System.out.println(id);

        for (int i = 0; i < age.size(); i++) {
            System.out.println(fname.get(id.get(i))+ " "+ sname.get(id.get(i)).toUpperCase().charAt(0)+"."+lname.get(id.get(i)).toUpperCase().charAt(0)+". " + age.get(id.get(i)));
        }

}
}