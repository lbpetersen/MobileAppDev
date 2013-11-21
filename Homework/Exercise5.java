class Exercise5 {
	public static void main(String[] args){
	  double dist= distance(1.0, 2.0, 4.0, 6.0);
	  System.out.println(sumSquares(5.0, 4.0));

     }
	public static double distance(double x1, double y1, double x2, double y2) {
	  double dx = x2 - x1;
	  double dy = y2 - y1;
	     double dsquared = dx*dx + dy*dy;
	     double result = Math.sqrt(dsquared);
	       return result;
    }
	public static double sumSquares(double x, double y) {
	    return ((x*x) + (y*y));
    } 
}
