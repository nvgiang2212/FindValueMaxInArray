public class FindMaxInArray2 {
    public static void main(String[] args) {
        int[][] array = {
                {4,59,6,7,8},
                {1,2,9,11,4},
                {7,4,3,0,8},
                {6,3,5,77,19},
        };

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
