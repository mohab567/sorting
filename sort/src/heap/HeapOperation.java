package heap;

public class HeapOperation {

	private static void swap (int x, int y,int[] heap){
		int s=heap[x];
		heap[x]=heap[y];
		heap[y]=s;
	}
	
	static void heapify (int x,Heap heap){
    int l = Integer.MIN_VALUE;
    int r = Integer.MIN_VALUE;
    int max=x;
    if(x*2+1<heap.getSize()){
    	
    	l=heap.getHeap()[x*2+1];
    	
    }
    if(x*2+2<heap.getSize()){
	  
    	r=heap.getHeap()[x*2+2];
    	
    }
    if(r>l){
    	if(heap.getHeap()[x]<r){
    		swap(x,x*2+2,heap.getHeap());
    		max=x*2+2;
    	}
    }else{
    	if(heap.getHeap()[x]<l){
    		swap(x,x*2+1, heap.getHeap());
    		max=x*2+1;
    	}
    }
		if (max!=x){
			heapify(max,heap);
		}
	}
	
	static void build (Heap heap){

		for(int i=heap.getSize()/2 ; i>=0 ; i--){
			heapify(i,heap);
		}
		
	}
	public void heapSort(int[] heap){
		Heap h = new Heap(heap);
		for(int i = 0; i < heap.length; i++){
			remove(h);
		}
	}
	void insert(Heap heap,int x){
		heap.getHeap()[heap.getSize()]=x;
		
		for(int i=heap.getSize(); i!=0 ;i=(i-1)/2){
			if(heap.getHeap()[i]>heap.getHeap()[(i-1)/2]){
				swap(i,(i-1)/2,heap.getHeap());
			}
			else{
				break;
			}
		}
		heap.incSize();
	}
	int remove(Heap heap){
		heap.decSize();
		swap(0,heap.getSize(),heap.getHeap());
		heapify(0, heap);
		return heap.getHeap()[heap.getSize()];
	}
	
	public static void main(String[] args) {
		HeapOperation k = new HeapOperation();
		int[] m = {-1,5,0,8,9,3};
		Heap s = new Heap();
		
		for(int i=0;i<m.length;i++){
		k.insert(s,m[i]);
		}
		
		k.insert(s, 27);
		k.insert(s, 0);
		
		for(int i=0;i<s.getSize();i++){
		System.out.println(s.getHeap()[i]);
		}

	}

}
