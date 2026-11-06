package de.ustutt.pse;

public class Searching {

    public static int naiveSearch(int[] array, int value) {
        i = 0;
	    while(array != value){
		i++;
		if(i = array.length){
			return -1;
		}
	    }
        return i;
    }

    public static int binarySearch(int[] array, int value) {
        int begin = 0;
	    int end = array.length;
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

    public static int numNaiveComparisons(int[] array, int value) {
       return naiveSearch(array, value);  // da genau ein vergleich pro durchgang
    }

    public static int numBinaryComparisons(int[] array, int value) {
        int begin = 0;
	    int end = array.length;
	    int com = 0;
	    while(behin <= end){
		    int mid = (end - begin)/2;
		    if(array[mid] < value){
				begin = mid + 1;
				com++;
		    }
		    else if(array[mid] > value){
			    end = mid - 1;
		    com++;
		    }
		    else{
			    return com;
		    }
	    }
        return com; // oder -1 da nicht ausführbar
    }


    public static void main(String[] args) {
        // You can use this main method freely and experiment around
        int[] test = { 1, 5, 7, 19, 42, 91, 141 };

        var find = naiveSearch(test, 5);
        // expect the output to be 1

        System.out.println(find);
    }
}
