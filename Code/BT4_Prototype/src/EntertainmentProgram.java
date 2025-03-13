public interface EntertainmentProgram extends Cloneable {
    EntertainmentProgram clone();
    void setTitle(String title);
    void setDuration(int duration);
    String getTitle();
    int getDuration();
    String getType();
}
