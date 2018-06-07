package sort;

public class quickSort {
    void sort(int[]x,int s,int e){
    	int l= s;
    	int r= e;
    	if(s<e){
    	while(l<r){
    		
    		while(l<e && x[s]>=x[l]){
    			l++;
    		}
    		while(s<r && x[s]<x[r]){
    			r--;
    		}		
    		if(l<r)
    		swap(l,r,x);
    	}
    	swap(s,r,x);
    	sort(x,s,r-1);
    	sort(x,r+1,e);
    	}
    }
    private void swap (int x, int y,int[] heap){
		int s=heap[x];
		heap[x]=heap[y];
		heap[y]=s;
	}
	public static void main(String[] args) {
		quickSort k = new quickSort();
		int[] m = {-1,5,0,8,9,3,-86878};
		k.sort(m,0,m.length-1);
		for(int i=0;i<m.length;i++){
		System.out.println(m[i]);
	}
	}
}
