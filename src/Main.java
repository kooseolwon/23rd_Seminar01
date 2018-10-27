import org.sopt.model.Department;
import org.sopt.model.Professor;
import org.sopt.model.Student;
import org.sopt.model.University;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        final ArrayList<Student> studentList = new ArrayList<>();
        final ArrayList<Professor> professorList = new ArrayList<>();
        final ArrayList<University> univList = new ArrayList<>();


        final Student student1 = new
                Student(1510215, "구설원",
                4,"IT공학","seolwon6289@naver.com","전북 익산",
                23,"재학");
        final Student student2 = new
                Student(1511111, "나연",
                4,"IT공학","1@naver.com","서울",
                23,"재학");
        final Student student3 = new
                Student(1510215, "쯔위",
                4,"IT공학","2","서울",
                23,"재학");
        final University univ1 = new
                University(1,"숙명",010111111,"청파동");
        final University univ2 = new
                University(2,"원광대",010111111,"익산");
        final University univ3 = new
                University(3,"전북대",010111111,"전주");
        final Department dept1 = new
                Department(1,"IT공학",02111,"공과대학");
        final Department dept2 = new
                Department(2,"기계공학",02111,"공과대학");
        final Department dept3 = new
                Department(3,"전자공학",02111,"공과대학");
        final Professor prof1 = new
                Professor(1,"임유진","iT공학",010111,"클라우드");
        final Professor prof2 = new
                Professor(2,"홍길동","기계공학",010111,"기계의역사");
        final Professor prof3 = new
                Professor(3,"김삿갓","전자공학",010111,"아두이노");
        student1.toString();
        student2.toString();
        student3.toString();
        univ1.toString();
        univ2.toString();
        univ3.toString();
        dept1.toString();
        dept2.toString();
        dept3.toString();
        prof1.toString();
        prof2.toString();
        prof3.toString();




    }
}
