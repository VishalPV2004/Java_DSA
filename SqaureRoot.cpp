#include<iostream>

using namespace std;

int main()
{
    int a;
    cout<<"*****This is a program to compute square root of a number*****"<<endl;
    cout<<"Enter a number : ";
    cin>>a;
    int max = 0;
    for (int i=1;i<a/2;i++)
    {
        if (i>max)
         max = i;
        if (i*i <= a && i>max)
            {cout<<i;
            break;
            }
    }
return 0;

}
