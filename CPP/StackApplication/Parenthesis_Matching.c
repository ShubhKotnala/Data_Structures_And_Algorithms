//This code works on the basic application of the stack in C i.e Parenthesis Matching the basic concept behind this is the expression 
//is entered as an input from the user with parenthesis and the code using the LIFO property of the stack will check that each parenthesis 
//is matching or not if yes it prints the result as Parenthesis is matching o/w Parenthesis is not matching


#include<stdio.h>
#include<stdlib.h>

//The below functions is about basic operations of the stack
char *arr;
int top=-1;
int size = 50;
int valid = 1;

//isEmpty function checks that the stack is empty or not
int isEmpty(){

    if(top == -1)   return 1;
    return 0;
}

//isFull function checks that whether the stack is overflowed or not
int isFull(){

    if(top == size-1)   return 1;
    return 0;
}

//push function pushes an element into the stack and top points the top index that is recently pushed element
void push(char ch){

    if(!isFull()){
        arr[++top] = ch;
    }
    else
        printf("\nThe stack is overflowed!!\n");

}

//pop function pops or deletes the top most element of the stack and decrements the top pointer
char pop(){

    if(!isEmpty()){
        char ch = arr[top];
        top--;
        return ch;
    }
    printf("\nThe stack is empty!!\n");
}

int main(){

    //memory is allocated to the array using malloc function at run time dynamically
    arr=(char *)malloc(sizeof(char)*size);
    printf("Enter an expression : \n");
    gets(arr);


    //this for loops checks that if the parenthesis is matching or not
    for(int i=0;arr[i]!='\0';i++){

        //on an opening parenthesis it will push it into the stack
        if(arr[i] == '(')
            push('(');
        
        //after pushing the element if closing parenthesis appears it will check if any openenig parenthesis is present in the stcak or not
        else{
            if(isEmpty()){
                //if stack is empty and there is a closing bracket then it will output as parentesis is not matching
                valid = 0;
                break;
            }
                
            else{   
            
                char ch = pop();
                if(ch != '('){
                    valid = 0;
                    break;
                }
                    
            }   
        }
    }
    if(!isEmpty())  valid = 0;
    //if valid return zero this means the parenthesis is not matching
    if(valid == 0)
        printf("Parenthesis not matching\n");
    //if valid is not equals to zero this means that parenthesis is matching
    else
        printf("Parenthesis matching\n");
    return 0;
}