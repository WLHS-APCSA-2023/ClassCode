public class BillTester{
    public static void main(String[] args){
      Bill myBill = new Bill(100.00,9);
      Bill myBillTwo = new Bill(100.00,6);
      System.out.println(myBill);
      myBill.tipSwitch();
      System.out.println(myBill);

      System.out.println(myBillTwo);
      myBillTwo.tipSwitch();
      System.out.println(myBillTwo);
    }
  
  }
