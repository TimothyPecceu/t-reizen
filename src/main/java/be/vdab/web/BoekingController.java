package be.vdab.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import be.vdab.entities.Boeking;
import be.vdab.services.LandService;
import be.vdab.services.StadService;

@Controller
@RequestMapping("/boeking")
@SessionAttributes("boeking")
public class BoekingController {
	private static final String VERTREK_LAND_VIEW = "boeking/vertrekland";
	private static final String VERTREK_STAD_VIEW = "boeking/vertrekstad";
	
	private LandService landService;
	private StadService stadService;
	
	@Autowired
	public BoekingController(LandService landService, StadService stadService) {
		this.landService = landService;
		this.stadService = stadService;
	}
	
	@RequestMapping(path= "/vertrekland",method = RequestMethod.GET)
	ModelAndView createFormLand(){
		ModelAndView view = new ModelAndView(VERTREK_LAND_VIEW);
		view.addObject("landen", landService.findAll());
		return view;
	}
	
	@RequestMapping(path="{landcode}/vertrekstad")
	ModelAndView createFormLandnaarStad(@PathVariable String landcode){
		ModelAndView view = new ModelAndView(VERTREK_STAD_VIEW);
		view.addObject("steden", stadService.findByLandcode(landcode));
		return view;
	}
}
