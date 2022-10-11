/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista05;
import java.util.Scanner;

/**
 *
 * @author 120114567
 */
public class RowExercise {

    private static void SumNum(int num, int nextNum, int result){
            
        if(num != nextNum){

            System.out.println("The number is: " + nextNum);
            System.out.println("Sum: " + result + nextNum);

            SumNum(num,nextNum + 1, result + nextNum);  
        
        }
    }
    
    private static void ShowNum(int num, int nextNum){
            
        if(num + 1 != nextNum){
            
            System.out.println(nextNum);

            ShowNum(num,nextNum + 1);  
        
        }
    }
    
    private static void RaiseNum(int base, int exp, int nextNum, int result){
            
        if(exp != nextNum){
            
            if(result == 0){
                result = base;             
            }
            
            result = result * base;
            
            nextNum++;
            
            RaiseNum(base,exp,nextNum,result);  
        
        }
        else{
            System.out.println(result);
        }
        
    }
        
    public static void main(String[] args) {
        
        String[] stringList;
        Row upperCaseRow = new Row();
        Row lowCaseRow = new Row();
        int count1 = 0;
        int letterCount1 = 0;
        int letterCount2 = 0;
        
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Exercise 1 - ");
        System.out.println("Insert characters to be spaced:");
        String input = in.nextLine();
        
        stringList = input.split(" ");
        
        upperCaseRow.setMaxSize(stringList.length);
        lowCaseRow.setMaxSize(stringList.length);    
        
        while(count1 != stringList.length){
            
            char charInput = stringList[count1].charAt(0);
                 
            System.out.println(charInput + " - Will be added");
            
            if(Character.isLowerCase(charInput)){
                lowCaseRow.push(charInput);
            }
            else{
                upperCaseRow.push(charInput);
            }
            
            count1++;
        }
        
        if(upperCaseRow.itens.length > 0){
            while(letterCount1 != upperCaseRow.itens.length - 1){

                char excluido = upperCaseRow.front();

                System.out.println(excluido + " - Will be deleted");

                upperCaseRow.pop();

                letterCount1++;

            }  
        }     
        
        if(lowCaseRow.itens.length > 0){
            while(letterCount2 != lowCaseRow.itens.length){

                char excluido = lowCaseRow.front();

                System.out.println(excluido + " - Will be deleted");

                lowCaseRow.pop();

                letterCount2++;
            }
        }
        
        System.out.println("Exercise 2 - ");
        System.out.println("Insert a number:");
        int inputExercise2 = in.nextInt();
        
        SumNum(inputExercise2, 1, 0);
        
        System.out.println("Exercise 3 - ");
        System.out.println("Insert a number:");
        int inputExercise3 = in.nextInt();
        
        ShowNum(inputExercise3, 1);
        
        System.out.println("Exercise 4 - ");
        System.out.println("Insert a number for the base:");
        int base = in.nextInt();
        
        System.out.println("Insert a number for the expoent:");
        int exp = in.nextInt();
        
        
        RaiseNum(base, exp, 1, 0);
        
    }  
}
