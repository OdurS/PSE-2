import InsertSorted as Is

int naiveSearch(int[] array, int value) { 
	Is.position(int[] array, int value);
}


int binarySearch(int[] array, int value) { 
	int begin = 0;
	int end = array.length
	while(behin <= end){
		int mid = (end - begin)/2;
		if(array[mid] < value){
				begin = mid + 1;
		}
		else if(array[mid] > value){
			end = mid - 1;
		}
		else{
			return mid;
		}
		return -1;
	}
}

