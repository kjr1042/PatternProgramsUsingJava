
public class reverseOfRightAngledpyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		int n=5;
		for(i=1;i<=n;i++)
		{
			
			for(j=1;j<=n-i+1;j++)
			{
				if(i==1||j==1 ||j==n-i+1)
				{
					System.out.print((i+j)-1 +" ");
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
