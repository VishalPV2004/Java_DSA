#include<iostream>
using namespace std;
int n;
int arr[100];
void display(int arr[],int a)
{
    for (int i=0;i<a;i++)
     cout<<arr[i]<<" ";
}

void insert(int arr[],int data,int pos)
{
    if (pos > 100 || pos < 0)
     cout<<"INVALID POSITION";

    if (::n == 100)
     cout<<"Array is full!";
    else {
    for (int i=n; i>=pos-1 ;i--)
    {
        arr[i] = arr[i-1];
    }
    arr[pos-1] = data;
    ::n++;

    }
}
int main()
{

    cout<<"Enter array size : ";
    cin>>::n;
    cout<<"Enter array elements : ";
    for (int i=0;i<::n;i++)
     cin>>::arr[i];

    /*INSERTION PART*/
    int data,pos;
    cout<<"Enter data and position : ";
    cin>>data>>pos;
    insert(arr,data,pos);
    for (int i=0;i<::n;i++)
     cout<<arr[i]<<" ";

    /*UPDATION PARY*/
    int num

}
