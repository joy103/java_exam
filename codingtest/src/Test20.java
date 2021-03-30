//Summer/Winter Coding(~2018)(�Ҽ������)
class Test20 {
	public int solution(int[] nums) {
		int nlen = nums.length;
        int count=0; //���� �Ҽ��� ��� ī��Ʈ
        
        for(int i=0;i<nlen-2;i++) {
            for(int j=i+1;j<nlen-1;j++) {
                for(int k=j+1;k<nlen;k++) {
                    int sum = nums[i]+nums[j]+nums[k]; //�迭���� ���ڸ� 3���� ��� ����
                    if(isPrime(sum)==true) 
                        count++;  //�Ҽ��� ��� ī��Ʈ
                    if(i==nlen-3&&j==nlen-2&&k==nlen-1) //������ ����� ���� ��� break;
                        break;
                }                    
            }
        }
        return count;
	}
        
    public boolean isPrime(int n) {
        boolean result = true; 
        for(int j = 2; j <= (int)Math.sqrt(n); j++) { //�Ҽ����� �Ǻ�
            if(n%j == 0) {
                result=false;
                break; //������ �������� ���̻� �Ҽ��� �ƴ� -> false && break
             } else {
                 result=true; // �Ҽ��̸� true
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
