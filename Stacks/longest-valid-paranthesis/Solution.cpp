class Solution {
public:
    int longestValidParentheses(string s) {
        
        int n=s.length();
        
        stack<int>st;
        st.push(-1);
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(s[i]=='('){st.push(i);}
            else
            {
                
                int t=st.top();
                
                if(t!=-1 && s[t]=='(')
                {
                    st.pop();
                    ans=max(ans,i-st.top());
                }
                else
                {
                    st.push(i);
                }
                
            }
            
        }
        return ans;
    }
};