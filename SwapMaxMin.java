import java.util.*; 
public class SwapMaxMin {
 
    public static void main(String[] args) {
         
        //declare an integer array with 10 elements
        int [] array = new int [10];
        int i, j, k;
         
         
        System.out.println("Before swapping:");
        //initialize an array with random numbers
        for (i = 0; i < array.length; i++)
            array[i] = (int)(Math.random()*100) + 1;
            // print an array
        for (i = 0; i < array.length; i++)
            System.out.println("array pos [" + i + "] = " + array[i]);
        // Find the largest number
        int myMax = array[0];
        int myMaxIndex = 0;
        for (i = 0; i < array.length; i++)
            if (array[i] > myMax){
                myMax = array[i];
                myMaxIndex = i;
            }
        int myMin = array[0];
        int myMinIndex = 0;
        for (j = 0; j < array.length; j++)
            if (array[j] < myMin){
                myMin = array[j];
                myMinIndex = j;
            }
             
    System.out.println(""); 
    System.out.println("The largest number is " + myMax + " and at [" + myMaxIndex + "]");
    System.out.println("The smallest number is " + myMin + " and at [" + myMinIndex + "]");
    System.out.println("\nAfter swapping:\n");
     
    for (k = 0; k < array.length; k++)
        System.out.println("array [" + k + "] = " + array[k]);
    
    
    //Start bubble sort
    System.out.println("Sorted method");
     BubbleSort ob = new BubbleSort(); 
     ob.bubbleSort(array); 
     ob.printArray(array);
         
 
    }
 
}