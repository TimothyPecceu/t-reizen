package be.vdab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import be.vdab.dao.LandDAO;
import be.vdab.entities.Land;

@Service
public class LandServiceImpl implements LandService {
	private final LandDAO landDAO;
	
	@Autowired
	public LandServiceImpl(LandDAO landDAO) {
		this.landDAO = landDAO;
	}
	
	@Override
	public List<Land> findAll(){
		return landDAO.findAll(new Sort("naam"));
	}
}
