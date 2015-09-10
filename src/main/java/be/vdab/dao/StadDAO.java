package be.vdab.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import be.vdab.entities.Stad;

public interface StadDAO extends JpaRepository<Stad, Long>{
	List<Stad> findStedenMetLuchthaven(@Param("landCode") String landcode);
}
