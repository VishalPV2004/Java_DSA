#include<iostream>
using namespace std;

int main()
{
    int a;
    cout<<"Enter a number : ";
    cin>>a;

    for (int i=0;i<a;i++)
    {
      for (int j=0;j<a;j++)
        {
            if (i==j)
            {
                if (i<a/2)
                    cout<<i+1<<" ";
                else
                 cout<<a-i<<" ";
            }
            else if (i+j+1==a)
            {
             if (i<a/2)
                cout<<i+1<<" ";
             else
                 cout<<j+1<<" ";
             }
            else
                 cout<<" ";
        }
        cout<<endl;
    }
}
