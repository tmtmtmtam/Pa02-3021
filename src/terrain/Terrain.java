package terrain;

import javafx.scene.image.Image;
import units.Unit;

// TODO: You may refer to the Unit classes (Archer, Cavalry, Infantry, Pikeman) for how to setup the Image for the other Terrain classes.
// NOTE: TerrainOutOfBounds is a special case and the code is fully given.

public abstract class Terrain{
	protected final int MOVEMENT_COST;
	protected boolean impassable;
	protected boolean occupied;
	protected Unit occupyingUnit;
	
	public Terrain(int movementCost) {
		MOVEMENT_COST = movementCost;
		impassable = (movementCost == -1)? true : false;
		occupied = false;
		occupyingUnit = null;
	}
	
	public abstract Image getImage();
	
	public int getMovementCost() {
		return MOVEMENT_COST;
	}
	
	public void occupy(Unit occupying) {
		occupyingUnit = occupying;
		occupied = true;
	}
	
	public void unoccupy() {
		occupyingUnit = null;
		occupied = false;
	}
	
	public Unit getOccupyingUnit() {
		return occupyingUnit;
	}
	
	public boolean isOccupied() {
		return occupied;
	}
	
	public boolean isBlocked() {
		return (impassable || occupied);
	}
}