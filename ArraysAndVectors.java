    // ArraysAndVectors.java
    // Heng Ky
    // 24/08/23



public class ArraysAndVectors {
    public static void main(String[] args) {

        System.out.println("\n Welcome to the Array Program! \n");

        // Create an in array = sign mean "assignment operator"
        int[] myNumbers = new int[8];

        // Fill the array with ints
        myNumbers[0] = 1;
        myNumbers[1] = 3;
        myNumbers[2] = 5;
        myNumbers[3] = 7;
        myNumbers[4] = 9;
        myNumbers[5] = 11;
        myNumbers[6] = 13;
        myNumbers[7] = 15;

        // Output the array
        System.out.println("myNumbers[3] = " + myNumbers[3]);


        for (int i = 0; i < 8; i++) {
            // Print the elements of the array
            System.out.println("myNumbers[" + i + "] is: " + myNumbers[i]);
        }

        // Fill the array with 5, 10, 15, etc.
        int myFiveContainer = 0;
        for (int i = 0; i < 8; i++) {
            // Fill the elements of the array
            myNumbers[i] = myFiveContainer += 5;
        }
        System.out.println("\n\n This array should be the fives: ");
        for (int i = 0; i < 8; i++) {
            // Print the elements of the array
            System.out.println("myNumbers[" + i + "] is: " + myNumbers[i]);
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("i= " + i + ", j= " + j);
            }
            // Create a 2D array
            int[][] myNumberGrid = new int[4][3] {

                // Fill the array with a for() loop!
                myFiveContainer = 0;
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j > 3; j++) {
                        myNumberGrid[i][j] = myFiveContainer += 5;
                    }
                }

                // Output the array with a for() loop!
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j > 3; j++) {

                        System.out.print(myNumberGrid[i][j] + " ");
                    }
                    System.out.println("");

                }
            }

        }
    }
}
