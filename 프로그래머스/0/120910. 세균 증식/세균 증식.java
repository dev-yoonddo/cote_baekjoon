class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        
        for(int i=0; i<t; i++){
            if(i==0){
                answer += n * 2;
            }else{
                answer = answer * 2;
            }
        }
        return answer;
    }
}