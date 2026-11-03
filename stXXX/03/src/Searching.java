import InsertSorted as Is

int naiveSearch(int[] array, int value) { 
	i = 0;
	while(array != value){
		i++;
		if(i = array.length){
			return -1;
		}
	}
return i;
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


int numBinaryComparisons(int[] array, int value){
	int begin = 0;
	int end = array.length
	int com = 0
	while(behin <= end){
		int mid = (end - begin)/2;
		if(array[mid] < value){
				begin = mid + 1;
				com++;
		}
		else if(array[mid] > value){
			end = mid - 1;
		 com++
		}
		else{
			return com;
		}
		return com; // oder -1 da nicht ausführbar
	}
}



int numNaiveComparisons(int[] array, int value){
return naiveSearch(array, value)  // da genau ein vergleich pro durchgang
}
