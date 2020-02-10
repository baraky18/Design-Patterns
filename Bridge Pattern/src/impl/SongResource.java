package impl;

import intf.IResource;
import otherclasses.Song;

public class SongResource implements IResource {

	private Song song;
	
	public SongResource(Song song){
		this.song = song;
	}
	
	@Override
	public String snippet() {
		//returns the snippet
		return null;
	}

	@Override
	public String title() {
		//returns the title
		return null;
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
