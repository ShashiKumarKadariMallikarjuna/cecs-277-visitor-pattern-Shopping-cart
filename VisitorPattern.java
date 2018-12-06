package assignment8p1;
/**class which contains methods required for the functioning of the program(Client)
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 8 part 1
 * @since Due - 11/27/18
 */
import java.util.*;
public class VisitorPattern {
	/**method which adds items into the shopping cart and displays the shopping cart with the total */
	public void shoppingCart() {
		List<techGadgets> items=new ArrayList<techGadgets>();
		items.add(new LaptopComputers(1000.00,"Microsoft Surface" , 1));
		items.add(new LaptopComputers(1000.00,"Dell XPS" , 1));
		items.add(new MobilePhones(800.00, "Apple",1));
		items.add(new MobilePhones(800.00, "Galaxy S8",1));
		items.add(new VideoGames(1000.00, "Sony Playstation", 1));
		items.add(new VideoGames(1000.00, "Microsoft Xbox One", 2));
		System.out.println("Shopping Cart:\n");
		double total=calculatePrice(items);
		System.out.println("Total:  "+total);
	}
	/**method which calculates the total price
	 * @param items list of items in the shopping cart
	 * @return total price of the products in the shopping cart
	 */
	public double calculatePrice(List<techGadgets> items)

	{
		techGadgetsVisitor visitor = new PriceVisitor();
		double sum=0;
		for(techGadgets item:items) {
			item.display();
			sum+=item.accept(visitor);
		}
		return sum;
	}
}
