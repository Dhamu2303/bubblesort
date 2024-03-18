package bubble_sort;

public class Bubble_sort {
	static void bubble(int array[]) {
		int n=array.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(array[j]>array[j+1]) {
					int tem=array[j];
					array[j]=array[j+1];
					array[j+1]=tem;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] data = {64,34,57,86,97,-3};
		System.out.println("orginal array :");
		printArray(data);
		
		bubble(data);
		System.out.println("Sorted array in ascending order");
		printArray(data);
	}
	public static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

}
