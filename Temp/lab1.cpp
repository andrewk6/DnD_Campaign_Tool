#include <iostream>
#include <string>
using namespace std;

int main() {
  string name;
  cout << "Enter your fist name" << endl;
  getline(cin, name);

  int grades[3];
  cout << "Enter you first grade" << endl;
  cin >> grades[0];
  if(cin.peek() == '\n')
    cin.ignore();
  cout << "Enter your second grade" << endl;
  cin >> grades[1];
  if(cin.peek() == '\n')
    cin.ignore();
  cout << "Enter your third grade" << endl;
  cin >> grades[2];

  cout << name << "your average is " << ((grades[0]+grades[1]+grades[2])/ 3)<< endl;
  return 0;
}
