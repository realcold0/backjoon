class Solution {
   public static int solution(String t, String p) {
        long pLong = Long.parseLong(p);
        int answer = 0;

        //10203 15
        //5 - 2 = 3
        for(int i =0;i <= t.length() - p.length();i++){
            long k = Long.parseLong(t.substring(i, i + p.length()));
            System.out.println(k);
            if((k <= pLong)){

                answer++;
            }
        }

        return answer;
    }
}