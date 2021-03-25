//2018 kakao blind recruitment([1차]비밀지도)
import java.util.Arrays;
public class Test18 {

	public static void main(String[] args) {
        Test18 tes = new Test18();
		int n =5;
		int[] arr1= {9, 20, 28, 18, 11};
		int[] arr2= {30, 1, 21, 17, 28};
		System.out.println(Arrays.toString(tes.solution(n,arr1,arr2)));
	}

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] str1 = new String[n];
        String[] str2 = new String[n];
        String[][] str = new String[n][n];
        
        //answer[i] 초기화
        for(int i=0;i<n;i++) { 
        	answer[i]="";
        }
        
        for (int i=0;i<n;i++) {
            str1[i]=Integer.toBinaryString(arr1[i]); //10진수를 2진수로 변환
            str2[i]=Integer.toBinaryString(arr2[i]); 

            //2진수를 길이 n에 맞춤
            String tmp1=str1[i];
            str1[i]="";
            for(int m=0;m<n-tmp1.length();m++){
                if(str1[i].length()==n) {
                	break;
                }
            	str1[i]+="0";
            }          
            str1[i]+=tmp1;

            //2진수를 길이 n에 맞춤
            String tmp2=str2[i];
            str2[i]="";
            for(int m=0;m<n-tmp2.length();m++){
            	if(str2[i].length()==n) {
                	break;
                }
            	str2[i]+="0";
            }          
            str2[i]+=tmp2;
            
            //전체지도의 암호 생성
            for(int j=0;j<n;j++) {
                if(str1[i].charAt(j)=='0'&&str2[i].charAt(j)=='0'){ 
                    str[i][j]=" "; 
                } else {
                    str[i][j]="#";
                }
                answer[i]+=str[i][j];
            }
        }
       
        return answer;
    }
}