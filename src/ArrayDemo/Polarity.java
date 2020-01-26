package ArrayDemo;

class Polarity{
	
	public static void main(String[] args){
		int[] test = {1, 12, 34, 56, 90, 32, 54, 67, 33};
		int result = Po(test);
		System.out.println(result);
	}
	
	public static int Po(int[] data){
		int result = -1;
		if(data == null || data.length == 0){
			System.out.println("Invalid array");
		}
		for(int i = 0; i < data.length; i++){
			if(data[i] > result){
				result = data[i];
			}
		}
		return result;
	}
}
