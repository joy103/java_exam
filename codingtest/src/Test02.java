//가운데 글자 가져오기
class Solution2 {
    public String solution(String s) {
        String answer = "";
        int lth = s.length();
        
        if(lth%2==0) {
            answer = s.substring(lth/2-1,lth/2+1);
        } else {
            answer = s.substring((int)(lth/2),(int)(lth/2)+1);
        }
 
        return answer;
    }
}