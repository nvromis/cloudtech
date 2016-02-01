

import java.util.Scanner;
public class LostCard {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int [n+1];
		int temp,sum=0;
		for(int i = 1; i <=n-1; i++)
		{
		    temp=sc.nextInt();
			//a[temp] = temp;
			sum+=temp;

				}
		int i=1;
	/*while(a[i]!=0)
	i++;*/
		System.out.println((((1+n)*n)>>1)-sum);
	}


}
