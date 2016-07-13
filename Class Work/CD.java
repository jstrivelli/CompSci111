public class CD{

	String albumName;
	String artist;
	double runtime;
	
	public CD(String an, String a, double r){
		
		albumName=an;
		artist = a;
		runtime = r;
	
	}
	
	public double getDuration(){
		return runtime;
	}
	
	public String getArtist(){
		return artist;
	}
	
	public String getAlbumName(){
		return albumName;
	}
}