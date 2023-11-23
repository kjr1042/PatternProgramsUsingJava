import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*" +" ");
			}
			
			System.out.println();
		}

	}

}
