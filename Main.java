//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
 Author  : Chonlada Sutsanguan
 Program : find area
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pp = new Scanner(System.in);

        String input = pp.nextLine();
        int n = Integer.parseInt(input);

        System.out.println(n * (n + 1) / 2);
    }
}

