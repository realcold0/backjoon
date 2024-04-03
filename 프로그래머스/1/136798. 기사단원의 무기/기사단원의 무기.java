class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        //약수 갯수를 구하고 배열에 넣는다.
        for(int i = 1; i <= number; i++){
            int temp = getPower(i);
            if(temp > limit){
                temp = power;
            }
            answer += temp;
        }
        return answer;
    }
    
    //약수의 갯수를 구하는 함수
    public int getPower(int num){
        int count = 0;
        for(int i = 1 ; i * i <= num ; i++){
            if(i * i == num){
                count++;
            }
            else if(num % i == 0){
                count += 2;
            }
        }
        return count;
    }
}