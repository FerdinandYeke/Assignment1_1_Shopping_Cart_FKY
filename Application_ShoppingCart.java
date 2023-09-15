import java.util.Iterator;

public class Application_ShoppingCart extends ArrayBagSHP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Cart_ItemInterface aItem = new ArrayBagSHP<ShoppingCartInterface>();
		Cart_ItemInterface aItem2 = new ArrayBagSHP<String>();
		Cart_ItemInterface aItem3 = new ArrayBagSHP<String>();
		ShoppingCartInterface aCart = new ArrayBagSHP<Object>();
		*/
		ShoppingCartInterface<Object> aCart = new ArrayBagSHP<Object>();
		Cart_ItemInterface aItem = new ArrayBagSHP();
		Cart_ItemInterface aItem2 = new ArrayBagSHP();
		
		aItem.setItemName("Apple");
		aItem.setItemID("OZ2100");
		aItem.setItemPrice(2.00);
		aCart.addItem(aItem);
		
		System.out.println(aCart.getCurrentItems());
		System.out.println(aCart.getTotalCartPrice());
		System.out.println(aCart.getItemPrice());
		System.out.println(aCart.toArray());
		//System.out.println(aCart.remove(aItem));
		
		aItem2.setItemName("Beats Headphones");
		aItem2.setItemID("08343NS");
		aItem2.setItemPrice(50.34);
		aCart.addItem(aItem2);

	}

}
