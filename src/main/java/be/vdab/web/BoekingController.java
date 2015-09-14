package be.vdab.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import be.vdab.entities.Boeking;
import be.vdab.services.LandService;
import be.vdab.services.LuchthavenService;
import be.vdab.services.StadService;

@Controller
@RequestMapping("/boeking")
@SessionAttributes("vluchtinfo")
public class BoekingController {
	private static final String VERTREKLAND_VIEW = "boeking/vertrekland";
	private static final String VERTREKSTAD_VIEW = "boeking/vertrekstad";
	private static final String VERTREKLUCHTHAVEN_VIEW = "boeking/vertrekluchthaven";
	private static final String BESTEMMINGSLAND_VIEW = "boeking/bestemmingsland";
	private static final String BESTEMMINGSSTAD_VIEW = "boeking/bestemmingsstad";
	private static final String BESTEMMINGSLUCHTHAVEN_VIEW = "boeking/bestemmingsluchthaven";
	
	
	private LandService landService;
	private StadService stadService;
	private LuchthavenService luchthavenService;
	
	@Autowired
	public BoekingController(LandService landService, StadService stadService, LuchthavenService luchthavenService) {
		this.landService = landService;
		this.stadService = stadService;
		this.luchthavenService = luchthavenService;
	}
	
	@RequestMapping(path= "/vertrekland",method = RequestMethod.GET)
	ModelAndView createFormVertrekLand(){
		ModelAndView view = new ModelAndView(VERTREKLAND_VIEW);
		view.addObject("landen", landService.findAll());
		view.addObject(new Vluchtinfo());
		return view;
	}
	
	@RequestMapping(path="/vertrekstad", params="landcode")
	ModelAndView createFormVertrekStad(String landcode){
		ModelAndView view = new ModelAndView(VERTREKSTAD_VIEW);
		view.addObject("steden", stadService.findByLandcode(landcode));
		return view;
	}
	
	@RequestMapping(path="/vertrekluchthaven", params="stadid")
	ModelAndView createFormVertrekLuchthaven(long stadid, @ModelAttribute Vluchtinfo vluchtinfo, BindingResult bindingResult){
		ModelAndView view = new ModelAndView(VERTREKLUCHTHAVEN_VIEW);
		view.addObject("luchthavens", luchthavenService.findByStadId(stadid));
		return view;
	}
	
	@RequestMapping(path="/bestemmingsland", method= RequestMethod.GET)
	ModelAndView createFormBestemming(){
		ModelAndView view = new ModelAndView(BESTEMMINGSLAND_VIEW);
		view.addObject("landen", landService.findAll());
		return view;
	}
	
	@RequestMapping(path="/bestemmingsstad", params="landcode")
	ModelAndView createFormBestemmingsStad(String landcode){
		ModelAndView view = new ModelAndView(BESTEMMINGSSTAD_VIEW);
		view.addObject("steden", stadService.findByLandcode(landcode));
		return view;
	}
	
	@RequestMapping(path="/bestemmingsluchthaven", params="stadid")
	ModelAndView createFormBestemmingsLuchthaven(long stadid, @ModelAttribute Vluchtinfo vluchtinfo, BindingResult bindingResult){
		ModelAndView view = new ModelAndView(BESTEMMINGSLUCHTHAVEN_VIEW);
		view.addObject("luchthavens", luchthavenService.findByStadId(stadid));
		return view;
	}
}
