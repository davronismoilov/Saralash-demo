package davron;

public class Task1 {

    public static int task1(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 1) {

                    return Math.abs(i - 3) + Math.abs(j - 3);
                }
            }

        }
        return 0;
    }

    public static void main(String[] args) {
      int[][] arr = {
          {0,0,0,0,0,0,0},
          {0,0,0,0,0,1,0},
          {0,0,0,0,0,0,0},
          {0,0,0,0,0,0,0},
          {0,0,0,0,0,0,0},
          {0,0,0,0,0,0,0},
          {0,0,0,0,0,0,0}
      };
        System.out.println(task1(arr));
    }
}
