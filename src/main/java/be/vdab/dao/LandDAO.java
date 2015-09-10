package be.vdab.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import be.vdab.entities.Land;

public interface LandDAO extends JpaRepository<Land, String>{
}
