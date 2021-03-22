//시저암호
class Solution15 {
    public String solution(String s, int n) {
        char[] charr = new char[s.length()];
        
        for(int i=0;i<charr.length;i++) {
            charr[i]=s.charAt(i);
            if (charr[i]==32) {
                continue;
            } else if (charr[i]>=65&&charr[i]<=90) {
                charr[i]=(char)(charr[i]+n);
                if(charr[i]>90) {
                    charr[i]=(char)(charr[i]-26);
                }
            } else if (charr[i]>=97&&charr[i]<=122) {
                charr[i]=(char)(charr[i]+n);
                if(charr[i]>122) {
                    charr[i]=(char)(charr[i]-26);
                }
            }          
        }       
        String answer = new String(charr);
        
        return answer;
    }
}