public class ArrayPractice4 {
    public static void main(String[] args) {
    
        //challenge 1
        double[] winners = new double[18];

        //challenge 2
        int[] first_array = {2, 3, 5, 7, 11, 13, 17, 19};

        //challenge 3
        int[] num = new int[20];

        for (int i = 0; i < num.length; i++) {
            num[i] = i * 2;
        }
        
        //challenge 4
        int[][] maze = new int[30][40];

        //challenge 5
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 32; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }

        //challenge 6 (output):
        //231
        //221
        //023
        //104

        //challenge 7 (output):
        //0

        //challenge 8 (output):
        //1286864

    }
}