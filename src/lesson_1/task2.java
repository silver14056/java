package lesson_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br1 = new BufferedReader(new FileReader("src/lesson_1/one.txt"));
        String line1 = br1.readLine();
        BufferedReader br2 = new BufferedReader(new FileReader("src/lesson_1/two.txt"));
        String line2 = br2.readLine();
        System.out.println(line1);
        System.out.println(line2);
        System.out.println();
        br1.close();
        br2.close();

        String[] lst1 = line1.split("[+-]");
        String[] lst2 = line2.split("[+-]");

        ArrayList<String[]> arr1 = split_list(lst1);
        ArrayList<String[]> arr2 = split_list(lst2);

        System.out.println(arr1.size() + "size");
        al_print(arr1);
        System.out.println();
        System.out.println(arr2.size() + "size");
        al_print(arr2);
    }


    public static ArrayList<String[]> split_list(String[] lst) throws Exception {
        ArrayList<String[]> temp_arr = new ArrayList<>();

        for (int i = lst.length-1; i >= 0; i--) {
            if (lst[i].contains("x")) {
                if (lst[i].contains("^")) {
                    String[] temp_str = new String[3];
                    temp_str[0] = lst[i].substring(0, lst[i].indexOf("x"));
                    temp_str[1] = "x";
                    temp_str[2] = lst[i].substring(lst[i].indexOf("x") + 2);
                    temp_arr.add(temp_str);
                } else {
                    String[] temp_str = new String[3];
                    temp_str[0] = lst[i].substring(0, lst[i].indexOf("x"));
                    temp_str[1] = "x";
                    temp_str[2] = "1";
                    temp_arr.add(temp_str);
                }
            } else  {
                String[] temp_str = new String[3];
                temp_str[0] = lst[i];
                temp_str[1] = "x";
                temp_str[2] = "0";
                temp_arr.add(temp_str);
            }
        }
        return temp_arr;
    }


    public static void al_print(ArrayList<String[]> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (String item : arr.get(i)){
                System.out.print(item + " ");
            }
            System.out.println("\n-------------------");
        }
    }
}
