//ã�ƶ� ���α׷��� ��������(���ϸ�) 
import java.util.*;
class Solution17 {
    public int solution(int[] nums) {
        int answer = 0;
        int n = (int)(nums.length/2);
        
        HashSet set = new HashSet();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        
        if(set.size()>=n) {
            answer = n;
        } else {
            answer = set.size();
        }
        
        return answer;
    }
}