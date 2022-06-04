package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.lang.*;

public class BOJ2839 {

    //220528
    //https://www.acmicpc.net/problem/2839
    //설탕 배달
    //종류 : 그리디 알고리즘풂

    //파이썬 풀이법 참조. https://ooyoung.tistory.com/81
    //220604

    /**
     * 문제
     * 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다.
     * 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
     *
     * 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다.
     * 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면,
     * 더 적은 개수의 봉지를 배달할 수 있다.
     *
     * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
     *
     * 출력
     * 상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
     * **/

    public static void main(String[] args) throws IOException {

        int bag = 0 ;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sugar = Integer.parseInt(br.readLine());

        while ( sugar >= 0 ) {
            if ( sugar % 5 == 0) { //sugar가 5로 나누어지는 수가 되면.
                bag += sugar / 5 ;
                //System.out.println(bag);
                break; // 반복문 끝냄.
            }
            else {
                sugar -= 3 ;
                bag ++ ; //3킬로짜리에 하나 담음
            }
        }

        if ( sugar < 0 ) //반복문이 끝나고 sugar가 음수이면 정확히 N킬로그램을 만들 수 없다는 뜻.
            System.out.print(-1);
        else
            System.out.print(bag);

    }
}
