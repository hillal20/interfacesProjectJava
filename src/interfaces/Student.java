package interfaces;

public class Student {

    static  int age = 34;
     String name = "Hilal";
   int id  = 1;

   void  setID(int id ){
       this.id = id;
   }

    int   getID(){
       return this.id;
    }

     void  setName (String name ){
        this.name  = name;
    }
    String   getName(){
        return this.name;
    }

    void  setAge (int  age  ){
        this.age   = age ;
    }
    int  getAge ( ){
         return this.age ;
    }
}
