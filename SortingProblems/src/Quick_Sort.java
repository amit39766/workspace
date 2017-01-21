
public class Quick_Sort {

	public static void main(String[] args) {
		int array[]={5,2,3,7,55,8,3,9,85,69,4,5,69,54,20,35,14};
	    int left,right;
	    int i;
	    left=0;
	    right=array.length-1;
	    quicksort(array,left,right);
	    for(i=0;i<array.length;i++)
	          System.out.printf(" "+array[i]);
	  	


	}
	private static int partition(int[] array,int left,int right){
	    int privot=array[left];
	    int i,j;
	    i=right+1;
	    for(j=right;j>left;j--){
	        if(array[j]>=privot){
	            i=i-1;
	            swap(array,i,j);

	        }

	    }
	    swap(array,i-1,left);
	    return i-1;
	}
	private static void swap(int[] arr, int a, int b) {
		// TODO Auto-generated method stub
	    int temp=arr[a];
	    arr[a]=arr[b];
	    arr[b]=temp;
		
	}
	private static void quicksort(int[] array,int left,int right){
	    while(left<right){
	    int q=partition(array,left,right);
	    quicksort(array,left,q);
	    quicksort(array,q+1,right);
	    break;
	    }
	    

	}

}
/*
 *
 #include<stdio.h>
void swap(int arr[],int a,int b){
    int temp=arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
    }
void quicksort(int array[],int left,int right){
    while(left<right){
    int q=partition(array,left,right);
    quicksort(array,left,q);
    quicksort(array,q+1,right);
    break;
    }


}
int partition(int array[],int left,int right){
    int privot=array[left];
    int i,j;
    i=right+1;
    for(j=right;j>left;j--){
        if(array[j]>=privot){
            i=i-1;
            swap(array,i,j);

        }

    }
    swap(array,i-1,left);
    return i-1;
}

int main(){
    int array[]={5,2,8,3,9};
    int left,right;
    int i;
    left=0;
    right=4;
    quicksort(array,left,right);
    for(i=0;i<5;i++)
       printf("%d ",array[i]);
	return 0;
}
*/
