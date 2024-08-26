#include<iostream>
using namespace std;
int main()
{

    int arr[40];
    int pos,size;
    cout<<"Enter the size : ";
    cin>>size;
    cout<<"Enter elements : ";
    for (int i=0;i<size;i++){

    cin>>arr[i];
    }
    cout<<"Enter position where to be deleted : ";
    cin>>pos;

    if (pos<0 || pos>=size)
        cout<<"Invalid:(";

    else{
    for (int i=pos-1;i<=size-1;i++)
    {

        arr[i] = arr[i+1];
    }
    size--;

    for (int i=0;i<size;i++)
        cout<<arr[i]<<" ";
}
return 0;
}
