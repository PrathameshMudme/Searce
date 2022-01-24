import java.util.Scanner;

public class linklist{
	
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			
		
			this.next=null;
		}
	}
	
	public Node head=null;
	

	public void addNode(int data) {
	    
		
		Node newNode = new Node(data);
		
            
		if(head==null) {
			head=newNode;
		}else {
            
			Node tail=head;
			while(tail.next!=null) {
				tail=tail.next;
			}
			tail.next=newNode;
		}
	}
	
	public void display() {
		Node ptr=head;
		
		if(ptr==null) {
			System.out.println("The list is empty");
			return;
		}
		System.out.println("The nodes of lists are : ");
		
		while(ptr!=null) {
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		linklist list = new linklist();
		
		System.out.println("Enter number of nodes : ");
		int n = scanner.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter value of "+(i+1)+" node : ");
			int val = scanner.nextInt();
			list.addNode(val);
		}
		
            
		list.display();
        scanner.close();
	}
}