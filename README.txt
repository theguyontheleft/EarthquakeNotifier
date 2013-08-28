DESCRIPTION:
=============


This software is an earthquake notification system. It automatically informs subscribers 
if an earthquake occurred around them, and can inform every subscriber of any earthquake occurrence. 
This program works by receiving input from two data streams. The first stream comes from an earthquake
tracking service provider (USGS), which provides information on the time, location, and magnitude of 
earthquakes around the world. The second data stream will be a series of requests related to users of the notification system. 


FEATURES:
=============
* Notifies subscribers to earthquakes 
* Stores earthquake records for the last six hours
* 

NOTES:
=============
Three data structures are used. The first is a linked list containing the names of everyone that has subscribed to the notification system. 
Subscribers on the linked list in are in the order that they arrive, and all processing to delete watchers or generate notifications is done by sequentially working through the list.  The second is a linked queue which stores the list of recent earthquake records, in
The order of their occurrence. The third data structure is a heap which stores the earthquakes in terms of their magnitudes.


ADDITIONAL ITEMS NEEDED TO RUN THE PROJECT:
=======================================
Eclipse Java 
* 

- Dictionaries


INSTRUCTIONS:
=======================================
Building the project
* From the terminal once in the project directory run the 
following commands to make and build the project:
