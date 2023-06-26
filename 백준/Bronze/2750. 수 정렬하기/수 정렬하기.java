import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arrlen = sc.nextInt();
		int arr[] = new int[arrlen];

		for (int i = 0; i < arrlen; i++) {
			arr[i] = sc.nextInt();
		}

		quickSort(arr, 0, arrlen - 1);

		for (int i = 0; i < arrlen; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = start;
		int low = start-1;
		int high = end + 1;

		do {
			do {
				low++;
			} while (low <=end && arr[pivot] > arr[low]);

			do {
				high--;
			} while (high >=start && arr[pivot] < arr[high]);

			if (low < high) {
				swap(arr, low, high);
			}
		} while (low < high);

		swap(arr, pivot, high);
		return high;
	}

	private static void quickSort(int[] arr, int start, int end) {

		if (start < end) {
			int q = partition(arr, start, end);

			quickSort(arr, start, (q-1));
			quickSort(arr, (q + 1), end);
		}
		return;
	}

}
