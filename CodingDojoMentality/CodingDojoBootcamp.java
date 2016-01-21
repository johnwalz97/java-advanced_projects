public class CodingDojoBootcamp{
    public static void main(String[] args){
        LosAngelesDojoStudent eduardo = new LosAngelesDojoStudent("Eduardo");
        SanJoseDojoStudent brendan = new SanJoseDojoStudent("Brendan");
        SeattleDojoStudent aaron = new SeattleDojoStudent("Matt");
        CodingDojoMentality[] students = new CodingDojoMentality[] { eduardo, brendan, aaron };
        for(CodingDojoMentality student: students){
            challengeStudent(student);
        }
    }
    public static void challengeStudent(CodingDojoMentality student){
        student.struggle();
    }
}