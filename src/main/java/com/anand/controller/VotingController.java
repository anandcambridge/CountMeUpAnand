package com.anand.controller;

import java.time.Duration;
import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anand.domain.VotingResult;
import com.anand.domain.VotingResultInput;
import com.anand.service.IVoteCounting;

@Controller
public class VotingController {

	IVoteCounting voteCounting;
	
    @Autowired
	public void setVoteCounting(IVoteCounting voteCounting) {
		this.voteCounting = voteCounting;
	}

	@RequestMapping(value="/takevoting")
	public String index() {
		return("voting");
	}
	
	@RequestMapping(value="/votingresultinput")
	public String votingResultInput(Model model) {
        model.addAttribute("votingresultinput", new VotingResultInput());
		return("votingresultinput");
	}
	
	@RequestMapping(value="/votingresult", method = RequestMethod.POST)
	public String votingResult(VotingResultInput votingResultInput, Model model) {
		Instant start = Instant.now();
		System.out.println(votingResultInput.toString());
		VotingResult votingResult = voteCounting.countVoting(votingResultInput);
        model.addAttribute("votingresult", votingResult);
        Instant end = Instant.now();
        System.out.println("Total druation:" + Duration.between(start, end));
		return("votingresult");
	}
}
