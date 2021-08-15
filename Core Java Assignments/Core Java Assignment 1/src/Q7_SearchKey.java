
public class Q7_SearchKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int key = 19;
		for(int i=0;i<arr.length;i++){
			if(key==arr[i]){
				System.out.println("key " + arr[i] + " found in the array");
			}
		}

	}

}
