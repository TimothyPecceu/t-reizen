package be.vdab.services;

import java.util.List;

import be.vdab.entities.Stad;

public interface StadService {
	List<Stad> findByLandcode(String code);
}
