//task2 
//Grade calculation
import java.util.Scanner;
class stud{
    double claculateTotal(double m[]){
        double sum=0;
        for(int i=0;i<m.length;i++){
            sum+=m[i];
        }
        return sum;
    }
    double calculateAvg(double m[],double total){
        double avg=total/m.length;
        return avg;
    }
    void Grade(double avg){
        if(avg>=90){
            System.out.println("Grade:A");
        }
        else if(avg>=80){
            System.out.println("Grade:B");
        
        }
        else if(avg>=70){
            System.out.println("Grade:C");
        
        }
        else if(avg>=60){
            System.out.println("Grade:D");
        }
        else{
            System.out.println("Grade:E");
        }
    }
}
class StudMarks{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    stud s1=new stud();
    double[] m=new double[5];
    System.out.print("enter the marks:");
    for(int i=0;i<m.length;i++){
        m[i]=sc.nextDouble();
    }
    double total=s1.claculateTotal(m);
    System.out.println("Total Mark:"+total);
    double avg=s1.calculateAvg(m,total);
    System.out.println("Average Mark:"+avg);
    s1.Grade(avg);    
}
    }