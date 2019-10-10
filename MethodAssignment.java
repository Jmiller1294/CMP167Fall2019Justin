
public class MethodAssignment {
	
		public static void main(String[] args) 
		{
			System.out.println(productOf3(2,4,6));
			System.out.println(sumOf2(4,6));
			System.out.println(averageOfNum(5));
			
			
		}
	
	    public static int productOf3(int num1,int num2,int num3) 
		{
			return(num1 * num2 * num3);
			
			
		}
	    
	    public static int sumOf2(int num1,int num2) 
		{
			
			int i;
			int sum = 0;
			 for(i = num1;i <=num2;++i)
			{
			 sum = sum +i;
	        }
			
			return sum;
			
			
		}
		
	    
	    
	    public static int averageOfNum(int n)
		{
			
			int i;
			int sum = 0;
			
			for(i = 1;i <= n;++i)
			{
		    
			sum  += i;
				
				
			}
			
			return sum/n;
		}
	    
	}

	

