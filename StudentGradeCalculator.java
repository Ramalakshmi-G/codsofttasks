import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String args[])
    {
        int totalmarks =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of subject:");
        int numofsub = sc.nextInt();
        System.out.println("Enter a marks of each subject(out of 100):");
        int marks[] = new int[numofsub];
        for(int i=0;i<numofsub;i++){
          marks[i] = sc.nextInt();
          if(marks[i]<0 || marks[i]>100){
            System.out.println("Invalid marks");
            i--;
            continue;
          }
          totalmarks +=marks[i];
       }
        double average = (double)totalmarks/numofsub;
        char grade;
       
        if(average>=90)
        {
          grade='A';
        }else if(average>=80)
        {
            grade='B';
        }else if(average>=70){
            grade='C';
        }else if(average>=50){
            grade='D';
        }else{
            grade='E';
        }
        System.out.println("Total Marks:"+totalmarks);
        System.out.println("Average Percentage :"+average);
        System.out.println("Grade:"+grade);
    }
}
