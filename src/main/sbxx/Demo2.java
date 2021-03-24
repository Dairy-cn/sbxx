package main.sbxx;

import java.util.PriorityQueue;

/**
 * @author Dair
 * @since
 */
public class Demo2 {
	
	
	public static void main(String[] args) {
		int[] arr = new int[]{2, 1, 7, 4, 3, 9, 5};
//		headSort(arr);
//		for (int i : arr) {
//			System.out.println("-------" + i);
//		}
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		for (int i = 0; i <arr.length ; i++) {
			priorityQueue.add(arr[i]);
		}
		while (!priorityQueue.isEmpty()){
			System.out.println(priorityQueue.poll());
		}
	}
	
	private static void mergeSort(int[] arr, int low, int high, int[] temp) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(arr, low, mid, temp);
			mergeSort(arr, mid + 1, high, temp);
			merge(arr, low, high, mid, temp);
		}
		
	}
	
	private static void headSort(int[] arr) {
		//构建初始化堆
		System.out.println("初始化堆之前");
		for (int j : arr) {
			System.out.println(j);
		}
		for (int i = arr.length / 2; i >= 0; i--) {
			adjustHead(arr, i, arr.length);
		}
		System.out.println("初始化堆之后");
		for (int j : arr) {
			System.out.println(j);
		}
		int m = 0;
		for (int j = arr.length - 1; j > 0; j--) {
			int temp = arr[0];
			arr[0] = arr[j];
			arr[j] = temp;
			adjustHead(arr, 0, j);
			System.out.println("第" + m + "次构建后");
			m++;
			for (int k : arr) {
				System.out.println(k);
			}
		}
		
	}
	
	private static void adjustHead(int[] arr, int parent, int length) {
		int temp = arr[parent];
		//左节点
		int child = parent * 2 + 1;
		while (child < length) {
			//如果存在右节点且右节点大于左节点，把子节点赋值给右节点
			if (child + 1 < length && arr[child + 1] > arr[child]) {
				child++;
			}
			//如果父节点大于子节点 结束
			if (temp > arr[child]) {
				break;
			}
			//把子节点赋值给父节点
			arr[parent] = arr[child];
			//选取子节点
			parent = child;
			child = 2 * parent + 1;
		}
		//和赋值给最大的交换
		arr[parent] = temp;
	}
	
	
	//1,2,4,7,|| 3,5,9,9,0
	private static void merge(int[] arr, int low, int high, int mid, int[] temp) {
		int i = low;
		int j = mid + 1;
		int start = i;
		while (low <= mid && j <= high) {
			if (arr[low] > arr[j]) {
				temp[start++] = arr[j++];
			} else {
				temp[start++] = arr[low++];
			}
		}
		while (low <= mid) {
			temp[start++] = arr[low++];
		}
		while (j <= high) {
			temp[start++] = arr[j++];
		}
		
		while (i <= high) {
			arr[i] = temp[i++];
		}
		
	}
	
	private static void shellSort(int[] arr) {
		//2, 1, 7, 4, 3, 9, 5
		int h = 1;
		int n = arr.length;
		while (h < n / 3) {
			h = h * 3 + 1;
		}
		while (h >= 1) {
			for (int i = h; i < n; i++) {
				for (int j = i; j >= h && arr[j] < arr[j - h]; j -= h) {
					int temp = arr[j - h];
					arr[j - h] = arr[j];
					arr[j] = temp;
				}
			}
			h = h / 3;
		}
	}
	
	private static void selectionSort(int[] arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			
			int minIndex = i;
			for (int j = i; j < arr.length - 1; j++) {
				if (arr[minIndex] > arr[j + 1]) {
					minIndex = j + 1;
				}
			}
			if (i != minIndex) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
	
	private static void insertionSort(int[] arr) {
		
		int i;
		for (int j = 1; j < arr.length; j++) {
			int temp = arr[j];
			for (i = j - 1; i >= 0 && arr[i] > temp; i--) {
				arr[i + 1] = arr[i];
			}
			arr[i + 1] = temp;
		}
		
		
	}
	
	private static void quickSort(int[] arr, int low, int high) {
		if (high < low) {
			return;
		}
		int i = low;
		int j = high;
		int k = arr[low];
		//2, 1, 7, 4, 3, 9, 5
		while (low < high) {
			while (low < high && arr[high] >= k) {
				high--;
			}
			//从左到右
			while (low < high && arr[low] <= k) {
				low++;
			}
			
			if (low < high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
			}
			
		}
		arr[i] = arr[low];
		arr[low] = k;
		quickSort(arr, i, high - 1);
		quickSort(arr, high + 1, j);
	}
	
	
	private static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			
		}
		
	}
}
