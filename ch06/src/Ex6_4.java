class Ex6_4 {

	public static void main(String[] args) {
		MyMath mm = new MyMath(); //2.MyMath ��ü ����
		long result = mm.max(5, 3); //3.MyMath ��ü ���(��ü�� �޼��� ȣ��)
		long result1 = mm.add(5L, 3L); //add�޼��� ȣ�� -> ���� add�޼���� ���ٰ� �۾��� ��ġ�� ��ȯ���� ȣ���� ������ ���ƿ�
		long result2 = mm.subtract(5L, 3L); //5�� 3���� ��� ���� (�ڵ�����ȯ)
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("max(5L,3L) = "+result);
		System.out.println("add(5L,3L) = "+result1);
		System.out.println("subtract(5L,3L) = "+result2);
		System.out.println("multiply(5L,3L) = "+result3);
		System.out.println("divide(5L,3L) = "+result4);
	
	}


}


class MyMath {  //1.MyMath Ŭ���� �ۼ�(�޼��� �ۼ�)
	long add(long a, long b) {
		long result = a + b;
		return result; //return a+b; �� �ٷ� ������ ����
	}
	long subtract(long a, long b) { return a-b;}
	long multiply(long a, long b) { return a*b;}
	long divide(long a, long b) { return a/b;}
	
	//�� ���� �޾Ƽ� �� �߿� ū ���� ��ȯ�ϴ� �޼��带 �ۼ��Ͻÿ�.
	long max(long a, long b) {
		long result = 0;
		if(a>b) {  
			result = a;
		} else {
			result = b;
		}
		return result;
	}
	
	//���׿����� ���
	long max1(long a, long b) {
		long result = a > b ? a : b;
		return result;
	}
	
}