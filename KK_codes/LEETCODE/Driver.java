
import java.util.Arrays;
import java.util.Scanner;

public class Driver {

    public void driver() {

    }
}

class RCW {

    private int[][] account = new int[3][3];
    Scanner sc = new Scanner(System.in);

    public void input() {

        for (int row = 0; row < account.length; row++) {
            for (int col = 0; col <= account[row].length; col++) {
                System.out.println("Enter value for  " + row + " and col" + col + " : ");
                account[row][col] = sc.nextInt();
            }
            System.out.println("");
        }
    }

    public void display() {
        for (int row = 0; row < account.length; row++) {
            System.out.println(Arrays.toString(account[row]));
        }
    }
}

class Solution {

    public int maximumWealth(int[][] accounts) {
        int bal = 0;
        for (int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum += accounts[row][col];

            }
            int max = 0;
            if (max < sum) {
                max = sum;
                bal = max;
            }
        }
        return bal;
    }
}
