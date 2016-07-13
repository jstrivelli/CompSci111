public class CDCatalog
{
	public static void main(String [] args)
	{
		CD [] catalog = new CD[100];
		String name = "";
		String artist = "";
		double dur = 0.0;
		int count = 0;
		do
		{
			name = IO.readString();
			artist = IO.readString();
			dur = IO.readDouble();

			CD c = new CD(name, artist, dur);

			add(catalog, c, count);
			count++;

		} while (name.equals("exit"));

	}

	
	public static boolean add(CD [] cat, CD c, int i)
	{
		if(i < cat.length)
		{
			cat[i] = c;
			return true;
		}	
		else
			return false;
	}
	public static boolean add(CD[] cat, CD c)
	{
		for(int a = 0; a < cat.length; a++)
		{
			
			if(cat[a] == null)
			{
				cat[a] = c;
				return true;
			}	
		}	
		return false;
	}
	
	public static double calcDuration(CD [] cat)
	{
		double total = 0;
		for(int i = 0; i < cat.length; i++)
		{
			if(cat[i] != null)
			total = cat[i].getDuration() + total;
			else
				break;
		}	
		return total;
	}
	public static boolean search(CD [] cat, String albumName)
	{
		for(int i = 0; i < cat.length; i++)
		{
			if(cat[i] == null)
				return false;
			if(albumName.equalsIgnoreCase(cat[i].getAlbumName() ))
			{
				return true;
			}		
		}	
		return false
	}
}