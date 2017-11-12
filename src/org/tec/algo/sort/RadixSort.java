package org.tec.algo.sort;

public class RadixSort {

    static void sort( int[] a)
    {
        int i, m = a[0], exp = 1, n = a.length;
        int[] b = new int[10];

        for (i = 1; i < n; i++)
            if (a[i] > m)
                m = a[i];

        while (m / exp > 0)
        {
            int[] bucket = new int[10];

            for (i = 0; i < n; i++)
                bucket[(a[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--bucket[(a[i] / exp) % 10]] = a[i];
            for (i = 0; i < n; i++)
                a[i] = b[i];
            exp *= 10;
        }
        print(a);
    }
    static void print(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args){
        int[] x={5,9,1,3,90,43};
        RadixSort shell=new RadixSort();
        shell.sort(x);
    }
}

