class Ex9_10 {

	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal); //int�� String���� ��ȯ
		
		double dVal = 200;
		String strVal2 = dVal+""; //double�� String���� ��ȯ
		
		double sum = Integer.parseInt("+"+strVal)+Double.parseDouble(strVal2); //���ڿ��� ���ڷ� �ٲٴ� ���
		double sum2 = Integer.valueOf(strVal)+Double.valueOf(strVal2);
		
		System.out.println(String.join("",strVal,"+",strVal2,"=")+sum); //""�� �����ؼ� ����
		System.out.println(strVal+"+"+strVal2+"+"+sum2);

	}

}
