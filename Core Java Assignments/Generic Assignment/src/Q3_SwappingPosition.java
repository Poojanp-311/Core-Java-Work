class swaposition<T>{
	private T[] arr;
	
	
	public swaposition(T[] arr) {
		super();
		this.arr = arr;
		
	}
	
	public static <T> void swap(T[] arr, int i, int j){
		T temp = arr[i];
		arr[i]  = arr[j];
		arr[j] = temp;
	}   
}


public class Q3_SwappingPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1,2,3,4};
        swaposition<Integer> sw = new swaposition<Integer>(arr);
        
               sw.swap(arr,1,2);
                for(int i: arr){
                	System.out.print(i+ " ");
                }
	}

}
