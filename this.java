class thi
	{
	int i;
	int g;
	
       void m1(int i,int g)
	{
	i=i;
	this.g=g;
	System.out.println(i+","+g);
	this.disp();
        }  
	 void disp()
	{
	System.out.println(i+","+g);
	}
	public static void main(String[] orgs)
	{ 
	thi t=new thi();
	
	t.m1(22,33);
	t.disp();
	}    
}
