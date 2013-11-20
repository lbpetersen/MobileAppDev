class Exercise3 {
	public static void main(String[] args){
	 System.out.println(isTriangle(3,4,5));
    }
	public static boolean isTriangle(int a, int b, int c){
	   if (a >= b &&  b >= c){
             return true;
	   }else{
             return false;
           }
        }
}
