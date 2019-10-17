package interfaces;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.net.SocketOption;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Student  studentA = new Student();
        Student  studentB = new Student();

        studentA.setAge(40);
        studentA.setID(2);
        studentA.setName("aissani");

        studentB.setAge(20);
        studentB.setID(3);
        studentB.setName("Ali");


        /// static age
        Student.age = 7;


        System.out.println(studentA.id);
        System.out.println(studentA.age);
        System.out.println(studentA.name);
        System.out.println(" static age ===>  " + Student.age);


        System.out.println(studentB.id);
        System.out.println(studentB.age);
        System.out.println(studentB.name);




       /////////////////////// cube ////

        Cube obj1 = new Cube(3,4,5);

        int v1 = obj1.getVolume();
        System.out.println("v1 ===>  "+ v1);


        ////////////////////// method over loading

        System.out.println(add(4,5));
        System.out.println(add(4.40,5.6600));
        System.out.println(add("hilal", "Aissain"));


        ///////// inheritance  ////
        Triangle tri = new Triangle();
        Rectangle rec  = new Rectangle();
        tri.setValues(5,6);
        rec.setValues(5,6);
        double area1 = tri.calArea();
        double   area2 = rec.calArea();
        System.out.println("a1 ==> "+ area1);
        System.out.println("a2 ==> "+ area2);

        ////// polymorphism ////

        Bank bankA  =  new BankA();
        Bank bankB  =  new BankB();
        Bank bankC  =  new BankC();

        System.out.println("bankA :" + bankA.getInterestRate());
        System.out.println("bankB :" +bankB.getInterestRate());
        System.out.println("bankC :" +bankC.getInterestRate());
        System.out.println("bankC bankIng :" +bankC.bankInt);

        /////// interfaces ///

        ImplementedInterface  implementedInterfaceObj = new ImplementedInterface();
        implementedInterfaceObj.count = 300;

        System.out.println("ImplementedInterface ==> "+  implementedInterfaceObj.count  );










    }

    public static  int add(int a, int b ){
        return a+b;
    };
    public static  double add(double a, double b ){
        return a+b;
    };
    public static  String  add(String a, String b ){
        return a+b;
    };

}
