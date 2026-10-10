import java.util.*;

public class EmployeeManagement{
    static class Employee{
        private String name;
        private long id;
        private String designation;
        private int age;
        private int exp;

        public Employee(String name,long id,String designation,int age,int exp){
            this.name=name;
            this.id=id;
            this.designation=designation;
            this.age=age;
            this.exp=exp;
        }
        public String getName(){
            return name;
        }
        public long getId(){
            return id;
        }
        public String getDesignation(){
            return designation;
        }
        public int getAge(){
            return age;
        }
        public int getExp(){
            return exp;
        }
    }
    public static void main(String[] args){

    }
}