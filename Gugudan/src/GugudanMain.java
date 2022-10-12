import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		// 클래스
//		for(int i = 2; i < 10; i++) {
//			int[] result = Gugudan.calculate(i);
//			System.out.println(i + "단");
//			Gugudan.print(result);
//		}
		
		// 최종 요구사항1
//		System.out.println("몇 단까지 출력할까요?? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		
//		
//		for(int i = 2; i < (number + 1); i++) {
//			int[] result = Gugudan.calculate1(i, number);
//			System.out.println(i + "단");
//			Gugudan.print(result);
//		}
		
		// 최종 요구사항 2
		System.out.println("몇 단까지 출력할까요?? : ");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		for(int i = 2; i < (first + 1); i++) {
			int[] result = Gugudan.calculate1(i, second);
			System.out.println(i + "단");
			Gugudan.print(result);
		}
	}
}
