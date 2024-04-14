import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s, " ", true);
        
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            if(str.equals(" ")){
                sb.append(str);
            }else{
                str = str.toLowerCase();
                sb.append(str.substring(0,1).toUpperCase() + str.substring(1));
            }
            
            
        }
        
        String answer = sb.toString();
        return answer;
    }
}