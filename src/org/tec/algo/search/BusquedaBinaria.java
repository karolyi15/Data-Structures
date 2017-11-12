package org.tec.algo.search;

public class BusquedaBinaria {
    int first=0;
    int middle;
    int last;
    public BusquedaBinaria(int[]array,int value){
        this.last=array.length-1;
        while(first<=last){
            this.middle=(first+last)/2;
            if(value==array[middle]){
                System.out.println(middle);
                return;
            }else{
                if(array[middle]>value){
                    last=middle-1;
                }else{
                    first=middle+1;
                }
            }
        }

    }
    public static void main(String[] args){
        int[] array={5,9,1,3,90,43};
        BusquedaBinaria buscar=new BusquedaBinaria(array,90);
    }
}
