package part4;

public class Programmers_lv3_Integer_triangle {
    public int solution(int[][] triangle) {
    	for(int i=triangle.length-1; i>=1; i--)
    	{
    		for(int j=0; j<=i-1; j++)
    		{
    			triangle[i-1][j] = triangle[i-1][j] + Math.max(triangle[i][j], triangle[i][j+1]);
    		}
    	}
    	
    	
        return triangle[0][0];
    }
}