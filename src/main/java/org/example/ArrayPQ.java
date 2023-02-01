package org.example;

public class ArrayPQ {

    public static void main(String[] args) {
        int marksList[] = {90,70,60,65,50,20};
        int[] result = sortingArrayByBubbleSort(marksList);
        for (int i = 0; i < result.length; i++) {
            System.out.println("result[i] = " + result[i]);
        }

    }

    public static int[] sortingArrayByBubbleSort(int[] marksList){

        for (int i = 0; i < marksList.length-1; i++) {
            System.out.println("first for= " + marksList[i]);
            for (int j = 0; j < marksList.length-i-1; j++) {
                System.out.println("second for = " + marksList[j]);
                if (marksList[j]>marksList[j+1]){
                    int temp = marksList[j];
                    marksList[j] = marksList[j+1];
                    marksList[j+1] = temp;
                }
            }
        }
        return marksList;
    }

}
