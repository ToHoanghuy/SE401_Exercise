public class Movie implements EntertainmentProgram{
    private String title;
    private int duration;
    private String director;

    public Movie(String title, int duration, String director){
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    @Override
    public EntertainmentProgram clone(){
        try{
            return (EntertainmentProgram) super.clone();
        } catch (CloneNotSupportedException e){
            return new Movie(this.title, this.duration, this.director);
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

    public void setDirector(String director){
        this.director = director;
    }

    @Override
    public String getTitle(){
        return title;
    }

    @Override
    public int getDuration(){
        return duration;
    }

    public String getDirector(){
        return director;
    }

    @Override
    public String getType(){
        return "Movie";
    }

    @Override
    public String toString() {
        return "Movie [title=" + title + ", duration=" + duration + " mins, director=" + director + "]";
    }
}
