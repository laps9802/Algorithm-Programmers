import java.util.LinkedList;
import java.util.Queue;

class Programmers_lv3_Network_recursive {
    public int solution(int n, int[][] computers) {
    	boolean[] checkedList = new boolean[n];
    	
    	
    	int networkUnits=0;
    	for(int com=0; com<n; com++)
    	{
    		if(!checkedList[com]) {
    			networkUnits++;
    			findConnection(computers, checkedList, com);
    		}
    	}
		
		
        return networkUnits;
    }
    
    private void findConnection(int[][] computers, boolean[] checkedList, int com) {
    	checkedList[com] = true;
    	
    	int connect=0;
    	while(connect < computers.length)
    	{
    		if(!checkedList[connect] && computers[com][connect] == 1) 
    			findConnection(computers, checkedList, connect);
    		connect++;
    	}
    }
}


class Programmers_lv3_Network_queue {
    public int solution(int n, int[][] computers) {
		Queue<Integer> comQueue = new LinkedList<>();
		boolean[] visited = new boolean[n];
		int networkUnits=0;

		for(int i=0; i<n; i++)
		{
			if(visited[i]) continue;
			
			networkUnits++;
			comQueue.offer(i);
			while(!comQueue.isEmpty())
			{
				int com = comQueue.poll();
				visited[com] = true;

				for(int j=0; j<computers[com].length; j++)
				{
					if(visited[j]) continue;
					int connection = computers[com][j];
					if(connection == 1){
						comQueue.offer(j);
					}
				}
			}
		}


        return networkUnits;
    }
}