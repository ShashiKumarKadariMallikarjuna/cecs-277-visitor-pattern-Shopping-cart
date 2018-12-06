package assignment8p1;
/** Concrete element class which contains the details of Video games
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 8 part 1
 * @since Due - 11/28/18
 */
public class VideoGames implements techGadgets{
	private int quantity;
	private double cost;
	private String model;
	/**overloaded constructor
	 * @param cost price of the videogame
	 * @param model description 
	 * @param quantity
	 */
	public VideoGames(double cost, String model, int quantity) {
		this.cost=cost;
		this.quantity=quantity;
		this.model=model;
	}
	/**method that returns the price of the videogame
	 * @return price
	 */
	public double getPrice() {
		return cost;
	}
	/**method that returns the description of the videogame
	 * @return description
	 */
	public String getModel() {
		return model;
	}
	/**method that returns the quantity of videogames
	 * @return quantity
	 */
	public int getquantity() {
		return quantity;
	}
	/**method that replaces the old price with the new price
	 * @param cost price
	 */
	public void setPrice(double cost) {
		this.cost=cost;
	}
	/**method that returns the updated price*/
	public double accept(techGadgetsVisitor techItems) {
		return techItems.visit(this);
	}
	/**display method*/
	public void display() {
		System.out.println("Model: "+this.getModel()+"\tquantity: "+this.getquantity()+"\tprice: "+this.getPrice());
	}
}
