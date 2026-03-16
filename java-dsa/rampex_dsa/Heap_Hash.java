/*
Heap and Hash means using heap and hashmap together to quickly access minimum/maximum elements and fast searching
Frequency of Top K Elements --- 10 10 3 3 3 5 5 5 
*/
import java.util.*;
class Heap_Hash{
    public static void main(String args[]){
        int[] arr={1,1,1,2,2,3};
        int k=2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> map.get(a)-map.get(b));
        for(int key:map.keySet()){  //[1 2 3]
            pq.add(key);   //3 2 1
            if(pq.size()>k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
