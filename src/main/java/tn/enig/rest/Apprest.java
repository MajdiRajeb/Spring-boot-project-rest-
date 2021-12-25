package tn.enig.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.enig.dao.IgestionMagasin;
import tn.enig.dao.IgestionProduit;
import tn.enig.model.Magasin;
import tn.enig.model.Produit;

@RestController
public class Apprest {
	

		
		@Autowired
		IgestionProduit daop ;
		@Autowired
		IgestionMagasin daom;
		public void setDaop(IgestionProduit daop) {
			this.daop = daop;
		}
		public void setDaom(IgestionMagasin daom) {
			this.daom = daom;
		}

		@GetMapping("/magasin")
		 
			public List<Magasin> get1()
		{
			
			return daom.findAll(); 
		}
		
		@GetMapping("/produit")
		 
		public List<Produit> get2()
	{
		
		return daop.findAll(); 
	}
		@PostMapping("/ajouterproduit")
		public void addp(@RequestBody Produit pdt) {
			daop.save(pdt);
			
		}
		@PostMapping("/ajoutermagasin")
		public void addmag(@RequestBody Magasin mag) {
			daom.save(mag);
			
		}
		@DeleteMapping("/deleteproduit/{id}")
		public void delpdt(@PathVariable("id") int id) {
			daop.deleteById(id);
		}
		@DeleteMapping("/deletemagasin/{id}")
		public void delmag(@PathVariable("id") int id) {
			daom.deleteById(id);
		}
	}


