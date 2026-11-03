import InsertSorted as Is

int naiveSearch(int[] array, int value) { 
	Is.position(int[] array, int value);
}


int binarySearch(int[] array, int value) { 
	int begin = 0;
	int end = array.length
	for(){
		int mid = (end - begin)/2;
		if(array[mid] != value){
			return -1;
		}
		else if(array[mid] < value){
			begin = mid;
		}
		else{
			end = mid;
		}
	}
}

