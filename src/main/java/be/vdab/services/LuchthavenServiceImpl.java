package be.vdab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.vdab.dao.LuchthavenDAO;
import be.vdab.entities.Luchthaven;

@Service
public class LuchthavenServiceImpl implements LuchthavenService {
	
	private LuchthavenDAO luchthavenDAO;
	
	@Autowired
	public LuchthavenServiceImpl(LuchthavenDAO luchthavenDAO) {
		this.luchthavenDAO = luchthavenDAO;
	}
	
	@Override
	public List<Luchthaven> findByStadId(long id){
		return luchthavenDAO.findByStadIdLike(id);
	}
	
	@Override
	public Luchthaven read(String code){
		return luchthavenDAO.findOne(code);
	}
}
