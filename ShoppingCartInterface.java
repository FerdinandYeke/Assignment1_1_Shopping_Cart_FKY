/*@author Ferdinand K. Yeke
 * 
 */
public interface ShoppingCartInterface<T> {
	

	/*
	 * addItem() adds a new item to the shopping cart,
	 * while checking if the newly added item was
	 * successfully added or not.
	 * @param newItem adds a new item
	 */
	public boolean addItem(T aItem);
	//addItem() method ends here
	
	/*
	 * getItemPrice methods gets the specific price
	 * of a single item, while returning the price that
	 * it found.
	 */
	public double getItemPrice();
	//getItemPrice() method ends here
	
	/*
	 * remove method removes the LASTLY added item
	 */
	public T remove();
	//remove() method ends here.
	
	/*
	 * getCurrentItems() method gets and returns 
	 * the number of items that have been added to the 
	 * cart.
	 */
	public T getCurrentItems();
	//getCurrentItems() method ends here
	
	/*
	 * clear() method clears ALL the items in the cart.
	 */
	public void clear();
	//clear() method ends here.
	
	/*
	 * getTotalCartPrice() method gets and returns the 
	 * TOTAL cart price.
	 */
	public float getTotalCartPrice();
	//getTotalCartPrice() method ends here.
	
	/*
	 * getDupli() method gets the amount of a duplicated
	 * item that is in the cart, counts it, and returns 
	 * the amount.
	 */
	public int getDupli(T newItem);
	//getDupli() method ends here.
	
	/*
	 * isEmpty() method checks if the cart is empty or not;
	 * Returns true if it is empty, returns false otherwise.
	 */
	public boolean isEmpty();
	//isEmpty() method ends here
	
	/*
	 * toArray() converts and puts all the items into an 
	 * array.
	 */
	public T[] toArray();
	//toArray() method ends here.

	
}//Class ends here.
