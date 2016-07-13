public class TVGuide{
	public static void main(String [] args){
		String [] networks = {"CBS", "NBC", "FOX", "ABC", "My9", "HBO"};

		int [] channels = {2,4,5,7,9,400};

	}
	public static int lookupChannel(String target, String [] nets, int [] chan){

		for(int a = 0; a < nets.length; a++)
		{
			if(nets[a].equals(target))
			{
				return chan[a];
			}	
		}
		return -1;	

	}

	public static String reverseLook(int target, String [] nets, int [] chan){
		for(int a = 0; a < chan.length; a++){
			if(chan[a] == target)
			{
				return nets[a];
			}
		}
		return "Chan not found";
	}
}