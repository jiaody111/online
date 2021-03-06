package com.koala.learn.service;


import com.koala.learn.entity.Vote;

/**
 * Vote 服务接口.
 * 
 * @since 1.0.0 2017年4月9日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public interface VoteService {
	/**
	 * 根据id获取 Vote
	 * @param id
	 * @return
	 */
	Vote getVoteById(Integer id);
	/**
	 * 删除Vote
	 * @param id
	 * @return
	 */
	void removeVote(Integer id);
}
