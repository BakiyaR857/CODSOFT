//Task1
//Guessing of random number
import java.util.Random;
import java.util.Scanner;

class RandomNo{
public static void main(String[]args){
Random r=new Random();
Scanner sc=new Scanner(System.in);
int Max=10;
char playAgain='y';

while(playAgain=='y'){
int attempts=0;
Boolean correctguess=false;
int randno=r.nextInt(100)+1;

while(attempts<Max && correctguess!=true){
System.out.print("enter your guess:");
int guess=sc.nextInt();
attempts++;
if(guess<randno){
System.out.println("input is too low");
}
else if(guess>randno){
System.out.println("input is too high");
}
else{
System.out.println("your guess is correct");
correctguess=true;
}
}
if(attempts==1 && correctguess==true){
System.out.println("you are the winner! and your score is:100");
}
else if(attempts<=5 && correctguess==true){
System.out.println("your score is:75");
}
else if(attempts<=10 && correctguess==true){

System.out.println("your score is:50");
}
else{
System.out.println("Game Over.Try Again!" );
}
System.out.println("do you want to play(y/n):");
playAgain=sc.next().charAt(0);
}
}
}
