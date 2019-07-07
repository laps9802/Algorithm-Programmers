class Programmers_lv2_NextBiggerNumber {
    public int solution(int n) {
    	int originBinary1Numbers = getBinary1Numbers(n);
    	int nextNum = n+1;
    	
    	
    	while(originBinary1Numbers != getBinary1Numbers(nextNum))
    		nextNum++;
    	
    	
        return nextNum;
    }
    
    private int getBinary1Numbers(int number) {
        int num = number;
        int cnt = 0;
        
        
        while (num > 0) 
        {
            if ((num & 1) == 1) cnt++;
               
            num >>>= 1;
        }
        

        return cnt;
    }
}