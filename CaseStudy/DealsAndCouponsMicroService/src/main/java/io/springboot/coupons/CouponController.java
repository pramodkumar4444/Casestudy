package io.springboot.coupons;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CouponController {
@Autowired
private CouponRepository repository;
@RequestMapping("/hello")
public String helloworld() {
	return "hello";
}
@PostMapping("/addcoupon")
	public String SaveCoupon(@RequestBody COUPONS coupon) {
		repository.save(coupon);
		return "coupon added";
		
	}
@GetMapping("/findallcoupons")
public List<COUPONS> getCoupons(){
	return repository.findAll();
}
@GetMapping("/findcoupon/{id}")
public Optional<COUPONS> getcoupon(@PathVariable String id) {
	return repository.findById(id);
}
@DeleteMapping("/deletecoupin/{id}")
public String deletecoupon(@PathVariable String id){
	repository.deleteById(id);
	return "deleted";
}
}
