import java.util.regex.*;
class Re{
public static void main(String args[]){
String s="abcdefg";

  System.out.println(Pattern.matches("[^a-g]","p"));  
    System.out.println(Pattern.matches("[xyz]","vcxyz"));  
  System.out.println(Pattern.matches("[^xyz]","vczxy"));  
  System.out.println(Pattern.matches("[a-zA-Z]","advnbhi"));  
    System.out.println(Pattern.matches("[a-f[m-t]]","vczxy"));  
  System.out.println(Pattern.matches("[a-z&&p-y]","vczxy"));  
    System.out.println(Pattern.matches("[a-z&&[^bc]]","va"));  




    

}
}
