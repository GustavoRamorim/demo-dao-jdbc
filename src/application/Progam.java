package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Progam {

	public static void main(String[] args) {

		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		Seller seller = sellerdao.findById(3);
		
		System.out.println(seller);
		
		
		
	}

}
