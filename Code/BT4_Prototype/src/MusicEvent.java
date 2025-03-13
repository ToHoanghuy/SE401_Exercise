public class MusicEvent implements EntertainmentProgram{
    private String title;
    private int duration;
    private String artist;

    public MusicEvent(String title, int duration, String artist){
        this.title = title;
        this.duration = duration;
        this.artist = artist;
    }

    @Override
    public EntertainmentProgram clone(){
        try{
            return (EntertainmentProgram) super.clone();
        } catch (CloneNotSupportedException e){
            return new MusicEvent(this.title, this.duration, this.artist);
        }
    }

    @Override
    public void setTitle(String title){
        this.title = title;
    }

    @Override
    public void setDuration(int duration){
        this.duration = duration;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    @Override
    public String getTitle(){
        return title;
    }

    @Override
    public int getDuration(){
        return duration;
    }

    public String getArtist(){
        return artist;
    }

    @Override
    public String getType(){
        return "MusicEvent";
    }

    @Override
    public String toString() {
        return "MusicEvent [title=" + title + ", duration=" + duration + " mins, artist=" + artist + "]";
    }
}
