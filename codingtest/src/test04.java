//나누어 떨어지는 숫자 배열
import java.util.*;
class Solution4 {
    public Integer[] solution(int[] arr, int divisor) {
        Integer[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++) {
            if(arr[i]%divisor==0) {
                list.add(arr[i]);
            }
        }
        
        Collections.sort(list);
        if(list.isEmpty()) {
            list.add(-1);
        }
        
        answer = list.toArray(new Integer[list.size()]);
        
        return answer;
    }
    
    
}