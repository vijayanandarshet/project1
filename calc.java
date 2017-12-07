class calc
{
	public static void main(String[] ggg)
	{
	String oper="*";
	int i=10;
	int j=20;
	float res;
	
	switch(oper)
	{
	case "+":
	res=i+j;
	System.out.println("addition"+res);
	break;
	
	case "-":
	res=i-j;
	System.out.println("sub"+res);
	break;
	
	case "/":
	res=i/j;
	System.out.println("DIV"+res);
	break;
	
	case "*":
	res=i*j;
	System.out.println("MUL"+res);
	break;
     		
	case "%":
	res=i%j;
	System.out.println("mod"+res);
	  
	default:
	System.out.println("no operation");
	}
}
}
