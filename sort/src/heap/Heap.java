package heap;

public class Heap{
	private int[] heap;
	private int size=0;
	Heap(int length){
		heap=new int[length];
	}
	Heap(){
		heap=new int[10000000];
	}
	Heap(int[] array){
		heap=array;
		size=array.length;
		HeapOperation.build(this);
	}
	public int[] getHeap() {
		return heap;
	}
	public void setHeap(int[] heap) {
		this.heap = heap;
	}
	public int getSize() {
		return size;
	}
	public void incSize() {
		size++;
	}
	public void decSize() {
		size--;
	}
}
