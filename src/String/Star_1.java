package String;

import java.util.Scanner;

public class Star_1 {

    public static void main(String[] args) {

        System.out.println("숫자를 입력해주세요.");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        for (int i=0; i<size; i++) {
            for (int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
