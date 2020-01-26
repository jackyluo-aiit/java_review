package ArrayDemo;

class MergeAndSort{
	
	public static void main(String[] args){
		int[] test1 = {1, 12, 34, 56, 90, 32, 54, 67, 33};
		int[] test2 = {2, 97, 76, 108, 59, 78};
		int[] result = MA(test1, test2);
		for(int a:result){
    	System.out.println(a);
  	}
	}
	
	public static int[] MA(int[] data1, int[] data2){
		int[] result = new int[data1.length+data2.length];
		System.arraycopy(data1,0,result,0,data1.length);
		System.arraycopy(data2,0,result,data1.length,data2.length);
		int len = result.length;
		int iter = 0;
		while(iter < len-1){
			for(int i = 0; i <len-1-iter; i++){
				if(result[i] > result[i+1]){				
					int tmp = result[i];
					result[i] = result[i+1];
					result[i+1] = tmp;
				}
			}
			iter++;
		}
		return result;
	}
}
