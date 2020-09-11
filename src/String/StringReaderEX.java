package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReaderEX {

    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//
//        int N = Integer.parseInt(br.readLine()); // 첫번째 N 문자 입력받기
//
//        String[] str = new String[N]; // N 크기의 String 배열 생성
//
//        for (int i = 0; N > i; ++i) { // String 배열에 입력받은 문자 담기
//            str[i] = br.readLine();
//        }
//
//        for (int i = 0; N > i; ++i) {  // String 배열에 담긴 문자 출력
//            System.out.print(str[i] + " ");
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        String  str = br.readLine();

        for (int i =0; i < N ;  i++) {
            sum = sum + Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println(sum);
    }
}
