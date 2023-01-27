class Solution {
    public:
        int CountWays(string str){
           int n = str.size();
           vector<long long int>dp(n+1,-1);
           int ans = solve(0,n,str,dp);
           return ans;
        }
       
        int solve(int i,int n,string &s,vector<long long int>&dp){
            if(i>=n){
                return 1;
            }
           
            if(s[i]=='0'){
                return 0;
            }
            if(dp[i]!= -1){
                return dp[i];
            }
           
            if(s[i]>'2'){
                return dp[i] = (solve(i+1,n,s,dp))%1000000007;
            }
            else if(s[i]=='2'){
              if(i<n-1){
                  if(s[i+1]<='6'){
                      return dp[i] = (solve(i+1,n,s,dp) + solve(i+2,n,s,dp))%1000000007;
                  }
                  else{
                      return dp[i] = (solve(i+1,n,s,dp))%1000000007;
                  }
              }
              else{
                  return dp[i] = (solve(i+1,n,s,dp))%1000000007;
              }
            }
            else{
                if(i<n-1){
                    return dp[i] = (solve(i+1,n,s,dp) + solve(i+2,n,s,dp))%1000000007;
                }
                else{
                    return dp[i] = (solve(i+1,n,s,dp))%1000000007;
                }
            }
        }

};