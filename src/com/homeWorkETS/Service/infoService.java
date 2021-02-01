package com.homeWorkETS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.homeWorkETS.Dao.infoDao;
import com.homeWorkETS.Model.infoModel;

@Service("infoService")
public class infoService {
	
	@Autowired
	infoDao infodao;
	
	@Transactional
	public List<infoModel> getAllInfo() {
		return infodao.getAllInfo();
	}

	@Transactional
	public void addInfo(infoModel infoModel) {
		infodao.addInfo(infoModel);
	}
	
}