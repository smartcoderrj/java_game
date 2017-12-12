import java.lang.*;

import java.io.*;
import java.util.*;
public class Jgame
{
public static void func()
{
  Scanner i = new Scanner(System.in);
  int a;
  Random r=new Random();
  int r1=r.nextInt(10);
  int r2=r.nextInt(10);
    while(r1==r2)
    {
      r2=r.nextInt(10);
    }
  
  System.out.println("Which is bigger: "+r1+" or "+r2);
  a=Integer.parseInt(System.console().readLine());
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
    int ans;
    while(true)
    {
      func();
      System.out.println("Do You want to play again: Reply 1 for Yes and 2 for No");
      ans=Integer.parseInt(System.console().readLine());
      while(ans!=1&&ans!=2)
      {
        System.out.println("Wrong input! Try again");
        System.out.println("Do You want to play again: Reply 1 for Yes and 2 for No");
      }
      if(ans==2)
        break;
    }
}
  
public static void main(String[] args)
{
  Scanner input = new Scanner(System.in);
    Jgame j=new Jgame();  
  Jgame.game();
}
}
