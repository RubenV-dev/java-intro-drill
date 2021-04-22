import java.util.ArrayList;

public class Playlist {
    public String name;
    public ArrayList<Song> songs = new ArrayList<Song>();
    public boolean empty = true;
    int tempIndex1;
    int tempIndex2;

    public Playlist(String name){
        this.name = name;
    }
    public boolean isEmpty(){
        for (int i = 0; i < songs.size(); i++) {
            if(songs.get(i) != null){
                empty = false;
                break;
            }
        }
        return empty;
    }
    public void addSong(Song song){
        songs.add(song);
    }
    public String[] songNames(){
        String[] songStrings = new String[songs.size()];
        for (int i = 0; i < songs.size(); i++) {
            if(songs.get(i) != null){
                songStrings[i] = songs.get(i).title;
//                        .add(songs.get(i).title);
            }
        }
        return songStrings;
    }
    public int totalDuration() {
        int durationinSeconds = 0;
        for (int i = 0; i < songs.size(); i++) {
            if(songs.get(i) != null){
                durationinSeconds = durationinSeconds + songs.get(i).durationInSeconds;
            }
        }
        return durationinSeconds;

    }

//    playlist.swap(itsIce, everything);
//        String[] swappedSongOrder = {"It's Ice", "Time", "Everything In Its Right Place"};
//        assertArrayEquals(swappedSongOrder, playlist.songNames());
    public ArrayList<Song> swap(Song song1, Song song2){
        for (int i =0; i < songs.size(); i++){
            if (songs.get(i) == song1){
                tempIndex1 = i;
            }
            if (songs.get(i) == song2){
                tempIndex2 = i;
            }
        }
        songs.set(tempIndex1, song2);
        songs.set(tempIndex2, song1);
        return songs;
    }

    public ArrayList<Song> removeSong(Song song){
        for (int i =0; i < songs.size(); i++){
            if (songs.get(i) == song){
                tempIndex1 = i;
            }

        }
        songs.remove(tempIndex1);
        return songs;
    }


}
