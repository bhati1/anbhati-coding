class Solution {
    
    public int rec(Integer dp[],String s, int n,int index)
    {
        if(index==n){return 1;}
        
        if(dp[index]!=null){return dp[index];}
        if(s.charAt(index)=='0'){return 0;}
        
        int ans=0;
        ans+=rec(dp,s,n,index+1);
        
        if(index+1<n)
        {
            int num_index=(s.charAt(index)-'0')*10+(s.charAt(index+1)-'0');
            
            if(num_index<=26)
            {
                ans+=rec(dp,s,n,index+2);
            }
        }
        return dp[index]=ans;
    }
    public int numDecodings(String s) {
        
        int n=s.length();
        Integer dp[]=new Integer[n];
        return rec(dp,s,n,0);
        
    }
}