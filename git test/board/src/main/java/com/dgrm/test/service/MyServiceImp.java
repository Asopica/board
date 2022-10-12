package com.dgrm.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgrm.test.dao.IWriterDAO;
import com.dgrm.test.dto.WriterDTO;

@Service("IMyService")
public class MyServiceImp implements IMyService{
	
	@Autowired
	IWriterDAO writerDAO;
	
	@Override
	public List<WriterDTO> list() {
		
		List<WriterDTO> list = writerDAO.list();
		
		System.out.println("ok : =====> list");
		System.out.println("list :" + list);
		return list;
	}

	@Override
	public int insert() {
		System.out.println("ok : =====> insert");
		return writerDAO.insert();
	}

	@Override
	public int delete() {
		System.out.println("ok : =====> delete");
		return writerDAO.delete();
	}

	@Override
	public int update() {
		System.out.println("ok : =====> update");
		return writerDAO.update();
	}
	
	
	
}
