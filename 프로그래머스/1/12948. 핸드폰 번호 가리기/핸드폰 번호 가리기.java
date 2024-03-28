 class Solution {
       public String solution(String phone_number) {

        String[] number = phone_number.split("");
        int point = phone_number.length() - 4;

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<phone_number.length();i++){
            if(i < point){
                sb.append("*");
            }
            else{
                sb.append(number[i]);
            }
        }
        System.out.println(sb);
        return sb.toString();
        
    }
    }
