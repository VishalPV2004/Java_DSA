#include<iostream>

using namespace std;

int size;
int arr[100];
//MAX_SIZE IS 100
//Deletion can be done in 2 ways, deleting the element by providing a location, deleting a specific element by itself
void display(int arr[],int a)
{
    cout<<"Displaying array : "<<endl;
    for (int i=0;i<a;i++)
        cout<<arr[i]<<" ";
    cout<<endl;
}

void insert(int data,int pos)
{
    if (pos > ::size || pos > 100||pos<=0)
        cout<<"INVALID POSITION"<<endl;
    else {
    cout<<data<<" will be inserted at position "<<pos<<endl;
    int ct = 0;
    for (int i = ::size;i>=pos - 1; i--)
    {
        arr[i] = arr[i-1];
        ct++;
    }
    ::size++;
    arr[pos-1] = data;
    cout<<endl;
    if (ct>=1)
         cout<<"Successfully Inserted"<<endl;
    for (int i=0;i<::size;i++)
        cout<<arr[i]<<" ";
}
}

void remove(int pos)
{
    int ct = 0;
    for (int i = pos-1; i < ::size; i++)
    {
        arr[i] = arr[i+1];
        ct++;
    }
    ::size--;
    if (ct)
         cout<<"Successfully deleted"<<endl;
    for (int i = 0;i<::size;i++)
        cout<<arr[i]<<" ";

}
void remove2(int data)
{

           int ct = 0;
           for (int i=0;i<::size;i++)
           {
               if (arr[i] == data)
                ct++;
           }
           if (ct>=1)
           {
               int ref = 0;
               for (int i=0;i<::size;i++)
               {
                   if (arr[i] == data)
                   {
                       ref = i;
                       break;
                   }
               }
               cout<<data<<" is found at index "<<ref<<endl;
               for (int i = ref;i<=::size;i++)
               {
                   arr[i] = arr[i+1];
               }
               ::size--;

               for (int i=0;i<::size;i++)
                cout<<arr[i]<<" ";
           }
           else
            cout<<"Element not found :("<<endl;
}

void update(int data,int pos)
{
    int ct =0;
    while(data-->0)
    {
        arr[pos-1] = data+1;
        data = 0;
        ct++;
    }
    if (ct)
        cout<<"Succesfully updated"<<endl;

    for (int i=0;i<::size;i++)
        cout<<arr[i]<<" ";
}


int main()
{
    cout<<"1 - Create, 2 - Do Nothing^_^"<<endl;
    int ch;
    cin>>ch;

    if (ch==1){
    cout<<"Enter the size of array : ";
    cin>>::size;
    cout<<"Enter elements of array : ";
    for (int i=0;i<::size;i++)
        cin>>arr[i];
    }
    else if (ch==2) {
        cout<<"OK"<<endl;
        //exit();
    }
    cout<<"1 - Display, 2 - Insert, 3 - Delete, 4 - Update"<<endl;
    int cg = 0;
     cout<<"Enter choice for operation : ";
     cin>>cg;
     if (cg==1) {
    display(arr,::size);
    }

    else if (cg==2) {
    int data,pos;
    cout<<"Enter data to be inserted : ";
    cin>>data;
    cout<<"Enter position : ";
    cin>>pos;
    insert(data,pos);
    }

    else if (cg == 3)
    {
        int choice;
        cout<<"Delete element by position - 1"<<endl;
        cout<<"Delete element by data - 2"<<endl;
        cin>>choice;

        if(choice==1){
        int post;
        cout<<"Enter position of data to be deleted : ";
        cin>>post;
        remove(post);
    }
       if (choice ==2 )
       {
           int data;
           cout<<"Enter data to be deleted : ";
           cin>>data;
           remove2(data);
       }
    }

    else if (cg == 4)
    {

        int data,pos;
        cout<<"Enter data to be updated : "<<endl;
        cin>>data;
        cout<<"Enter position : "<<endl;
        cin>>pos;
        update(data,pos);
    }

}
