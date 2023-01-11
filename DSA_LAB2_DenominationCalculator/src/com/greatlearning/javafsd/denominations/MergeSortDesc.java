package com.greatlearning.javafsd.denominations;

public class MergeSortDesc {

	void merge(int arr[], int left, int mid, int right) {

		// Find sizes of two sub arrays to be merged
		int size1 = mid - left + 1;
		int size2 = right - mid;

		// Creating temporary arrays
		int leftArray[] = new int[size1];
		int rightArray[] = new int[size2];

		// Copying data to temporary arrays
		for (int i = 0; i < size1; ++i) {
			leftArray[i] = arr[left + i];
		}
		for (int j = 0; j < size2; ++j) {
			rightArray[j] = arr[mid + 1 + j];
		}

		/*
		 * Merge the temporary arrays Initial indexes of first and second sub-arrays
		 */
		int i = 0, j = 0;
		// Initial index of merged sub-array array
		int k = left;
		while (i < size1 && j < size2) {
			if (leftArray[i] > rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		// Initial index of merged sub-array array
		while (i < size1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < size2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

	public void sortDesc(int arr[], int left, int right) {
		if (left < right) {

			int mid = (left + right) / 2;
			sortDesc(arr, left, mid);
			sortDesc(arr, mid + 1, right);

			merge(arr, left, mid, right);
		}
	}
}
