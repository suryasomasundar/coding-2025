package Strings;

public class deFangIP {

	public static String deFangIp(String str) {

		String deFang = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '.') {
				deFang += "[]";
			} else {
				deFang += str.charAt(i);
			}
		}
		return deFang;
	}

	public static void main(String[] args) {
		String str = "1.1.1.1";
		System.out.println(deFangIp(str));
	}

}
