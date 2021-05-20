
public class Kompleti {
	private Letra[] kompleti_i_letrave;
	private int letrat_e_përdorura;
	
	public Kompleti()
	{
		kompleti_i_letrave = new Letra[52];
		int nrLetra = 0;
		for (int shenja = 0; shenja <= 3; shenja++)
		{
			for (int vlera = 1; vlera <= 13; vlera++)
			{
				kompleti_i_letrave[nrLetra++] = new Letra(vlera, shenja);
			}
		}
				
		letrat_e_përdorura = 0;
	}
	
	public void shuffle()
	{
		for (int i = kompleti_i_letrave.length - 1; i > 0; i--)
		{
			int rand = (int) (Math.random() * (i + 1));
			Letra temp = kompleti_i_letrave[i];
			kompleti_i_letrave[i] = kompleti_i_letrave[rand];
			kompleti_i_letrave[rand] = temp;
		}
		letrat_e_përdorura = 0;
	}
	
	public int cardsLeft()
	{
		return kompleti_i_letrave.length - letrat_e_përdorura;
	}
	
	public Letra dealCard()
	{
		if (cardsLeft() == 0) 
			System.out.println("Loja përfundoi! Nuk ka më letra! Lojën e fiton ai që ka më shumë pikë.");
		return kompleti_i_letrave[letrat_e_përdorura++];
	}
}
