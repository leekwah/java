class Ex3_11 {
	public static void main(String args[]) { 
		double pi = 3.141592; // 4번째에서 반올림하고 싶을 때
		
		System.out.println(pi); // 3.141592
		System.out.println(Math.round(pi*1000)); // 3142
		System.out.println(Math.round(pi*1000)/1000); // 3
		System.out.println((double)Math.round(pi*1000)/1000); // 3.142
		System.out.println(Math.round(pi*1000)/1000.0); // 3.142
		
		//double pi = 3.141592; // 3.141을 얻으려면?
		
		//System.out.println(pi); // 3.141592
		//System.out.println(Math.round((int)(pi*1000))); // 3141
		//System.out.println(Math.round((int)(pi*1000))/1000.0); // 3.141
	}
}