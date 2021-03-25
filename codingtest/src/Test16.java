//2020 카카오인턴(키패드누르기)
class Solution16 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] key = {{1,4,7,10},{2,5,8,0},{3,6,9,11}};
        int lh_a=0;
        int lh_b=3;
        int rh_a=2;
        int rh_b=3;
        int lh = key[lh_a][lh_b]; //왼손의 위치
        int rh = key[rh_a][rh_b]; //오른손의 위치
        
        
        for(int i=0;i<numbers.length;i++) {
                for(int b=0;b<4;b++) {
                    if (numbers[i]==key[0][b]) {
                        lh_a=0;
                        lh_b=b;
                        answer += "L";
                    } else if (numbers[i]==key[2][b]) {
                        rh_a=2;
                        rh_b=b;
                        answer += "R";
                    } else if (numbers[i]==key[1][b]) {
                        int Ldist = Math.abs(lh_a-1)+Math.abs(lh_b-b);
                        int Rdist = Math.abs(rh_a-1)+Math.abs(rh_b-b);
                        if(Ldist>Rdist) { //왼손이 거리가 더 멀면 오른손이 움직임
                            rh_a=1;
                            rh_b=b;
                            answer += "R";
                        } else if (Ldist<Rdist) { //오른손이 거리가 더 멀면 왼손이 움직임
                            lh_a=1;
                            lh_b=b;
                            answer += "L";
                        } else { //왼손과 오른손의 거리가 같을 때
                            if (hand.equals("right")) {
                                rh_a=1;
                                rh_b=b;
                                answer += "R";
                            } else {
                                lh_a=1;
                                lh_b=b;
                                answer += "L";
                            }
                        }
                    }

            }
        }            
        
        return answer;
    }
}