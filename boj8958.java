package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class boj8958 {

    public static void main (String[] args ) throws IOException  {
        //2022.02.17
        //https://www.acmicpc.net/problem/8958

        /**"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.

         "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

         OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.**/

        //첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.

        BufferedReader br = new BufferedReader( (new InputStreamReader( System.in ) ) ) ;

        //Scanner sc = new Scanner( System.in) ;
        int count = Integer.parseInt( br.readLine() ) ;
        for (int i = 0 ; i < count ; i ++) {
            int sum = 0 ;
            String s = br.readLine();
            int increase = 0 ; //연속 O의 개수를 0으로 초기화.
            //int  isO = 0;
            String[] sa = s.split(""); //스트링을 하나씩 담은 배열.
                for ( int j = 0 ; j < sa.length ; j ++ ) {
                    //x / o 구별 로직.
                    if (sa[j].equals("O") ) { //현재 문자가 O이면
                        //isO = 1 ;
                        increase ++;
                        sum += increase ;
                    } else if (sa[j].equals("X")) {
                        //isO = 0 ;
                        increase = 0 ;
                    }

                }
            System.out.println(sum);
        }

    }

}
