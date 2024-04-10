class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(!s.equals("1")){
            answer[0]++;
            int n = 0;
            for(int i = 0 ; i< s.length(); i++){
                if(s.charAt(i) == '1'){
                    n++;
                }else{
                    answer[1]++;
                }
            }
            System.out.println(Integer.toBinaryString(n));
            s = Integer.toBinaryString(n);
        }
        
        
        return answer;
    }
}