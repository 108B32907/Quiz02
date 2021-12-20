package java;
import java.util.*;

public class J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=1234;
		System.out.println("密碼輸入測試");
		System.out.println("請輸入密碼");
		int a=sc.nextInt();
		System.out.println("請再一次輸入密碼");
		int b=sc.nextInt();
		System.out.println("請再一次輸入密碼");
		int c=sc.nextInt();
		int flag=0;
		try {
			if(a!=n || b!=n || c!=n) {
				System.out.println("與第一次不同");
				flag++;
			}
			else {
				System.out.println("密碼正確");
			}
			if(flag==2) {
				throw new RuntimeException("輸入三次錯誤!程式停止!");
			}
		}
		catch(RuntimeException e) {
			
		}
	}

}
