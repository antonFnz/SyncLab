package com.cartellacardio.dao;

import java.util.List;

import com.cartellacardio.entity.Cartella;

public interface RecordDAO {
	
	public List<Cartella> getRecords(int id);

}