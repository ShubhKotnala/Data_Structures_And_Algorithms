/*N-Queen Problem is a recursive problem in which we are given the value of N and we have to find out the valid positions of Queen ina N X N matrix such that
no queen should attack eachother.

For above condition to be fulfilled :
(i) Every Row must have only 1 queen.
(ii) Every Column must have only 1 queen.*/


//The below given approach is the least optimized approach with a Time Complexity = O(N! X N)

#include<bits/stdc++.h>
using namespace std;


bool isSafe(int row,int col,int n,vector<string> &board){		//Function to find the valid positions of queen in N X N matrix

	int tempRow = row;
	int tempCol = col;

	while(row>=0 && col>=0){

		if(board[row][col] == 'Q')	return false;
		row--;
		col--;
	}

	row = tempRow;
	col = tempCol;

	while(col >= 0){

		if(board[row][col] == 'Q')	return false;
		col--;
	}

	row = tempRow;
	col = tempCol;

	while(row < n && col >= 0){

		if(board[row][col] == 'Q')	return false;
		row++;
		col--;
	}


	return true;
}

void printAns(int col,int n,vector<string> &board){

	if(col == n){			//Base Condition

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				cout<<board[i][j]<<" ";
			}
			cout<<endl;
		}
		cout<<endl;
		return;
	}

	for(int row=0;row<n;row++){

		if(isSafe(row,col,n,board)){
			board[row][col] = 'Q';
			printAns(col+1,n,board);		//Recursive Call
			board[row][col] = '.';
		}
	}

}


int main(){

	//Additional code for performing input and output opeartions through files.
	// #ifndef ONLINE_JUDGE
	// 	freopen("input.txt","r",stdin);
	// 	freopen("output.txt","w",stdout);
	// #endif

	int N;
	cout<<"Enter the value of N : "<<endl;
	cin>>N;

	vector<string> board(N);
	string s(N,'.');

	for(int i=0;i<N;i++)
		board[i] = s;

	cout<<"The possible solutions of N-Queen Problem are : "<<endl;

	
	printAns(0,N,board);	//Function Calling



	return 0;
}