package com.anand.domain;

public class VotingResultInput {

	long totalVote;
	int votePercentageCandidate1;
	int votePercentageCandidate2;
	int votePercentageCandidate3;
	int votePercentageCandidate4;
	int votePercentageCandidate5;
	
	public long getTotalVote() {
		return totalVote;
	}
	public void setTotalVote(long totalVote) {
		this.totalVote = totalVote;
	}
	public int getVotePercentageCandidate1() {
		return votePercentageCandidate1;
	}
	public void setVotePercentageCandidate1(int votePercentageCandidate1) {
		this.votePercentageCandidate1 = votePercentageCandidate1;
	}
	public int getVotePercentageCandidate2() {
		return votePercentageCandidate2;
	}
	public void setVotePercentageCandidate2(int votePercentageCandidate2) {
		this.votePercentageCandidate2 = votePercentageCandidate2;
	}
	public int getVotePercentageCandidate3() {
		return votePercentageCandidate3;
	}
	public void setVotePercentageCandidate3(int votePercentageCandidate3) {
		this.votePercentageCandidate3 = votePercentageCandidate3;
	}
	public int getVotePercentageCandidate4() {
		return votePercentageCandidate4;
	}
	public void setVotePercentageCandidate4(int votePercentageCandidate4) {
		this.votePercentageCandidate4 = votePercentageCandidate4;
	}
	public int getVotePercentageCandidate5() {
		return votePercentageCandidate5;
	}
	public void setVotePercentageCandidate5(int votePercentageCandidate5) {
		this.votePercentageCandidate5 = votePercentageCandidate5;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append("totalVote:" + totalVote);
		sb.append(" " + "votePercentageCandidate1:" + votePercentageCandidate1);
		sb.append(" " + "votePercentageCandidate2:" + votePercentageCandidate2);
		sb.append(" " + "votePercentageCandidate3:" + votePercentageCandidate3);
		sb.append(" " + "votePercentageCandidate4:" + votePercentageCandidate4);
		sb.append(" " + "votePercentageCandidate5:" + votePercentageCandidate5);
		sb.append("]");
		return sb.toString();
	}
}
