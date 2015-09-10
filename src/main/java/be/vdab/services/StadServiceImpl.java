package be.vdab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.vdab.dao.StadDAO;
import be.vdab.entities.Stad;

@Service
public class StadServiceImpl implements StadService {
	private final StadDAO stadDAO;
	
	@Autowired
	public StadServiceImpl(StadDAO stadDAO) {
		this.stadDAO = stadDAO;
	}
	
	@Override
	public List<Stad> findByLandcode(String code){
		return stadDAO.findStedenMetLuchthaven(code);
	}
}
