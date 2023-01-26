class Solution
{
    public:
    //Function to perform case-specific sorting of strings.
    string caseSort(string str, int n)
    {
        string lower = "";
        string upper = "";
        for(int i = 0; i < n ; i++){
            if(islower(str[i])){
                lower += str[i];
            }else{
                upper += str[i];
            }
        }
        sort(lower.begin(), lower.end());
        sort(upper.begin(), upper.end());
        
        int i = 0;
        int j = 0;
        int k = 0;
        while(k < n){
            if(islower(str[k])){
                str[k++] = lower[i++];
            }else{
                str[k++] = upper[j++];
            }
        }
        return str;
    }
};
