package com.prodemy.springmvc.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.prodemy.springmvc.dao.MahasiswaDao;
import com.prodemy.springmvc.model.Mahasiswa;

@Controller(value = "mhsService1")
@Transactional
public class MahasiswaServiceImpl implements MahasiswaService {
	@Autowired
	private MahasiswaDao dao;
	
	@Override
	public Mahasiswa findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}
	
	@Override
	public void deleteById(String id) throws Exception {
		// TODO Auto-generated method stub
		dao.deleteByid(id);
	}

	@Override
	public void insert(Mahasiswa mhs) throws Exception {
		// TODO Auto-generated method stub
		dao.insert(mhs);
		
	}
	
	@Override
	public void update(Mahasiswa mhs) throws Exception {
		// TODO Auto-generated method stub
		dao.update(mhs);
	}

	@Override
	public List<Mahasiswa> findAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
