package twoDArray;

public class Experiment {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];

       int i;
        int ind = 0;
       for (i=0;i<arr.length-1;i++){
           arr[ind] += arr[i];
           ind++;
       }
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[i]+" ");
        }
    }
}
