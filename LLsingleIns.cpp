#include <iostream>
using namespace std;

struct node
{
    int data;
    struct node* next;
};
struct node* head = NULL;
struct node* tail = NULL;
void ins_beg(int data)
{
    cout<<"Data to be inserted : "<<data<<endl;

    struct node *newt = (struct node*)malloc(sizeof(struct node*));
    newt->data = data;
    newt->next = NULL;
    if (head == NULL)
    {
        head = newt;
        tail = newt;
    }

    else
    {
        newt->next = head;
        head = newt;
    }
}

void ins_last(int data)
{
    cout<<"Data to be inserted : "<<data<<endl;

    struct node* newt = (struct node*)malloc(sizeof(struct node*));
    newt->data = data;
    newt->next = NULL;
    if (tail == NULL)
    {
        tail = newt;
        head = newt;
    }
    else
    {
        tail->next = newt;
        tail = newt;
    }
}

void ins_pos(int pos,int data)
{
    cout<<"Data will be inserted at "<<pos<<" position"<<endl;
    struct node* newt = (struct node*)malloc(sizeof(struct node*));
    struct node* temp = head;

    for (int i=1;i<pos-1;i++)
    {
        temp = temp->next;
    }

    newt->data = data;
    newt->next = NULL;

    if (pos==1)
    {
        ins_beg(data);
    }
    else
    {
    newt->next = temp->next;
    temp->next = newt;
    }


}
void disp()
{
    struct node* temp = head;
    while (temp != NULL)
    {
        cout<<temp->data<<" ";
        temp = temp->next;
    }
}


int main()
{
    ins_beg(2);
    ins_beg(3);
    ins_beg(5);
    ins_beg(1);
    ins_pos(5,10);
    disp();

    return 0;
}
