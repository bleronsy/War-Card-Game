import java.util.Scanner;

public class War {
	public static void main (String[] args)
	{
			int luaj;
			luaj = luaj();
	}
		private static int luaj()
		{
			Kompleti kompleti = new Kompleti();
			Letra letraL;
			Letra letraPC;
			int piketL;
			int piketPC;
			String guess;
			kompleti.shuffle();
			piketL = 0;
			piketPC = 0;
			
			while (true)
			{
				System.out.println("Shtypni 'L' per te luajtur");
				Scanner scan = new Scanner(System.in);
				do
				{
					guess = scan.next();
					if(!guess.equals("L"))
						System.out.println("Ju lutem pergjigjuni me L");
				}while (!guess.equals("L"));
				
				letraL = kompleti.dealCard();
				letraPC = kompleti.dealCard();
				System.out.println("Letra e lojtarit është: " + letraL);
				System.out.println("Letra e kompjuterit është: " + letraPC);
				
				if (letraL.getValue() == letraPC.getValue())
				{
					System.out.println("War -->");
					letraL = kompleti.dealCard();
					letraPC = kompleti.dealCard();
					System.out.println("Letra e lojtarit është: xx");
					System.out.println("Letra e kompjuterit është: xx");
					
					letraL = kompleti.dealCard();
					letraPC = kompleti.dealCard();
					System.out.println("Letra e lojtarit është: xx");
					System.out.println("Letra e kompjuterit është: xx");
					
					letraL = kompleti.dealCard();
					letraPC = kompleti.dealCard();
					System.out.println("Letra e lojtarit është: xx");
					System.out.println("Letra e kompjuterit është: xx");
					
					letraL = kompleti.dealCard();
					letraPC = kompleti.dealCard();
					System.out.println("Letra e lojtarit është: " + letraL);
					System.out.println("Letra e kompjuterit është: " + letraPC);
					
					if (letraL.getValue() > letraPC.getValue())
					{
						System.out.println("Lojtari e fiton War");
						piketL = piketL + 8;
					}
					else if(letraL.getValue() < letraPC.getValue())
					{
						System.out.println("Kompjuteri e fiton War");
						piketPC = piketPC + 8;
					}
					
				}
				else if(letraL.getValue() > letraPC.getValue())
				{
					System.out.println("Lojtari e fitoi raundin!");
						piketL = piketL + 2;
				}
				else if(letraL.getValue() < letraPC.getValue())
				{
					System.out.println("Kompjuteri e fitoi raundin");
					piketPC = piketPC + 2;
				}
				
				System.out.println("Lojtari ka " + piketL + " pikë!");
				System.out.println("Kompjuteri ka " + piketPC + " pikë!");
			}
		}
}


