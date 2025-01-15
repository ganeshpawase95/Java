class Pattern4
{
	public static void main(String [] args)
	{
		int n=7;
		int i,j,k;
		for(i=n;i>=1;i--)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}