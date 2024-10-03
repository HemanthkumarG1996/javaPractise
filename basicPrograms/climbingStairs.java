package basicPrograms;

public class climbingStairs {
	public static void main(String args[]) {
		int n =50;
		if (n==1){
             System.out.println(1);
        }
        int cs [] = new int[n+1];
        cs[1] = 1;
        cs[2] = 2;
        for(int i =3; i<=n;i++){
            cs[i] = cs[i-1] + cs[i-2];
        } 
        System.out.println(cs[n]);
	}
}
