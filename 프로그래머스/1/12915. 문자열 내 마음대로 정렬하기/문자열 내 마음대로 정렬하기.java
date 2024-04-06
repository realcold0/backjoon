import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> stringsArrayList = new ArrayList<>();
        for(String str : strings){
            stringsArrayList.add(str.charAt(n) + str);
        }
        

        Collections.sort(stringsArrayList);
        
        for(int i =0;i < stringsArrayList.size(); i++){
            answer[i] = stringsArrayList.get(i).substring(1);
        }
        
        
    
        return answer;
    }
}