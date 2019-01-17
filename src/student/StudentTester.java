/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author aksha
 */
public class StudentTester {
    public static void main(String[] args)
    {
    Student s1= new Student("Akshat Patel");
    Student[] StudentList=new Student[5];
    StudentList[0]=s1;
    StudentList[1]=new Student("Ces Macalugan");
    StudentList[2]=new Student("Gavindeep bains");
    StudentList[3]=new Student("Kajeevan Kaneshamoorthy");
    StudentList[4]=new Student("Divy Rabari");
    
    for(int i=0;i<StudentList.length;i--)
    {
        System.out.println(StudentList[i].getName());
    }
    }
}
