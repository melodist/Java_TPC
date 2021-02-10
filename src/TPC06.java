
public class TPC06 {
	public static void main(String[] args) {
	// 5. 메서드 -> 동작(method), 기능(function)
		int a = 67;
		int b = 98;
		// a + b = ?
		int result = sum(a, b);
		System.out.println(result);
		
		int hap=0;
		int[] arr = makeArr(10, 20, 30);
		for(int i=0;i<arr.length;i++) {
			hap += arr[i];
		}
		System.out.println(hap);
	}
	// 정수 2개를 매개변수로 받아서 총합을 구하여 리턴하는 메서드를 정의하시오.
	public static int sum(int a, int b) {
		return a+b;
	}
	// 10, 20, 30
	public static int[] makeArr(int x, int y, int z) {
		int[] arr = new int[3];
		arr[0] = x;
		arr[1] = y;
		arr[2] = z;
		
		return arr;
	}
}
