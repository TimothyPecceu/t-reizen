package be.vdab.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import be.vdab.entities.Stad;

public interface StadDAO extends JpaRepository<Stad, Long>{
	List<Stad> findByLandCodeLike(String code);
}
