class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        //[[1, 4], 
        // [3, 2], 
        // [4, 1]]
        
        //[[3, 3], 
        // [3, 3]]
        for(int i =0; i < arr1.length; i++){
            for(int j = 0; j < arr2[0].length; j++){
                int temp = 0; // 각 요소별로 초기화
                for(int k = 0; k < arr1[i].length; k++){
                    temp += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = temp;
            }
        }
        
        return answer;
    }
}