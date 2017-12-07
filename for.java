class for1
	{
	public static void main(String[] orgd)
	{
	int i=0;
	int k=6;
	boolean bb=true;
	boolean jj=true;
	
      for(int j=2;j<=6;j++)
	{
	       if(i%2==0)
		{
		  bb=true;
		}
		else if(i%2==1)
		{
		    bb=false;
		}
           for(i=2;i<=6;i++)
	   { 
	         if(bb==true)
		{
	    	  System.out.print("*");
		}
		bb=!bb;
		else if(bb==false)
		{
		  System.out.print("-"); 
		}
	    }

		
	System.out.println();
	
	
	}
}
}