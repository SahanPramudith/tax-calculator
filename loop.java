import java.util.*;
class loop{
	public static void main (String args []){
		Scanner input = new Scanner (System.in );
		
		 do
			{
							
			
			System.out.println("\t\t\t\t\t______                 _      _____           _ ");
			System.out.println("\t\t\t\t\t| ___ \\               | |    /  ___|         | |      ");
			System.out.println("\t\t\t\t\t| |_/ / __ _ _ __ ___ | | __ \\ `--. _   _ ___| |_ ___ _ __ ___ ");
			System.out.println("\t\t\t\t\t| ___ \\/ _` | '_ ` _ \\| |/ /  `--. \\ | | / __| __/ _ \\ '_ ` _ \\ ");
			System.out.println("\t\t\t\t\t| |_/ / (_| | | | | | |   <  /\\__/ / |_| \\__ \\ ||  __/ | | | | |");
			System.out.println("\t\t\t\t\t\\____/ \\__,_|_| |_| |_|_|\\_\\ \\____/ \\__, |___/\\__\\___|_| |_| |_|");
			System.out.println("\t\t\t\t\t                                      __/ | ");
			System.out.println("\t\t\t\t\t                                     |___/ ");
			System.out.println("\t\t\t\t\t");
			System.out.println("\t\t\t\t\t=========================================================================");
			
			
		L32 :	while (true)
			{
				
			System.out.printf("\t\t\t\t\t%-5s \t\t%-5s","[1] Deposit","[2] Lone");
			System.out.println("");
			System.out.println("");
			System.out.printf("\t\t\t\t\t%-5s \t\t%-5s","[3] Tax","[4] Share Market");
			System.out.println("");
			System.out.println("");
			System.out.printf("\t\t\t\t\t%-5s ","[5] Exit");
			System.out.println("");
			System.out.println("");
			
			System.out.print("Enter an option  continue--> ");
			char a = input.next().toLowerCase() .charAt(0);
			
			if (a=='1')
			{
				L1:	while (true)
					{
					System.out.println("\t\t\t\t\t _____                       _ _   ");
					System.out.println("\t\t\t\t\t|  __ \\                     (_) |  ");
					System.out.println("\t\t\t\t\t| |  | | ___ _ __   ___  ___ _| |_");
					System.out.println("\t\t\t\t\t| |  | |/ _ \\ '_ \\ / _ \\/ __| | __|");
					System.out.println("\t\t\t\t\t| |__| |  __/ |_) | (_) \\__ \\ | |_ ");
					System.out.println("\t\t\t\t\t|_____/ \\___| .__/ \\___/|___/_|\\__|");
					System.out.println("\t\t\t\t\t             | | ");
					System.out.println("\t\t\t\t\t             |_|");
					System.out.println("\t\t\t\t\t=======================================");
					System.out.println("");
					System.out.println("");
					System.out.printf("\t\t\t\t\t%-5s ","[1] Saving account");
					System.out.println("");
					System.out.println("");
					System.out.printf("\t\t\t\t\t%-5s ","[2] Fixed account");
					System.out.println("");
					System.out.println("");
					
					System.out.print("Enter an option  continue-->");
					 a = input.next().toLowerCase() .charAt(0);
						if (a=='1')
							{
								
							L2 : while (true)
								{
										System.out.println("\t\t\t\t\t  _____             _     ");
										System.out.println("\t\t\t\t\t / ____|           (_)                     /\\ ");
										System.out.println("\t\t\t\t\t| (___   __ ___   ___ _ __   __ _ ___     /  \\   ___ ___ ___  _   _ _ __ ");
										System.out.println("\t\t\t\t\t \\___ \\ / _` \\ \\ / / | '_ \\ / _` / __|   / /\\ \\ / __/ __/ _ \\| | | | '_ \\ ");
										System.out.println("\t\t\t\t\t ____) | (_| |\\ V /| | | | | (_| \\__ \\  / ____ \\ (_| (_| (_) | |_| | | | |");
										System.out.println("\t\t\t\t\t|_____/ \\__,_| \\_/ |_|_| |_|\\__, |___/ /_/    \\_\\___\\___\\___/ \\__,_|_| |_|");
										System.out.println("\t\t\t\t\t                             __/ |");
										System.out.println("\t\t\t\t\t                            |___/");
										System.out.println("\t\t\t\t\t==========================================================================================");
										System.out.println("");
										System.out.println("");
								
										System.out.print("\t\t\t\t\t\t Enter your Amounth :  ");
										double amounth=input.nextDouble();
										System.out.print("");
										System.out.print("");
										double permoth=amounth*0.05;
										double year=permoth*12;
								
								
										String n="The interest you get the per month :";
										String n1="The interest you get the per year :";
								
										//System.out.printf("\t\t\t\t\t %-5s %2.2f","");
										System.out.println("");
										System.out.printf(" \t\t\t\t\t\t%-10s%1.2f",n,permoth);
										System.out.println("");
								
										System.out.println("");
										System.out.println("");
										System.out.printf("\t\t\t\t\t\t%-10s%1.2f",n1,year);
								
										System.out.print("");
										System.out.print("");
										
										System.out.print("\nDo you wan to Exit ?");
										a = input.next().toLowerCase() .charAt(0);
									
										if (a =='y')
											{
													break L2;
											}
									}
							}else
							{										
								System.out.print(" \n Enter Invalid number .............! ");
								System.out.print("\n\nDo you wan to Exit ?");
								a = input.next().toLowerCase() .charAt(0);
									
								if (a =='y')
								{
									break L1;
								}	
							}
							
							if (a=='2'){
							
							while (true)
							{
								System.out.println("\t\t\t\t\t ______ _              _       _                      _ _ ");
							System.out.println("\t\t\t\t\t|  ____(_)            | |     | |                    (_) | ");
							System.out.println("\t\t\t\t\t| |__   ___  _____  __| |   __| | ___ _ __   ___  ___ _| |_ ___ ");
							System.out.println("\t\t\t\t\t|  __| | \\ \\/ / _ \\/ _` |  / _` |/ _ \\ '_ \\ / _ \\/ __| | __/ _ \\");
							System.out.println("\t\t\t\t\t| |    | |>  <  __/ (_| | | (_| |  __/ |_) | (_) \\__ \\ | ||  __/");
							System.out.println("\t\t\t\t\t|_|    |_/_/\\_\\___|\\__,_|  \\__,_|\\___| .__/ \\___/|___/_|\\__\\___|");
							System.out.println("\t\t\t\t\t");
							System.out.println("\t\t\t\t\t==========================================================================================");
							System.out.println("\t\t\t\t\t");
							System.out.println("");
							System.out.println("");
							
							System.out.print("\t\t\t\t\t\t your Amounth :  ");
							double amounth1=input.nextDouble();
							
							System.out.println("");
							String n11="The interest you get the per year :";
							double permut1=amounth1*0.08;
							
							System.out.print("\t\t\t\t\t\t your number of year  :  ");
							double year1=input.nextDouble();
							
							System.out.println("");
							System.out.println("");
							
							
						    System.out.printf("\t\t\t\t\t\t%-10s%1.2f",n11,permut1);
							
							System.out.println("\t\t\t\t\t");
							System.out.println("\t\t\t\t\t");
							System.out.println("");
							System.out.print("\nDo you wan to Exit ?");
							a = input.next().toLowerCase() .charAt(0);

							if (a=='y')
								{
									break ;
							}
						}
								
						}
					}
						
////////////////////////////////////////////////////////////////////////////////////////////
					
			}
			if (a=='2')
			{
				while (true)
				{
						System.out.println("\t\t\t\t\t _");
						System.out.println("\t\t\t\t\t| |");
						System.out.println("\t\t\t\t\t| | ___  _ __   ___");
						System.out.println("\t\t\t\t\t| |/ _ \\| '_ \\ / _ \\");
						System.out.println("\t\t\t\t\t| | (_) | | | |  __/");
						System.out.println("\t\t\t\t\t|_|\\___/|_| |_|\\___|");
						System.out.println("\t\t\t\t===========================");
						System.out.println("");
						System.out.println("");
						System.out.printf("\t\t\t\t\t%-5s ","[1] Personal Lone");
						System.out.println("");
						System.out.println("");
						System.out.printf("\t\t\t\t\t%-5s ","[2] Businus Lone");
						System.out.println("\t\t\t\t\t");
						System.out.println("");
						System.out.printf("\t\t\t\t\t%-5s ","[3] Home Eqity Lone");
						System.out.println("");
						System.out.println("");
						System.out.printf("\t\t\t\t\t%-5s ","[4] Car Finace");
						System.out.println("\t\t\t\t\t");
						System.out.println("");
						
						System.out.print("\n\n Enter an option  continue--> ");
						a = input.next().toLowerCase() .charAt(0);
				
				
					if (a=='1')
						{
							while (true)
							{
								System.out.println("\t\t\t\t\t");
									System.out.println("\t\t\t\t\t  _____                                _   _         ");
									System.out.println("\t\t\t\t\t |  __ \\                              | | | |     ");
									System.out.println("\t\t\t\t\t | |__) |__ _ __ ___  ___  _ __   __ _| | | |     ___   __ _ _ __  ");
									System.out.println("\t\t\t\t\t |  ___/ _ \\ '__/ __|/ _ \\| '_ \\ / _` | | | |    / _ \\ / _` | '_ \\ ");
									System.out.println("\t\t\t\t\t | |  |  __/ |  \\__ \\ (_) | | | | (_| | | | |___| (_) | (_| | | | |");
									System.out.println("\t\t\t\t\t |_|   \\___|_|  |___/\\___/|_| |_|\\__,_|_| |______\\___/ \\__,_|_| |_|");
									System.out.println("\t\t\t\t\t");
									System.out.println("\t\t\t\t\t===============================================================================");
																	System.out.println("\t\t\t\t\t");
									
																
								System.out.print("\t\t\t\t\t\t Enter your salary   :  ");
								double sal=input.nextDouble();
								
								System.out.println("\t\t\t\t\t");
								if (sal>50000)
								{
									
									sal*=5;
									System.out.printf("\t\t\t\t\t\t%-10s%1.2f","The maximum amount you can with daraw is ",sal);
									//System.out.print("\t\t\t\t\t\t\t The maximum amount you can with daraw is "+sal);
									System.out.println("\t\t\t\t\t");
									
									System.out.print("\t\t\t\t\t\t Enter your Amounth   :  ");
									double Amounth=input.nextDouble();
									System.out.println("\t\t\t\t\t");
				
				//===========================================================================|	
								if (Amounth<=500000 )
								{
									System.out.print("\t\t\t\t\t\t Enter your Number of month    :  ");
									int numMounth=input.nextInt();
									
									
									if (Amounth >200000 & numMounth>24)
									{
										double r = Amounth*0.15;
										Amounth =Amounth/numMounth;
										double newAmounth =r+Amounth;
										System.out.printf("\t\t\t\t\t\t%-10s%1.2f","You monthly instalment :  ",newAmounth);
									}
	//							//...........................................................
									if (Amounth <200000 & numMounth<24)
									{
										double r = Amounth*0.1;
										Amounth =Amounth/numMounth;
										double newAmounth =r+Amounth;
										System.out.printf("\t\t\t\t\t\t%-10s%1.2f","You monthly instalment :  ",newAmounth);
									}
									
									
								}else{
										System.out.print("\t\t\t\t\t\t Cannot get a lone .....    "); 	
									}
									
								}else
								{
									System.out.print("\t\t\t\t\t\t\t Cannot get a lone .....    ");
								}
							System.out.print("\nDo you wan to Exit ?");
							a = input.next().toLowerCase() .charAt(0);
							
							if (a=='y')
								{
									break L32 ;
							}
						}

				}
						if (a=='2')
						{
						while (true)
						{
									System.out.println("\t\t\t\t\t ____            _                       _             ");
								System.out.println("\t\t\t\t\t|  _ \\          (_)                     | |           ");
								System.out.println("\t\t\t\t\t| |_) |_   _ ___ _ _ __   ___  ___ ___  | |     ___   __ _ _ __  ");
								System.out.println("\t\t\t\t\t|  _ <| | | / __| | '_ \\ / _ \\/ __/ __| | |    / _ \\ / _` | '_ \\ ");
								System.out.println("\t\t\t\t\t| |_) | |_| \\__ \\ | | | |  __/\\__ \\__ \\ | |___| (_) | (_| | | | |");
								System.out.println("\t\t\t\t\t|____/ \\__,_|___/_|_| |_|\\___||___/___/ |______\\___/ \\__,_|_| |_|");
								System.out.println("\t\t\t\t\t");
								System.out.println("\t\t\t\t\t===============================================================================");
								System.out.println("\t\t\t\t\t");
								System.out.println("\t\t\t\t\t");
								
								System.out.print("\t\t\t\t\t\t Enter your incom :  ");
							    double sal1=input.nextDouble();
							//    .................nw......................
							    
							    if (sal1>50000)
							 {
								
								sal1*=5;
								System.out.printf("\t\t\t\t\t\t%-10s%1.2f","The maximum amount you can with daraw is ",sal1);
								//System.out.print("\t\t\t\t\t\t\t The maximum amount you can with daraw is "+sal);
								System.out.println("\t\t\t\t\t");
								
								System.out.print("\t\t\t\t\t\t Enter your Amounth   :  ");
								double bAmounth=input.nextDouble();
								System.out.println("\t\t\t\t\t");
			
			//===========================================================================|	
							if (bAmounth<=500000 )
							{
								System.out.print("\t\t\t\t\t\t Enter your Number of month    :  ");
								int bnumMounth=input.nextInt();
								
								
								if (bAmounth >500000 & bnumMounth>36)
								{
									double br = bAmounth*0.2;
									bAmounth =bAmounth/bnumMounth;
									double bnewAmounth =br+bAmounth;
									System.out.printf("\t\t\t\t\t\t%-10s%1.2f","You monthly instalment :  ",bnewAmounth);
								}
//							//...........................................................
								if (bAmounth <500000 & bnumMounth<36)
								{
									double br = bAmounth*0.15;
									bAmounth =bAmounth/bnumMounth;
									double bnewAmounth =br+bAmounth;
									System.out.printf("\t\t\t\t\t\t%-10s%1.2f","You monthly instalment :  ",bnewAmounth);
								}
								
								
							}else{
									System.out.print("\t\t\t\t\t\t Cannot get a lone .....    "); 	
								}
								
							}else
							{
								System.out.print("\t\t\t\t\t\t\t Cannot get a lone .....    ");
							}
							
							System.out.print("\nDo you wan to Exit ?");
							a = input.next().toLowerCase() .charAt(0);
							
							if (a=='y')
								{
									break L32;
							}
						}
					}
					
							if (a=='3')
							{
								while (true)
								{
									System.out.println("\t\t\t\t\t _    _                        ______            _ _           _        ");
								System.out.println("\t\t\t\t\t| |  | |                      |  ____|          (_) |         | |       ");
								System.out.println("\t\t\t\t\t| |__| | ___  _ __ ___   ___  | |__   __ _ _   _ _| |_ _   _  | |     ___   __ _ _ __  ");
								System.out.println("\t\t\t\t\t|  __  |/ _ \\| '_ ` _ \\ / _ \\ |  __| / _` | | | | | __| | | | | |    / _ \\ / _` | '_ \\ ");
								System.out.println("\t\t\t\t\t| |  | | (_) | | | | | |  __/ | |___| (_| | |_| | | |_| |_| | | |___| (_) | (_| | | | |");
								System.out.println("\t\t\t\t\t|_|  |_|\\___/|_| |_| |_|\\___| |______\\__, |\\__,_|_|\\__|\\__, | |______\\___/ \\__,_|_| |_|");
								System.out.println("\t\t\t\t\t");
								System.out.println("\t\t\t\t\t===================================================================================================");
								System.out.println("\t\t\t\t\t");
								System.out.println("\t\t\t\t\t");
								
									System.out.print("\t\t\t\t\t\t Enter your salary :  ");
									double sal2=input.nextDouble();
							//    .................nw......................
							    
							    if (sal2>50000)
							 {
								
								sal2*=5;
								System.out.printf("\t\t\t\t\t\t%-10s%1.2f","The maximum amount you can with daraw is ",sal2);
								//System.out.print("\t\t\t\t\t\t\t The maximum amount you can with daraw is "+sal);
								System.out.println("\t\t\t\t\t");
								
								System.out.print("\t\t\t\t\t\t Enter your Amounth   :  ");
								double hAmounth=input.nextDouble();
								System.out.println("\t\t\t\t\t");
			
			//===========================================================================|	
							if (hAmounth<=500000 )
							{
								System.out.print("\t\t\t\t\t\t Enter your Number of month    :  ");
								int hnumMounth=input.nextInt();
								
								
								if (hAmounth >50000 & hnumMounth>48)
								{
									double hr = hAmounth*0.08;
									hAmounth =hAmounth/hnumMounth;
									double hnewAmounth =hr+hAmounth;
									System.out.printf("\t\t\t\t\t\t%-10s%1.2f","You monthly instalment :  ",hnewAmounth);
								}
//							//...........................................................
								if (hAmounth <500000 & hnumMounth<36)
								{
									double hr = hAmounth*0.06;
									hAmounth =hAmounth/hnumMounth;
									double hnewAmounth =hr+hAmounth;
									System.out.printf("\t\t\t\t\t\t%-10s%1.2f","You monthly instalment :  ",hnewAmounth);
								}
								
								
							}else{
									System.out.print("\t\t\t\t\t\t Cannot get a lone .....    "); 	
								}
								
							}else
							{
								System.out.print("\t\t\t\t\t\t\t Cannot get a lone .....    ");
							}
							    
							    
							 System.out.print("\nDo you wan to Exit ?");
							a = input.next().toLowerCase() .charAt(0);
							
							if (a=='y')
								{
									break L32 ;
							}
						}
					
					}if (a=='4')
						{
							while (true)
						{
							System.out.println("\t\t\t\t\t");
								System.out.println("\t\t\t\t\t ______ _                              _  ");
								System.out.println("\t\t\t\t\t|  ____(_)                            | |  ");
								System.out.println("\t\t\t\t\t| |__   _ _ __   __ _ _ __   ___ ___  | |     ___   __ _ _ __  ");
								System.out.println("\t\t\t\t\t|  __| | | '_ \\ / _` | '_ \\ / __/ _ \\ | |    / _ \\ / _` | '_ \\ ");
								System.out.println("\t\t\t\t\t| |    | | | | | (_| | | | | (_|  __/ | |___| (_) | (_| | | | |");
								System.out.println("\t\t\t\t\t|_|    |_|_| |_|\\__,_|_| |_|\\___\\___| |______\\___/ \\__,_|_| |_|");
								System.out.println("\t\t\t\t\t");
								System.out.println("\t\t\t\t\t=======================================================================");
								System.out.println("\t\t\t\t\t");
								System.out.println("\t\t\t\t\t");
								
								System.out.print("\t\t\t\t\t\t Enter value of the vehical  :  ");
								double v=input.nextDouble();
								System.out.println("\t\t\t\t\t");
								System.out.print("\t\t\t\t\t\t Enter your Amounth   :  ");
								double vm=input.nextDouble();
								System.out.println("\t\t\t\t\t");
								
								if (vm<12)
								{
									double v1 = v*0.06;
									double b1= v/vm;
									double total1= v1+b1;
										System.out.printf("\t\t\t\t\t\t%-10s%1.2f","You monthly instalment :  ", total1);
								}
								
								if (vm>12&vm<24)
								{
									double v1 = v*0.1;
									double b1= v/vm;
									double total1= v1+b1;
										System.out.printf("\t\t\t\t\t\t%-10s%1.2f","You monthly instalment :  ", total1);
								}
								
								if (vm>12&vm<36)
								{
									double v1 = v*0.14;
									double b1= v/vm;
									double total1= v1+b1;
										System.out.printf("\t\t\t\t\t\t%-10s%1.2f","You monthly instalment :  ", total1);
								}
								
								
								if (vm>36)
								{
									double v1 = v*0.16;
									double b1= v/vm;
									double total1= v1+b1;
										System.out.printf("\t\t\t\t\t\t%-10s%1.2f","You monthly instalment :  ", total1);
								}
								
								   
									System.out.print("\nDo you wan to Exit ?");
									a= input.next().toLowerCase() .charAt(0);
							
							if (a=='y')
								{
									break L32;
							}
						}
					}
					//////////////////////
				
			} 
					
		}
		
		if (a=='3')
		{
			while (true)
			{
				System.out.println("\t\t\t\t\t _______   ");
					System.out.println("\t\t\t\t\t|__   __|      ");
					System.out.println("\t\t\t\t\t   | | __ ___  __");
					System.out.println("\t\t\t\t\t   | |/ _` \\ \\/ /");
					System.out.println("\t\t\t\t\t   | | (_| |>  < ");
					System.out.println("\t\t\t\t\t   |_|\\__,_/_/\\_\\");
					System.out.println("\t\t\t\t\t==========================");
					System.out.println("\t\t\t\t\t");
					System.out.println("\t\t\t\t\t");
					System.out.printf("\t\t\t\t\t%-5s ","[1] Rent Tax");
						System.out.println("");
						System.out.println("");
						System.out.printf("\t\t\t\t\t%-5s ","[2] Income Tax");
						System.out.println("\t\t\t\t\t");
						System.out.println("");
						System.out.printf("\t\t\t\t\t%-5s ","[3] Payble Tax");
						System.out.println("");
						System.out.println("");
						System.out.printf("\t\t\t\t\t%-5s ","[4] Leasing");
						System.out.println("\t\t\t\t\t");
						System.out.println("");
						System.out.print("\n\n Enter an option  continue--> ");
						a = input.next().toLowerCase() .charAt(0);
										
									
						/*System.out.print("\nDo you wan to Exit ?");
						a= input.next().toLowerCase() .charAt(0);
							
						if (a=='y')
							{
								break ;
						}*/
						
					if (a=='1')
						{
							while (true)
							{
								System.out.println("\t\t\t\t\t _____            _     _______         ");
							System.out.println("\t\t\t\t\t|  __ \\          | |   |__   __|");
							System.out.println("\t\t\t\t\t| |__) |___ _ __ | |_     | | __ ___  __");
							System.out.println("\t\t\t\t\t|  _  // _ \\ '_ \\| __|    | |/ _` \\ \\/ /");
							System.out.println("\t\t\t\t\t| | \\ \\  __/ | | | |_     | | (_| |>  < ");
							System.out.println("\t\t\t\t\t|_|  \\_\\___|_| |_|\\__|    |_|\\__,_/_/\\_\\");
							System.out.println("\t\t\t\t\t====================================================");
							System.out.println("\t\t\t\t\t");
							
							
							System.out.println("\t\t\t\t\t");
							
							System.out.print("\t\t\t\t\t\t Enter rent Tax  :  ");
							double rent=input.nextDouble();
							
							if (rent<100000)
							{
								System.out.print("\t\t\t\t\t\t \"You are not required to pay rent tax.\"");
							}else
							{
								rent*=0.05; 
								System.out.println("\t\t\t\t\t");

								System.out.printf("\t\t\t\t\t\t%-10s%1.2f","You have to pay trnt tax  :  ", rent);
							}
							
						System.out.print("\nDo you wan to Exit ?");
						a= input.next().toLowerCase() .charAt(0);
							
						if (a=='y')
							{
								break L32;
						}
							
					}
				}
				if (a=='2')
				{
					while (true)
					{
							System.out.println("\t\t\t\t\t  _____                                  _______      ");
							System.out.println("\t\t\t\t\t |_   _|                                |__   __|        ");
							System.out.println("\t\t\t\t\t   | |  _ __   ___ ___  _ __ ___   ___     | | __ ___  __");
							System.out.println("\t\t\t\t\t   | | | '_ \\ / __/ _ \\| '_ ` _ \\ / _ \\    | |/ _` \\ \\/ /");
							System.out.println("\t\t\t\t\t  _| |_| | | | (_| (_) | | | | | |  __/    | | (_| |>  < ");
							System.out.println("\t\t\t\t\t |_____|_| |_|\\___\\___/|_| |_| |_|\\___|    |_|\\__,_/_/\\_\\");
							System.out.println("\t\t\t\t\t");
							System.out.println("\t\t\t\t\t=====================================================================");
							System.out.println("\t\t\t\t\t");
							System.out.print("\t\t\t\t\t\t Enter you total income per year   :  ");
							double pay1=input.nextDouble();
							double tax1 = 0;
							
							if (pay1<1200000)
							{
								System.out.print("\t\t\t\t\t\t You have to pay income Tax per year   ");
							}else
							{
								System.out.println("\t\t\t\t\t");
								
								if (pay1>3200000  && pay1<=37000000)
								{
									tax1+=(((pay1-3200000)/100)*30);
									pay1=3200000;
								}
								
								if (pay1>2700000 && pay1<=3200000)
								{
									tax1+=(((pay1-2700000)/100)*24);
									pay1=2700000;
									
								}
								
								if (pay1>2200000 && pay1<=2700000 )
								{
									tax1+=(((pay1-2200000)/100)*18);
									pay1=2200000;
								
								}
								
								if (pay1>1700000 && pay1<=2200000 )
								{
									tax1+=(((pay1-1700000)/100)*12);
									pay1=1700000;
								}
								
								if (pay1>1200000 && pay1<=1700000 )
								{
									 tax1+=(((pay1-1200000)/100)*6);
									pay1=1200000;
									
								}

								System.out.printf("\t\t\t\t\t\t%-10s%1.2f","You have to pay trnt tax  :  ",tax1);
								
								System.out.print("\nDo you wan to Exit ?");
								a= input.next().toLowerCase() .charAt(0);
							}
							if (a=='y')
							{
								break L32 ;
							}	
					}
					
					
				}
				if (a=='3')
					{
						while (true)
						{
							System.out.println("\t\t\t\t\t  _____                  _     _        _______          ");
							System.out.println("\t\t\t\t\t |  __ \\                | |   | |      |__   __|  ");
							System.out.println("\t\t\t\t\t | |__) |_ _ _   _  __ _| |__ | | ___     | | __ ___  __ ");
							System.out.println("\t\t\t\t\t |  ___/ _` | | | |/ _` | '_ \\| |/ _ \\    | |/ _` \\ \\/ / ");
							System.out.println("\t\t\t\t\t | |  | (_| | |_| | (_| | |_) | |  __/    | | (_| |>  <  ");
							System.out.println("\t\t\t\t\t |_|   \\__,_|\\__, |\\__,_|_.__/|_|\\___|    |_|\\__,_/_/\\_\\ ");
							System.out.println("\t\t\t\t\t=====================================================================");
							System.out.println("\t\t\t\t\t");
							
							System.out.print("\t\t\t\t\t\t Enter you employee pament per mounth  :  ");
							double pay=input.nextDouble();
							
							
							double tax = 0;
							
							if (pay<100000)
							{
								System.out.print("\t\t\t\t\t\t You are not required to pay Payable tax.  ");
							}else
							{
								System.out.println("\t\t\t\t\t");
								
								if (pay>266667  && pay<=308333)
								{
									tax+=(((pay-266667)/100)*30);
									pay=266667;
								}
								
								if (pay>225000 && pay<=266667)
								{
									tax+=(((pay-225000)/100)*24);
									pay=225000;
									
								}
								
								if (pay>183333 && pay<=225000 )
								{
									tax+=(((pay-183333)/100)*18);
									pay=183333;
								
								}
								
								if (pay>141667 && pay<=183333 )
								{
									tax+=(((pay-141667)/100)*12);
									pay=141667;
								}
								
								if (pay>100000 && pay<=141667 )
								{
									 tax+=(((pay-100000)/100)*6);
									pay=100000;
									
								}

								System.out.printf("\t\t\t\t\t\t%-10s%1.2f","You have to pay trnt tax  :  ",tax);
								
								System.out.println("\t\t\t\t\t");
								System.out.println("\t\t\t\t\t");
								System.out.println("\t\t\t\t\t");
								System.out.println("\t\t\t\t\t");
							
							}
		
							System.out.print("\nDo you wan to Exit ?");
								a= input.next().toLowerCase() .charAt(0);
							
							if (a=='y')
							{
								break L32 ;
							}	
						}
					}
					if (a=='4')
					{
						while (true)
						{
							System.out.println("\t\t\t\t\t _                    _  ");
							System.out.println("\t\t\t\t\t| |                  (_)");
							System.out.println("\t\t\t\t\t| |     ___  __ _ ___ _ _ __   __ _ ");
							System.out.println("\t\t\t\t\t| |    / _ \\/ _` / __| | '_ \\ / _` |");
							System.out.println("\t\t\t\t\t| |___|  __/ (_| \\__ \\ | | | | (_| |");
							System.out.println("\t\t\t\t\t|______\\___|\\__,_|___/_|_| |_|\\__, |");
							System.out.println("\t\t\t\t\t                        __/ |");
							System.out.println("\t\t\t\t\t                       |___/ ");
							System.out.println("\t\t\t\t\t==========================================");
							System.out.println("\t\t\t\t\t");
							
							System.out.print("\t\t\t\t\t\t Enter you the monthly lease payment you can afford   :  ");
							double lee=input.nextDouble();
								System.out.println("\t\t\t\t\t"  );
								
							System.out.print("\t\t\t\t\t\t Enter num of year   :  ");
							double numofyear=input.nextDouble();
							System.out.println("\t\t\t\t\t");
							
							int n = (int)numofyear*12;
							
							System.out.print("\t\t\t\t\t\t Enter annual interrest rate  :  ");
							double interrest=input.nextDouble();
							
							double i= interrest/100;
								   i=i/12;
								   
							double tt = lee/i * (1-(1/Math.pow((1+i),n)));
							System.out.println("\t\t\t\t\t");
							
							System.out.printf("\t\t\t\t\t\t%-10s%1.2f","You can get lease amounth  :  ",tt);
							
							System.out.print("\nDo you wan to Exit ?");
								a= input.next().toLowerCase() .charAt(0);
							
							if (a=='y')
							{
								break L32  ;
							}	
						}
					}
					if (a=='4')
					{
						while (true)
						{
							System.out.println("\t\t\t\t\t _                    _  ");
							System.out.println("\t\t\t\t\t| |                  (_)");
							System.out.println("\t\t\t\t\t| |     ___  __ _ ___ _ _ __   __ _ ");
							System.out.println("\t\t\t\t\t| |    / _ \\/ _` / __| | '_ \\ / _` |");
							System.out.println("\t\t\t\t\t| |___|  __/ (_| \\__ \\ | | | | (_| |");
							System.out.println("\t\t\t\t\t|______\\___|\\__,_|___/_|_| |_|\\__, |");
							System.out.println("\t\t\t\t\t                        __/ |");
							System.out.println("\t\t\t\t\t                       |___/ ");
							System.out.println("\t\t\t\t\t==========================================");
							System.out.println("\t\t\t\t\t");
							
							System.out.print("\t\t\t\t\t\t Enter you the monthly lease payment you can afford   :  ");
							double lee=input.nextDouble();
								System.out.println("\t\t\t\t\t"  );
								
							System.out.print("\t\t\t\t\t\t Enter num of year   :  ");
							double numofyear=input.nextDouble();
							System.out.println("\t\t\t\t\t");
							
							int n = (int)numofyear*12;
							
							System.out.print("\t\t\t\t\t\t Enter annual interrest rate  :  ");
							double interrest=input.nextDouble();
							
							double i= interrest/100;
								   i=i/12;
								   
							double tt = lee/i * (1-(1/Math.pow((1+i),n)));
							System.out.println("\t\t\t\t\t");
							
							System.out.printf("\t\t\t\t\t\t%-10s%1.2f","You can get lease amounth  :  ",tt);
							System.out.print("\nDo you wan to Exit ?");
								a= input.next().toLowerCase() .charAt(0);
							
							if (a=='y')
							{
								break L32  ;
							}	
						}
					}
					
								
							
			
			}
		}
		
		if (a=='4')
		{
			while (true)
			{
				System.out.println("\t\t\t\t\t  _____ _                      __  __            _        _   ");
					System.out.println("\t\t\t\t\t / ____| |                    |  \\/  |          | |      | |  ");
					System.out.println("\t\t\t\t\t| (___ | |__   __ _ _ __ ___  | \\  / | __ _ _ __| | _____| |_ ");
					System.out.println("\t\t\t\t\t \\___ \\| '_ \\ / _` | '__/ _ \\ | |\\/| |/ _` | '__| |/ / _ \\ __|");
					System.out.println("\t\t\t\t\t ____) | | | | (_| | | |  __/ | |  | | (_| | |  |   <  __/ |_ ");
					System.out.println("\t\t\t\t\t|_____/|_| |_|\\__,_|_|  \\___| |_|  |_|\\__,_|_|  |_|\\_\\___|\\__|");
					System.out.println("\t\t\t\t\t=======================================================================");
					System.out.println("\t\t\t\t\t");
					System.out.println("\t\t\t\t\t");
					
					System.out.print("\t\t\t\t\t\t Enter you amount  :  ");
							double sher=input.nextDouble();
							
							double ava = sher/80;
							double  shava= (ava*6)*12;
							
					System.out.println("\t\t\t\t\t");
					
					System.out.printf("\t\t\t\t\t\t%-10s%1.2f","Number of shares available   :  ",ava);
					System.out.println("\t\t\t\t\t");
					System.out.printf("\t\t\t\t\t\t%-10s%1.2f","You can get lease amounth  :  ",shava);
					System.out.print("\nDo you wan to Exit ?");
					a= input.next().toLowerCase() .charAt(0);
							
							if (a=='y')
							{
								break L32  ;
							}	
			}
		}
			}
			

			} while (true);
			
	}
}
