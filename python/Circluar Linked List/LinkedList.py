# Python program to Search an Element in a Circular Linked List
#Md Zeeshan


# -----| Understand Circular Linked List|-----#

# QUES: What is Linked List -
# ANS: A linked list is a kind of linear data structure where each node has a data part and an address part which points to the next node. 
# A circular linked list is a type of linked list where the last node points to the first one, making a circle of nodes.
# Search an Element in a Circular Linked List

# Example:
# Input: CList = 6->5->4->3->2, find = 3
# Output: Element is present
 
# Input: CList = 6->5->4->3->2, find = 1
# Output: Element is not present

# For example, if the key to be searched is 30 and the linked list is 5->4->3->2, then the function should return false.
# If the key to be searched is 4, then the function should return true. 

# How to approach: 

#    1. Initialize a node pointer, temp = head.
#    2. Initialize a counter f=0 (to check if the element is present in a linked list or not).
#    3.  If the head is null then the print list is empty.
#    4.  Else start traversing the Linked List and if element found in Linked List increment in f.
#    5. If the counter is zero, then the print element is not found.
#    6. Else print element is present.	

# -----|-----#


	
# Class to define node of the linked list	
class Node:
	def __init__(self,data):	
		self.data = data;
		self.next = None;
		
class CircularLinkedList:
	
	# Declaring Circular Linked List
	def __init__(self):	
		self.head = Node(None);	
		self.tail = Node(None);	
		self.head.next = self.tail;	
		self.tail.next = self.head;	
		
	
	# Adds new nodes to the Circular Linked List
	def add(self,data):	
		
		# Declares a new node to be added
		newNode = Node(data);
		
		# Checks if the Circular
		# Linked List is empty
		if self.head.data is None:
			
			# If list is empty then new node
			# will be the first node
			# to be added in the Circular Linked List
			self.head = newNode;
			self.tail = newNode;
			newNode.next = self.head;
		
		else:
			# If a node is already present then
			# tail of the last node will point to
			# new node
			self.tail.next = newNode;
			
			# New node will become new tail
			self.tail = newNode;
			
			# New Tail will point to the head
			self.tail.next = self.head;	
				
	# Function to search the element in the
	# Circular Linked List
	def findNode(self,element):
		
		# Pointing the head to start the search
		current = self.head;
		i = 1;
		
		# Declaring f = 0
		f = 0;	
		# Check if the list is empty or not	
		if(self.head == None):
			print("Empty list");
		else:
			while(True):	
				# Comparing the elements
				# of each node to the
				# element to be searched
				if(current.data == element):

					# If the element is present
					# then incrementing f
					f += 1;	
					break;
				
				# Jumping to next node
				current = current.next;	
				i = i + 1;	
				
				# If we reach the head
				# again then element is not
				# present in the list so
				# we will break the loop
				if(current == self.head):	
					break;	
			
			# Checking the value of f
			if(f > 0):	
				print("element is present");	
			else:	
				print("element is not present");	
				
# Driver Code
if __name__ == '__main__':
	
	# Creating a Circular Linked List
	'''
	Circular Linked List we will be working on:
	1 -> 2 -> 3 -> 4 -> 5 -> 6
	'''
	circularLinkedList = CircularLinkedList();
	
	#Adding nodes to the list	
	circularLinkedList.add(1);
	circularLinkedList.add(2);
	circularLinkedList.add(3);
	circularLinkedList.add(4);
	circularLinkedList.add(5);
	circularLinkedList.add(6);
	
	# Searching for node 2 in the list	
	circularLinkedList.findNode(2);
	
	#Searching for node in the list	
	circularLinkedList.findNode(7);
