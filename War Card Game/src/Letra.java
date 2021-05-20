public class Letra {
	public final static int LOPATA = 0;
	public final static int ZEM�R = 1;
	public final static int DIAMANT = 2;
	public final static int DETELIN� = 3;
	
	public final static int ASI = 1;
	public final static int FANTI = 11;
	public final static int MBRET�RESHA = 12;
	public final static int MBRETI = 13;
	
	private final int shenja;
	private final int vlera;
	

	public Letra(int Vlera, int Shenja)
	{
		if (Shenja != LOPATA && Shenja != ZEM�R && Shenja != DIAMANT && Shenja != DETELIN�)
			throw new IllegalArgumentException("Illegal playing card suit");
		if (Vlera < 1 || Vlera > 13)
			throw new IllegalArgumentException("Illegal playing card value");
		vlera = Vlera;
		shenja = Shenja;
	}
	public int getSuit()
	{
		return shenja;
	}
	
	public int getValue()
	{
		return vlera;
	}
	
	public String getSuitAsString()
	{
		switch (shenja)
		{
		case LOPATA:
		return "Lopata";
		case ZEM�R:
		return "Zem�r";
		case DIAMANT:
		return "Diamant";
		case DETELIN�:
		return "Detelin�";
		default:
			return "";
		}
	}
	
	public String getValueAsString()
	{
			switch(vlera)
			{
			case 1:
				return "Asi";
			case 2:
				return "2";
			case 3:
				return "3";
			case 4:
				return "4";
			case 5:
				return "5";
			case 6:
				return "6";
			case 7:
				return "7";
			case 8:
				return "8";
			case 9:
				return "9";
			case 10:
				return "10";
			case 11:
				return "Fanti";
			case 12:
				return "Mbret�resha";
			default:
				return "Mbreti";
			}
	}
	
	public String toString()
	{
		return getValueAsString() + " me " + getSuitAsString();
	}
	
}
