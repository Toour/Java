public class InsertionSort01 {

	public static void main(String[] args) {
		int a[] = {1,5,3,20,100,85,50,33,32,7,4,97,46,43,83,64};
		for (int x : a) {
			System.out.print(x + " ");
		}
		insertionsort(a);
		System.out.println();
		for (int x : a) {
			System.out.print(x + " ");
		}
	}
	
	public static void insertionsort(int a[]) {
		int temp;
		for(int x=0; x< a.length ; x++) {
			for (int y = 0; y < a.length; y++) {
				if(a[x] < a[y]) {
					temp = a[x];
					a[x] = a[y];
					a[y] = temp;
				}
			}
		}
	}

}
