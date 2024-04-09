class Solution {
    public int solution(int[][] sizes) {
        //[[60, 50], [30, 70], [60, 30], [80, 40]]
        //->> [50 ,60], [30, 70], [30, 60], [40, 80]] -> 50, 80
        //[[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]
        // ->[7, 10], [3, 12], [8, 15], [7, 14], [5, 15]] -8 15
        //[[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]
        int bigX = Integer.MIN_VALUE;
        int bigY = Integer.MIN_VALUE;
        
        for(int i =0;i<sizes.length;i++){
            if(sizes[i][0] > sizes[i][1]){ //앞에게 작게
                int  temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            if(bigX < sizes[i][0]){
                bigX = sizes[i][0];
            }
            if(bigY < sizes[i][1]){
                bigY = sizes[i][1];
            }
        }
        
        
        int answer = bigX * bigY;
        return answer;
    }
}