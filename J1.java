package java;
import java.util.*;

public class J1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=1234;
		System.out.println("�K�X��J����");
		System.out.println("�п�J�K�X");
		int a=sc.nextInt();
		System.out.println("�ЦA�@����J�K�X");
		int b=sc.nextInt();
		System.out.println("�ЦA�@����J�K�X");
		int c=sc.nextInt();
		int flag=0;
		try {
			if(a!=n || b!=n || c!=n) {
				System.out.println("�P�Ĥ@�����P");
				flag++;
			}
			else {
				System.out.println("�K�X���T");
			}
			if(flag==2) {
				throw new RuntimeException("��J�T�����~!�{������!");
			}
		}
		catch(RuntimeException e) {
			
		}
	}

}
