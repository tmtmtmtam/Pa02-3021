package terrain;

import javafx.scene.image.Image;
import pa1.GameApplication;

// TODO: Also setup the Images for Water Animation.
// Use "static {}" to initialize static fields.
// You may change ANIM_TIME_PER_FRAME to your own preference.
// Refer to Lab 12.

public class Water extends Terrain{
	private final static Image IMAGE_WATER;
	public final static int NUM_ANIM_FRAMES = 4;
	private final static Image[] ANIM_FRAMES;
	public final static int ANIM_TIME_PER_FRAME = 500;
	
	static {
		ANIM_FRAMES = new Image[Water.NUM_ANIM_FRAMES];
		for(int i = 0; i < Water.NUM_ANIM_FRAMES; i++)
			ANIM_FRAMES[i] = new Image("terrain_images/water" + (i + 1) + ".png", GameApplication.TILE_WIDTH, GameApplication.TILE_HEIGHT, true, true);
		IMAGE_WATER = ANIM_FRAMES[0];
	}
	
	public Water() {
		super(-1);	
	}
	
	public Image getImage() {
		return Water.IMAGE_WATER;
	}
	
	public Image getAnimFrame(int index) {
		return Water.ANIM_FRAMES[index];
	}
}