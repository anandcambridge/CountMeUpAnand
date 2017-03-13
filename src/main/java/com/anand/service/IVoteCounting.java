package com.anand.service;

import com.anand.domain.VotingResult;
import com.anand.domain.VotingResultInput;

public interface IVoteCounting {

	public VotingResult countVoting(VotingResultInput votingResultInput);
}
