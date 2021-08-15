
public class Q3_SI_CI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int P=153, N=3,R=2;
      double si=(P*N*R)/100;
       System.out.println("Simple interset is: " +si);
       
       
      int  p=2000, t=5, n=12;
    		 double r=0.08; 
       double CI= (p*Math.pow((1+r/100),n*t))-p;
       System.out.println("Compound interset is: " + CI);
	}

	
  
}
