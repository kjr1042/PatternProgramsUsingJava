import java.util.Scanner;

public class squareWithNumCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		int count=1;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(count<=9)
				{
					System.out.print("0");
				}
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	

	}

}
