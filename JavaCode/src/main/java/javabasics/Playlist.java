package javabasics;

import java.util.ArrayList;

class Playlist {


    public static void main(String[] args) {

        ArrayList<String> desertIslandPlaylist = new ArrayList<>();
        desertIslandPlaylist.add("Song1");
        desertIslandPlaylist.add("Song2");
        desertIslandPlaylist.add("Song3");
        desertIslandPlaylist.add("Song4");
        desertIslandPlaylist.add("Song5");

        System.out.println(desertIslandPlaylist.get(1));

    }

}