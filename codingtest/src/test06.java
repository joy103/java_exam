//문자열 내 마음대로 정렬하기
import java.util.*;
class Solution6 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        for(int i=0;i<strings.length;i++) {
            strings[i] = String.valueOf(strings[i].charAt(n))+strings[i];
        }
        Arrays.sort(strings);
        for(int i=0;i<strings.length;i++) {
            strings[i] = strings[i].substring(1);
        }
           
        answer = strings;
        
        return answer;
    }
}

