/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author fagun
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] studentList = new Student[6];//change size before running
        Student s1 = new Student();
        s1.setName("Fagun Vankawala");
        s1.studentID =1;
        Student s2 = new Student();
        s2.setName("Palak Shah");
        s2.studentID=2;
        Student s3 = new Student();
        s3.setName("Megh Vankawala");
        s3.studentID=3;
//        Student s4 = new Student();
//        s4.setName("Megh Vankawala");
//       
        studentList[0] = s1;
        studentList[1] = s2;
        studentList[2] = s3;
        
        //fill in 4 student names before running
        for (Student s : studentList) {
            System.out.println( s.studentID );
            System.out.println(s.getName());
        }

    }

}
