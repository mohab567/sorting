package sort;

public class insertionSort {
	 void sort(int[] x) {
        int j;
        for (int i = 1; i < x.length; i++) {
            int current_item = x[i];
            j = i - 1;
            while (j >= 0 && x[j] > current_item) {
                x[j + 1] = x[j];
                j--;
            }
            x[j + 1] = current_item;
        }
    }

	public static void main(String[] args) {
		insertionSort k = new insertionSort();
		int[] m = {5,2,9,3,0,-1,-96,-2234};
		k.sort(m);
		for(int i=0;i<m.length;i++){
		System.out.println(m[i]);
	}

	}

}
