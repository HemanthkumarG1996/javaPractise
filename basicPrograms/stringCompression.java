package basicPrograms;

public class stringCompression {
	public static void main(char args[]) {
		char chars [] = {'a','a','b','b','c','c','c'};
		StringBuilder sb = new StringBuilder();
		int count = 1;
		int i = 1;
		sb.append(chars[0]);
		while(i< chars.length) {
			if(chars[i] == chars[i-1]) {
				count ++;
			}else {
				sb.append(count);
				sb.append(chars[i]);
			}
			i++;
		}
		sb.append(chars[i]);
		for(int j=0; j<chars.length; j++) {
			 chars[j] = sb.charAt(j);
		}
		System.out.println(sb.length());
	}
}
