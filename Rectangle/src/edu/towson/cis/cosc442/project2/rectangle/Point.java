package edu.towson.cis.cosc442.project2.rectangle;

/**
 * The Point Class.
 */
public class Point {
	
	/** x and y coordinates. */
	public Double x, y;
	
	/**
	 * Instantiates a new point.
	 *
	 * @param x the x
	 * @param y the y
	 */
	Point(Double x, Double y) {
		//Changed the statement this.x = y to this.x = x;
		this.x = x;
		this.y = y;
	}
}
