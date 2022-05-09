package io.springboot;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlanservicesController {
	@Autowired
	private PlanRepository repository;
	@GetMapping("recharge/{category}")
	public Optional<PlansAndDetails> getrecharge(@PathVariable String category) {
		return repository.findById(category);
	}
@GetMapping("dishrecharge/{operator}")
public Optional<PlansAndDetails> getdishdeatails(@PathVariable String operator){
	return repository.findById(operator);
	
}
@GetMapping("electricitybill/{userid}")
public Optional<PlansAndDetails>getelectricitybill(@PathVariable String serviceid){
return repository.findById(serviceid);
}
}
