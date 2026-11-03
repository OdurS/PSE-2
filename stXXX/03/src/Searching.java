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
/*
	int i = 0;
	int com = 0;
	while(array[i] < value){
		com++;
		i++;
		if(array[i] = value){
			return com + 1; // oder -1, da nicht gefunden
		}
	}
return com
}
*/
return naiveSearch(array, value) *2 // da genau zwei vergleich pro position 
}
