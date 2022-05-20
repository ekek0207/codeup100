package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Math;
public class boj1629 {

    public static long C;

    public static void main (String args[]) throws IOException {

        //22.03.17.
        //https://www.acmicpc.net/problem/1629

        BufferedReader br = new BufferedReader(new InputStreamReader ( System.in ) ) ;

        StringTokenizer st = new StringTokenizer( br.readLine(), " ") ;

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong( st.nextToken());
        C = Long.parseLong(st.nextToken());
        System.out.println(pow(A,B));

    }

    //A = 밑, exponent = 지수
    public static long pow (long A, long exponent) {

        //지수가 1일 경우 A^1이므로 A를 그대로 리턴
        if(exponent == 1 ) {
            return A % C;
        }

        //지수의 절반에 해당하는 A^(exponent / 2 ) 를 구한다.
        long temp = pow(A, exponent / 2 ) ;

        /*
        현재 지수가 홀수였다면
        A^(exponent / 2 ) * A^(exponent / 2 ) * A 이므로
        A를 한 번 더 곱해주어야 한다.

        ex) A^9 = A^4 * A^4 * A
         */
        //지수가 홀수일 경우
        if (exponent % 2 == 1 ) {
            //return ( temp * temp * A ) % C; 오버플로우이기 때문에 에러 남.
            return ( temp * temp % C ) * A % C;
            //https://st-lab.tistory.com/237 -> 모듈러 공식
            /**
             * // (a * b) % C = ((a % C)*(b % C)) % C
             * (temp * temp * A) % C = ((temp * temp % C) * (A % C)) % C
             * 					  = (((temp * temp % C) % C) * (A % C)) % C 	// (temp * temp % C) = (temp * temp % C) % C
             * 					  = ((temp * temp % C) * A) % C
             */
        }

       //지수가 짝수일 경우
        // 그 외에는 짝수이므로 구했던 값을 한 번 더 곱해서 반환한다.
        return temp * temp % C ;
    }

}
