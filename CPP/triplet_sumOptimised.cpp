#include<bits/stdc++.h>
using namespace std;
vector<vector<int>> threeSum(vector<int>& nums,int X) {
        vector<vector<int>> result;
        sort(nums.begin(),nums.end());
        int n=nums.size();
        for(int i=0;i<n-3;i++)
        {
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                int current_sum=nums[i];
                current_sum+=nums[j];
                current_sum+=nums[k];
                if(current_sum==X)
                {
                    //if(i!=j && i!=k && j!=j){
                    result.push_back({nums[i],nums[j],nums[k]});
                   // result.push_back(nums[j]);
                    //result.push_back(nums[k]);
                    j++;
                    k--;
                
                }
                else if(current_sum > X)
                {
                    k--;
                }
                else
                {
                    j++;
                }

            }
            return result;
        }
int main()
{
    vector<int> nums {-1,0,1,2,-1,-4};
    int X;
    cin>>X;
    auto result=threeSum(nums,X);
    for(auto v:result)
    {
        for(auto no:v)
        {
            cout<<no<<" ";
        }
    }
    cout<<endl;
    return 0;
}
