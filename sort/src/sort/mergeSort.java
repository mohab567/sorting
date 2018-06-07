package sort;

public class mergeSort {

	
	void sort(int[] x,int s,int e){
		if(s<e){
			int mid=(s+e)/2;
			sort( x, s,mid);
			sort( x,mid+1 , e);
			merge(x,s,mid,e);
		}
	}
	private void merge(int[] x, int s, int mid, int e) {
		int l=s,r=mid+1,i=0;
		int[] temp=new int[e-s+1];
		while(l<=mid&&r<=e){
			if(x[l]>x[r]){
				temp[i]=x[r];
				r++;
			}else{
				temp[i]=x[l];
				l++;
			}
			i++;
		}
		while(l<=mid){
			temp[i]=x[l];
			l++;
			i++;
		}
		while(r<=e){
			temp[i]=x[r];
			r++;
			i++;
		}
		for(i=0;i<temp.length;i++){
			x[i+s]=temp[i];
		}
	}

	public static void main(String[] args) {
		mergeSort k = new mergeSort();
		int[] m = {-1,5,0,8,9,3};
		k.sort(m,0,m.length-1);
		for(int i=0;i<m.length;i++){
		System.out.println(m[i]);
		}
		
		

	}

}
