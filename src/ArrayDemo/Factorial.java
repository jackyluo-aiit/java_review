package ArrayDemo;

class Factorial{
	/*
	1: male; 0: female
	*/
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		System.out.println(fn(num));
	}
	
	public static int fn(int num){
		if(num<=1){
			return num;
		}
		
		int result = num * fn(num-1);
		
		return result;
	}
}