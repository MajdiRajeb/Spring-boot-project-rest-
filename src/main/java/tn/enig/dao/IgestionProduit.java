package tn.enig.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.*;
import tn.enig.model.Produit;

public interface IgestionProduit extends JpaRepository<Produit, Integer> {

	
	@Query("select pdt from Produit pdt where pdt.magasin.id =:x")
	public List<Produit> getAllProduitBymagasinId(@Param("x") Integer id); 

}
