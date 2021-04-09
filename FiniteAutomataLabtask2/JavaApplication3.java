/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total Number of states");
        int nummberOfStates = sc.nextInt();
        System.out.println("Enter character without space");
        String stringCharacters = sc.next();
        char[] ch = new char[stringCharacters.length()];
  
        // Copy character by character into array
        for (int i = 0; i < stringCharacters.length(); i++) {
            ch[i] = stringCharacters.charAt(i);
        }
        
        System.out.print("Enter the number of final states elements you want to store: ");  
        //reading the number of elements from the that we want to enter  
        int n=sc.nextInt();  
        //creates an array in the memory of length 10  
        int[] finalStatesArray = new int[n];  
        System.out.println("Enter the fianl states elements array one by one ");  
        for(int i=0; i<n; i++)  
        {  
        //reading array elements from the user   
        finalStatesArray[i]=sc.nextInt();  
        }
        
        


        int[][] transitionTable = new int[nummberOfStates][stringCharacters.length()];
        
        for(int i=0; i<nummberOfStates;i++)
         {            
            for(int j=0; j<stringCharacters.length();j++)
            {
                if(j==0){
                        System.out.println("Enter state number at position " + "[" + i + "]" + "[" + j + "]");
                        transitionTable[i][j]=sc.nextInt();
                }
                if(j==1){
                        System.out.println("Enter for b column at position " + "[" + i + "]" + "[" + j + "]");
                        transitionTable[i][j]=sc.nextInt();
                }
            }
         }
        
        System.out.println("Enter strings consist of a's and b's");
        String word = sc.next();
        char[] characterArrayOfWord = new char[word.length()];
        // Copy character by character into array
        for (int i = 0; i < word.length(); i++) {
            characterArrayOfWord[i] = word.charAt(i);
        }
        
        int q=0;
        int save = 0;
        for(int p=0; p<characterArrayOfWord.length;p++)
        {
            for(int k=q;k<nummberOfStates;k++)
            {
                for(int j=0; j<1;j++)
                {
                    if(characterArrayOfWord[p]==ch[0])
                    {
                        save = transitionTable[k][j];
                        q= save;
                    }
                    if(characterArrayOfWord[p]==ch[1])
                    {
                        save = transitionTable[k][j+1];
                        q= save;
                    }
                }
                break;
            }
            
        }
        int y;
        for(y=0; y<n; y++)  
        {  
        //reading array elements from the user   
            if(finalStatesArray[y]==save)
            {
                System.out.print("Correct Input");
                break;
            }
            
        }
        
        if(y==n)
        {
            System.out.print("InCorrect Input");
        }
        
        
        
        
        
        
    }
    
}
