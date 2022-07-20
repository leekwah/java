package chapter03;

public class CoronaSum {
	public static void main(String[] args) {
		int corona [][] = {
							{11},{12},{13},
							{21},{22},{23},
							{31},{32},{33},
							{41},{42},{43},
							{51},{52},{53},
							{61},{62},{63},
							{71},{72},{73},
							{81},{82},{83},
							{91},{92},{93},
							{91},{92},{93},
							{101},{102},{103},
							{111},{112},{113},
							{121},{122},{123},
						  };
		
		int sum = 0;
		
		for (int month = 0; month < corona.length; month++) {
			for (int city = 0; city < corona.length; city++) {
				sum += corona[month][city];
			}
		}
		System.out.println("1년 전체 코로나 환자수는 "+sum+"입니다.");
	}
}
