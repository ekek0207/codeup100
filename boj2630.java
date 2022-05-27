package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * 전체 종이의 크기가 N×N(N=2k, k는 1 이상 7 이하의 자연수) 이라면 종이를 자르는 규칙은 다음과 같다.
 *
 * 전체 종이가 모두 같은 색으로 칠해져 있지 않으면 가로와 세로로 중간 부분을 잘라서 <그림 2>의 I, II, III, IV와 같이 똑같은 크기의 네 개의 N/2 × N/2색종이로 나눈다.
 * 나누어진 종이 I, II, III, IV 각각에 대해서도 앞에서와 마찬가지로 모두 같은 색으로 칠해져 있지 않으면 같은 방법으로 똑같은 크기의 네 개의 색종이로 나눈다.
 * 이와 같은 과정을 잘라진 종이가 모두 하얀색 또는 모두 파란색으로 칠해져 있거나, 하나의 정사각형 칸이 되어 더 이상 자를 수 없을 때까지 반복한다.

 입력으로 주어진 종이의 한 변의 길이 N과 각 정사각형칸의 색(하얀색 또는 파란색)이 주어질 때 잘라진 하얀색 색종이와 파란색 색종이의 개수를 구하는 프로그램을 작성하시오.

 // 입력
 첫째 줄에는 전체 종이의 한 변의 길이 N이 주어져 있다.
 N은 2, 4, 8, 16, 32, 64, 128 중 하나이다.
 색종이의 각 가로줄의 정사각형칸들의 색이 윗줄부터 차례로 둘째 줄부터 마지막 줄까지 주어진다.
 하얀색으로 칠해진 칸은 0, 파란색으로 칠해진 칸은 1로 주어지며, 각 숫자 사이에는 빈칸이 하나씩 있다.
 // 예제 입력1
 8
 1 1 0 0 0 0 1 1
 1 1 0 0 0 0 1 1
 0 0 0 0 1 1 0 0
 0 0 0 0 1 1 0 0
 1 0 0 0 1 1 1 1
 0 1 0 0 1 1 1 1
 0 0 1 1 1 1 1 1
 0 0 1 1 1 1 1 1

 //출력
 첫째 줄에는 잘라진 햐얀색 색종이의 개수를 출력하고, 둘째 줄에는 파란색 색종이의 개수를 출력한다.
 // 예제 출력1
 9
 7
 * **/

public class boj2630 {

    //풀이 : https://st-lab.tistory.com/227
    //bufferedreader 방법으로 풀어봄

    //색상 카운트 할 변수 및 색종이(board)
    public static int white = 0;
    public static int blue = 0;
    public static int[][] board;

    public static void main(String args[]) throws IOException {
        //22.04.19
        //22.05.28 완료
        // https://www.acmicpc.net/problem/2630

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        board = new int[N][N];

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //정사각형 데이터를 입랸빋는 for문

        partition(0,0,N);

        System.out.println(white);
        System.out.println(blue);

    }

    public static void partition(int row, int col, int size) {

        //
        if (colorCheck(row, col, size)) { //이게 truw이면, 그 사분면의 색이 모두 똑같다는 뜻.
            //똑같을 경우(자를 수 있을 경우), 밑의 판별문을 통해서 white인지 blue인지 구별.
            if(board[row][col] == 0) {
                white ++;
            }
            else {
                blue++;
            }
            return;
        }

        int newSize = size / 2; //절반 사이즈
        //재귀 호출
        partition(row,col,newSize); //2사분면
        partition(row, col + newSize, newSize); //1사분면
        partition( row + newSize, col, newSize); //3사분면
        partition(row + newSize, col + newSize, newSize) ; //4사분면
    }

    //현재 파티션의 컬러가 같은지 체크한다.
    public static boolean colorCheck(int row, int col, int size) {

        int color = board[row][col]; //첫 번째 원소를 기준으로 검사

        for(int i = row; i < row + size ; i ++ ) {
            for(int j = col; j < col + size ; j ++ ) {
                //색상이 같지 않다면 false를 리턴
                if(board[i][j] != color ){
                    return false;
                }
            }
        }
        // 검사가 모두 통과했다는 의미이므로 true 리턴
        return true;
    }
}