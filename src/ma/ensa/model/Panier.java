package ma.ensa.model;

import java.util.HashMap;
import java.util.Map;

public class Panier {
	Map<Long,LigneCommande> items = new HashMap<Long,LigneCommande>();
	
	public void AjouterItem(Produit produit, int quantite){
		
		LigneCommande Lc = items.get(produit);
		
		if (Lc==null){
			
			
			LigneCommande_PK panier1=new LigneCommande_PK(produit, null);
            LigneCommande Lc1=new LigneCommande(panier1,"Electromenagere Agadir",quantite);
            items.put(produit.getIdproduit(), Lc1);
			
		}
		else
		{ 
			
			int quant=Lc.getQuantite();
			Lc.setQuantite(quantite+quant);
			//items.replace(produit.getIdproduit(), Lc);
			
			
			
			
			
		}
		
		
		
	}
	
    public void RetirerItem(Long IdProduit){
		
    	
    	
    	
    	items.remove(IdProduit);
		
		
	
		
		
		
	}
	

}
