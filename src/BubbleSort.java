public class BubbleSort <T>{

    public BubbleSort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        print(array);
    }
    public void print(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] array={5,9,1,3,90,43};
        BubbleSort bubble=new BubbleSort(array);
    }
}
