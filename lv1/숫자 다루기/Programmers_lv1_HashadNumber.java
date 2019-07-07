class Programmers_lv1_HashadNumber {
    public boolean solution(int x) {
    	int temp = x;
    	int sum = 0;
    	
    	while(x != 0)
    	{
    		sum += temp % 10;
    		temp /= 10;
    	}
    	
    	return x % sum == 0;
    }
}