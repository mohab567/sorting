package sort;

public class selectionSort {

	void sort(int[]x){
		int tempIndex;
		for(int i=0;i<x.length;i++){
			tempIndex=i;
			for(int j=i;j<x.length;j++){
				if(x[j]<x[tempIndex])	
				    tempIndex=j;
			}
			swap(i,tempIndex,x);
			
		}
		
	}
	 private void swap (int x, int y,int[] heap){
			int s=heap[x];
			heap[x]=heap[y];
			heap[y]=s;
		}
	public static void main(String[] args) {
		selectionSort k = new selectionSort();
		int[] m = {-9,5,-33,8,9,7,0};
		k.sort(m);
		for(int i=0;i<m.length;i++){
		System.out.println(m[i]);
	}
	}

}
