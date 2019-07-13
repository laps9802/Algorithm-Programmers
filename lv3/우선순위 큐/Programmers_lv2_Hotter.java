import java.util.PriorityQueue;

public class Programmers_lv2_Hotter {
    public int solution(int[] scoville, int K) {
    	int count=0;
    	PriorityQueue<Integer> ascendingScoville = new PriorityQueue<Integer>();
    	
    	for(int i : scoville)
    		ascendingScoville.offer(i);
    	
    	
    	while(ascendingScoville.size() >= 2)
    	{
    		if(ascendingScoville.peek() < K) {
    			ascendingScoville.offer(ascendingScoville.poll() + ascendingScoville.poll() * 2);
    			count++;
    		}
    		else
    			break;
    	}
    	
    	
    	if(ascendingScoville.peek() >= K) return count;
    	else return -1;
    }
}
