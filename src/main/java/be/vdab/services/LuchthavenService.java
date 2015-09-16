package be.vdab.services;

import java.util.List;

import be.vdab.entities.Luchthaven;

public interface LuchthavenService {
	List<Luchthaven> findByStadId(long stadid);
	Luchthaven read(String code);
}
