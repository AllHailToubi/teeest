package ma.ensa.controllers;






import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ma.ensa.dao.CommandeDaoImpl;
import ma.ensa.dao.LigneCommandeDao;
import ma.ensa.dao.ProduitDaoImpl;
import ma.ensa.model.Produit;







@Controller
@Component(value="Home")
public class HomeController {
	
	@Autowired
	ProduitDaoImpl dao;
	@Autowired
	CommandeDaoImpl cdao;
	@Autowired
	LigneCommandeDao lcdao;
	
	
	@RequestMapping("/")
	public String home(){
		return "home";
	}
	
@RequestMapping(value = "/produits", method = RequestMethod.GET)
	public ModelAndView vue2(){	
	ModelAndView modelview = new ModelAndView();
	modelview.setViewName("produits");
	modelview.addObject("lp",dao.findAll());
	return modelview;
	}

@RequestMapping(value = "/commandes", method = RequestMethod.GET)
public ModelAndView vue3(){
ModelAndView modelview = new ModelAndView();
modelview.setViewName("commandes");
modelview.addObject("lc",cdao.findAll());
return modelview;
}

@RequestMapping(value = "/details/{idcommande}", method = RequestMethod.GET)
public ModelAndView vue4(@PathVariable("idcommande") int idcommande){
ModelAndView modelview = new ModelAndView();  
modelview.setViewName("details");
modelview.addObject("llc",lcdao.findOne(idcommande));
return modelview;
}

/*@RequestMapping("/ajouterproduit")
  public String traitform(@ModelAttribute Produit produit)
{ return "form";}

@RequestMapping(value ="/addProduit" , method=RequestMethod.POST)
public String addform(@ModelAttribute @Validated Produit produit, BindingResult result,Model model)
 {
  if
}
*/


}
