
public class squarepattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, n=5;
		for(i=1;i<=n;i++)
		{
			if(i%2 == 0)
			{
				System.out.print(i+1+" ");
			}
			for(j=1;j<=n;j++)
			{
				System.out.print(i +" ");
			}
			if(i%2!=0)
			{
				System.out.print(i+1+" ");
			}
			System.out.println();
		}

	}

}
