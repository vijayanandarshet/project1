
class PrintDemo{
 

 
public static void main(String args[]) 
{
 
hh(1); 
 
 }
 public static void hh(int n) 
{ 
 
  if(n <= 10000) {
 
	if(n%2!=0)
	System.out.println(n+"oad number");
	else 
	System.out.println(n+"even number");
         hh(n+1);   }
}
}


