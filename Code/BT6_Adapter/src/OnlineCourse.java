public class OnlineCourse {
    private final String name;
    private final String timetable;

    public OnlineCourse(String name, String timetable){
        this.name = name;
        this.timetable = timetable;
    }

    public void joinSession(){
        System.out.println("Tham gia lớp online: " + name);
    }

    public String viewTimetable(){
        return timetable;
    }
}
