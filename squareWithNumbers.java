import java.util.Scanner;

public class squareWithNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
