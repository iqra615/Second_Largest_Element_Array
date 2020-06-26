package come.codewithiqra;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array= {2,5,1,9,10,68,55,99};

	for (int i = 0; i<array.length; i++)
    {
        for (int j=i+1; j<array.length; j++)
        {
            if (array[i] < array[j])
            {
                int temp = array[i];
                 array[i] =array [j];
                  array[j] = temp;
            }
        }
    }
        System.out.println("Second largest Element is: " + array[1]);
    }
}
