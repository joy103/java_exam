//두 정수 사이의 합
class Solution5 {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a>b) {
            int mid = a;
            a=b;
            b=mid;
        }
        
        for (long i=a;i<b+1;i++) {
            answer += i;
        }
 
        return answer;
    }
}
