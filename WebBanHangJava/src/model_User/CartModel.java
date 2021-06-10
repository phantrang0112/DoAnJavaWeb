package model_User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import entities.Item;
import entities.Product;



public class CartModel {
	HashMap<String, Item> cartHashMap;

	public CartModel() {
		cartHashMap = new HashMap<>();

	}

	public CartModel(HashMap<String, Item> cartHashMap) {

		this.cartHashMap = cartHashMap;
	}

	public HashMap<String, Item> getCartHashMap() {
		return cartHashMap;
	}

	public void setCartHashMap(HashMap<String, Item> cartHashMap) {
		this.cartHashMap = cartHashMap;
	}

	public void addlist(String idSP) {
		Item items = new Item();
		Product sanpham = new ProductModel().getProductIdSP(idSP);
		if (sanpham != null && cartHashMap.containsKey(idSP)) {
			items = cartHashMap.get(idSP);
			int count = items.getSoluong();
			count = count + 1;
			items.setSoluong(count);
			
		} else {

			items.setProduct(sanpham);;
			items.setSoluong(1);
			System.out.println("CartModel"+items.getSoluong());

		}
		cartHashMap.put(idSP, items);

	}

	public void removeProduct(String idSP) {
		int a = 0;
		for (Item item : cartHashMap.values()) {
			if (item.getProduct().getIdSP().equals(idSP)) {
				int sl = item.getSoluong();
				item.setSoluong(sl - 1);
				if (item.getSoluong() == 0) {
					cartHashMap.remove(idSP);
				}
			}
		}

	}

	public void removeAll() {
		cartHashMap.clear();
	}

	public int totallist() {
		int total = 0;
//		
		for (Item item : cartHashMap.values()) {

			total = total + (item.getProduct().getGia() * item.getSoluong());
			System.out.println(total+"cartmd");
		}
		return total;
	}

	public List<Item> getlistItems() {
//		Collection<items> valuesCollection= cartHashMap.values();
		List<Item> listItems = new ArrayList<Item>();
//		
		for (Item i : cartHashMap.values()) {
//		for (int i=0;i<cartHashMap.size();i++) {
//			items item= cartHashMap.get(i);
			System.out.println("oc cho");
			System.out.println(i.getProduct().getGia()+i.getSoluong());
			listItems.add(i);
		}
		return listItems;
	}

//	public static void main(String[] args) {
//
//		String a = "SP1";
//		Product sanpham = new ProductModel().getProductmasp(a);
//		CartModel aCartModel = new CartModel();
//		List<Items> bItems = aCartModel.getlistItems();
//		System.out.println("a");
//		// TODO Auto-generated method stub
//		for (int i = 0; i < aCartModel.getlistItems().size(); i++) {
//			System.out.println(bItems.get(i));
//
//		}
//	}

}
