// package Arrays.diffk;

// import java.util.ArrayList;

public class Solution {
    public int diffPossible(ArrayList<Integer> A, int B) {
        
        
        int j=0;
        int n=A.size();
        for(int i=0;i<n;)
        {
            if(i==j){i++;continue;}
            
            if((A.get(i)-A.get(j))>B){j++;}
            else if((A.get(i)-A.get(j))==B){return 1;}
            else{i++;}
        }
        
        return 0;
    }
}
