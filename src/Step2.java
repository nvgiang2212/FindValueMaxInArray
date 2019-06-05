import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Array" + "["+i+"]"+"["+j+"] :");
                int x = scanner.nextInt();
                array[i][j] = x;
            }
        }

        int Max = array[0][0];
        int indexX = 0;
        int indexY = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > Max) {
                    Max = array[i][j];
                    indexX = i;
                    indexY = j;
                }
            }
        }
        System.out.println("Value Max in Array: " + Max + " position "
                            + "(" + indexX + ", " + indexY + ")");
    }
}
