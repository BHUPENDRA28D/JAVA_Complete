

public class Driver {
    public static void main(String[] args) {

        int [] arr = {61,85,89,96,102,142,654};

        SortingAlgos sa = new SortingAlgos();
        Searching searching =new Searching();
     int x = searching.binarySearch(arr,102,0,arr.length-1);

     System.out.println(x);

//        sa.bubbleSort(arr);
//        sa.selectionSort(arr);
//
//        sa.insertionSort(arr);
//
//        sa.cycleSort(arr);

    }

}
