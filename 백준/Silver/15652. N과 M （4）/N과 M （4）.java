import java.io.IOException;
import java.io.*;
import java.awt.Point;
import java.util.*;
public class Main {

  /**
  자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

  1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
  고른 수열은 오름차순이어야 한다.
  */
  static int numbers[];
  static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    numbers = new int[m];
    dfs(n,m, 0, 0);
    System.out.println(sb);
  }

  public static void dfs(int n, int m, int depth,int start){
    if(depth == m){
      for(int i : numbers ){
        sb.append(i).append(" ");
      }
      sb.append("\n");
      return;
    }
    
    for(int i = start;i < n; i++){
        numbers[depth] = i +1 ;
        dfs(n, m , depth+1, i);
    }
  }

}