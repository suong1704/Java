package demo;

// method và điều kiện
public class Method {
	public static int sum(int a, int b) {
		int resutl = a + b;
		return resutl;

	}

	public static void MyMethod() {
		System.out.println("Thông báo!");
	}

	public static void main(String[] args) {
		sum(6, 5);
		System.out.println(sum(4, 5));
		MyMethod();
		MyMethod();

		// Điều kiện

		// Array
		String[] array1 = { "Phan", "Thị", "Thu", "Sương" };
		String[] array2 = new String[10];
		for (int i = 0; i < array2.length; ++i) {
			System.out.println(i);
		}
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
//		for(String index: array1) {
//			System.out.print(array1);
//		}
	}

}
