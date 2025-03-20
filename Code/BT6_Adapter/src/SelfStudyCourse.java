public class SelfStudyCourse {
    private final String name;
    private final String deadline;

    public SelfStudyCourse(String name, String deadline){
        this.name = name;
        this.deadline = deadline;
    }

    public void accessMaterial(){
        System.out.println("Truy cập tài liệu cho môn: " + name);
    }

    public String getDeadline(){
        return deadline;
    }
}
