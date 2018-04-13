package ma.ensa.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ma.ensa.model.Produit;

@Component("ProduitValid")
public class ProduitValid implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return Produit.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object objects, Errors errors) {
		Produit produit = (Produit) objects;
		if(produit.getIdproduit() == 0){
			errors.rejectValue("idproduit", "error Idproduit");
		}
		if(produit.getDescription().length() >5){
			errors.rejectValue("description", "error description");
		}
		if(produit.getPrix() == 0){
			errors.rejectValue("prix", "error prix");
		}

	}

}
