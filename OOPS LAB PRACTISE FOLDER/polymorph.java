class Notifier {
public void send(String message){
System.out.println("General Notification: "+message);
}
protected void send(String message,String email){
System.out.println("Email sent to "+email+": "+message);
}
void send(String message,long phone){
System.out.println("SMS sent to "+phone+": "+message);
}
private void sendInternal(String message){
System.out.println("Internal Notification: "+message);
}
public void accessPrivate(String message){
sendInternal(message);
}
}

class AppNotifier extends Notifier {
public void test(){
send("Hello User");
send("OTP Message","user@gmail.com");
send("Order Delivered",9876543210L);
accessPrivate("System Alert");
}
}

public class polymorph {
public static void main(String[] args){
AppNotifier obj=new AppNotifier();
obj.send("Welcome");
obj.send("Check Email","test@gmail.com");
obj.send("Check SMS",9999999999L);
obj.test();
}
}