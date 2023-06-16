// 1. Finding the Maximum Value in an Array

public class max_value{
    public static void main(String[] args){
        int[] numbers = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        int maxValue = numbers[0];

    // codes for loop to find the largest number in an array
    for(int i = 0; i < numbers.length; i++){
        if(numbers[i] > maxValue){
            maxValue = numbers[i];
        }
    }
    System.out.println("**************************************");
    System.out.println("The maximum value in the array is:" + maxValue);
    System.out.println("**************************************");
    }
}