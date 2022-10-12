package com.dgrm.test.service;

import java.util.List;

import com.dgrm.test.dto.WriterDTO;

public interface IMyService {
	public List<WriterDTO> list();
	public int insert();
	public int delete();
	public int update();
}
