package net.javaguides.springboot.service;
import java.util.List;

import net.javaguides.springboot.model.shoe;


public interface ShoeService
{
	List<shoe> getAllShoes();
	void saveShoes(shoe shoes);
	shoe getShoebyId(long id);
	void deleteShoeById(long id);
}






