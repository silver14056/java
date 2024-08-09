package lesson_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

        ArrayList<ArrayList<String>> arr1 = split_list(lst1);
        ArrayList<ArrayList<String>> arr2 = split_list(lst2);

        System.out.println(arr1.size() + " size");
        al_al_print(arr1);
        System.out.println();
        System.out.println(arr2.size() + " size");
        al_al_print(arr2);


        counterArray(arr1, arr2);
        al_print(counterArray(arr1, arr2));
        String new_str = concatArrayToString(arr1, arr2, counterArray(arr1, arr2));
        System.out.println(new_str);

        try (FileWriter fw = new FileWriter("src/lesson_1/third.txt", false)) {
            fw.write(new_str);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public static ArrayList<ArrayList<String>> split_list(String[] lst) throws Exception {
        ArrayList<ArrayList<String>> temp_arr = new ArrayList<>();

        for (int i = lst.length-1; i >= 0; i--) {
            if (lst[i].contains("x")) {
                if (lst[i].contains("^")) {
                    temp_arr.add(new ArrayList<>());
                    temp_arr.get(lst.length-1-i).add(lst[i].substring(0, lst[i].indexOf("x")));
                    temp_arr.get(lst.length-1-i).add("x");
                    temp_arr.get(lst.length-1-i).add(lst[i].substring(lst[i].indexOf("x") + 2));

                } else {
                    temp_arr.add(new ArrayList<>());
                    temp_arr.get(lst.length-1-i).add(lst[i].substring(0, lst[i].indexOf("x")));
                    temp_arr.get(lst.length-1-i).add("x");
                    temp_arr.get(lst.length-1-i).add("1");

                }
            } else  {
                temp_arr.add(new ArrayList<>());
                temp_arr.get(lst.length-1-i).add(lst[i]);
                temp_arr.get(lst.length-1-i).add("x");
                temp_arr.get(lst.length-1-i).add("0");

            }
        }
        return temp_arr;
    }


    public static void al_al_print(ArrayList<ArrayList<String>> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (String item : arr.get(i)){
                System.out.print(item + " ");
            }
            System.out.println("\n-------------------");
        }
    }


    public static void al_print(List<Integer> arr) {
        System.out.println("Список уникальных степеней:");
            for (int item : arr){
                System.out.print(item + " ");
            }
            System.out.println("\n-------------------");
    }


    public static String concatArrayToString (ArrayList<ArrayList<String>> arr1, ArrayList<ArrayList<String>> arr2, List<Integer> lst) throws Exception {
        String temp_str = "";
        for (int i = 0; i < lst.size(); i++) {
            int k = 0;
            int s = lst.get(i);
            for (int j = 0; j < arr1.size(); j++){
                if (Integer.parseInt(arr1.get(j).get(2)) == lst.get(i)){
                    k += Integer.parseInt(arr1.get(j).get(0));
                }
            }
            for (int j = 0; j < arr2.size(); j++){
                if (Integer.parseInt(arr2.get(j).get(2)) == lst.get(i)){
                    k += Integer.parseInt(arr2.get(j).get(0));
                }
            }
            if (s ==0) {
                temp_str = k + "+" + temp_str;
            } else if (s == 1) {
                temp_str = k + "x" + "+" + temp_str;
            } else {
                temp_str = k + "x^" + s + "+" + temp_str;
            }
        }
        return temp_str.substring(0, temp_str.length()-1);
    }


    public static List<Integer> counterArray(ArrayList<ArrayList<String>> arr1, ArrayList<ArrayList<String>> arr2) throws Exception {
        List<Integer> temp_arr = new ArrayList<>();
        for (int i = 0; i < arr1.size(); i++) {
            int a = Integer.parseInt(arr1.get(i).get(2));
            temp_arr.add(a);
        }
        for (int i = 0; i < arr2.size(); i++) {
            int a = Integer.parseInt(arr2.get(i).get(2));
            temp_arr.add(a);
        }

        Set<Integer> uniqueNumbers = new HashSet<>(temp_arr);
        List<Integer> noDuplicates = new ArrayList<>(uniqueNumbers);
        noDuplicates.sort(null);
        return noDuplicates;
    }
}
