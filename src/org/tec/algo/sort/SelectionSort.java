package org.tec.algo.sort;

public class SelectionSort {

    public  void doSelectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        this.print(arr);
    }
    public void print(int[] array){
        int n=array.length;
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] array={5,9,1,3,90,43};
        SelectionSort sort=new SelectionSort();
        sort.doSelectionSort(array);

    }

}