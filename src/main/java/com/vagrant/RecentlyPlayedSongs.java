package com.vagrant;


import java.util.*;

public class RecentlyPlayedSongs {
    private int capacity;
    private Map<String, LinkedList<String>> store;

    public RecentlyPlayedSongs(int capacity) {
        this.capacity = capacity;
        this.store = new HashMap<>();
    }

    public void addSong(String user, String song) {
        if (!store.containsKey(user)) {
            store.put(user, new LinkedList<>());
        }

        LinkedList<String> playlist = store.get(user);
        playlist.remove(song); // Remove the song if it already exists in the playlist

        if (playlist.size() >= capacity) {
            playlist.removeLast(); // Remove the least recently played song
        }

        playlist.addFirst(song); // Add the recently played song to the beginning
    }

    public void getRecentlyPlayedSongs(String user) {
    	var list=store.getOrDefault(user, new LinkedList<>());
    	for(int i=list.size()-1;i>=0;i--) {
    		System.out.print(list.get(i));
    		if(i!=0) {
    			System.out.print(",");
    		}
    	}
    	System.out.println();
    }
    public LinkedList<String> getPlayList(String user) {
    	return store.getOrDefault(user, new LinkedList<>());
    }

    public static void main(String[] args) {
        int initialCapacity = 3;
        RecentlyPlayedSongs store = new RecentlyPlayedSongs(initialCapacity);

        store.addSong("user1", "S1");
        store.addSong("user1", "S2");
        store.addSong("user1", "S3");
        System.out.println("User1's playlist: ");
        store.getRecentlyPlayedSongs("user1");

        store.addSong("user1", "S4");
        System.out.print("S4 Song Played, User1's updated playlist: ");
        store.getRecentlyPlayedSongs("user1");

        store.addSong("user1", "S2");
        System.out.print("S2 Song Played, User1's updated playlist: ");
        store.getRecentlyPlayedSongs("user1");

        store.addSong("user1", "S1");
        System.out.print("S1 Song Played, User1's updated playlist: ");
        store.getRecentlyPlayedSongs("user1");
    }
}

