package com.tarena.dao;

import java.sql.SQLException;
import java.util.List;

import com.tarena.entity.Product;



public interface ProductDAO {
	public List<Product> findByCatId(int cid,int begin,int size) throws Exception;
	public Product findById(int id) throws Exception;
	public List<Product> findByHot(int num) throws Exception;
	public List<Product> findByNew(int num) throws Exception;
	public List<Product> findByNewHot(int num,long time) throws Exception;
}
