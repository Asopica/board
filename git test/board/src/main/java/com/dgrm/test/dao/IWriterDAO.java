package com.dgrm.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dgrm.test.dto.WriterDTO;

@Mapper
public interface IWriterDAO {
	
	public List<WriterDTO> list();
	public int insert();
	public int delete();
	public int update();
}
