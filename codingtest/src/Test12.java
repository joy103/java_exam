//문자열 다루기 기본
import java.util.*;
class Solution12 {
    public boolean solution(String s) {
        boolean answer = true;
        char ch = ' ';
        
        if(s.length()==4||s.length()==6) {
            for(int i =0;i<s.length();i++){
                ch=s.charAt(i);
                if (!(Character.isDigit(ch))) 
                    return (!answer);  
            }
            return answer;
        } else {
            return (!answer);
        }
    }
}