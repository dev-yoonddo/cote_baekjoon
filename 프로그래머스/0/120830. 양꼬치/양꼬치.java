class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int food = 0;
        int drink = 0;
        int free = 0;
        
        food = 12000 * n;
        drink = 2000 * k;
        free = (n / 10) * 2000;
        
        if(free > 0){
            drink = drink - free;
        }
        
        answer = food + drink;
        
        return answer;
    }
}