//체육복(탐욕법Greedy)
import java.util.*;
class Solution8 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int count = 0;
        
        ArrayList<Integer> lost1 = new ArrayList<Integer>();
        ArrayList<Integer> lost0 = new ArrayList<Integer>();
        ArrayList<Integer> reserve1 = new ArrayList<Integer>();
        ArrayList<Integer> pass = new ArrayList<Integer>();

        for(int i=0;i<lost.length;i++) {
            lost1.add(lost[i]);
            lost0.add(lost[i]);
        }
        for(int i=0;i<reserve.length;i++) {
            reserve1.add(reserve[i]);
        }


        lost1.removeAll(reserve1);
        reserve1.removeAll(lost0);


        if(lost1.contains(1)&&reserve1.contains(2)) {
            pass.add(1);
            reserve1.set(reserve1.indexOf(2),0);
        } 

        for (int i=2;i<n;i++) {
            if (lost1.contains(i)) {
                if(reserve1.contains(i-1)) {
                    pass.add(i);
                    reserve1.set(reserve1.indexOf(i-1),0);
                } else if (reserve1.contains(i+1)) {
                    pass.add(i);
                    reserve1.set(reserve1.indexOf(i+1),0);
                }
            }
        } 

        if(lost1.contains(n)&&reserve1.contains(n-1)) {
            pass.add(n);
            reserve1.set(reserve1.indexOf(n-1),0);
        } 

        count = n - lost1.size() + pass.size() ;

        return count;
    }
}

