import java.util.Scanner;

public class squarePattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		int count=1;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{	count=i;
			for(j=1;j<=n;j++)
			{
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}

	}

}
