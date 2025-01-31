package Employee_PaySlip;

public class PaySlip {

    public static void main(String args[]){

        Programmer p=new Programmer(10,"AAA","xxx","aaa_xxx@gmail.com","1111111111");
      System.out.println("-------Programmer--------");
      p.computepay();

   Ass_Professor Ap=new Ass_Professor(20,"BBB","yyy","bbb_yyy@gmail.com","2222222222");
     System.out.println("-------Assistant Professor--------");
     Ap.computepay();

     Asso_Professor As=new Asso_Professor(30,"CCC","zzz","ccc_zzz@gmail.com","3333333333");
     System.out.println("-------Associate Professor--------");
     As.computepay();

     Professor pf=new Professor(40,"DDD","www","www_@gmail.com","4444444444");
     System.out.println("-------Professor-------");
     pf.computepay();
    }

}
