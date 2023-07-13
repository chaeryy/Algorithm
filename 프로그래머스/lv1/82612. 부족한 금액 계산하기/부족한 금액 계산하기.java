class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long ticket = 0;
        
        for (int i = 1; i <= count; i++) {
			ticket += price * i;
		}
        
        if (ticket < money) {
			answer = 0;
		} else {
			answer = ticket - money;
		}
        return answer;
    }
}