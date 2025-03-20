public class OnlineCourseAdapter implements Course {
    private final OnlineCourse onlineCourse;

    public OnlineCourseAdapter (OnlineCourse onlineCourse){
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void start(){
        onlineCourse.joinSession();
    }

    @Override
    public String getDetails(){
        return "Khóa học online: " + onlineCourse.viewTimetable();
    }
}
