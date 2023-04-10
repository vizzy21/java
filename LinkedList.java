//Linked List 
//linear and dynamic and one data is linked to other data upcoming
//every single data is known as a node , it can be of any data type, so gotta specify the type
//two types of stuff gets stored in a node, one is data and other is pointer(reference variables)
//pointer is called next which points to the next node
//the chain will end while storing a null value, this is the structure of the linked List
//we need to make a class for nodes generally and then, whatever we use as data nodes are the objects of the node class
//reference variable next, its type will also be the class node type
//singly linked list means there is nly pointing to the forward direction
//why use? because its more effecient in adding and removing


public class LinkedList
{   
public static class Node{
        int data;
        Node next;
    
        public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public static Node head;
public static Node tail;
public static int size;

//methord to add first
//Adding a new node in linked List
//add first :create a new node, new node's text = head , head = new node
//spcl case when only no node is present , the the new node will be the head and the tail

public void addFirst(int data){
    //if linked list is empty this will happen
    //step 1: to create a new node
    Node newNode = new Node(data);
    size++;
    if(head == null){      //if linked list is empty
         head = tail = newNode;
         return;
    }
    
    //if already elements are present then this will happen
    
    //step 2: newNode next = head
    newNode.next = head;
    //step 3:head  = newNode;
    head  = newNode;
}

//methord to add at last
//create a node, tail.next = new node
//tail = new node
//if ll empty, head tail both same

public void addlast(int data){
  Node newNode  = new Node(data);
  size++;

   if(head == null){
       head = tail = newNode;
   }
   
    tail.next = newNode;
    tail = newNode;
}


//methord to add in the middle
//add(index, data)
//if the index given is zero then call the first methord, and the index given is the size then call the last methord

public void add(int idx, int data){
     if(idx == 0){
         addFirst(data);
         return;
        }
      
      Node newNode = new Node(data);
      size++;
      Node temp = head;
      int i =0; // this is used to track the index of temp variable
      while(i<idx-1){   //we are stopping one before so we cut the link
         //we can traverse till that location, so no problem, just keep moving temp and increasing the index for count
          temp = temp.next;
          i++;
      }
      //i = idx-1;
      newNode.next = temp.next;
      temp.next = newNode;
      
  }
	
//print methord
public void print(){
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
    System.out.println("null");
}
	
//removal of elements in linked list , remove first and remove last	
//remove first: remove and put head as the next node head = head.next

public int removeFirst(){
   if(size ==0){
       System.out.println("LL is empty");
       return Integer.MIN_VALUE;
       
       }
       
    if(size == 1){
        int val = head.data;
        head = tail = null;
        size=0;
        return val;
    }
   
    int val = head.data;
    head = head.next;
    size--;
    return val;
}

//remove last:
//if we take last before node as previous, we need to make prev.next -null;
//assign tail as prev value

public int removelast(){
   if(size ==0){
       System.out.println("LL is empty");
       return Integer.MIN_VALUE;
   }
    if(size == 1){
        int val = head.data;
        head = tail = null;
        size=0;
        return val;
    }  
   
   //need to apply loop to reach the previous node
   //prev : i = size-2;
   Node prev = head;
   for(int i=0;i<size-2;i++){
      prev = prev.next; 
   }
   int val = tail.data; //before deleting always store data
   prev.next = null;
   tail = prev;
   size--;
   return val;
   
}

public int iterativesearch(int key){
    Node temp = head;
    int i = 0;
    while(temp!=null){
        if(temp.data == key){
            return i;  //data found at this index
        }
        temp = temp.next;
        i++;
    }
    //key not found 
    return -1;
}

//keep changing head to next node in every step in recursive search 
public static Node reverseLinked(Node head){
     Node prev = null;  
     Node current = head;
    
        while(current != null) { 
           Node next = current.next; 
            current.next = prev;
            prev = current;
            current = next;
        }
       return prev; 
    }

	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
	    ll.addFirst(2); ll.addFirst(1);
		ll.addlast(3); ll.addlast(4);
		ll.add(2, 9);
		ll.print();
		System.out.println("size of the linked list : " + ll.size);
		ll.removeFirst();
		ll.print(); //1 is removed
		ll.removelast();
		ll.print(); //1 is removed
		System.out.println("size of the linked list : " + ll.size);
        //iterative search
		System.out.println(ll.iterativesearch(3));
		System.out.println(ll.iterativesearch(11));
		ll.print();
		Node head = reverseLinked(ll.head);
		ll.head = head;
		ll.print();

	}
}
