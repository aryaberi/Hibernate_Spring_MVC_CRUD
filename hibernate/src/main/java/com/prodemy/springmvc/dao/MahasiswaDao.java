package com.prodemy.springmvc.dao;

import java.util.List;

import com.prodemy.springmvc.model.Mahasiswa;
public interface MahasiswaDao {
	public Mahasiswa findById(String id) throws Exception;
	public void deleteByid(String id) throws Exception;
	public void insert(Mahasiswa mhs) throws Exception;
	public void update(Mahasiswa mhs) throws Exception;
	public List<Mahasiswa> findAll() throws Exception;

}
