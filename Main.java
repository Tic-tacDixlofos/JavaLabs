//package io.darkwings;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Marks a1=new Marks();
        a1.getName();
        a1.getMark();
    }}

class User {
    private int id;
    private String lastName;
    private String firstName;
    private int age;

    User(){

        id=1;
        lastName="Bostan";
        firstName="Marius";
        age=43;

    }
    User( int age){
        firstName="Marina";
        age=18;

        if(this.age>16){
            System.out.println("I told u!");

        }


    }

    public String getName() {
        return firstName;
    }

    // Setter
    public void setName(String newName) {
        this.firstName = newName;
    }

}

class Marks extends User{
   private int id ;
   private int marks[] ;

   Marks(){

       id=12;
       if(id<14){
           System.out.println("Well your id is"+id);

       }


   }
   Marks(int marks[], int id){
       id=12;
       marks=new int[id];

       for (int i=0; i<id; i++){
           marks[i]=8;
       }


   }
    public Integer getMark() {
        return id;
    }

    // Setter
    public void setMark(int newId) {
        this.id = newId;
    }
}

