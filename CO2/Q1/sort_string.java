import java.util.Arrays;
public class sort_string {
	public static String sort(String x) {
		char temp[]= x.toCharArray();
		Arrays.sort(temp);
		return new String(temp);
	}
	public static void main(String[] args) {
		String text = "java";
		String out = sort(text);
		System.out.println("Input String:"+text);
		System.out.println("Output String:"+out);
	}
}