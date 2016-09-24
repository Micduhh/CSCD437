//Micah Netz CSCD 437 SelfReplicatingProgram.java

public class SelfReplicatingProgram
{
   public static void main(String[] args) 
   { 
      char quotes = '"';
      //The weird use of white-space below is to make things print formatted as intended.
      String str = "//Micah Netz CSCD 437 SelfReplicatingProgram.java%n%npublic class SelfReplicatingProgram%n{%n    public static void main(String[] args) %n    {%n        char quotes = '%c'; %n        //The weird use of white-space below is to make things print formatted as intended.%n        String str = %c%s%c; %n        System.out.println(String.format(str, quotes, quotes, str, quotes));%n    }%n}";
      System.out.println(String.format(str, quotes, quotes, str, quotes));
   }
}