import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    
   public int count(ArrayList<Integer> A, int B)
{
    int n=A.size();
    
    int ans=0;
    HashMap<Integer,Integer>mp = new HashMap();
    int j=0;
    
    for(int i=0;i<n;i++)
    {
        mp.put(A.get(i),mp.getOrDefault(A.get(i),0)+1);
        
        while(mp.size()>B && j<n)
        {
            mp.put(A.get(j),mp.get(A.get(j))-1);
            if(mp.get(A.get(j))==0)
            {
                mp.remove(A.get(j));
            }
            j++;
        }
        
        ans+=i-j+1;
    }
    
    return ans;
}
    
    public int solve(ArrayList<Integer> A, int B) {
        
        int c1=count(A,B);
        int c2=count(A,B-1);
        
        return c1-c2;
    }
}
