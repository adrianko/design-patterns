    ArrayList<SongInfo> bestSongs;
    public void addSong(String songName, String bandName, int yearReleased){
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.add(songInfo);
    }
    
    public ArrayList<SongInfo> getBestSongs(){
        return bestSongs;
    }
    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }