public class BusquedaLineal <T>{
    public T[] array;
    public T search;
    public BusquedaLineal(T[] array, T value){
        this.array=array;
        this.search=value;
        searchValue();
    }
    public int searchValue(){
        for(int i=0;i<array.length;i++){
            if(array[i]==search){
                System.out.println(i);
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Integer[] array={5,9,1,3,90,43};
        BusquedaLineal<Integer> buscar=new BusquedaLineal<Integer>(array,90);
    }
}
