// import java.util.ArrayList;
// import java.util.List;

class Solution {
    
    public void dfs(int num, List<Integer>ans, int n, int k)
    {
        
        if(n==1)
        {
            ans.add(num);
        }
        else
        {
            int temp=num%10;
            if(temp+k<10)
            {
                dfs(num*10+temp+k,ans,n-1,k);
            }
            if(k!=0 && temp-k>=0)
            {
                dfs(num*10+temp-k,ans,n-1,k);
            }
        }
        
    }
    
    public int[] numsSameConsecDiff(int n, int k) {
        
        List<Integer>ans= new ArrayList();
        
        for(int i=1;i<10;i++)
        {
            dfs(i,ans,n,k);
        }
        
        return ans.stream().mapToInt(i -> i).toArray();
        
    }
}