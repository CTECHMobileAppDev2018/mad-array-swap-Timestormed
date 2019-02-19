import java.util.Arrays;

class ArraySwapper {
  
  // This method assumes you only have 2 items in your array
  public void arraySwap(int []arrVar) {
    
    
    // Swap the two items in "arrVar" and return the output
    // put your code here
    
    int temp; // you can use this as a temporary variable
    temp = arrVar[0];
    arrVar[0] = arrVar[1];
    arrVar[1] = temp;
  }
  
  // This method swaps any 2 items in any array
  public void arraySwapAny2(int []arrVar, int loc1, int loc2) {
    
    // Swap the two items in "arrVar" and return the output
    // Remember to make sure that loc1 and loc2 are valid positions in the array!
    
      int temp; // you can use this as a temporary variable
    temp = arrVar[loc1];
    arrVar[loc1] = arrVar[loc2];
    arrVar[loc2] = temp;
  }
    
        
  

  public static void main(String[] args) {

    ArraySwapper testSwapper = new ArraySwapper();
    
    // ***** Test the first swap method *******
    System.out.println("*** Trying first method ***");
    int[] exampleInput = {1, 2};
    int[] exampleOutput = {2, 1};
    System.out.println("exampleInput before: " + Arrays.toString(exampleInput));    
    System.out.println("exampleOutput: " + Arrays.toString(exampleInput));    
    
    // This calls the first swap method
    testSwapper.arraySwap(exampleInput);
    System.out.println("exampleInput after: " + Arrays.toString(exampleInput));    
    
    if (java.util.Arrays.equals(exampleInput, exampleOutput)) {
      System.out.println("arraySwap succeeded");
    } else {
      System.out.println("arraySwap FAILED!");
    }
   
    // ***** Test the second swap method *******
    System.out.println("\n*** Trying second method ***");
    exampleInput = new int[]{1, 22, 333, 4444};
    exampleOutput = new int[]{1, 333, 22, 4444};
    System.out.println("exampleInput before: " + Arrays.toString(exampleInput));    
    System.out.println("exampleOutput: " + Arrays.toString(exampleOutput));    
    
    // This calls the second swap method
    testSwapper.arraySwapAny2(exampleInput, 1, 2);
    System.out.println("exampleInput after: " + Arrays.toString(exampleInput));    
    
    if (java.util.Arrays.equals(exampleInput, exampleOutput)) {
      System.out.println("arraySwapAny2 succeeded");
    } else {
      System.out.println("arraySwapAny2 FAILED!");
    }
  }
}