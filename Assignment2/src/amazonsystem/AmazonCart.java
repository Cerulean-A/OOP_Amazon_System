package amazonsystem;

import java.util.ArrayList;

import LabA.Customer;
import LabA.ItemDescription;

// Imported from lab4A. Early import and not edited.

public class AmazonCart {
	
	Customer presentCustomer;
	ArrayList<ItemDescription> itemsDescription = new ArrayList<ItemDescription>();
	float totalValue = 0;
	
	public AmazonCart(Customer presentCustomer) {
		this.customer = presentCustomer;
		}
	
//	public boolean addItemDescription(Item currentItem, int quantity) {
//		ItemDescription singleItem = new ItemDescription(currentItem, quantity);
//		return itemsDescription.add(singleItem);
//	}
	
	public boolean addItemDescription(ItemDescription singleItemDesc) {
//		ItemDescription singleItem = new ItemDescription(currentItem, quantity);
		return itemsDescription.add(singleItemDesc);
	}
	
	private float calcCartSubTotal() {
	    float subtotal = 0.0f;
	    for (ItemDescription listItem : itemsDescription) {
	        subtotal += listItem.calcSubTotal();
	    }
	    return subtotal;
	}
	
	public String toString() {
		return customer.toString() + itemsDescription.toString();
	}
	
	public boolean pay(float payment) {
		return (payment >= calcCartSubTotal());
	}
	
	
	
}
