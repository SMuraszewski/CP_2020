package pl.waw.sgh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<List<Integer>> myList2D = new ArrayList<>();
        List<Integer> row = Arrays.asList(new Integer[]{46, 25, 466});
        myList2D.add(row);
        myList2D.add(Arrays.asList(new Integer[]{37768, 225, 251}));
        myList2D.add(Arrays.asList(new Integer[]{8935, 62, 324}));

        //1. Total sum of all elements

        int totalSum = 0;

        List<Integer> myList = new ArrayList <>();
        for (List<Integer> r : myList2D) {
            for (Integer el : r){
                totalSum+= el;
            }
        }

        System.out.println(totalSum);

        //2. Sum of each row

        for (List<Integer> r : myList2D) {
            int sumOfRow = 0;
            Integer[] arr = r.toArray(new Integer[0]);
            for (Integer el : arr){
                sumOfRow+= el;
            }
            System.out.println(sumOfRow);

        }


        //3. Sum of each column

        ArrayList<Integer> lists[]=new ArrayList[myList2D.size()];

        for(int i=0;i<myList2D.size();i++){
            lists[i]=new ArrayList<>();
        }

        for (List<Integer> r : myList2D) {
            int sumOfRow = 0;
            Integer[] arr = r.toArray(new Integer[0]);

            for (int i=0; i < arr.length; i++){
                lists[i].add(arr[i]);
            }
        }

        for (List<Integer> r : lists) {
            int ColumnSum = 0;
            for (Integer el : r){
                ColumnSum+= el;
            }
            System.out.println(ColumnSum);
        }







    }
}
