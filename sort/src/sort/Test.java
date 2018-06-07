package sort;

import java.io.FileWriter;
import java.io.IOException;

import heap.HeapOperation;

public class Test {
	//static Long preformance;
	static void test (int length){
		bubbleSort s1 = new bubbleSort();
		mergeSort s2 = new mergeSort();
		quickSort s3 = new quickSort();
		selectionSort s4 = new selectionSort();
		HeapOperation s5 = new HeapOperation();
		
		int[] x= new int [length];
		 
		for(int i=0;i<length;i++){
			x[i]=randomNumber(Integer.MAX_VALUE);
			
		}
		int[] x1= new int [length];
		int[] x2= new int [length];
		int[] x3= new int [length];
		int[] x4= new int [length];
		int[] x5= new int [length];
		
		for(int i=0;i<length;i++){
			x1[i]=x2[i]=x3[i]=x4[i]=x5[i]=x[i];
			
		}

		long s1Start = System.nanoTime();
		s1.sort(x1);
		long s1Time = System.nanoTime()-s1Start;
		System.out.println("bubble      "+s1Time);
		//preformance=s1Time;
		
		long s2Start = System.nanoTime();
		s2.sort(x2,0,x2.length-1);
		long s2Time = System.nanoTime()-s2Start;
		System.out.println("merge       "+s2Time);
		
		
		long s3Start = System.nanoTime();
		s3.sort(x3,0,x3.length-1);
		long s3Time = System.nanoTime()-s3Start;
		System.out.println("quick       "+s3Time);
		

		long s4Start = System.nanoTime();
		s4.sort(x4);
		long s4Time = System.nanoTime()-s4Start;
		System.out.println("selection   "+s4Time);
		

		
		long s5Start = System.nanoTime();
		s5.heapSort(x5);
		long s5Time = System.nanoTime()-s5Start;
		System.out.println("heap        "+s5Time);
		
	}
	public static int randomNumber(int length) {
        // generate random number from 0 to length-1
		double x = Math.random();
		if(x<0.5)
        return (int) (Math.floor(Math.random() * (length)));
		else
		return (int) (-1*Math.floor(Math.random() * (length)));
    }
	public static void main(String[] args) throws IOException {
		test(1000);
		/*
		FileWriter saveFile = new FileWriter("text.txt");
		for(int i=1;i<=10000;i++){
			
			//System.out.println(i);
			String micro =preformance.toString();
			//System.out.println(micro);
				saveFile.write(micro+"\n");
				
				
			
		}
		saveFile.close();
		*/
	}

}
