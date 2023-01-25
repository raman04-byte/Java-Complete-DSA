class Solution {
public:
    int minOperation(string s) {
        // code here
        int ans =0, extra=0;
        
        if(s.size()==1) return 1;
        else if(s.size()==2) return 2;
        string cur = s.substr(0, 2);
        ans+=2;
        
        for(int i=2; i<s.size(); i++){
            if((i+cur.size()<=s.size()) && s.substr(i, cur.size()) == cur){
                ans++;
                i--;
                i+=cur.size();
                int c = cur.size();
                cur+=cur;
                if(extra>1) ans--;
                ans+=extra;
                extra = c;
                
            }else{
                cur+=s[i];
                ans++;
            }
            
        }
        
        return ans;
    }
};