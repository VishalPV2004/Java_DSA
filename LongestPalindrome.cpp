#include<iostream>
#include<map>
using namespace std;


class Solution
{
public:
    int longestPalindrome(string s)
    {
        map <char,int> mp;
        for (char x : s)
        {
            mp[x]++;
        }
        int ct = 0;
        int sum = 0;
        int sumev = 0;
        bool sq = false;
        for (auto val : mp)
        {
            if (val.second%2!=0 && val.second!=1)
                 sum = sum + (val.second-1);
            else if (val.second == 1){
                    sq = true;
                    ct++;
            }
            else if (val.second%2==0)
                sumev = sumev + val.second;
        }
        ct = ct - (ct-1);
        int ig = 0;

        if (sumev==0)
        {
            sum+=1;
        }
        else
        {
            sum = sum+1-1;
        }
        if (!sq)
        {
            ct = 0;
            ig = sum + ct + sumev;
        }
        else
        {
             ct = 1;
            ig = sum + ct + sumev;
        }
        return ig;

    }

};
int main()
{
    string fy;
    cout<<"Enter a string : ";
    cin>>fy;
    Solution s;
    cout<<s.longestPalindrome(fy);
}
