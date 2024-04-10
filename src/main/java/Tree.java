import static java.lang.Math.abs;

public class Tree {

    //[1,2,3,4,5]
    public int garlandLength(int[] arr){
        int length = 0;
        //calculation
        for (int i=1; i<arr.length; i++){
            length = length + abs((arr[i] - arr[i-1]));
        }
        return length;
    }
}
