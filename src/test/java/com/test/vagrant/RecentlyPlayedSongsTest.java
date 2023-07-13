package com.test.vagrant;

import org.junit.Before;
import org.junit.Test;

import com.vagrant.RecentlyPlayedSongs;

import static org.junit.Assert.*;

import java.util.LinkedList;

public class RecentlyPlayedSongsTest {
    private RecentlyPlayedSongs store;

    @Before
    public void setUp() {
        int initialCapacity = 3;
        store = new RecentlyPlayedSongs(initialCapacity);
        System.out.println("Initialized");
    }

    @Test
    public void testAddSong() {
        store.addSong("user1", "S1");
        store.addSong("user1", "S2");
        store.addSong("user1", "S3");
        store.addSong("user1", "S4");

        LinkedList<String> expectedPlaylist = new LinkedList<>();
        expectedPlaylist.addFirst("S2");
        expectedPlaylist.addFirst("S3");
        expectedPlaylist.addFirst("S4");
        
        System.out.println("Expected Play List"+expectedPlaylist);
        System.out.println("Actual Play List"+store.getPlayList("user1"));

        assertEquals(expectedPlaylist, store.getPlayList("user1"));
    }

    @Test
    public void testGetRecentlyPlayedSongs() {
        store.addSong("user1", "S1");
        store.addSong("user1", "S2");
        store.addSong("user1", "S3");

        LinkedList<String> expectedPlaylist=store.getPlayList("user1");
        assertEquals(expectedPlaylist, store.getPlayList("user1"));
    }  
}
