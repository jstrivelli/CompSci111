public class TVGuide{
	public static void main(String [] args){
		String [] networks = {"CBS", "NBC", "FOX", "ABC", "My9", "HBO"};
		System.out.println(lookupChannel("My9",networks));

	}
	public static int lookupChannel(String target, String [] nets){

		for(int a = 0; a < nets.length; a++)
		{
			if(nets[a].equals(target))
			{
				a++:
				return a;
			}	
		}	

	}
}