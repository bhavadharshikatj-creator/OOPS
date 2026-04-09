
class InvoiceProcessor {
public void generateInvoice(String customer,double amount){
double finalAmount=calculateTotal(amount);
System.out.println("Invoice for "+customer);
System.out.println("Amount: "+finalAmount);
}
private double calculateTotal(double amount){
System.out.println("Base calculation");
return amount;
}
public void showCalculation(double amount){
double result=calculateTotal(amount);
System.out.println("Internal Calculation: "+result);
}
}

class RetailInvoice extends InvoiceProcessor {
public void generateInvoice(String customer,double amount){
double discount=amount*0.1;
double finalAmount=amount-discount;
System.out.println("Retail Invoice for "+customer);
System.out.println("Original Amount: "+amount);
System.out.println("Discount: "+discount);
System.out.println("Final Amount: "+finalAmount);
}
public double calculateTotal(double amount){
System.out.println("Retail calculation");
return amount-50;
}
}

public class override {
public static void main(String[] args){
InvoiceProcessor ref=new RetailInvoice();
ref.generateInvoice("Avanthi",1000);
ref.showCalculation(1000);
}
}