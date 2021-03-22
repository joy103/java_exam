//문자열 내 p와 y의 개수
class Solution10 {
    boolean solution(String s) {
        boolean answer = true;
        int pcount=0;
        int ycount=0;
        String[] str = new String[s.length()];
               
        for (int i=0;i<s.length();i++) {
            str[i]=s.charAt(i)+"";
            if(str[i].equalsIgnoreCase("p")) {
                pcount++;
            } else if (str[i].equalsIgnoreCase("y")) {
                ycount++;
            }
        }
        return pcount==ycount ? answer : !(answer);

    }
}
