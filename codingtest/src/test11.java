//문자열 내림차순으로 배치하기
import java.util.*;
class Solution11 {
    public String solution(String s) {
        String answer = "";
        String[] strarr = new String[s.length()];
        
        for(int i=0;i<s.length();i++) {
            strarr[i]=s.charAt(i)+"";
        }
        
        Arrays.sort(strarr);
    
        for(int i=0;i<strarr.length;i++) {
            answer += strarr[i];
        }
        
        StringBuffer sb = new StringBuffer(answer);
        sb.reverse();
        
        return sb.toString();
    }
}