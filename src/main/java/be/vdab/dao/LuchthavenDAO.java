package be.vdab.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import be.vdab.entities.Luchthaven;

public interface LuchthavenDAO extends JpaRepository<Luchthaven, String>{
	List<Luchthaven> findByStadIdLike(long id);
}
