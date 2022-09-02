string Solution::longestCommonPrefix(vector<string> &A) {
    sort(A.begin(),A.end());
    int n=A.size();string com=A[0];int m=A[0].length();int len=m;
    for(int i=1;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            if(A[i][j]!=A[i-1][j]){m=j;break;}
        }
    }
    return com.substr(0,m);
}