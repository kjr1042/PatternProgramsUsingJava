import java.util.Scanner;

public class hallowSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==1 || j==1 || i==n || j==n)
				{
					System.out.print("*" +" ");
				}
				else
				{
					System.out.print(" " +" ");
				}
			}
			System.out.println();
		}

	}

}
