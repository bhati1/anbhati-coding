
long count(vector<int>&A, int B)
{
    
    int n=A.size();
    
    unordered_map<int,int>mp;
    long ans=0;int j=0;
    for(int i=0;i<n;i++)
    {
        mp[A[i]]++;
        
        while(mp.size()>B && j<n)
        {
            if(mp[A[j]]==1){mp.erase(A[j]);}
            else
            {
                mp[A[j]]--;
            }
            j++;
        }
        
        ans+=(long)(i-j+1);
        
    }
    return ans;
}

int Solution::solve(vector<int> &A, int B) {
    
    return (int)(count(A,B)-count(A,B-1));
}
