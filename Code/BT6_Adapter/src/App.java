public class App {
    public static void main(String[] args) throws Exception {
        Course inPerson = new InPersonCourse("Mẫu thiết kế", "Thứ 6, Tiết 6-8");
        Course online = new OnlineCourseAdapter(new OnlineCourse("Kiến trúc phần mềm", "Thứ 3, Tiết 1-4"));
        Course selfStudy = new SelfStudyCourseAdapter(new SelfStudyCourse("OOAD", "2025-12-11"));

        // Tạo danh sách khóa học
        Course[] courses = {inPerson, online, selfStudy};

        // Thử nghiệm hệ thống
        System.out.println("Hệ thống danh sách môn học:");
        System.out.println("--------------------");

        for (Course course : courses) {
            System.out.println(course.getDetails());
            course.start();
            System.out.println();
        }
    }
}
