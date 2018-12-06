package assignment8p1;
/** Concrete visitor class which contains the offers on gadgets
 * @author Shashi Kumar Kadari Mallikarjuna
 * @version Assignment 8 part 1
 * @since Due - 11/28/18
 */
public class PriceVisitor implements techGadgetsVisitor{
	/**visitor method which returns the discounted price */
	public double visit(techGadgets p) {
		if(p instanceof LaptopComputers) {
			LaptopComputers lc=(LaptopComputers)p;
			if(lc.getModel().equalsIgnoreCase("Microsoft Surface")) {
				System.out.println("You are recieving 20% discount on Microsoft Surface\n");
				lc.setPrice(lc.getPrice()*0.8);
			}
			return lc.getPrice()*lc.getquantity();
		}
		else if(p instanceof MobilePhones) {
			MobilePhones mp=(MobilePhones)p;
			if(mp.getModel().equalsIgnoreCase("Galaxy S8")) {
				System.out.println("You are recieving 20% discount on Galaxy S8\n");
				mp.setPrice(mp.getPrice()*0.8);
			}
			else if(mp.getModel().equalsIgnoreCase("Apple") && mp.getPrice()>400) {
				System.out.println("You are recieving $30 off for the Apple phone which costs more than $400\n");
				mp.setPrice(mp.getPrice()-30.0);
			}
			return mp.getPrice()*mp.getquantity();
		}
		else {
			VideoGames v=(VideoGames)p;
			if(v.getModel().equalsIgnoreCase("Sony Playstation")) {
				System.out.println("You are recieving 20% discount on Sony Playstation\n");
				v.setPrice(v.getPrice()*0.8);
			}
			else if(v.getModel().equalsIgnoreCase("Microsoft Xbox One") && v.getquantity()==2) {
				System.out.println("You are recieving 30% discount on Sony Playstation\n");
				v.setPrice(v.getPrice()*0.7);
			}
			return v.getPrice()*v.getquantity();
		}
	}
}
