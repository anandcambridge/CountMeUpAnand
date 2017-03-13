package com.anand.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.stereotype.Service;

import com.anand.domain.VotingResult;
import com.anand.domain.VotingResultInput;

@Service
public class VoteCountingImpl implements IVoteCounting {

	private static final int THREAD_POOL_COUNT = 5;
	
	@Override
	public VotingResult countVoting(VotingResultInput votingResultInput) {
//		long totalVote = votingResultInput.getTotalVote();
//		int votePercentageCandidate1 = votingResultInput.getVotePercentageCandidate1();
		
		VotingResult result = new VotingResult();
		ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_COUNT);
		for (int i=1; i<=5; i++) {
			executorService.execute(new CandiateVoteCount(votingResultInput, result, i));
		}
		/*calculateCandiateVoteCount(votingResultInput, result, 1);
		calculateCandiateVoteCount(votingResultInput, result, 2);
		calculateCandiateVoteCount(votingResultInput, result, 3);
		calculateCandiateVoteCount(votingResultInput, result, 4);
		calculateCandiateVoteCount(votingResultInput, result, 5);*/
		executorService.shutdown();
		while (!executorService.isTerminated()) {
			//wait until all tasks are completed
		}
		return result;
	}

	private class CandiateVoteCount implements Runnable {
		VotingResultInput votingResultInput;
		VotingResult votingResult;
		int candidate;
		
		public CandiateVoteCount(VotingResultInput votingResultInput, VotingResult votingResult, int candidate) {
			this.votingResultInput = votingResultInput;
			this.votingResult = votingResult;
			this.candidate = candidate;
		}

		@Override
		public void run() {
			calculateCandiateVoteCount(votingResultInput, votingResult, candidate);
		}
		
	}
	private void calculateCandiateVoteCount(VotingResultInput votingResultInput, VotingResult result, int candiateIndex) {
		long totalVote = votingResultInput.getTotalVote();
		switch (candiateIndex) {
		case 1:
			int votePercentageCandidate1 = votingResultInput.getVotePercentageCandidate1();
			long voteCountCandidate1 = getVoteCount(totalVote, votePercentageCandidate1);
			result.setVoteCountCandidate1(voteCountCandidate1);
			break;
		case 2:
			int votePercentageCandidate2 = votingResultInput.getVotePercentageCandidate2();
			long voteCountCandidate2 = getVoteCount(totalVote, votePercentageCandidate2);
			result.setVoteCountCandidate2(voteCountCandidate2);
			break;
		case 3:
			int votePercentageCandidate3 = votingResultInput.getVotePercentageCandidate3();
			long voteCountCandidate3 = getVoteCount(totalVote, votePercentageCandidate3);
			result.setVoteCountCandidate3(voteCountCandidate3);
			break;
		case 4:
			int votePercentageCandidate4 = votingResultInput.getVotePercentageCandidate4();
			long voteCountCandidate4 = getVoteCount(totalVote, votePercentageCandidate4);
			result.setVoteCountCandidate4(voteCountCandidate4);
			break;
		case 5:
			int votePercentageCandidate5 = votingResultInput.getVotePercentageCandidate5();
			long voteCountCandidate5 = getVoteCount(totalVote, votePercentageCandidate5);
			result.setVoteCountCandidate5(voteCountCandidate5);
			break;

		default:
			break;
		}
	}

	protected long getVoteCount(long totalVote, int votePercentage) {
		long result = 0;
		if (totalVote <= 0 || votePercentage <= 0) {
			return result;
		}
		
		result = (totalVote * votePercentage)/100;
		return result;
	}
}
