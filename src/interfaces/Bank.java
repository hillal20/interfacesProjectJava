package interfaces;



abstract public class Bank {
   abstract int getInterestRate();
   /// abstracted methods can not have body , the childes should have the same method AND and with  defined  bodies.
   /// if it is not abstracted  then it could have body
        int bankInt = 50;
   public void bankMethod1() {
      System.out.println(" ===> bankMethod1");
   }
   public void bankMethod2() {
      System.out.println(" ===> bankMethod2");
   }
   public void bankMethod3() {
      System.out.println(" ===> bankMethod2");
   }
}