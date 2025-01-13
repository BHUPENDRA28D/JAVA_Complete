package Collections.Heaping;

import java.util.ArrayList;

public class HeapClass<T extends  Comparable<T>> {

  private ArrayList<T> list;

  public HeapClass(){
      list = new ArrayList<>();
  }

  //swap methode
    private void swap(int a, int b){
      T temp = list.get(a);
      list.set(a,list.get(b));
      list.set(b,temp);

    }

    private  int parent(int index){
      return (index-1)/2;
    }
    private  int left(int index){
      return  2*index +1;
    }

    private  int righe(int index){
      return  2*index +2;
    }


    public void insert(T data){
      list.add(data);
       upheap(list.size()-1);
    }

    private void upheap(int index) {
      if(index == 0){
          return;
      }

      int p = parent(index);
       if(list.get(index).compareTo(list.get(p))<0){
           swap(index,p);
           upheap(p);
       }

    }
}
