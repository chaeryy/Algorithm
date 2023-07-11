import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
    	int answer = 0;
    	Arrays.sort(score);
    	
    	int cnt = 0;
        int box = 0;
        
        for (int i = score.length-1; i >= 0; i--) {
            cnt++;
            if (cnt == m) {
                answer += (score[i] * m);
                    
                cnt = 0;
                box++;
                
                if (box == (score.length / m)) 
                	break;
            }
        }
        return answer;
    }
}