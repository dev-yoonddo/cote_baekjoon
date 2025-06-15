class Solution {
    public int solution(int[] numbers) {
        int maxNum = 0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i] * numbers[j] > maxNum){
                    maxNum = numbers[i] * numbers[j];
                }
            }
        }
        return maxNum;
    }
}