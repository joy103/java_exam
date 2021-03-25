//모의고사(완전탐색)
import java.util.*;
class Solution9 {
    public Integer[] solution(int[] answers) {
        int ansLength = answers.length;
        int[][] person = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        int[] Ct = {0,0,0};
     
        for (int i=0;i<person.length;i++) {
            for (int j=0;j<ansLength;j++) {
                int index = j % person[i].length;
                if (answers[j]==person[i][index]) {
                    Ct[i]++;
                }
            }
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int max = 0;
        for (int i=0;i<Ct.length;i++) {
            if(Ct[i]>max) {
                max = Ct[i];
            }
        }
        
        for (int i=0;i<Ct.length;i++) {
            if(Ct[i]==max) {
                list.add(i+1);
            }   
        }
                     
        Integer[] answer = list.toArray(new Integer[list.size()]);
               
        return answer;
    }
}
