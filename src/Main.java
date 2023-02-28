public class Main{
    public static void main(String[] args) {
        
        MusicBox mbox = new MusicBox("S34TG65", 'Y', "Raindrops", "Misty", 
        "The path less traveled", "Country", "BZEE Music", "Rhythm Divine");
        PlaySongs playing = new PlaySongs();

        System.out.println("Now playing the song");
        playing.playSong(mbox.getSongID(), mbox.getPremiumSong(), 2);
        
        // --- TODO

        /* Repeat the above code to create another object  
         * Pass different parameters to the MusicBox constructor, but initialise premiumSong to N and when calling the
         * playSong method, pass ads parameter as just 1
         * 
         * 
        */
        
        MusicBox newBox = new MusicBox("T12344", 'N', "Forest", "Justin", 
        "All the way", "POP", "LLL Music", "Relax");

        System.out.println("Now playing the song");
        playing.playSong(newBox.getSongID(),newBox.getPremiumSong(), 1);

    }
}




