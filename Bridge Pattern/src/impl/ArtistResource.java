package impl;

import intf.IResource;
import otherclasses.Artist;

public class ArtistResource implements IResource {

	private Artist artist;
	
	public ArtistResource(Artist artist){
		this.artist = artist;
	}
	
	@Override
	public String snippet() {
		return artist.bio();
	}

	@Override
	public String title() {
		return artist.firstName() + " " + artist.lastName();
	}

	@Override
	public String image() {
		//returns the image
		return null;
	}

	@Override
	public String url() {
		//returns the url
		return null;
	}

}
