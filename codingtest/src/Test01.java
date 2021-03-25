//2016³â

class Solution {
  public String solution(int a, int b) {
      String answer="";
      
      int[] d = {31,29,31,30,31,30,31,31,30,31,30,31};
      String[] m = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
      int adate = 0;
      for(int i=0;i<a-1;i++) {
          adate += d[i];
      }
      adate += b-1;
      answer = m[adate%7];
      
      return answer;     
  }
}