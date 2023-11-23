
public class alphabetPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=5;
		char c='A';
		for(i=1;i<=n;i++)
		{
			if(i%2 ==0)
			{
				char ch =(char)(c+i-1);
				for(j=1;j<=i;j++)
				{
					System.out.print(ch+" ");
					ch--;
					c++;
				}
				System.out.println();
			}
			
			else
			{
				for(j=1;j<=i;j++)
				{
					System.out.print(c +" ");
					c++;
				}
				System.out.println();
			}
			
		}

	}

}
