int[] array_new insertSorted(int[] array, int value){
  
  
    int[] result = resizeAt(array,position);
}



int[] resizeAt(int[] array, int index){
    int[] result = new int[array.length + 1]
    for(int i=0; i < index; i++){
        result[i] = array[i];
    }
    result[index] = 0;
    for(int j = index + 1; j < result.length; j++){
        result[j] = array[j];
    }

}
