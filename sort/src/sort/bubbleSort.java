package sort;

public class bubbleSort {
  private void swap (int x, int y,int[] heap){
			int s=heap[x];
			heap[x]=heap[y];
			heap[y]=s;
		}
  void sort(int[]x){
	  boolean flag =true;
	  for(int i =0; i<x.length && flag;i++){
		  flag=false;
		  for(int j=0;j<x.length-1-i;j++){
			  if(x[j]>x[j+1]){
				  flag=true;
				 swap(j,j+1,x);
			  }
		  }
	  }  
  }
	public static void main(String[] args) {
		bubbleSort k = new bubbleSort();
		int[] m = {-1,5,0,8,9,3,-86878};
		k.sort(m);
		for(int i=0;i<m.length;i++){
		System.out.println(m[i]);
	}

	}

}
