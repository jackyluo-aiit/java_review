package ArrayDemo;

class ReverseArray{
	
	public static void main(String[] args){
		int[] test = {1, 12, 34, 56, 90, 32, 54, 67, 33};
		int[] result = RA(test);
		for(int a:result){
    	System.out.println(a);
  	}
	}
	
	public static int[] RA(int[] data){
		int len = data.length;
		int mid = len/2;
		for(int i = 0; i <mid; i++){
			int tmp = data[i];
			data[i] = data[len-1-i];
			data[len-1-i] = tmp;
		}
		return data;
	}
}
