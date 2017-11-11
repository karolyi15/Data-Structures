public class InsertionSort {
    public  InsertionSort(int[] array) {

        int n = array.length;
        for (int i=1; i<n;i++)
        {
            int key = array[i];
            int j = i-1;

            while (j>=0 && array[j] > key)
            {
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
        print(array);
    }
    public void print(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] array= {5,9,1,3,90,43};
        InsertionSort sort=new InsertionSort(array);
    }
}
