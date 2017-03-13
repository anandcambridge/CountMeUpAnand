package com.anand.service;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class VoteCountingImplTest {
	VoteCountingImpl voteCountingImpl;

	@BeforeMethod
	public void init() {
		voteCountingImpl = new VoteCountingImpl();
	}
	
	@Test
	public void getVoteCount_HappyPath() {
		long voteCount = voteCountingImpl.getVoteCount(100, 25);
		Assert.assertEquals(25, voteCount);
	}
	
	
}
