import java.io.*;
import java.math.*;
import java.util.*;

public class Main {

    static long averybigsum(long[] ar){
        long sum = 0;
    for(int x = 0; x < ar.length; x++){
        sum += ar[x];
    }
        return sum;
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        final int size = 5;
        long[] ar = new long[size];
        for(int x = 0; x < size; x++){
            ar[x] = in.nextInt();
        }

        long result = averybigsum(ar);
        System.out.println(result);
    }
}

