class Pattern3
{
	public static void main(String [] args)
	{
		int n=7;
		int i,j,k,l;
		for(i=1; i<=4; i++)
		{
			for(j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			for(k=i;k>=1; k--)
			{
				System.out.print(i);
			}
			for(l=2; l<=i;l++)
			{
				System.out.print(i);
			}
		System.out.println(" ");
		}
	}
}