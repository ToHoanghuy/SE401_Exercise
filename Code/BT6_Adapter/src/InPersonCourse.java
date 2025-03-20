public class InPersonCourse implements Course {
    private final String name;
    private final String schedule;

    public InPersonCourse(String name, String schedule) {
        this.name = name;
        this.schedule = schedule;
    }

    public void attendClass() {
        System.out.println("Lớp học kèm: " + name);
    }

    public String getSchedule() {
        return schedule;
    }

    @Override
    public void start(){
        attendClass();
    }

    @Override
    public String getDetails() {
        return "Lớp học cần tham gia: " + name + " | Lịch học: " + schedule;
    }
}