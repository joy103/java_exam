//Summer/Winter Coding(~2018)(소수만들기)
class Test20 {
	public int solution(int[] nums) {
		int nlen = nums.length;
        int count=0; //합이 소수인 경우 카운트
        
        for(int i=0;i<nlen-2;i++) {
            for(int j=i+1;j<nlen-1;j++) {
                for(int k=j+1;k<nlen;k++) {
                    int sum = nums[i]+nums[j]+nums[k]; //배열에서 숫자를 3개씩 골라 합함
                    if(isPrime(sum)==true) 
                        count++;  //소수인 경우 카운트
                    if(i==nlen-3&&j==nlen-2&&k==nlen-1) //마지막 경우의 수일 경우 break;
                        break;
                }                    
            }
        }
        return count;
	}
        
    public boolean isPrime(int n) {
        boolean result = true; 
        for(int j = 2; j <= (int)Math.sqrt(n); j++) { //소수인지 판별
            if(n%j == 0) {
                result=false;
                break; //나누어 떨어지면 더이상 소수가 아님 -> false && break
             } else {
                 result=true; // 소수이면 true
             }
         }
        return result;
     }   
	
	public static void main(String[] args) {
		Test20 test = new Test20();
		int[] nums = {1,2,3,4};
		int[] nums2 = {1,2,7,6,4};
		
		System.out.println(test.solution(nums));
		System.out.println(test.solution(nums2));
		

	}

}
