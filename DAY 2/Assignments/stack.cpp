#include <iostream>

using namespace std;

class Stack{
    private:
        int a[100];
        int top =-1;
    public:
    void push(int pushnum)
    {
        if(top>100)
        {
          
        }
        else
        {
            
            a[++top]=pushnum;
            
        }

    }
    int gettop()
    {
        if(top==-1)
            return -999;
        return a[top];
    }
    void pop()
    {
        if(top==-1)
        {
            
        }
        else
        {
            top--;
        }
    }
};


int main()
{
    Stack stack;
    int t;
    cin>>t;
    while(t--){
        int ch=0;
        cin>>ch;
        switch(ch){
            case 1:
            {
                int num=0;
                cin>>num;
                stack.push(num);
                break;
            }
            case 2:
                stack.pop();
                break;
            case 3:
                cout<<stack.gettop();
        }
    }

    return 0;
}