package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.dto.CustomerDetail;
import com.cg.service.IBankService;

@Controller
public class BankController {
		@Autowired
		IBankService bankServ=null;

		//setters and getters for Saevice interface
		public IBankService getBankServ() {
			return bankServ;
		}

		public void setBankServ(IBankService bankServ) {
			this.bankServ = bankServ;
		}
		
		
		//show accept pancard page
		@RequestMapping(value="/acceptPanCard",method=RequestMethod.GET)
		public String getPanCardPage(Model model) {
			model.addAttribute("qq", new CustomerDetail());
			return "acceptPanCard";
		}
		
		//code for testEligibility for getting loan and printing corresponding response page
		@RequestMapping(value="/testEligibility",method=RequestMethod.POST)
		public String getEligibilityDetails(@ModelAttribute(value="qq") CustomerDetail cd,@RequestParam(value="panCard")String pan,Model model) {
			
			cd=bankServ.findPanCard(pan);
			System.out.println(cd);
			model.addAttribute("panCardd",cd);
			if(cd == null) {
				return "errorPage2";}
			else if (cd.getPanCardNo().equals(pan) && cd.getCibilScore()>=750) {
				model.addAttribute("panCardd",cd);
				return "Success";
				}
			else if(cd.getPanCardNo().equals(pan) && cd.getCibilScore()<750){
				model.addAttribute("panCardd",cd);
				return "errorPage1";
			}
			return "Success";
		}
}
