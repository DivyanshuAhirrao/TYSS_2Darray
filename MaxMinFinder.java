package twoDArray;
public class MaxMinFinder {
    public static void main(String[] args) {

        int[][] arr = { {6,5,2} , {11,3,12,7} , {5,21,32} , {5,8,2} };

        System.out.println("Max element is : "+getMaxElement(arr));
        System.out.println("Min Elemnet is : "+getMinElement(arr));

    }

    private static int getMinElement(int[][] arr) {
        int maxValue = arr[0][0];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j] > maxValue){
                    maxValue = arr[i][j];
                }
            }
        }
        return maxValue;
    }

    private static int getMaxElement(int[][] arr) {
        int minValue = arr[0][0];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j] < minValue){
                    minValue = arr[i][j];
                }
            }
        }
        return minValue;
    }
}
