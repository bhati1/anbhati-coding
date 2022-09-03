class Solution {
public:
    void dfs(int num, vector<int>&ans, int n, int k)
    {
        if(n==1){ans.push_back(num);}
        else
        {
            int m=num%10;
            
            if(m+k<10)
            {
                dfs(num*10+m+k,ans,n-1,k);
            }
            if(k>0 && m-k>=0)
            {
                dfs(num*10+m-k,ans,n-1,k);
            }
        }
        
        
    }
    
    vector<int> numsSameConsecDiff(int n, int k) {
        
        vector<int>ans;
        for(int i=1;i<=9;i++)
        {
            dfs(i,ans,n,k);
        }
        
        return ans;
    }
};