package akr.infotech;

import java.util.List;

public class StudentRecordUtil {
    public static List<StudentRecord> getStudentList(){
        StudentRecord s1=new StudentRecord("Raj","Java",99);
        StudentRecord s2=new StudentRecord("Raj","SQL",44);
        StudentRecord s3=new StudentRecord("Raj","PHP",55);
        StudentRecord s4=new StudentRecord("Raj","C",77);
        StudentRecord s5=new StudentRecord("Raj","C++",88);

        StudentRecord s6=new StudentRecord("Akash","Java",99);
        StudentRecord s7=new StudentRecord("Akash","SQL",44);
        StudentRecord s8=new StudentRecord("Akash","PHP",55);
        StudentRecord s9=new StudentRecord("Akash","C",77);
        StudentRecord s10=new StudentRecord("Akash","C++",88);

        StudentRecord s11=new StudentRecord("Sham","Java",66);
        StudentRecord s12=new StudentRecord("Sham","SQL",72);
        StudentRecord s13=new StudentRecord("Sham","PHP",48);
        StudentRecord s14=new StudentRecord("Sham","C",89);
        StudentRecord s15=new StudentRecord("Sham","C++",59);

        return List.of(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15);
    }
}
