
public class rightAngledTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,count=1;
		int n=5;
		for(i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print("  ");
			}
			count=1;
			for(j=1;j<=(2*i)-1;j++)
			{
				if(i>j)
				{
					System.out.print(count+" " );
					count++;
				}
				else
				{
					System.out.print(count+" ");
					count--;
				}
			}
			System.out.println();
		}
		

	}

}
