class Solution {
public:
    int rec(vector<int>&dp,string s, int index,int n)
    {
        //int n=s.length();
        
        if(index==n){return 1;}
        if(dp[index]!=-1){return dp[index];}
        if(s[index]=='0'){return 0;}
        int res=0;
        res+=rec(dp,s,index+1,n);
        if(index+1<n)
        { int num_index=(s[index]-'0')*10+s[index+1]-'0';
          if(num_index<=26)
          {
              res+=rec(dp,s,index+2,n);
          }
         
         }
        return dp[index]=res;
    }
    
    int numDecodings(string s) {
        
        int n=s.length();
        
        vector<int>dp(n,-1);
        int ans=rec(dp,s,0,n);
        return ans;
        
    }
};