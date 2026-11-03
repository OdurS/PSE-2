int[] array_new insertSorted(int[] array, int value){
    int position = position(array, value);
	if(position = -1){
		return -1; // zahl ist schon in der liste
	}
	else{
    int[] result = resizeAt(array, position);
    result [position] = value;
    return result;
	}
}



int[] resizeAt(int[] array, int index){
    int[] result = new int[array.length + 1];
    for(int i=0; i < index; i++){
        result[i] = array[i];
    }
    result[index] = 0;
    for(int j = index + 1; j < result.length - 1; j++){
        result[j] = array[j];
    }

}
// einfach ein such algorithmus( siehe Searching)
int position(int[]array, value){ // geht auch besser( such algorithmen), z.B. in mitte, größer kleiner vergleichen(binearisearch), hier simple search
	int i = 0;
	while(array[i] < value){
		i++;
	}
	if(array[i] = value){
		return -1
	}
	else{
	return i 
	}
}


// oder einfach rezizedAT mit weiterer eingabe int valeu und statt 0 valeu schreiben(schneller)
/*
int[] array_new insertSortedFast(int [] array, int value){
    position = position(int[] array, value){
    int[] result = resisedAtFast(array, index, value);
    return result;
    }
}


int[] resisedAtFast(int[] array, int index, int value){
    int[] result = new int[array.length + 1]; 
    for(i = 0; i < result.length - 1, i ++) //oder mit länge von array
}
*/