public class TVShow implements EntertainmentProgram{
    private String title;
    private int duration;
    private int numberOfEpisodes;

    public TVShow(String title, int duration, int numberOfEpisodes){
        this.title = title;
        this.duration = duration;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    @Override
    public EntertainmentProgram clone(){
        try{
            return (EntertainmentProgram) super.clone();
        } catch (CloneNotSupportedException e){
            return new TVShow(this.title, this.duration, this.numberOfEpisodes);
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

    public void setnumberOfEpisodes(int numberOfEpisodes){
        this.numberOfEpisodes = numberOfEpisodes;
    }

    @Override
    public String getTitle(){
        return title;
    }

    @Override
    public int getDuration(){
        return duration;
    }

    public int getnumberOfEpisodes(){
        return numberOfEpisodes;
    }

    @Override
    public String getType(){
        return "TVShow";
    }

    @Override
    public String toString() {
        return "TVShow [title=" + title + ", duration=" + duration + " mins, numberOfEpisodes=" + numberOfEpisodes + "]";
    }
}
