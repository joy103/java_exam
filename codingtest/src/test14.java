//���ڼ��ڼ��ڼ��ڼ�?
class Solution14 {
    public String solution(int n) {
        String answer = "";
        String str = "����";
        
        if(n%2==0) {
            for(int i=0;i<(int)(n/2);i++) {
                answer += str;
            }
        } else {
            for(int i=0;i<(int)(n/2);i++) {
                answer += str;
            }
            answer += "��";
        }

        return answer;
    }
}
