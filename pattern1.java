
public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=5;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int k=1;k<n;k++)
		{
			for(int l=1;l<=n-k;l++)
			{
				System.out.print(n-k +" ");
			}
			System.out.println();
		}

	}

}
