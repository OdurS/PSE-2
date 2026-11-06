package de.ustutt.pse;

public class InsertSorted {


    public static int[] resizeAt(int[] array, int index) {
         int[] result = new int[array.length + 1];
         for(int i=0; i < index; i++){
            result[i] = array[i];
        }
        result[index] = 0;
        for(int j = index + 1; j < result.length - 1; j++){
            result[j] = array[j];
        }
        return result;
    }

    public static int indexOf(int[] array, int value) {
        int i = 0;
	    while(array[i] < value){
		    i++;
	    }   
	    if(array[i] = value){
		    return -1;
	    }
	    else{
	        return i; 
	    }
    }

    public static int[] insertSorted(int[] array, int value) {
        int position = indexOf(array, value);
	    if(position = -1){
		    return -1; // zahl ist schon in der liste
	    }
	    else{
        int[] result = resizeAt(array, position);
        result [position] = value;
        return result;
	}
    }

    public static String arrayToString(int[] array) {
        throw new RuntimeException("not implemented");
    }


    public static void main(String[] args) {
        // You can use this main method freely and experiment around
        int[] test = {1, 3, 5, 7, 9};

        var find = indexOf(test, 3);
        System.out.println(find);

        var out = insertSorted(test, 3);

        System.out.println(arrayToString(out));

    }
}
