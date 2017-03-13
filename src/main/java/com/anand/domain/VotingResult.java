package com.anand.domain;

public class VotingResult {

	long voteCountCandidate1;
	long voteCountCandidate2;
	long voteCountCandidate3;
	long voteCountCandidate4;
	long voteCountCandidate5;
	
	public long getVoteCountCandidate1() {
		return voteCountCandidate1;
	}
	public void setVoteCountCandidate1(long voteCountCandidate1) {
		this.voteCountCandidate1 = voteCountCandidate1;
	}
	public long getVoteCountCandidate2() {
		return voteCountCandidate2;
	}
	public void setVoteCountCandidate2(long voteCountCandidate2) {
		this.voteCountCandidate2 = voteCountCandidate2;
	}
	public long getVoteCountCandidate3() {
		return voteCountCandidate3;
	}
	public void setVoteCountCandidate3(long voteCountCandidate3) {
		this.voteCountCandidate3 = voteCountCandidate3;
	}
	public long getVoteCountCandidate4() {
		return voteCountCandidate4;
	}
	public void setVoteCountCandidate4(long voteCountCandidate4) {
		this.voteCountCandidate4 = voteCountCandidate4;
	}
	public long getVoteCountCandidate5() {
		return voteCountCandidate5;
	}
	public void setVoteCountCandidate5(long voteCountCandidate5) {
		this.voteCountCandidate5 = voteCountCandidate5;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append(" " + "voteCountCandidate1:" + voteCountCandidate1);
		sb.append(" " + "voteCountCandidate2:" + voteCountCandidate2);
		sb.append(" " + "voteCountCandidate3:" + voteCountCandidate3);
		sb.append(" " + "voteCountCandidate4:" + voteCountCandidate4);
		sb.append(" " + "voteCountCandidate5:" + voteCountCandidate5);
		sb.append("]");
		return sb.toString();
	}
}
