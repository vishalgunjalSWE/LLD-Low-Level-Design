public class App {
    public static void main(String[] args) throws Exception {
        // Parameterized CTOR
        Student vishalObj = new Student(287, "Vishal", 23, 5);
        vishalObj.study();

        // Copy CTOR
        Student rahulObj = new Student(vishalObj);
        rahulObj.study();
    }
}
