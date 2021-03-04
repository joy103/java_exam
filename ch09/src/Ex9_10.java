class Ex9_10 {

	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal); //int를 String으로 변환
		
		double dVal = 200;
		String strVal2 = dVal+""; //double를 String으로 변환
		
		double sum = Integer.parseInt("+"+strVal)+Double.parseDouble(strVal2); //문자열을 숫자로 바꾸는 방법
		double sum2 = Integer.valueOf(strVal)+Double.valueOf(strVal2);
		
		System.out.println(String.join("",strVal,"+",strVal2,"=")+sum); //""로 구분해서 결합
		System.out.println(strVal+"+"+strVal2+"+"+sum2);

	}

}
