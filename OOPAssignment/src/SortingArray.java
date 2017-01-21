
public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={66,2,36,4,1,22,27,65,8,23,12,35,78,96,36,12,20,19,45,64,36,78,6};
		System.out.println("Befor sorting the array: ");
		for(int i=0;i<array.length;i++)System.out.print(array[i]+" ");
		System.out.println("\nAfter Sorting the array:[Using Bubble Sort Algorithm] ");
		for(int a=0;a<array.length;a++){
			for(int b=0;b<array.length;b++){
				if(array[a]>array[b]){
					int temp=array[b];
					array[b]=array[a];
					array[a]=temp;
				}
			}
		}
		for(int i=0;i<array.length;i++)System.out.print(array[i]+" ");

	}

}
