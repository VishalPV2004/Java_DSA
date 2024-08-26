#include <iostream>
using namespace std;


struct node
{
    int data;
    struct node* next;
    struct node* prev;
};
struct node* head = NULL;
struct node* tail = NULL;

void ins_beg(int data)
{
    struct node* newt = (struct node*)malloc(sizeof(struct node*));
    newt->data = data;
    newt->next = NULL;
    newt->prev = NULL;

    if (head == NULL)
    {
        head = newt;
        tail = newt;
    }
    else
    {
        head->prev = newt;
        newt->next = head;
        head = newt;
    }
}

void ins_end(int data)
{
    struct node* newt = (struct node*)malloc(sizeof(struct node*));
    newt->data = data;
    newt->next = NULL;
    newt->prev = NULL;

    if (tail == NULL)
    {
        tail = newt;
        head = newt;
    }
    else
    {
        tail -> next =newt;
        newt->prev = tail;
        tail = newt;
    }
}

void ins_pos(int data, int pos)
{
    struct node* newt = (struct node*)malloc(sizeof(struct node));
    newt->next = NULL;
    newt->prev = NULL;
    newt->data = data;

    struct node* temp =head;

    for (int i =1;i<pos-1;i++)
    {
        temp = temp->next;
    }

    if (pos==1)
     ins_beg(data);

     else if (temp->next == NULL)
      ins_end(data);

    else
    {
        newt->prev = temp;
        newt->next = temp->next;
        if(temp->next!=NULL)
         {
             temp->next->prev = newt;
         }
        temp->next = newt;

        if (newt->next == NULL)
        tail = newt;

    }


}

void del_ele(int data)
{
    struct node* temp = head;

    while (temp->data!=data && temp!=NULL)
    {
        if (temp->data == data)
            break;

       temp = temp->next;
    }
    if (temp->next==NULL)
         cout<<"Element not found"<<endl;
    else
    {
        temp->prev->next = temp->next;
        temp->next->prev = temp->prev;
        free(temp);
    }

}

void del_beg()
{
    struct node* temp = head;
    if (head==NULL)
     cout<<"List is empty"<<endl;
    else
    {
        head->next->prev = NULL;
        head = head->next;
        temp->next = NULL;
        free(temp);
    }
}

void del_end()
{
    struct node* temp = tail;
    if (tail == NULL)
     cout<<"List is empty";
    else
    {
        temp->prev->next = NULL;
        tail = tail->prev;
        temp->prev = NULL;

    }
}
void display()

{
    struct node* tme = head;
    while (tme!=NULL)
    {
        cout<<tme->data<<" ";
        tme=tme->next;
    }
}
int main()
{
    ins_beg(1);
    ins_beg(2);
    ins_beg(3);
    ins_beg(4);
    ins_pos(10,2);
    display();
}
