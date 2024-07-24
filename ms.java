// Main.java
import java.util.ArrayList;
class Main {
    // public static ArrayList<Integer> merge(ArrayList<Integer> uno, ArrayList<Integer> dos) {
      

    // }
    public static ArrayList<Integer> mergeSort(ArrayList<Integer> s) {
      //nums.subList(0,midpoint);
      //new ArrayList<>(nums.subList(0,midpoint));
      if (s.size()<=1) {
        System.out.println(s);
        return s;
      }
      
      ArrayList<Integer> n = new ArrayList<>(s.subList(0,s.size()/2));
      ArrayList<Integer> n2 = new ArrayList<>(s.subList(s.size()/2,s.size()));
      
      ArrayList<Integer> AL1 = mergeSort(n);
      ArrayList<Integer> AL2 = mergeSort(n2);
      
      ArrayList<Integer> sorted = new ArrayList<Integer>();
     
      while (AL2.size() > 0 && AL1.size() > 0) {
        if(AL1.get(0)>AL2.get(0)) {
          //System.out.println(dos[counter2]);
          sorted.add(AL2.get(0));
          AL2.remove(0);

          
        }
        else {
          //System.out.println(uno[counter1]);
          sorted.add(AL1.get(0));
          AL1.remove(0);
          
        }
        
      }
      
      if (AL1.size() == 0) {
        sorted.addAll(AL2);
      }
      else {
        sorted.addAll(AL1);
      }
      // if(counter1 < AL1.size()-1) {
      //   for (int i = 0; i<AL1.size();i++) {
      //     if (AL1.get(i)>sorted.get(sizez-1-AL1.size()-1+i)) {
      //       sorted.set(sizez-AL1.size()+i,AL1.get(i));
      //     }
      //   }
      // }
      // else {
      //   for (int i = 0; i<AL2.size();i++) {
      //     if (AL2.get(i)>sorted.get(sizez-1-AL2.size()-1+i)) {
      //       sorted.set(sizez-AL2.size()+i,AL2.get(i));
      //     }
      //   }
      // }
      
    
      return sorted;
      
      
      // System.out.println(n);
      // System.out.println(n2);
      
    }
    public static void main(String[] args) {
    	ArrayList<Integer> nums = new ArrayList<Integer>();
    //   for (int i = 0; i < 10; i++) {
    // 	  nums.add(i);
    // 	}
      nums.add(12);
      nums.add(25);
      nums.add(19);
      nums.add(85);
      nums.add(64);
      System.out.println(mergeSort(nums));
      
    }
}