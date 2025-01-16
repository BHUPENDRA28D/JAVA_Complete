package SearchSortPackage;

public class PostionInInfinteArray extends Array{
// facebook an damazone interview question.
    public int setRange(int item){
        int start =0;
        int end =1;
        while(item > end){
            int temp = end +1;
             end = end+(end-start+2)*2;
             start =temp;
        }
        return binarySearch(item,start,end);
    }

    int binarySearch(int item, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < item)
                start = mid + 1;
            else if (arr[mid] > item)
                end = mid - 1;
            else {
                return mid;
            }
        }

        return -1;
    }
}
