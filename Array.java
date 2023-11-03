
package dsa;

import java.util.*;

public class Array {
    Scanner sc = new Scanner(System.in);
    int LB = 0;     // LB represent lower bound
    int N = 0;      // N represent No of element in an Array
    int S;          // S represent Size of an Array
    int K;          // K represent Position in an Array
    int Item;       // Item represent 
    int Arr [];     //Decleration of Array
    // Array Constructre 
    
    Array(){
        // Taking input array size from user
        System.out.println("Enter the size of an Array");
        S= sc.nextInt();
        Arr = new int[S];
        arrayMenu();
    }
        void arrayMenu(){
        int option;
        while(true)
        {
            System.out.println("Select What you want to do in  an Array \n 1.Traverse \n 2.Insertion \n 3.Deletion \n 4.Searching \n 5.Exit");
            option = sc.nextInt();
            switch(option)
            {
                case 1 :
                {
                    traverse();
                }
                break;
                case 2 :
                {
                    insertion();
                }
                break;
                case 3 :
                {
                   deletion(); 
                }
                break;
                case 4 :
                {
                    searching();
                    System.out.println("Which Search you want \n 1.Single Search \n 2.Multi Search \n 3.Exit");
                    int search = sc.nextInt();
                    switch(search)
                    {
                        case 1 :
                        {
                            System.out.println("Which Search you want in Single Searching \n 1.Single Linear Search \n 2.Single Binary Search \n 3.Exit");
                            int sop1 = sc.nextInt();
                            switch(sop1)
                            {
                                case 1 :
                                {
                                    singleLinearSearch();
                                }
                                break;
                                case 2 :
                                {
                                    singleBinarySearch();
                                }
                                break;
                                case 3 :
                                {
                                    return;
                                }
                            }
                        }
                        break;
                        case 2 :
                        {
                            System.out.println("Which Search you want in Multi Searching \n 1.Multi Linear Search \n 2.Multi Binary Search \n 3.Exit");
                            int sop2 = sc.nextInt();
                            switch(sop2)
                            {
                                case 1 :
                                {
                                    multiLinearSearch();
                                }
                                break;
                                case 2 :
                                {
                                    multiBinarySearch();
                                }
                                break;
                                case 3 :
                                {
                                    return;
                                }
                            }
                        }
                    }
                }
                break;
                case 5 :
                return;
                default :
                    System.out.println("Invalid Searching");
            }
        }
    }
    // Traverse 
    void traverse()
    {
        //If the number of element in Array is zero then the following statement is execute
        if(N == 0)
        {
            System.out.println("Array Is Empty");
            return;         
        }
        // If Array have element then for loop execute and display the Array
        System.out.print("[");
        for ( int i=LB ; i<=N+LB-1 ; i++ )
        {
            System.out.print(Arr[i] + "\t");
        }
        System.out.print("]");
        return;
    }
    
    // Insertion
    
    void insertion()
    {
        // If the No of Element is equal to the size of an Array then insertion is not possible 
        if(N == S)
        {
            System.out.println("Array Is Full");
            return;
        }
        /* If the No of Element is not equal to the size of an Array 
           then the user input the position where the element will inserted 
           and if statement check the validity of  position */
        System.out.println("Enter the Position Where you Insert Value");
        K = sc.nextInt();
        //
        if((K<LB) || (K>(N+LB)))
        {
            System.out.println("Invalid Position For Insertion");
            return;
        }
        // If the position is valid then again user input the value that will inserted 
        System.out.println("Enter the Value which you want to insert");
        Item = sc.nextInt();
        for (int i = ((N+LB)-1) ; i >= K ; i--){
            Arr[i+1]=Arr[i];
        }
        Arr[K]= Item;
        N++;
        return;
    }
    
    // Deletion
    
    void deletion()
    {
        
    }
    
    // Searching
    void searching()
    {
        //If the number of element in Array is zero then the following statement is execute
        if(N == 0)
        {
            System.out.println("Array Is Empty No searching Possible");
            return;
        }
    }
    // Single Linear Search
    void singleLinearSearch()
    {
        
    }
    
    // Single Binary Search()
    void singleBinarySearch()
    {
        
    }
    
    // Multi Linear Search
    void multiLinearSearch()
    {
        
    }
    
    // Multi Binary Search()
    void multiBinarySearch()
    {
        
    }
}
