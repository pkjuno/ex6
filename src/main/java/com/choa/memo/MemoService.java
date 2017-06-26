package com.choa.memo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choa.util.ListInfo;

@Service
public class MemoService {
	
	@Autowired
	private MemoDAO memoDAO;
	
	
	
	//list
	public List<MemoDTO> boardList(ListInfo listInfo) throws Exception{
		int totalCount = memoDAO.boardCount(listInfo);
		listInfo.makePage(totalCount);
		listInfo.makeRow();
		return memoDAO.boardList(listInfo);
	}
	//view
	public MemoDTO boardView(Integer num)throws Exception{
		return memoDAO.boardView(num);
	}
	//insert
	public int boardWrite(MemoDTO memoDTO) throws Exception{
		return memoDAO.boardWrite(memoDTO);
	}
	//update
	public int boardUpdate(MemoDTO memoDTO) throws Exception{
		return memoDAO.boardUpdate(memoDTO);
	}
	//delete
	public int boardDelete(Integer num)throws Exception{
		return memoDAO.boardDelete(num);
	}
}
