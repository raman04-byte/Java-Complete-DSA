class Solution{

    public:

    pair<int,int> endPoints(vector<vector<int>> matrix){

        pair<int,int>ans;

        int i =0;

        int j =0;

        char a='r';

        while(i<matrix.size() && j<matrix[0].size() && i>=0 && j>=0){

             ans = {i,j};

            //  cout<<i<<" "<<j<<endl;

            if(matrix[i][j]==0){

                if(a=='r') j++;

                else if(a=='l') j--;

                else if(a=='u') i--;

                else i++;

            }else{

                matrix[i][j] =0;

                if(a=='r'){

                    i++;

                    a = 'd';

                }else if(a=='l'){

                    a ='u';

                    i--;

                }else if(a =='u'){

                    j++;

                    a ='r';

                }else{

                    //a = 'd';

                    j--;

                    a = 'l';         

                }

            }

        }

        return ans;

    }

};