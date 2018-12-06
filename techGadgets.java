package assignment8p1;
/**Visitable interface
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 8 part 1
 * @since Due - 11/27/18
 */
public interface techGadgets {
	public abstract double accept(techGadgetsVisitor techItems);
	public abstract void display();
}
