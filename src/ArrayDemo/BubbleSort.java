package ArrayDemo;

class BubbleSort{
	
	public static void main(String[] args){
		int[] test = {1, 12, 34, 56, 90, 32, 54, 67, 33};
		int[] result = BS(test);
		for(int a:result){
    	System.out.println(a);
  	}
	}
	
	public static int[] BS(int[] data){
		int len = data.length;
		int iter = 0;
		int tmp = -1;
		while(iter < len-1){
			for(int i = 0; i < len-1-iter; i++){
				if(data[i] < data[i+1]){
					tmp = data[i];
					data[i] = data[i+1];
					data[i+1] = tmp;
				}
			}
			iter++;
		}
		return data;
	}
}