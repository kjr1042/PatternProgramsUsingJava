import java.util.Scanner;

public class squarePattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if (i*j <= 9)
				{
					System.out.print("0");
				}
				System.out.print(i*j + " ");
			}
			System.out.println();
		}

	}

}
