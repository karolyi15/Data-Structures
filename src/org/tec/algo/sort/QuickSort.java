package org.tec.algo.sort;

class QuickSort {
    private int[] numbers;
    private int number;

    public void sort(int[] values) {
        this.numbers = values;
        number = values.length;
        quicksort(0, number - 1);
        print(values);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        int pivot = numbers[low + (high-low)/2];

        while (i <= j) {
            while (numbers[i] < pivot) {
                i++;
            }
            while (numbers[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
    public void print(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] array= {5,9,1,3,90,43};
        QuickSort sort=new QuickSort();
        sort.sort(array);
    }
}