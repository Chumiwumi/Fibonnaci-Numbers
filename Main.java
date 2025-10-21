public class Main
{
	public static void main(String[] args) {
	    System.out.println(fibfor(6));
	}
		public static int fibfor(int num){
		    int n1=0;
		    int n2=1;
		    int total = n1 + n2;
		    
		    		    if(num ==0) return n1;
		    		    else if (num==1) return n2;
		    		    else{
		    		        for (int i=1; i<num;i++){
		    		            total = n1+n2;
		    		            n1=n2;
		    		            n2=total;
		    		        }
		    		        return total;
		    		    }
	}
}
