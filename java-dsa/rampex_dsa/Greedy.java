/* 
Greedy Algorithm is an Approach that builds a solution step by step by always
choosing the best immediate option without reconsidering previous choice.
*/
// Maximum Number of Non - Overlapping activities
import java.util.Arrays;
class Activities{
	int start,end;
	Activities(int start,int end){
		this.start = start;
		this.end = end;
	}
}
public class Greedy {
	public static void main(String[] args) {
		int start[] = {1,3,0,5,8,5};
		int end[] = {9,5,8,7,2,1};
		int n = start.length;
		Activities[] obj = new Activities[n];
//		To make pair start and end array we used Array of objects
		for(int i=0;i<n;i++) {
			obj[i] = new Activities(start[i],end[i]);
		}
		for(int i=0;i<n;i++) {
			System.out.println(obj[i].start+" "+obj[i].end);	
			}
			Arrays.sort(obj,(s,e)->s.end - e.end);
//			If we sort the end array elements,then we come to know how many activities gets overlapped
			System.out.println("Verify Sort");
			for(int i=0;i<n;i++) {
				System.out.print(obj[i].start+" ");
			}
			System.out.println();
			for(int i=0;i<n;i++) {
				System.out.print(obj[i].end+" ");
			}
			System.out.println();
			int count = 1;
			int lastend = obj[0].end;
			for(int i=1;i<n;i++) {
				if(obj[i].start>=lastend)
					count++;
				lastend=obj[i].end;
			}
			System.out.println("Count : "+count);
	}		
}



