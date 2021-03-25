//2019 kakao blind recruitment(������)
import java.util.*;
public class Test19 {

	public static void main(String[] args) {
		Test19 tes = new Test19();
		int N1=5;
		int N2=4;
		int[] stages1= {2, 1, 2, 6, 2, 4, 3, 3};	
		int[] stages2= {4, 4, 4, 4, 4};	
		System.out.println(Arrays.toString(tes.solution(N1,stages1)));
		System.out.println(Arrays.toString(tes.solution(N2,stages2)));
	}
	
	public int[] solution(int N, int[] stages) {
        int[] answer = new int[N]; 
        int[] pass = new int[N]; //���������� ������ �÷��̾� ��
        int[] fail = new int[N]; //���������� ���������� ���� Ŭ�������� ���� �÷��̾��� ��
            
        for(int i=1;i<N+1;i++){
            for(int j=0;j<stages.length;j++){
                if(stages[j]>i) {
                    pass[i-1]++; //���������� ������ �÷��̾� �� ���
                } else if (stages[j]==i) {
                    fail[i-1]++; //���������� ���������� ���� Ŭ�������� ���� �÷��̾��� �� ���
                }
            }           
        }
        
        float[] rate = new float[N];
        for (int i=0;i<N;i++) {
            if(pass[i]==0&&fail[i]==0) {
                rate[i]=0;
            } else{
                rate[i]=(float)fail[i]/(fail[i]+pass[i]);
            } 
        }
        
        Map<Integer,Float> map = new HashMap<Integer,Float>();
        for(int i=1;i<N+1;i++) {
            map.put(i,rate[i-1]);
        }
        
        //map�� value���� �������� �������� ����
        List<Map.Entry<Integer,Float>> list = new ArrayList<Map.Entry<Integer,Float>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer,Float>>() {
              public int compare(Map.Entry<Integer,Float> e1, Map.Entry<Integer,Float> e2)
              {
                if (e1.getValue() == e2.getValue())
                    return e1.getKey().compareTo(e2.getKey());
                else
                    return e2.getValue().compareTo(e1.getValue());
              }
        });
        
        //���ĵ� list(key�� value)�� LinkedHashMap�� ������� ����
        LinkedHashMap<Integer,Float> result = new LinkedHashMap<Integer,Float>();
        for (Map.Entry<Integer,Float> e : list)
            result.put(e.getKey(), e.getValue());
        
        //list�� key���� ����
        List<Integer> list2 = new ArrayList<Integer>(result.keySet());
        answer = list2.stream().mapToInt(Integer::intValue).toArray(); //list�� int[]�� ��ȯ
        
        return answer;
    }

}
