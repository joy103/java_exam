//���￡�� �輭�� ã��
class Solution13 {
    public String solution(String[] seoul) {
        String answer = "";
        int x=0;
        
        for(int i=0;i<seoul.length;i++) {
            if(seoul[i].equals("Kim")) {
                x=i;
                break;
            }    
        }
        return "�輭���� "+x+"�� �ִ�";
    }
}
