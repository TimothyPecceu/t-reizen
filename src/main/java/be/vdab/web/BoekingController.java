package be.vdab.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import be.vdab.services.LandService;
import be.vdab.services.LuchthavenService;
import be.vdab.services.StadService;

@Controller
@RequestMapping("/boeking")
@SessionAttributes("boeking")
public class BoekingController {
	private static final String VERTREK_LAND_VIEW = "boeking/vertrekland";
	private static final String VERTREK_STAD_VIEW = "boeking/vertrekstad";
	private static final String VERTREK_LUCHTHAVEN_VIEW = "boeking/vertrekluchthaven";
	
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
	ModelAndView createFormLand(){
		ModelAndView view = new ModelAndView(VERTREK_LAND_VIEW);
		view.addObject("landen", landService.findAll());
		return view;
	}
	
	@RequestMapping(path="/vertrekstad", params="landcode")
	ModelAndView createFormLandnaarStad(String landcode){
		ModelAndView view = new ModelAndView(VERTREK_STAD_VIEW);
		view.addObject("steden", stadService.findByLandcode(landcode));
		return view;
	}
	
	@RequestMapping(path="/vertrekluchthaven", params="stadid")
	ModelAndView createFormStadnaarLuchthaven(long stadid){
		ModelAndView view = new ModelAndView(VERTREK_LUCHTHAVEN_VIEW);
		view.addObject("luchthavens", luchthavenService.findByStadId(stadid));
		return view;
	}
}
