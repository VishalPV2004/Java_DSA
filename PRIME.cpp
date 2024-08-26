#include<iostream>
using namespace std;
int main()
{
    int a,b;
    cin>>a>>b;
    int i,j;
    int ct=0;
    for (i=a;i<=b;i++) {
        ct=0;
     for (j=1;j<=i;j++)
     {
         if (i%j ==0)
           ct++;
     }
    if (ct==2)
        cout<<i;
        }
    return 0;
}
