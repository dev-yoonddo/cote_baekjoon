class Solution {
    public int solution(String message) {
        int answer = 0;
        answer = message.split("").length * 2;
        return answer;
    }
}