// James Dagres
// 9057-48682
// CS 3114 
// Project 1

// The subscriber class will contain a linked list of all of the subscribers
public class Subscribers {

	public int xPosition;
	public int yPosition;
	public String subscriberName;

	// public
	public Subscribers nextSubscriber;

	// Link constructor
	public Subscribers() {

	}

	// Print Link data
	public void printLink() {
		System.out.print("{" + xPosition + ", " + yPosition + "} ");
	}
}

class LinkList {

	// Head is the name of the first subscriber
	private Subscribers head;
	private Subscribers tail;

	// LinkList constructor
	public LinkList() {
		head = null;
	}

	// LinkList constructor
	public LinkList(int x, int y) {

		head = null;
	}

	// Returns true if list is empty
	public boolean isEmpty() {
		return head == null;
	}

	// Inserts a new Link at the head of the list
	public void insert(int x, int y) {
		Subscribers subscriber = new Subscribers();
		
		subscriber.xPosition = x;
		subscriber.yPosition = y;
		
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

	public void printSubscriberAdded() {
		// <name> is removed from the watchers list
	}

	public void printSubscriberDeleted() {
		// <name> is removed from the watchers list
	}

}

class LinkListTest {
	public static void main(String[] args) {
		LinkList watchers = new LinkList();

		// Test watchers here
		// watchers.insert(1, 1);

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