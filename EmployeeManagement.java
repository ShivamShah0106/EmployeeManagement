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
    static int num;
    static int max=20;

    static Employee emp[]=new Employee[max];
    static Scanner sc=new Scanner(System.in);
    static void build(){}
    static void insert(){}
    static void deleteRecord(){}
    static void searchRecord(){}
    static void showMenu(){
        System.out.println("--------------------" + "Welcome to the Employee Management System" + "--------------------" + "\n");
        System.out.println("Available Options:");
        System.out.println("Build Table       (1)");
        System.out.println("Insert New Entry  (2)");
        System.out.println("Delete Entry      (3)");
        System.out.println("Search Record     (4)");
        System.out.println("Exit              (5)");

        int op=sc.nextInt();

        if(op==1){
            build();
        }
        else if(op==2){
            insert();
        }
        else if(op==3){
            deleteRecord();
        }
        else if(op==4){
            searchRecord();
        }
        else if(op==5){
            return;
        }
        else{
            System.out.println("Choose From Given Options:" + "1/2/3/4/5");
            showMenu();
        }
    }
    public static void main(String[] args){
        showMenu();
    }
}