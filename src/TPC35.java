public class TPC35 {

	public static void main(String[] args) {
		String str1 = new String("APPLE");
		String str2 = new String("APPLE");
		
		if (str1 == str2) { // NO
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		if (str1.equals(str2)) { // YES
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		String str3 = "APPLE";
		String str4 = "APPLE";
		
		if (str3 == str4) { // YES
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}