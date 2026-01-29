public class Main {
    public static void main(String[] args) {
        
        Student s1 = new Student (2511020, "Ira ", "Mishae ", "Palabay ", "Male", "IraMishael.palabay@amrol.edu");
        Student s2 = new Student (2511021, "Nico ", "bob ", "lodeon ", "Male", "Nicolodeon@amrol.edu");
        Student s3 = new Student (2511023, "Joel ", "Carlo ", "Valdez ", "Male", "joelcarlo@amrol.edu");


        Course course1 = new Course("CS101",  "Introduction To Programming");
        

        course1.enrollStudent(s1);
        course1.enrollStudent(s2);
        course1.enrollStudent(s3);
        course1.displayCourseInfo();

      

     }
}
