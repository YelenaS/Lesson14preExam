/**
 * Created by Администратор on 18.11.2016.
 */
public class Array101010 {
    public static void main(String[] args) {

        int[][][] arr = new int[10][10][10];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(j);
                for (int k = 0; k < arr[j].length; k++) {
                    System.out.print(k);
                    arr[i][j][k] = (int) (Math.random() * 10);
                    System.out.print(arr[i][j][k] + "\t");
                }
                System.out.println();
            }
        }
    }
}
