import java.util.Scanner;

public class hallowPyramidWithNum {

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
				if(k==1 || k==i ||i==n)
				{
					System.out.print(k +" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			
			System.out.println();
		}

	}

}
/*import java.util.Scanner;

public class hallowPyramidWithNum {

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
				if(k==1 || k==i ||i==n)
				{
					System.out.print(i +" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			
			System.out.println();
		}

	}

}
*/