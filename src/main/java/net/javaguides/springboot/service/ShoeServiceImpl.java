package net.javaguides.springboot.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.shoe;
import net.javaguides.springboot.repository.ShoeRepository;

@Service
public class ShoeServiceImpl implements ShoeService {
	
	@Autowired
	private ShoeRepository shoerepository;
    
	@Override
	public List<shoe> getAllShoes()
	{
		return shoerepository.findAll();
	}
		
	

	@Override
	public shoe getShoebyId(long id) {
		Optional<shoe> optional =shoerepository.findById(id);
		shoe Shoes=null;
		if(optional.isPresent())
		{
		   Shoes=optional.get();
		}
		else
		{
			throw new RuntimeException("Shoe Not Found for id :: " +id);
		}	
			return Shoes;	
	}
	
	@Override
	public void saveShoes(shoe shoes) {
		this.shoerepository.save(shoes);
		
	}



	@Override
	public void deleteShoeById(long id) {
		// TODO Auto-generated method stub
		this.shoerepository.deleteById(id);
	}
}






	
	
	
    

