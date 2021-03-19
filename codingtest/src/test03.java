//같은 숫자는 싫어
import java.util.*;

class Solution3 {
    public Integer[] solution(int []arr) {
        Integer[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);
        
        for(int i=1;i<arr.length;i++) {
            if(arr[i]!=arr[i-1]) {
                list.add(arr[i]);
            }            
        }
        
        answer = list.toArray(new Integer[list.size()]);
        
        return answer;
    }
}