package isp.lab2.Exercise1RandomArray;

public class Exercise1RandomArray {

    public static int[] getArrayOfRandomNumbers(int n, int min, int max) {
        int[] matrix = new int[n];
        for(int i = 0;i<n;++i)
        {
            matrix[i] = (int)Math.floor(Math.random() * (max - min + 1) + min);
        }

        return matrix;
    }

    public static int[] findMaxAndMin(int[] array) {
        int min = 999999;
        int max = -999999;
        int m[] = new int[2];
        for(int i = 0;i< array.length;++i)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
            if(array[i]<min)
            {
                min=array[i];
            }

        }
        m[0] = min;
        m[1] = max;
        return m;
    }

    public static void main(String[] args) {

        int[] a = getArrayOfRandomNumbers(10, 1, 100);
        int[] mm = findMaxAndMin(a);
        System.out.println("Min is:"+mm[0]+" Max is:"+mm[1] );
    }
}
