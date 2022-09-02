// package Strings.longest-common-prefix;

public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        Collections.sort(A);
        int n=A.size();
        int m=A.get(0).length();
        
        
        for(int i=1;i<n;i++)
        {
            
            for(int j=0;j<m;j++)
            {
                if(A.get(i).charAt(j)!=A.get(i-1).charAt(j))
                {
                    m=j;break;
                }
            }
        }
        
        return m>0 ? A.get(0).substring(0,m) : "";
        
        
    }
}
