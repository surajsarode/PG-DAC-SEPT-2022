import java.util.*;
class Str15
{
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       Set<Character> set=new LinkedHashSet<>();
       for(int i=0;i<s.length();i++)
       {
            set.add(s.charAt(i));
       }
       for(char c:set)
           System.out.print(c);
   }
}