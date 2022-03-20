import java.util.Scanner;
class Queue{
int front=-1;
int rear=-1;
int a[];
int capacity;
Queue(int n){
	this.capacity=n;
	a=new int[n];
}
boolean isempty() {
	if(front==-1&&rear==-1) 
		return true;
	else
		return false;
}
boolean isfull() {
//if(((rear+1)%a.length)==front)
if(front==0&&rear==capacity-1||front==rear+1)
    	return true;
	else
		return false;
}
void enqueue(int n)
{
if(isfull()) {
	System.out.println("Queue is full");
}
else{
	if(rear==capacity-1){
		rear=0;
	}
	else if(rear==-1) {
		front++;
		rear++;
	}
	else {
		rear=rear+1;
	}
	a[rear]=n;
}
}

int dequeue() {
	int x=0;
	if(isempty()) {
	System.out.println("Queue is Empty");
	return -11111111;
    }
	else {
	x=a[front];
	    if(front==rear) {
	    	front=-1;
	    	rear=-1;
	    }
	    else {
		if(front==capacity-1) {
		front=0;	
		}
		else {
			front=front+1;
		}
	    }
		return x;
	}
}
void peek() {
	int top=front;
	int end=rear;
	if(isempty()) {
		System.out.println("Queue is Empty");
	}
	else {

			top=(top+1)%a.length;
			System.out.println(a[top]+" ");
			
	}
}
}

class functioncall{
      public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      int opt=0;
      System.out.println("Enter the queue size");
      Queue a=new Queue(in.nextInt());
      while(true){
          System.out.println("Enter 1.Enqueue 2.Dequeue 3.peek");
          opt=in.nextInt();
          if(opt==1){
              System.out.println("Enter the number");
              a.enqueue(in.nextInt());
          }
          else if(opt==2){
              System.out.println(a.dequeue());
          }
          else if(opt==3){
             a.peek();
          }
          else{
              System.out.println("Wrong option selected");
          }
      }
      }
  }