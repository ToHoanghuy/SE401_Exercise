public class SelfStudyCourseAdapter implements Course{
    private final SelfStudyCourse selfStudyCourse;

    public SelfStudyCourseAdapter(SelfStudyCourse selfStudyCourse){
        this.selfStudyCourse = selfStudyCourse;
    }

    @Override
    public void start(){
        selfStudyCourse.accessMaterial();
    }

    @Override
    public String getDetails(){
        return "Khóa tự học: Thời hạn - " + selfStudyCourse.getDeadline();
    }
}
