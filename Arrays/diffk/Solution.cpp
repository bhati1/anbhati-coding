
int Solution::diffPossible(vector<int> &A, int B) {
    //unordered_map<int,int>mp;
    int j=0;
    for(int i=0;i<A.size();)
    {   if(i==j){i++;continue;}
        if(A[i]-A[j]==B){return 1;}
        else if(A[i]-A[j]>B){j++;}
        else{i++;}
        
    }
    return 0;
}