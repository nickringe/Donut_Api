package grandcircus.co.donutAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@Autowired
	DonutService ds;
	
	@RequestMapping("/")
	public String displayHome(Model model) {
		model.addAttribute("donuts", ds.getAllDonuts());
		return "index";
	}
	
	@RequestMapping("/details")
	public String displayDetails(Model model,@RequestParam int id) {
		model.addAttribute("donut", ds.getDonutById(id));
		return "details";
	}
	

}
