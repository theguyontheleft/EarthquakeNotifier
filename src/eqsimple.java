// James Dagres
// 9057-48682
// CS 3114 
// Project 1
//
// On my honor:
//
// - I have not used source code obtained from another student,
// or any other unauthorized source, either modified or
// unmodified.
//
// - All source code and documentation used in my program is
// either my original work, or was derived by me from the
// source code published in the textbook for this course.
//
// - I have not discussed coding details about this project with
// anyone other than my partner (in the case of a joint
// submission), instructor, ACM/UPE tutors or the TAs assigned
// to this course. I understand that I may discuss the concepts
// of this program with other students, and that another student
// may help me debug my program so long as neither of us writes
// anything during the discussion or modifies any computer file
// during the discussion. I have violated neither the spirit nor
// letter of this restriction.

public class eqsimple {

	// Constructor method initializes references to the three structures used, and the 
	// 
	public eqsimple()
	{
	//	private EarthquakeService earthquakeService = EarthquakeService.getInstance();
	//	private WatcherService watcherService = WatcherService.getInstance();
	//	private static Subscribers subscriber = new Subscribers();
	}
	
	// This is the main function that receives the command line string.
	public static void main(String[] args) {
		argumentHelper(args);
	}

	// Takes in the input string and handles it. If it's in a correct format and
	// no exceptions then
	// it returns true for a successful input, otherwise it returns false for an
	// incorrect format.
	private static Boolean argumentHelper(String[] args) {

		String firstArg, secondArg, thirdArg;
		Boolean earthquakeInputSuccessful = false;

		if (3 == args.length) {
			try {

				firstArg = args[0];

				if ("--all" == firstArg) {

					secondArg = args[1];
					// TODO: handle the new subscriber in the secondArg

					thirdArg = args[2];
					earthquakeInputSuccessful = dataStreamHelper(thirdArg);

					return earthquakeInputSuccessful;
				}
			} catch (Exception ex) {
				System.err.println("Error: " + ex);
				System.exit(1);
			}
		} else if (2 == args.length) {
			try {

				firstArg = args[0];
				// TODO: handle the new subscriber in the firstArg

				secondArg = args[1];
				earthquakeInputSuccessful = dataStreamHelper(secondArg);

				return earthquakeInputSuccessful;
			} catch (Exception ex) {
				System.err.println("Error: " + ex);
				System.exit(1);
			}
		} else if (1 == args.length) {
			try {

				firstArg = args[0];
				if ("--h" == firstArg.trim()) {

					displayInputHelp();
					return false;
				}
			} catch (Exception ex) {
				System.err.println("Error: " + ex);
			}
		}

		System.err
				.println("Invalid input format, to see the help menu type '-h' /n");

		return false;
	}

	// If the earthquakeStream is live then call the helper function to load in
	// from the database
	// otherwise it's a filename so try and load it from the file. It returns
	// whether it
	// successfully loaded the earthquake stream.
	private static Boolean dataStreamHelper(String earthquakeStream) {
		if ("live" == earthquakeStream) {
			// Call a function to read from the real-time data stream

			return true;
		} else {
			// Try and load the file
			try {

				// TODO: load file

				// Success
				return true;
			} catch (Exception ex) {

			}

		}

		return false;
	}

	// The displayInputHelp function lists the accepted command line inputs
	private static void displayInputHelp() {
		// TODO: implement
	}

}