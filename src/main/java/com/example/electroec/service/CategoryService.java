package com.example.electroec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.electroec.entity.Category;
import com.example.electroec.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	public Iterable<Category> findAll() {
		return categoryRepository.findAll();
	}
}
