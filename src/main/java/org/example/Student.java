package org.example;

public class Student {

    public String Name;
    public int Semester;
    public boolean isActive;

    public boolean isDoingMBKM (){
        if ( Semester >= 6 && isActive == true ){
            return true;

        } else{
            return false;
        }
    }

    public Student(String name, int semester, boolean isActive) {
        Name = name;
        Semester = semester;
        this.isActive = isActive;
    }
}
