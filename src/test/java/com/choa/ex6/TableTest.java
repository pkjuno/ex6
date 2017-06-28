package com.choa.ex6;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.choa.table.TableADTO;
import com.choa.table.TableService;


public class TableTest extends MyAbstarctTestUnit{

	@Autowired
	private TableService tableservice;
	
	
	@Test
	public void test() throws Exception {
		TableADTO tableADTO = new TableADTO();
		tableADTO.setNum(4);
		tableADTO.setTitle("t4");
		tableADTO.setWriter("t4");
		int result = tableservice.inserTable(tableADTO, 4);
		assertEquals(1, result);
	}

}
