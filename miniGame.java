import java.util.*;
 class miniGame{
public static void main(String args[]){
Scanner scn = new Scanner(System.in);
int MyNumber =(int)(Math.random()*100);
int userNumber=0;
do{
System.out.println("Guss My number:");
  userNumber = scn.nextInt();
if(userNumber==MyNumber){
System.out.println("ohoo you are winner || Great");
break;
}
else if(userNumber>MyNumber){
System.out.println("your given number is much larger");
}
else{
System.out.println("your given number is samller");
}
}
while(userNumber>=0);
System.out.println("my number was");
System.out.println("MyNumber");

}
}




