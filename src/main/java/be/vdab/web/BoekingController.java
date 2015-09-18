package be.vdab.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import be.vdab.services.LandService;
import be.vdab.services.LuchthavenService;
import be.vdab.services.ScheduleService;
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
	private static final String VLUCHTEN_VIEW = "boeking/vluchten";
	
	
	private final LandService landService;
	private final StadService stadService;
	private final LuchthavenService luchthavenService;
	private final ScheduleService scheduleService;
	
	@Autowired
	public BoekingController(LandService landService, StadService stadService, LuchthavenService luchthavenService, ScheduleService scheduleService) {
		this.landService = landService;
		this.stadService = stadService;
		this.luchthavenService = luchthavenService;
		this.scheduleService = scheduleService;
	}
	
	@RequestMapping(path= "/vertrekland",method = RequestMethod.GET)
	ModelAndView createFormVertrekLand(){
		ModelAndView view = new ModelAndView(VERTREKLAND_VIEW);
		view.addObject("landen", landService.findAll());
		view.addObject(new Vluchtinfo());
		return view;
	}
	
	@RequestMapping(method = RequestMethod.POST, params={"landcode","vertrekstad"})
	ModelAndView createFormVertrekStad(String landcode, Vluchtinfo vluchtinfo){
		ModelAndView view = new ModelAndView(VERTREKSTAD_VIEW);
		view.addObject("steden", stadService.findByLandcode(landcode));
		return view;
	}
	
	@RequestMapping(method = RequestMethod.POST, params={"stadid", "vertrekluchthaven"})
	ModelAndView createFormVertrekLuchthaven(long stadid, Vluchtinfo vluchtinfo, BindingResult bindingResult){
		ModelAndView view = new ModelAndView(VERTREKLUCHTHAVEN_VIEW);
		view.addObject("luchthavens", luchthavenService.findByStadId(stadid));
		view.addObject("info", vluchtinfo);
		return view;
	}
	
	@RequestMapping(method = RequestMethod.POST, params="bestemmingsland")
	ModelAndView createFormBestemming(Vluchtinfo vluchtinfo){
		ModelAndView view = new ModelAndView(BESTEMMINGSLAND_VIEW);
		view.addObject("landen", landService.findAll());
		view.addObject("info", vluchtinfo);
		return view;
	}
	
	@RequestMapping(method = RequestMethod.POST, params={"landcode", "bestemmingsstad"})
	ModelAndView createFormBestemmingsStad(String landcode){
		ModelAndView view = new ModelAndView(BESTEMMINGSSTAD_VIEW);
		view.addObject("steden", stadService.findByLandcode(landcode));
		return view;
	}
	
	@RequestMapping(method = RequestMethod.POST, params={"stadid","bestemmingsluchthaven"})
	ModelAndView createFormBestemmingsLuchthaven(long stadid, @ModelAttribute Vluchtinfo vluchtinfo, BindingResult bindingResult){
		ModelAndView view = new ModelAndView(BESTEMMINGSLUCHTHAVEN_VIEW);
		view.addObject("luchthavens", luchthavenService.findByStadId(stadid));
		return view;
	}
	
	@RequestMapping(path="/vluchten")
	ModelAndView showVluchten(@ModelAttribute Vluchtinfo vluchtinfo){
		ModelAndView view = new ModelAndView(VLUCHTEN_VIEW);
		view.addObject("vluchtenSchedule", scheduleService.getVluchten(vluchtinfo.getVertrekLuchthavenCode(), vluchtinfo.getBestemmingsLuchthavenCode(), vluchtinfo.getDatum()));
		return view;
	}
}
