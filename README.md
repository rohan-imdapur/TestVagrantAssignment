# TestVagrantAssignment
Test Vagrant Assignment

This Java program demonstrates a class called RecentlyPlayedSongs that keeps track of recently played songs for different users. It uses a capacity-based approach, where it stores a certain number of songs per user and removes the least recently played song when the capacity is reached.

Usage
To use this program, follow these steps:

Create an instance of RecentlyPlayedSongs by providing the desired capacity in the constructor.
Add songs for a user using the addSong method, specifying the user and the song.
Retrieve the recently played songs for a user using the getRecentlyPlayedSongs method, passing the user as an argument.
Optionally, you can also retrieve the full playlist for a user using the getPlayList method.

Class Details
RecentlyPlayedSongs Class
Constructors
RecentlyPlayedSongs(int capacity): Creates a new instance of RecentlyPlayedSongs with the specified capacity.
Methods
void addSong(String user, String song): Adds a song to the recently played songs for the given user. If the user's playlist reaches the capacity, the least recently played song is removed.
void getRecentlyPlayedSongs(String user): Retrieves and prints the recently played songs for the given user.
LinkedList<String> getPlayList(String user): Returns the full playlist for the given user as a LinkedList<String>.
