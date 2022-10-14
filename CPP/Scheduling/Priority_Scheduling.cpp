#include <bits/stdc++.h>
using namespace std;

struct Process
{
	int pid; // Process ID
	int bt; // CPU Burst time required
	int priority; // Priority of this process
};

// decides the priority order of processes in queue
bool compare(Process a, Process b)
{
	return (a.priority > b.priority);
}

// Calculate Waiting time for a process 
void WT(Process proc[], int n, int wt[])
{
	wt[0] = 0;

	for (int i = 1; i < n ; i++ ) wt[i] = proc[i-1].bt + wt[i-1] ;
}

// calculates turn arround time 
void TAT( Process proc[], int n, int wt[], int tat[])
{
	for (int i = 0; i < n ; i++) tat[i] = proc[i].bt + wt[i];
}

// will display the final result 
void Display(Process proc[], int n)
{
	int wt[n], tat[n], total_wt = 0, total_tat = 0;

	WT(proc, n, wt);

	TAT(proc, n, wt, tat);

	cout << "\nProcesses "<< " Burst time " << " Waiting time " << " Turn around time\n";

	for (int i=0; i<n; i++)
	{
		total_wt = total_wt + wt[i];
		total_tat = total_tat + tat[i];
		cout << " " << proc[i].pid << "\t\t" << proc[i].bt << "\t " << wt[i] << "\t\t " << tat[i] <<endl;
	}

// Optional to calculate average Turn arroud time and Average waiting time
	cout << "\nAverage waiting time = " << (float)total_wt / (float)n;
	cout << "\nAverage turn around time = " << (float)total_tat / (float)n;
}

void priorityScheduling(Process proc[], int n)
{
	sort(proc, proc + n, compare);

	cout<< "Order in which processes gets executed \n";
	for (int i = 0 ; i < n; i++) cout << proc[i].pid <<" " ;

	Display(proc, n);
}

// Main function 
int main()
{

	// Direct Input 

	// Process proc[] = {{1, 10, 7}, {2, 7, 0}, {3, 10, 3}, {4, 8, 2}, {5, 6, 9}};
	// int n = sizeof proc / sizeof proc[0];
	// priorityScheduling(proc, n);


	// User Input 
	int n;
	cout << "number of process : "; cin >> n;
	Process proc[n];

	for (int i = 0; i < n; i++) {
		cout << "PID : "; cin >> proc[i].pid;
		cout << "PID" << i+1 << " Burst time: "; cin >> proc[i].bt;
		cout << "PID" << i+1 << " Priority: "; cin >> proc[i].priority;
	}
	priorityScheduling(proc, n);
	return 0;
}