
/*public class pyramidWithOddNumSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int n=5;
		for(i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" "+" ");
			}
			for(j=1;j<=(2*i)-1;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}*/

public class pyramidWithOddNumSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int n=5;
		for(i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" "+" ");
			}
			for(j=1;j<=(2*i)-1;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
