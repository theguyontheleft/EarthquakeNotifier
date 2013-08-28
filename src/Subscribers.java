// James Dagres
// 9057-48682
// CS 3114 
// Project 1

// The subscriber class will contain a linked list of all of the subscribers
public class Subscribers {

	public int data1;
	public double data2;
	//public 
	public Subscribers nextSubscriber;

	// Link constructor
	public Subscribers() {

	}

	// Print Link data
	public void printLink() {
		System.out.print("{" + data1 + ", " + data2 + "} ");
	}
}

class LinkList {
	
	// Head is the name of the first subscriber
	private Subscribers head;

	// LinkList constructor
	public LinkList() {
		head = null;
	}

	// Returns true if list is empty
	public boolean isEmpty() {
		return head == null;
	}

	// Inserts a new Link at the head of the list
	public void insert(int d1, double d2) {
		Subscribers subscriber = new Subscribers();
		subscriber.nextSubscriber = head;
		head = subscriber;
	}

	// Deletes the link at the head of the list
	public Subscribers delete() {
		Subscribers temp = head;
		head = head.nextSubscriber;
		return temp;
	}

	// Prints list data
	public void printList() {
		Subscribers currentSubscriber = head;
		System.out.print("List: ");
		while (currentSubscriber != null) {
			currentSubscriber.printLink();
			currentSubscriber = currentSubscriber.nextSubscriber;
		}
		System.out.println("");
	}
	
	public void printSubscriberAdded()
	{
		// <name> is removed from the watchers list
	}
	
	public void printSubscriberDeleted()
	{
		// <name> is removed from the watchers list
	}
	
}

class LinkListTest {
	public static void main(String[] args) {
		LinkList watchers = new LinkList();

		// Test watchers here
		//watchers.insert(1, 1.01);
		
		watchers.printList();

		while (!watchers.isEmpty()) {
			Subscribers deletedLink = watchers.delete();
			System.out.print("deleted: ");
			deletedLink.printLink();
			System.out.println("");
		}
		
		watchers.printList();
	}
}