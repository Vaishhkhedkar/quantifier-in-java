import java.util.regex.*;
class quantifier{
public static void main(String args[]){
String s="9";
String Password="Aabcd";

  System.out.println(Pattern.matches("[^a-g]","p"));  
    System.out.println(Pattern.matches("[b-z]","c"));  
  System.out.println(Pattern.matches("[geks]*","e"));  
  System.out.println(Pattern.matches("a{2}","aa"));  
    System.out.println(Pattern.matches("a{2,}","aaaaaa"));  
  System.out.println(Pattern.matches("a{2,5}","aaaaa")); 

   System.out.println(Pattern.matches("a{2,}.*","aaaabfga"));  
    System.out.println(Pattern.matches(".{8}","vaaaaaab"));  
     System.out.println(Pattern.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}","145-159-1213"));  
  

System.out.println(Pattern.matches("[a-zA-Z0-9&&[^!#$%]]{6,}@gmail.com","vaishukhedkar06@gmail.com")); 


    

}
}
