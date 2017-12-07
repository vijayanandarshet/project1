class nu1
{
	public static void main(String[] orgs)
	{
	int i=0,j=1212121212,l=0,sum=0;
	while(j!=0)
	{
	l=j%10;
	j=j/10;
	sum=sum+l;
	if(sum==9){continue;}
	System.out.println(sum);
	}
	
	}
	}
