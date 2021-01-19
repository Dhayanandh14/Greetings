import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    String m=kbd.nextLine();
    int count = 0;
    String concat= "h";
    boolean check = true;
     for(int i=0;i<m.length() && check;i++){
       if(m.charAt(i)=='e'){
         count=count+1;
       }
       else if(m.charAt(i)=='y'){
          check = false;
       }
     }
     for(int j=0;j<count*2;j++){
        
       concat = concat + "e";
     }
     System.out.print(concat+"y");  
  }
}
