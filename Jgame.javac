import java.util.*;
public class Jgame
{
public static void func()
{
  Scanner input = new Scanner(System.in);
  int a;
  Random r=new Random();
  int r1=r.nextInt(10);
  int r2=r.nextInt(10);
  if(r1==r2)
  {
    while(r1==r2)
    {
      r2=r.nextInt(10);
    }
  }
  System.out.println("Which is bigger: "+r1+" or "+r2);
  String nextIntString = input.nextLine(); 
  a = Integer.parseInt(nextIntString);
  if((a==r1&&r1>r2)||(a==r2&&r1<r2))
  {
    System.out.println("Congrats!!! Correct answer");
  }
  else
  {
    System.out.println("You suck at maths");
  }
}
public static void game()
{
    Scanner input = new Scanner(System.in);
    String ans;
    while(true)
    {
      func();
      System.out.println("Do You want to play again: Reply Y for Yes and N for No");
      ans=input.next();
      if(ans=="N")
        break;
    }
}
  
public static void main(String[] args)
{
  
    Jgame j=new Jgame();  
  Jgame.game();
}
}
