public class ArrayEx1 {

    public static void main(String args[]) {
        
      int[] score = new int[9];
      byte[] values = new byte[10];
      java.util.Arrays.fill(values, (byte) 1);
    
      
        int[] primeNum = new int[20];
        int[] even = new int[5];
        long[] primes = new long[20];
        primes[0] = 2;
        primes[1] = 3;
        long[] primes2 = primes;
        System.out.println(primes2[0]);
        primes2[0] = 5;
        System.out.println(primes[0]);

        //Using for loops to traverse arrays
        int[] array = { -20, 19, 1, 5, -1, 27, 19, 5 };

        int min = array[0];

        for (int index = 0; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }

        System.out.println("Minimum value: " + min);

        //How to determine if an element is in an array (uses for loop)
        int target = 6;
        int[] numbers = { 0, 2, 4, 6, 8 };
        boolean targetFound = false;

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == target) {
                targetFound = true;
                break;
            }
        }

        System.out.println("Target Found: " + targetFound);



        //how to determine that all elements are the same (uses for loop)
        int[] numbers1 = {0, 0, 0, 1, 0};
        boolean allSame = true;
        for( int index=1; index < numbers1.length; index++ ){
          if( numbers1[0] != numbers1[index] ) {
            allSame = false;
            break;
          }
        }

        System.out.println("All elements the same? " + allSame );

        //processing a string array (uses for-each loop)
        String[] names = {"George", "Jill", "Xinyi", "Ravi"};

        for( String name : names ) {
          System.out.println("Name is:" + name );
      }

}
}

