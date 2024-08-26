#include <iostream>
#include <vector>

using namespace std;

int
main ()
{

  vector < int >n;

  //Assigning 1 to first 9 values...
  cout << "ASSIGNING : " << endl;
  n.assign (9, 1);

for (int i:n)
    cout << i << " ";

  cout << endl;

  //using push_back to add element at last...
  cout << "PUSH_BACK : " << endl;
  n.push_back (7);

for (int i:n)
    cout << i << " ";

  cout << endl;

  //Print size of vector...
  cout << "SIZE OF VECTOR : " << endl;
  cout << n.size () << endl;

  //Delete element from last
  cout << "DELETING ELEMENTS FROM LAST : " << endl;
  n.pop_back ();

for (int i:n)
    cout << i << " ";

  cout << endl;

  //Inserting a value at a specified position...
  cout << "INSERTING AN ELEMENT : " << endl;

  n.insert (n.end (), 10);
for (int i:n)
    cout << i << " ";

  cout << endl;

  cout << "DELETING : " << endl;
  //deleting all elements using clear()...

  n.clear ();
for (int i:n)
    cout << i << " ";
  cout << endl;
}
