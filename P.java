
import java.util.Scanner;

public class P 
{
        static Scanner Memo = new Scanner (System.in);
 
        static String FName[] = {"Ali","Faisal","Mohammed","Omar","Yasir","Ahmed","Marwan","Hassan",null,null};
        static String LName[] = {"Ismail","Mohammed","Gamal","Sulaiman","Ashraf","Ibrahim","seed","Mahmood",null,null};
        static String Type[] = {"Programmer","Programmer","Programmer","System Analyst","System Analyst","Project Manager","Quality Assurance Engineer","Programmer",null,null};
        static String ID[] = {"3620477031","3620477831","3620495831","3620497831","3620498231","3620499231","3620500031","3620508131",null,null} ;       
        static String Email[] = {"Ail2030@gmail.com","F.A.F2010@gmail.com","Mooody.Gemo@gamil.com","Omar.Kamal@gmail.com","Y_Ali223355@gmail.com","M123M456.I@gmail.com","Marwan.King0@gmail.com","SSS.Mah@gmail.com",null,null};       
        static double BSalary[] = {3000,2500,4500,6500,4000,18000,3500,15000,0,0};
        static int Experience[] = {4,2,7,9,6,16,5,13,0,0};
        static boolean Transferable[] = {false,false,true,true,false,true,false,true,false,false};
       
        static int PM[] = {0,0,0,0,0,35,0,0,0,0}; // only for the Project Manager 
        static double CR[] = {0,0,0,0,0,0.3,0,0,0,0};   // only for the Project Manager 
    
       
    public static void main (String [] args )
    {   
         //int option ;
        //char repeat;
        boolean continuity = true;
        System.out.print("\n .(mmmmmmmmmmmmmmmmmmmmmmmmmmmmmm#____* :=: M^Gemo IT company :=: *____#mmmmmmmmmmmmmmmmmmmmmmmmmmmmmm). ");
        System.out.print("\n Student Name : Mohammed Gamal     ID : 362049583 ");
        System.out.print("\n ");
        System.out.print("\n  __                __   ______    _         _____     _____     ___    ___    ______  ");
        System.out.print("\n  \\#\\      __      /#/  |######|  |#|       /#####\\   /#####\\   |###\\  /###|  |######| ");
        System.out.print("\n   \\#\\    /##\\    /#/   |#|__     |#|      /#/       /#/   \\#\\  |#|\\#\\/#/|#|  |#|__    ");
        System.out.print("\n    \\#\\  /#/\\#\\  /#/    |####|    |#|      ##        ##     ##  |#| \\##/ |#|  |####|   ");
        System.out.print("\n     \\#\\/#/  \\#\\/#/     |#|____   |#|____  \\#\\_____  \\#\\___/#/  |#|  \\/  |#|  |#|____  ");
        System.out.print("\n      \\##/    \\##/      |######|  |######|  \\#####/   \\#####/   |#|      |#|  |######| ");
        System.out.print("\n ");
        
        do
        {
            System.out.print("\n Choose a number of the following :");
            System.out.print("\n (1) Show All employees. \n (2) Calculate total employees Salary. ");
            System.out.print("\n (3) Enter New employee. \n (4) Check email for employees." );
            System.out.print("\n (5) Check the full names of the employees. \n (6) Delete Spcefied employee. ");
            System.out.print("\n (7) Find employee according to specified field. \n (8) Exit. "); 
            System.out.print("\n \n Your choice is : ");

            int option = Memo.nextInt();
            
                while ( option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6 && option != 7 && option != 8 ) 
                {
                    System.out.print("\n Please press either 1,2,3,4,5,6,7 or 8 \n Your choice is : ");
                    option = Memo.nextInt();
                }     
            switch (option) {
                case 1:
                    displayInfoEmp();
                    break;
                case 2:
                    calTotalSalary();
                    break;
                case 3:
                    enterInfoEmp();
                    break;
                case 4:
                    rightEmail();
                    break;
                case 5:
                    checkFullName();
                    break;
                case 6:
                    deleteEmp();
                    break;
                case 7:
                    findSpecificEmp();
                    break;
                case 8:
                    System.out.print("\n \n Do you want to Exit the program ? \n Press 1: Exit  \n Press 0: Stay");
                    
                    do
                    {
                      System.out.print("\n Your choice is : ");
                      int chi = Memo.nextInt();
                      if(chi == 1)
                      {
                      System.out.print(" .(*~mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm~*/Good bye/*~mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm~*). ");
                      System.exit(0);
                      }
                      else if(chi == 0)
                      {
                        break;
                      }
                      else
                      {
                        while ( chi != 1 && chi != 0 )
                        {
                        System.out.print("\n ***### Please press either '1' for Exit or '0' for Stay ###***");
                        System.out.print("\n Your choice is : ");    
                        chi = Memo.nextInt();
                          if(chi == 1)
                          {
                          System.out.print(" .(*~mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm~*/Good bye/*~mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm~*). ");
                          System.exit(0);
                          }
                          else if(chi == 0)
                          {
                            break;
                          }
                        }
                      }
                    }  
                    while(true);
                    
            default:
               break;
            }
                
            System.out.print("\n \n Do you want to Re-Enter the program again ? \n Press 'y' for Yes or 'n' for No");
            System.out.print("\n Your choice is : ");
            char repeat = Memo.next().charAt(0);
            
                while ( repeat != 'y' && repeat != 'n' )
                {
                    System.out.print("\n ***### Please press either 'y' for Yes or 'n' for No ###***");
                    System.out.print("\n Your choice is : ");
                    repeat = Memo.next().charAt(0);
                }            
                
                if ( repeat == 'y' ) 
                {
                        continuity = true;
                }
                else if ( repeat == 'n' )
                {
                        continuity = false;
                    System.out.print(" .(*~mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm~*/Good bye/*~mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm~*). ");      
                }
                else
                {
                      // Do nothing     
                }         
        }
        while ( continuity == true );   
    }
    /*
    #===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===
    ****************************************************************************************************************************************************
    ==#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#=
    */     
          private static void displayInfoEmp() // Method 1 (Show All employees)
        {
            for ( int i = 0 ; i < 10 ; i++ )
            {            
                if ( FName[i] == null && Type[i] == null && BSalary[i] == 0 )
                {
                    break;
                }
                else if ( FName[i] != null && Type[i] != null && BSalary[i] != 0 )
                {
                    System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                    System.out.print("\n    Name : " + FName[i] + " " + LName[i] );
                    System.out.print("\n    ID : " + ID[i] );
                    System.out.print("\n    Email : " + Email[i] );
                    System.out.print("\n    Salary : " + BSalary[i] + " $" );
                    System.out.print("\n    Years of experience : " + Experience[i] + " year/years " );
                    System.out.print("\n    Transferability : " + Transferable[i] );
                    if ( Type[i].equals("Project Manager") )
                    {
                        System.out.print("\n    number of projects that he managed : " + PM[i] );
                        System.out.print("\n    commission rate : " + CR[i] );
                    }
                }
                else
                {
                    // do nothing
                }
            }       
        }
    /*
    #===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===
    ****************************************************************************************************************************************************
    ==#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#=
    */ 
         private static void calTotalSalary() // Method 2 (Calculate total employees Salary) 
        {
            // Total salary = (( basic salary * 5% * years of experience ) + ( basic salary ) 
            System.out.print("\n Please select one of the following : ");
            System.out.print("\n Press 1: Calculate Total Salary for Specific Employee ");
            System.out.print("\n Press 2: Calculate Total Salary for All Employees ");
            System.out.print("\n Your choice is : ");
            
            int select = Memo.nextInt();

                if ( select == 1 )
                {                                   
                    System.out.print("\n Please, Select on of the following : ");
                    
                    for ( int i = 0; i < 9 ; i++ )
                    {
                        if ( FName[i] == null && Type[i] == null && BSalary[i] == 0 )
                        {
                            break;
                        }
                        else if ( FName[i] != null && Type[i] != null && BSalary[i] != 0 )
                        {
                            System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                            System.out.print("\n     Name : " + FName[i] + " " + LName[i] );
                            System.out.print("\n     ID : " + ID[i] );
                            System.out.print("\n     Email : " + Email[i] );
                            System.out.print("\n     Salary : " + BSalary[i] + " $ " );
                            System.out.print("\n     Years of experience : " + Experience[i] + " year/years " );
                            System.out.print("\n     Transferability : " + Transferable[i] );
                            if ( Type[i].equals("Project Manager") )
                            {
                                System.out.print("\n     number of projects that he managed : " + PM[i] );
                                System.out.print("\n     commission rate : " + CR[i] );
                            }                                              
                        }
                    }
                        
                    System.out.print("\n \n Your choice number is : ");
                    int option = Memo.nextInt();                   
                    
                    if ( option == 1 && FName[0] != null && Type[0] != null && BSalary[0] != 0 )
                    {
                        int i = 0;
                        double TotalS = (( BSalary[i] * Experience[i] * 0.5 ) + BSalary[i]);
                        
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n     Name : " + FName[i] + " " + LName[i] );
                        System.out.print("\n     The Total Salary is : " + TotalS + " $ " );
                    }    
                    else if ( option == 2 && FName[1] != null && Type[1] != null && BSalary[1] != 0 )
                    {
                        int i = 1;
                        double TotalS = (( BSalary[i] * Experience[i] * 0.5 ) + BSalary[i]);
                        
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n     Name : " + FName[i] + " " + LName[i] );
                        System.out.print("\n     The Total Salary is : " + TotalS + " $ " );
                    }
                    else if ( option == 3 && FName[2] != null && Type[2] != null && BSalary[2] != 0 )
                    {
                        int i = 2;
                        double TotalS = (( BSalary[i] * Experience[i] * 0.5 ) + BSalary[i]);
                        
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n     Name : " + FName[i] + " " + LName[i] );
                        System.out.print("\n     The Total Salary is : " + TotalS + " $ " );
                    }
                    else if ( option == 4 && FName[3] != null && Type[3] != null && BSalary[3] != 0 )
                    {
                        int i = 3;
                        double TotalS = (( BSalary[i] * Experience[i] * 0.5 ) + BSalary[i]);
                        
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n     Name : " + FName[i] + " " + LName[i] );
                        System.out.print("\n     The Total Salary is : " + TotalS + " $ " );                                
                    }
                    else if ( option == 5 && FName[4] != null && Type[4] != null && BSalary[4] != 0 )
                    {
                        int i = 4;
                        double TotalS = (( BSalary[i] * Experience[i] * 0.5 ) + BSalary[i]);
                        
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n     Name : " + FName[i] + " " + LName[i] );
                        System.out.print("\n     The Total Salary is : " + TotalS + " $ " );
                    }
                    else if ( option == 6 && FName[5] != null && Type[5] != null && BSalary[5] != 0 )
                    {
                        int i = 5;
                        double TotalS = (( BSalary[i] * Experience[i] * 0.5 ) + BSalary[i]);
                        
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n     Name : " + FName[i] + " " + LName[i] );
                        System.out.print("\n     The Total Salary is : " + TotalS + " $ " );
                    }
                    else if ( option == 7 && FName[6] != null && Type[6] != null && BSalary[6] != 0 )
                    {
                        int i = 6;
                        double TotalS = (( BSalary[i] * Experience[i] * 0.5 ) + BSalary[i]);
                        
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n     Name : " + FName[i] + " " + LName[i] );
                        System.out.print("\n     The Total Salary is : " + TotalS + " $ " );
                    }
                    else if ( option == 8 && FName[7] != null && Type[7] != null && BSalary[7] != 0 )
                    {
                        int i = 7;
                        double TotalS = (( BSalary[i] * Experience[i] * 0.5 ) + BSalary[i]);
                        
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n     Name : " + FName[i] + " " + LName[i] );
                        System.out.print("\n     The Total Salary is : " + TotalS + " $ " );
                    }
                    else if( option == 9 && FName[8] != null && Type[8] != null && BSalary[8] != 0 ) 
                    {
                        int i = 8;
                        double TotalS = (( BSalary[i] * Experience[i] * 0.5 ) + BSalary[i]);
                        
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n     Name : " + FName[i] + " " + LName[i] );
                        System.out.print("\n     The Total Salary is : " + TotalS + " $ " );         
                    }
                    else if ( option == 10 && FName[9] != null && Type[9] != null && BSalary[9] != 0 )
                    {
                        int i = 9;
                        double TotalS = (( BSalary[i] * Experience[i] * 0.5 ) + BSalary[i]);
                        
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n     Name : " + FName[i] + " " + LName[i] );
                        System.out.print("\n     The Total Salary is : " + TotalS + " $ " );
                    }
                    else
                    {
                        System.out.print("\n <><>< Sorry, your selection is incorrect !!! ><><> ");
                    }
                }                
                else if ( select == 2 )
                {
                    for ( int i = 0 ; i < 10 ; i++ )
                    {            
                        if ( FName[i] == null && Type[i] == null && BSalary[i] == 0 )
                        {
                            break;
                        }
                        else if ( FName[i] != null && Type[i] != null && BSalary[i] != 0 )
                        {
                            double TotalS = (( BSalary[i] * Experience[i] * 0.5 ) + BSalary[i]);
                        
                            System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                            System.out.print("\n     Name : " + FName[i] + " " + LName[i] );
                            System.out.print("\n     The Total Salary is : " + TotalS + " $ " );
                        }
                        else
                        {
                            // do nothing
                        }
                    }
                }
                else
                {
                    // do nothing
                }            
        } 
    /*
    #===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===
    ****************************************************************************************************************************************************
    ==#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#=
    */ 
        private static void enterInfoEmp() // Method 3 (Enter New employee)
        {
            System.out.print("\n Choose the type of employee : ");
            System.out.print("\n Press 1: Programmer \n Press 2: System Analyst \n Press 3: Quality Assurance Engineer \n Press 4: Project Manager ");
            System.out.print("\n Your choice is : ");
            int choice = Memo.nextInt();
            
            while ( choice != 1 && choice != 2 && choice != 3 && choice != 4 )
            {
                System.out.print("\n Please Choose either (1) or (2) or (3) or (4):");
                System.out.print("\n Press 1: Programmer \n Press 2: System Analyst \n Press 3: Quality Assurance Engineer \n Press 4: Project Manager ");
                System.out.print("\n Your choice is : ");
                choice = Memo.nextInt();
            }
            switch (choice) {
                case 1:
                    {
                        int x = 0;
                        for ( int i = 0 ; i < 10 ; i++ )
                        {
                            if ( FName[i] == null && Type[i] == null && BSalary[i] == 0 )
                            {
                                x = i;
                                break;
                            }
                            else
                            {
                                // do noting
                            }
                        }      
                        Type[x] = "Programmer" ;
                        System.out.print("\n You have chosen a \"Programmer\" ");
                        System.out.print("\n Please enter the following information : ");
                        System.out.print("\n \n 1- First Name : ");
                        FName[x]= Memo.next();
                        System.out.print(" 2- Second Name : ");
                        LName[x] = Memo.next();
                        System.out.print(" 3- ID : ");
                        ID[x] = Memo.next();
                        System.out.print(" 4- Email : ");
                        Email[x] = Memo.next();
                        System.out.print(" 5- Basic Salary : ");
                        BSalary[x] = Memo.nextDouble();
                        System.out.print(" 6- Years of Experience  : ");
                        Experience[x] = Memo.nextInt();
                        System.out.print(" 7- Transferability to Another Location (true) or (false) : ");
                        Transferable[x] = Memo.nextBoolean();
                        System.out.print("\n \n (|||~ Do you want to see your NEW employee information ~|||) ");
                        System.out.print("\n Press y: to see the information \n Press n: to continue the program ");
                        System.out.print("\n Your choice is : ");
                        char option = Memo.next().charAt(0);
                        while ( option != 'y' && option != 'n' )
                        {
                            System.out.print("\n Please Choose either (y) or (n): ");
                            option = Memo.next().charAt(0);
                        }     
                        if ( option == 'y' )
                        {
                            System.out.print("\n \n " + (x+1) + " - Job : " + Type[x]);
                            System.out.print("\n     Name : " + FName[x] + " " + LName[x] );
                            System.out.print("\n     ID : " + ID[x] );
                            System.out.print("\n     Email : " + Email[x] );
                            System.out.print("\n     Salary : " + BSalary[x] + " $" );
                            System.out.print("\n     Years of experience : " + Experience[x] + " year/years " );
                            System.out.print("\n     Transferability : " + Transferable[x] );
                        }
                        else if ( option == 'n' )
                        {
                            System.out.print(" -%- The employee has now been added -%- "); 
                        }
                        else
                        {
                            // do nothing
                        }       
                        break;
                    }
                case 2:
                    {
                        int x = 0;
                        for ( int i = 0 ; i < 10 ; i++ )
                        {
                            if ( FName[i] == null && Type[i] == null && BSalary[i] == 0 )
                            {
                                x = i;
                                break;
                            }
                            else
                            {
                                // do noting
                            }
                        }     
                        Type[x] = "System Analyst" ;
                        System.out.print("\n You have chosen a \"System Analyst\" ");
                        System.out.print("\n Please enter the following information : ");
                        System.out.print("\n \n 1- First Name : ");
                        FName[x]= Memo.next();
                        System.out.print(" 2- Second Name : ");
                        LName[x] = Memo.next();
                        System.out.print(" 3- ID : ");
                        ID[x] = Memo.next();
                        System.out.print(" 4- Email : ");
                        Email[x] = Memo.next();
                        System.out.print(" 5- Basic Salary : ");
                        BSalary[x] = Memo.nextDouble();
                        System.out.print(" 6- Years of Experience  : ");
                        Experience[x] = Memo.nextInt();
                        System.out.print(" 7- Transferability to Another Location (true) or (false) : ");
                        Transferable[x] = Memo.nextBoolean();
                        System.out.print("\n \n (|||~ Do you want to see your NEW employee information ~|||) ");
                        System.out.print("\n Press y: to see the information \n Press n: to continue the program ");
                        System.out.print("\n Your choice is : ");
                        char option = Memo.next().charAt(0);
                        while ( option != 'y' && option != 'n' )
                        {
                            System.out.print("\n Please Choose either (y) or (n): ");
                            option = Memo.next().charAt(0);
                        }     
                        if ( option == 'y' )
                        {
                            System.out.print("\n \n " + (x+1) + " - Job : " + Type[x]);
                            System.out.print("\n     Name : " + FName[x] + " " + LName[x] );
                            System.out.print("\n     ID : " + ID[x] );
                            System.out.print("\n     Email : " + Email[x] );
                            System.out.print("\n     Salary : " + BSalary[x] + " $" );
                            System.out.print("\n     Years of experience : " + Experience[x] + " year/years " );
                            System.out.print("\n     Transferability : " + Transferable[x] );
                        }
                        else if ( option == 'n' )
                        {
                            System.out.print(" -%- The employee has now been added -%- "); 
                        }
                        else
                        {
                            // do nothing
                        }      
                        break;
                    }
                case 3:
                    {
                        int x = 0;
                        for ( int i = 0 ; i < 10 ; i++ )
                        {
                            if ( FName[i] == null && Type[i] == null && BSalary[i] == 0 )
                            {
                                x = i;
                                break;
                            }
                            else
                            {
                                // do noting
                            }
                        }      
                        Type[x] = "Quality Assurance Engineer" ;
                        System.out.print("\n You have chosen a \"Quality Assurance Engineer\" ");
                        System.out.print("\n Please enter the following information : ");
                        System.out.print("\n \n 1- First Name : ");
                        FName[x]= Memo.next();
                        System.out.print(" 2- Second Name : ");
                        LName[x] = Memo.next();
                        System.out.print(" 3- ID : ");
                        ID[x] = Memo.next();
                        System.out.print(" 4- Email : ");
                        Email[x] = Memo.next();
                        System.out.print(" 5- Basic Salary : ");
                        BSalary[x] = Memo.nextDouble();
                        System.out.print(" 6- Years of Experience  : ");
                        Experience[x] = Memo.nextInt();
                        System.out.print(" 7- Transferability to Another Location (true) or (false) : ");
                        Transferable[x] = Memo.nextBoolean();
                        System.out.print("\n \n (|||~ Do you want to see your NEW employee information ~|||) ");
                        System.out.print("\n Press y: to see the information \n Press n: to continue the program ");
                        System.out.print("\n Your choice is : ");
                        char option = Memo.next().charAt(0);
                        while ( option != 'y' && option != 'n' )
                        {
                            System.out.print("\n Please Choose either (y) or (n): ");
                            option = Memo.next().charAt(0);
                        }      
                        if ( option == 'y' )
                        {
                            System.out.print("\n \n " + (x+1) + " - Job : " + Type[x]);
                            System.out.print("\n     Name : " + FName[x] + " " + LName[x] );
                            System.out.print("\n     ID : " + ID[x] );
                            System.out.print("\n     Email : " + Email[x] );
                            System.out.print("\n     Salary : " + BSalary[x] + " $" );
                            System.out.print("\n     Years of experience : " + Experience[x] + " year/years " );
                            System.out.print("\n     Transferability : " + Transferable[x] );
                        }
                        else if ( option == 'n' )
                        {
                            System.out.print(" -%- The employee has now been added -%- "); 
                        }
                        else
                        {
                            // do nothing
                        }       
                        break;
                    }
                case 4:
                    {
                        int x = 0;
                        for ( int i = 0 ; i < 10 ; i++ )
                        {
                            if ( FName[i] == null && Type[i] == null && BSalary[i] == 0 )
                            {
                                x = i;
                                break;
                            }
                            else
                            {
                                // do noting
                            }
                        }     
                        Type[x] = "Project Manager" ;
                        System.out.print("\n You have chosen a \"Project Manager\" ");
                        System.out.print("\n Please enter the following information : ");
                        System.out.print("\n \n 1- First Name : ");
                        FName[x]= Memo.next();
                        System.out.print(" 2- Second Name : ");
                        LName[x] = Memo.next();
                        System.out.print(" 3- ID : ");
                        ID[x] = Memo.next();
                        System.out.print(" 4- Email : ");
                        Email[x] = Memo.next();
                        System.out.print(" 5- Basic Salary : ");
                        BSalary[x] = Memo.nextDouble();
                        System.out.print(" 6- Years of Experience  : ");
                        Experience[x] = Memo.nextInt();
                        System.out.print(" 7- Transferability to Another Location (true) or (false) : ");
                        Transferable[x] = Memo.nextBoolean();
                        System.out.print(" 8- Number of Projects That He Managed : ");
                        PM[x] = Memo.nextInt();
                        System.out.print(" 9- His Commission Rate : ");
                        CR[x] = Memo.nextDouble();
                        System.out.print("\n \n (|||~ Do you want to see your NEW employee information ~|||) ");
                        System.out.print("\n Press y: to see the information \n Press n: to continue the program ");
                        System.out.print("\n Your choice is : ");
                        char option = Memo.next().charAt(0);
                        while ( option != 'y' && option != 'n' )
                        {
                            System.out.print("\nPlease Choose either (y) or (n): ");
                            option = Memo.next().charAt(0);
                        }     
                        if ( option == 'y' )
                        {
                            System.out.print("\n \n " + (x+1) + " - Job : " + Type[x]);
                            System.out.print("\n     Name : " + FName[x] + " " + LName[x] );
                            System.out.print("\n     ID : " + ID[x] );
                            System.out.print("\n     Email : " + Email[x] );
                            System.out.print("\n     Salary : " + BSalary[x] + " $" );
                            System.out.print("\n     Years of experience : " + Experience[x] + " year/years " );
                            System.out.print("\n     Transferability : " + Transferable[x] );
                            System.out.print("\n     number of projects that he managed : " + PM[x] );
                            System.out.print("\n     commission rate : " + CR[x] );
                        }
                        else if ( option == 'n' )
                        {
                            System.out.print(" -%- The employee has now been added -%- "); 
                        }
                        else
                        {
                            // do nothing
                        }     
                        break;
                    }
                default:   
                    break;
            }
        }       
    /*
    #===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===
    ****************************************************************************************************************************************************
    ==#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#=
    */ 
       private static void rightEmail() // Method 4 (Check email for employees)
        {
            for ( int i = 0 ; i < 10 ; i++ )
            {            
                if ( FName[i] == null && Type[i] == null && BSalary[i] == 0 )
                {
                    break;
                }
                else if ( FName[i] != null && Type[i] != null && BSalary[i] != 0 )
                {
                        int x;
                        int y;
                        int sum = 0;
                        int sum2 = 0;
                
                        for ( int j = 0 ; j < Email[i].length() ; j++ )
                        {
                            if ( Email[i].charAt(j) != 64 )
                            {
                                y=0;
                                sum2 += y;
                            }
                            else
                            {
                                y=1;
                                sum2 += y;
                            }
                    
                            if ( Email[i].charAt(j) == 32 )
                            {
                                x = 0;
                                sum += x;
                            }                    
                            else 
                            {
                                x = 1;
                                sum += x;
                            }                                     
                        }                
                
                
                        if ( sum == Email[i].length() && sum2 == 1 )
                        {
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );
                        System.out.print("\n    Email is Right ");
                        }
                        else 
                        {
                            System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                            System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                            
                            System.out.print("\n    Email is (((*WRON*))), Because there is no @ or there are more than one @");
                        }                        
                    
                }
                else
                {
                    // do nothing
                }
                
            }
            System.out.print("\n \n");
            
        } 
    /*
    #===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===
    ****************************************************************************************************************************************************
    ==#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#=
    */ 
         private static void checkFullName() // Method 5 (Check the full names of the employees)
        {
            System.out.print("\n Please determine the following : ");
            System.out.print("\n Press 1 to : Check the names of all employees ");
            System.out.print("\n Press 2 to : Check the name of a particular employee ");
            System.out.print("\n Your choice is : ");
            int choice = Memo.nextInt();
            
            while ( choice != 1 && choice != 2 )
            {
                System.out.print("\n You have entered WRONG input ");
                System.out.print("\n Please Press ethier ( 1 ) or ( 2 ): ");
                System.out.print("\n Your choice is : ");
                choice = Memo.nextInt();
            }
            
            if ( choice == 1 )
            {
                for ( int i = 0 ; i < 10 ; i++ )
                {            
                    if ( FName[i] == null && Type[i] == null && BSalary[i] == 0 )
                    {
                        break;
                    }
                    else if ( FName[i] != null && Type[i] != null && BSalary[i] != 0 )
                    {
                        String first_and_last = (FName[i] + LName[i]);
                        int full_name_length = first_and_last.length();
            
                        if ( full_name_length >= 9 && full_name_length > 0 )
                        {
                            System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                            System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                            
                            System.out.print("\n    Employee has a CORRECT name");
                        }
                        else
                        {
                            System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                            System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                            
                            System.out.print("\n    Employee has a (((*WRON name*))) ");
                        }
                    }
                    else
                    {
                        // do nothing
                    }
                }  
            }
            else if ( choice == 2 )
            {
                System.out.print("\n Please, Select one of the following : ");
                
                for (int i = 0 ; i < 10 ; i++ )
                {
                    if ( FName[i] == null && Type[i] == null && BSalary[i] == 0 )
                    {
                        break;
                    }
                    else if ( FName[i] != null && Type[i] != null && BSalary[i] != 0 )
                    {
                        System.out.print("\n \n " + (i+1) + ". Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] ); 
                    }
                    else
                    { 
                        // do nothing  
                    }
                }
                
                System.out.print("\n \n My choice number is : ");                                    
                int option = Memo.nextInt();
                                           
                if ( option == 1 && FName[0] != null && Type[0] != null && BSalary[0] != 0 )
                {
                    int i = 0;
                    String first_and_last = (FName[i] + LName[i]);
                    int full_name_length = first_and_last.length();
            
                    if ( full_name_length >= 9 && full_name_length > 0 )
                    {
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                        
                        System.out.print("\n    Employee has a CORRECT name");
                    }
                    else
                    {
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                        
                        System.out.print("\n    Employee has a (((*WRON name*))) ");
                    }
                }    
                else if ( option == 2 && FName[1] != null && Type[1] != null && BSalary[1] != 0)
                {
                    int i = 1;
                    String first_and_last = (FName[i] + LName[i]);
                    int full_name_length = first_and_last.length();
            
                    if ( full_name_length >= 9 && full_name_length > 0 )
                    {
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                        
                        System.out.print("\n    Employee has a CORRECT name");
                    }
                    else
                    {
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                        
                        System.out.print("\n    Employee has a (((*WRON name*))) ");
                    }                                
                }
                else if ( option == 3 && FName[2] != null && Type[2] != null && BSalary[2] != 0 )
                {
                    int i = 2;
                    String first_and_last = (FName[i] + LName[i]);
                    int full_name_length = first_and_last.length();
            
                    if ( full_name_length >= 9 && full_name_length > 0 )
                    {
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                        
                        System.out.print("\n    Employee has a CORRECT name");
                    }
                    else
                    {
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                        
                        System.out.print("\n    Employee has a (((*WRON name*))) ");
                    }                               
                }
                else if ( option == 4 && FName[3] != null && Type[3] != null && BSalary[3] != 0)
                {
                    int i = 3;
                    String first_and_last = (FName[i] + LName[i]);
                    int full_name_length = first_and_last.length();
            
                    if ( full_name_length >= 9 && full_name_length > 0 )
                    {
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                        
                        System.out.print("\n    Employee has a CORRECT name");
                    }
                    else
                    {
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                        
                        System.out.print("\n    Employee has a (((*WRON name*))) ");
                    }                                
                }
                else if ( option == 5 && FName[4] != null && Type[4] != null && BSalary[4] != 0 )
                {
                    int i = 4;
                    String first_and_last = (FName[i] + LName[i]);
                    int full_name_length = first_and_last.length();
            
                    if ( full_name_length >= 9 && full_name_length > 0 )
                    {
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                        
                        System.out.print("\n    Employee has a CORRECT name");
                    }
                    else
                    {
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                        
                        System.out.print("\n    Employee has a (((*WRON name*))) ");
                    }                                
                }
                else if ( option == 6 && FName[5] != null && Type[5] != null && BSalary[5] != 0)
                {
                    int i = 5;
                    String first_and_last = (FName[i] + LName[i]);
                    int full_name_length = first_and_last.length();
            
                    if ( full_name_length >= 9 && full_name_length > 0 )
                    {
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                        
                        System.out.print("\n    Employee has a CORRECT name");
                    }
                    else
                    {
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                        
                        System.out.print("\n    Employee has a (((*WRON name*))) ");
                    }                                
                }
                else if ( option == 7 && FName[6] != null && Type[6] != null && BSalary[6] != 0 )
                {
                    int i = 6;
                    String first_and_last = (FName[i] + LName[i]);
                    int full_name_length = first_and_last.length();
            
                    if ( full_name_length >= 9 && full_name_length > 0 )
                    {
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                        
                        System.out.print("\n    Employee has a CORRECT name");
                    }
                    else
                    {
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                        
                        System.out.print("\n    Employee has a (((*WRON name*))) ");
                    }
                }
                else if ( option == 8 && FName[7] != null && Type[7] != null && BSalary[7] != 0)
                {
                    int i = 7;
                    String first_and_last = (FName[i] + LName[i]);
                    int full_name_length = first_and_last.length();
            
                    if ( full_name_length >= 9 && full_name_length > 0 )
                    {
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                        
                        System.out.print("\n    Employee has a CORRECT name");
                    }
                    else
                    {
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                        
                        System.out.print("\n    Employee has a (((*WRON name*))) ");
                    }                                
                }
                else if( option == 9 && FName[8] != null && Type[8] != null && BSalary[8] != 0) 
                {
                    int i = 8;
                    String first_and_last = (FName[i] + LName[i]);
                    int full_name_length = first_and_last.length();
            
                    if ( full_name_length >= 9 && full_name_length > 0 )
                    {
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                        
                        System.out.print("\n    Employee has a CORRECT name");
                    }
                    else
                    {
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                        
                        System.out.print("\n    Employee has a (((*WRON name*))) ");
                    }                                
                }
                 else if( option == 10 && FName[9] != null && Type[9] != null && BSalary[9] != 0) 
                {
                    int i = 9;
                    String first_and_last = (FName[i] + LName[i]);
                    int full_name_length = first_and_last.length();
            
                    if ( full_name_length >= 9 && full_name_length > 0 )
                    {
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                        
                        System.out.print("\n    Employee has a CORRECT name");
                    }
                    else
                    {
                        System.out.print("\n \n " + (i+1) + " - Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );                        
                        System.out.print("\n    Employee has a (((*WRON name*))) ");
                    }                                
                }
                else
                {
                    System.out.print("\n <><>< Sorry, your selection is incorrect !!! ><><> ");
                }   
            }
            else 
            {
                // do nothing
            }
        }
    /*
    #===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===
    ****************************************************************************************************************************************************
    ==#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#=
    */ 
          private static void deleteEmp() // Method 6 (Delete Spcefied employee)
        {
            for (int i = 0 ; i < 10 ; i++ )
            {
                if ( FName[i] == null && Type[i] == null && BSalary[i] == 0 )
                {
                    break;
                }
                else if ( FName[i] != null && Type[i] != null && BSalary[i] != 0 )
                {
                    System.out.print("\n \n " + (i+1) + ". Job : " + Type[i]);
                    System.out.print("\n    Name : " + FName[i] + " " + LName[i] ); 
                }
                else
                { 
                    // do nothing  
                }
            }
        
                System.out.println();
                System.out.print("\n Enter the number of the employee that you want to delete ");
                System.out.print("\n Delete Employee number : ");
                int number = Memo.nextInt();
        
                
                if ( number == 1 ) 
                {
                    for (int i = 0 ; i < 9 ; i++ )
                    {
                        FName[i] = FName[i + 1];
                        LName[i] = LName[i + 1];
                        Type[i] = Type[i + 1];
                        ID[i] = ID[i + 1];
                        Email[i] = Email[i + 1];
                        BSalary[i] = BSalary[i + 1];
                        Experience[i] = Experience[i + 1];
                        Transferable[i] = Transferable[i + 1]; 
                    }
                    
                    for ( int i = 0 ; i < 9 ; i++ )
                    {
                        if ( FName[i] == null && Type[i] == null && BSalary[i] == 0 )                           
                        {
                            break;
                        }
                        else if ( FName[i] != null && Type[i] != null && BSalary[i] != 0 )
                        {
                            System.out.print("\n \n " + (i+1) + ". Job : " + Type[i]);
                            System.out.print("\n    Name : " + FName[i] + " " + LName[i] );
                        }
                        else
                        {
                            // do nothing
                        } 
                    }
                }
                else if ( number == 2 )
                {
                    for (int i = 1 ; i < 9 ; i++ )
                    {
                        FName[i] = FName[i + 1];
                        LName[i] = LName[i + 1];
                        Type[i] = Type[i + 1];
                        ID[i] = ID[i + 1];
                        Email[i] = Email[i + 1];
                        BSalary[i] = BSalary[i + 1];
                        Experience[i] = Experience[i + 1];
                        Transferable[i] = Transferable[i + 1]; 
                    }
                    
                    for ( int i = 0 ; i < 9 ; i++ )
                    {
                        if ( FName[i] == null && Type[i] == null && BSalary[i] == 0 )                           
                        {
                            break;
                        }
                        else if ( FName[i] != null && Type[i] != null && BSalary[i] != 0 )
                        {
                            System.out.print("\n \n " + (i+1) + ". Job : " + Type[i]);
                            System.out.print("\n    Name : " + FName[i] + " " + LName[i] );
                        }
                        else
                        {
                            // do nothing
                        } 
                    }
                }
                else if ( number == 3 )
                {
                    for (int i = 2 ; i < 9 ; i++ )
                    {
                        FName[i] = FName[i + 1];
                        LName[i] = LName[i + 1];
                        Type[i] = Type[i + 1];
                        ID[i] = ID[i + 1];
                        Email[i] = Email[i + 1];
                        BSalary[i] = BSalary[i + 1];
                        Experience[i] = Experience[i + 1];
                        Transferable[i] = Transferable[i + 1]; 
                    }
                    
                    for ( int i = 0 ; i < 9 ; i++ )
                    {
                        if ( FName[i] == null && Type[i] == null && BSalary[i] == 0 )                           
                        {
                            break;
                        }
                        else if ( FName[i] != null && Type[i] != null && BSalary[i] != 0 )
                        {
                            System.out.print("\n \n " + (i+1) + ". Job : " + Type[i]);
                            System.out.print("\n    Name : " + FName[i] + " " + LName[i] );
                        }
                        else
                        {
                            // do nothing
                        } 
                    }
                }
                else if ( number == 4 )
                {
                    for (int i = 3 ; i < 9 ; i++ )
                    {
                        FName[i] = FName[i + 1];
                        LName[i] = LName[i + 1];
                        Type[i] = Type[i + 1];
                        ID[i] = ID[i + 1];
                        Email[i] = Email[i + 1];
                        BSalary[i] = BSalary[i + 1];
                        Experience[i] = Experience[i + 1];
                        Transferable[i] = Transferable[i + 1]; 
                    }
                    
                    for ( int i = 0 ; i < 9 ; i++ )
                    {
                        if ( FName[i] == null && Type[i] == null && BSalary[i] == 0 )                           
                        {
                            break;
                        }
                        else if ( FName[i] != null && Type[i] != null && BSalary[i] != 0 )
                        {
                            System.out.print("\n \n " + (i+1) + ". Job : " + Type[i]);
                            System.out.print("\n    Name : " + FName[i] + " " + LName[i] );
                        }
                        else
                        {
                            // do nothing
                        } 
                    }
                }
                else if ( number == 5 )
                {
                    for (int i = 4 ; i < 9 ; i++ )
                    {
                        FName[i] = FName[i + 1];
                        LName[i] = LName[i + 1];
                        Type[i] = Type[i + 1];
                        ID[i] = ID[i + 1];
                        Email[i] = Email[i + 1];
                        BSalary[i] = BSalary[i + 1];
                        Experience[i] = Experience[i + 1];
                        Transferable[i] = Transferable[i + 1]; 
                    }
                    
                    for ( int i = 0 ; i < 9 ; i++ )
                    {
                        if ( FName[i] == null && Type[i] == null && BSalary[i] == 0 )                           
                        {
                            break;
                        }
                        else if ( FName[i] != null && Type[i] != null && BSalary[i] != 0 )
                        {
                            System.out.print("\n \n " + (i+1) + ". Job : " + Type[i]);
                            System.out.print("\n    Name : " + FName[i] + " " + LName[i] );
                        }
                        else
                        {
                            // do nothing
                        } 
                    }
                }
                else if ( number == 6 )
                {
                    for (int i = 5 ; i < 9 ; i++ )
                    {
                        FName[i] = FName[i + 1];
                        LName[i] = LName[i + 1];
                        Type[i] = Type[i + 1];
                        ID[i] = ID[i + 1];
                        Email[i] = Email[i + 1];
                        BSalary[i] = BSalary[i + 1];
                        Experience[i] = Experience[i + 1];
                        Transferable[i] = Transferable[i + 1]; 
                    }
                    
                    for ( int i = 0 ; i < 9 ; i++ )
                    {
                        if ( FName[i] == null && Type[i] == null && BSalary[i] == 0 )                           
                        {
                            break;
                        }
                        else if ( FName[i] != null && Type[i] != null && BSalary[i] != 0 )
                        {
                            System.out.print("\n \n " + (i+1) + ". Job : " + Type[i]);
                            System.out.print("\n    Name : " + FName[i] + " " + LName[i] );
                        }
                        else
                        {
                            // do nothing
                        } 
                    }
                }
                else if ( number == 7 )
                {
                    for (int i = 6 ; i < 9 ; i++ )
                    {
                        FName[i] = FName[i + 1];
                        LName[i] = LName[i + 1];
                        Type[i] = Type[i + 1];
                        ID[i] = ID[i + 1];
                        Email[i] = Email[i + 1];
                        BSalary[i] = BSalary[i + 1];
                        Experience[i] = Experience[i + 1];
                        Transferable[i] = Transferable[i + 1]; 
                    }
                    
                    for ( int i = 0 ; i < 9 ; i++ )
                    {
                        if ( FName[i] == null && Type[i] == null && BSalary[i] == 0 )                           
                        {
                            break;
                        }
                        else if ( FName[i] != null && Type[i] != null && BSalary[i] != 0 )
                        {
                            System.out.print("\n \n " + (i+1) + ". Job : " + Type[i]);
                            System.out.print("\n    Name : " + FName[i] + " " + LName[i] );
                        }
                        else
                        {
                            // do nothing
                        } 
                    }
                }
                else if ( number == 8 )
                {
                    for (int i = 7 ; i < 9 ; i++ )
                    {
                        FName[i] = FName[i + 1];
                        LName[i] = LName[i + 1];
                        Type[i] = Type[i + 1];
                        ID[i] = ID[i + 1];
                        Email[i] = Email[i + 1];
                        BSalary[i] = BSalary[i + 1];
                        Experience[i] = Experience[i + 1];
                        Transferable[i] = Transferable[i + 1]; 
                    }
                    
                    for ( int i = 0 ; i < 9 ; i++ )
                    {
                        if ( FName[i] == null && Type[i] == null && BSalary[i] == 0 )                           
                        {
                            break;
                        }
                        else if ( FName[i] != null && Type[i] != null && BSalary[i] != 0 )
                        {
                            System.out.print("\n \n " + (i+1) + ". Job : " + Type[i]);
                            System.out.print("\n    Name : " + FName[i] + " " + LName[i] );
                        }
                        else
                        {
                            // do nothing
                        } 
                    }
                }
                else if ( number == 9 )
                {   
                    for (int i = 8 ; i < 10 ; i++ )
                    {
                        FName[i] = FName[i + 1];
                        LName[i] = LName[i + 1];
                        Type[i] = Type[i + 1];
                        ID[i] = ID[i + 1];
                        Email[i] = Email[i + 1];
                        BSalary[i] = BSalary[i + 1];
                        Experience[i] = Experience[i + 1];
                        Transferable[i] = Transferable[i + 1]; 
                    }
                    
                    for ( int i = 0 ; i < 10 ; i++ )
                    {
                        if ( FName[i] == null && Type[i] == null && BSalary[i] == 0 )                           
                        {
                            break;
                        }
                        else if ( FName[i] != null && Type[i] != null && BSalary[i] != 0 )
                        {
                            System.out.print("\n \n " + (i+1) + ". Job : " + Type[i]);
                            System.out.print("\n    Name : " + FName[i] + " " + LName[i] );
                        }
                        else
                        {
                            // do nothing
                        } 
                    }
                }
                else if ( number == 10 )
                {   
                    int i=9;
                        FName[i] = null;
                        LName[i] = null;
                        Type[i] = null;
                        ID[i] = null;
                        Email[i] = null;
                        BSalary[i] = 0.0;
                        Experience[i] = 0;
                        Transferable[i] = false; 
                    
                    
                    for ( int j = 0 ; j < 10 ; j++ )
                    {
                        if ( FName[j] == null && Type[j] == null && BSalary[j] == 0 )                           
                        {
                            break;
                        }
                        else if ( FName[j] != null && Type[j] != null && BSalary[j] != 0 )
                        {
                            System.out.print("\n \n " + (j+1) + ". Job : " + Type[j]);
                            System.out.print("\n    Name : " + FName[j] + " " + LName[j] );
                        }
                        else
                        {
                            // do nothing
                        } 
                    }
                }                
                else
                {
                    System.out.print("\n (((*WRON number*))) You entered a number that does not exist ");
                }
        }     
    /*
    #===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===
    ****************************************************************************************************************************************************
    ==#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#===#=
    */   
         private static void findSpecificEmp() // Method 7 (Find employee according to specified field -search by ID-)
        {
            
                    System.out.print("\n .`.`. Search by ( Employee ID ):- ");
                    System.out.print("\n Enter employee ( ID ) : ");
                    String User_ID = Memo.next();
                    
                    while ( !User_ID.equals(ID[0]) && !User_ID.equals(ID[1]) && !User_ID.equals(ID[2]) && !User_ID.equals(ID[3]) && !User_ID.equals(ID[4]) && !User_ID.equals(ID[5]) && !User_ID.equals(ID[6]) && !User_ID.equals(ID[7]) )
                    {                        
                        System.out.print("\n (|||~ You have entered wrong employee ID ~|||)"); 
                        System.out.print("\n Press y: to try again \n Press n: to continue the program ");
                        System.out.print("\n Your choice is : ");
                        char option = Memo.next().charAt(0);
                        
                        while ( option != 'y' && option != 'n' )
                        {
                            System.out.print("\n (((*WRONG choice*))) ... Please press either ( y ) or ( n ) : "); 
                            System.out.print("\n Press y: to try again \n Press n: to continue the program ");
                            System.out.print("\n Your choice is : ");
                            option = Memo.next().charAt(0);
                        }
                        
                        if ( option == 'y' )
                        {
                            System.out.print("\n The ID is : ");
                            User_ID = Memo.next();
                        }
                        else if ( option == 'n' )
                        {
                            break;
                        }
                        else
                        {
                            // do nothing
                        }
                        
                    }                                       
                    
                    if ( User_ID.equals(ID[0]) )
                    {
                        int i = 0;
                        System.out.print("\n \n    Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );
                        System.out.print("\n    ID : " + ID[i] );
                        System.out.print("\n    Email : " + Email[i] );
                        System.out.print("\n    Salary : " + BSalary[i] + " $" );
                        System.out.print("\n    Years of experience : " + Experience[i] + " year/years " );
                        System.out.print("\n    Transferability : " + Transferable[i] );
                    } 
                    else if ( User_ID.equals(ID[1]) )
                    {
                        int i = 1;
                        System.out.print("\n \n    Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );
                        System.out.print("\n    ID : " + ID[i] );
                        System.out.print("\n    Email : " + Email[i] );
                        System.out.print("\n    Salary : " + BSalary[i] + " $" );
                        System.out.print("\n    Years of experience : " + Experience[i] + " year/years " );
                        System.out.print("\n    Transferability : " + Transferable[i] );
                    }
                    else if ( User_ID.equals(ID[2]) )
                    {
                        int i = 2;
                        System.out.print("\n \n    Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );
                        System.out.print("\n    ID : " + ID[i] );
                        System.out.print("\n    Email : " + Email[i] );
                        System.out.print("\n    Salary : " + BSalary[i] + " $" );
                        System.out.print("\n    Years of experience : " + Experience[i] + " year/years " );
                        System.out.print("\n    Transferability : " + Transferable[i] );
                    }
                    else if ( User_ID.equals(ID[3]) )
                    {
                        int i = 3;
                        System.out.print("\n \n    Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );
                        System.out.print("\n    ID : " + ID[i] );
                        System.out.print("\n    Email : " + Email[i] );
                        System.out.print("\n    Salary : " + BSalary[i] + " $" );
                        System.out.print("\n    Years of experience : " + Experience[i] + " year/years " );
                        System.out.print("\n    Transferability : " + Transferable[i] );
                    }
                    else if ( User_ID.equals(ID[4]) )
                    {
                        int i = 4;
                        System.out.print("\n \n    Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );
                        System.out.print("\n    ID : " + ID[i] );
                        System.out.print("\n    Email : " + Email[i] );
                        System.out.print("\n    Salary : " + BSalary[i] + " $" );
                        System.out.print("\n    Years of experience : " + Experience[i] + " year/years " );
                        System.out.print("\n    Transferability : " + Transferable[i] );
                    }
                    else if ( User_ID.equals(ID[5]) )
                    {
                        int i = 5;
                        System.out.print("\n \n    Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );
                        System.out.print("\n    ID : " + ID[i] );
                        System.out.print("\n    Email : " + Email[i] );
                        System.out.print("\n    Salary : " + BSalary[i] + " $" );
                        System.out.print("\n    Years of experience : " + Experience[i] + " year/years " );
                        System.out.print("\n    Transferability : " + Transferable[i] );
                    }
                    else if ( User_ID.equals(ID[6]) )
                    {
                        int i = 6;
                        System.out.print("\n \n    Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );
                        System.out.print("\n    ID : " + ID[i] );
                        System.out.print("\n    Email : " + Email[i] );
                        System.out.print("\n    Salary : " + BSalary[i] + " $" );
                        System.out.print("\n    Years of experience : " + Experience[i] + " year/years " );
                        System.out.print("\n    Transferability : " + Transferable[i] );
                    }
                    else if ( User_ID.equals(ID[7]) )
                    {
                        int i = 7;
                        System.out.print("\n \n    Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );
                        System.out.print("\n    ID : " + ID[i] );
                        System.out.print("\n    Email : " + Email[i] );
                        System.out.print("\n    Salary : " + BSalary[i] + " $" );
                        System.out.print("\n    Years of experience : " + Experience[i] + " year/years " );
                        System.out.print("\n    Transferability : " + Transferable[i] );
                    }
                    else if ( User_ID.equals(ID[8]) )
                    {
                        int i = 8;
                        System.out.print("\n \n    Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );
                        System.out.print("\n    ID : " + ID[i] );
                        System.out.print("\n    Email : " + Email[i] );
                        System.out.print("\n    Salary : " + BSalary[i] + " $" );
                        System.out.print("\n    Years of experience : " + Experience[i] + " year/years " );
                        System.out.print("\n    Transferability : " + Transferable[i] );                        
                    }
                    else if ( ( User_ID.equals(ID[9]) ) )
                    {
                        int i = 9;
                        System.out.print("\n \n    Job : " + Type[i]);
                        System.out.print("\n    Name : " + FName[i] + " " + LName[i] );
                        System.out.print("\n    ID : " + ID[i] );
                        System.out.print("\n    Email : " + Email[i] );
                        System.out.print("\n    Salary : " + BSalary[i] + " $" );
                        System.out.print("\n    Years of experience : " + Experience[i] + " year/years " );
                        System.out.print("\n    Transferability : " + Transferable[i] );                        
                    }
                    else 
                    {
                        // do nothing
                    }
        }
}