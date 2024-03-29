package com.example.electroec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.electroec.entity.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Integer> {

	List<CartItem> findByUserId(Integer userId);

	CartItem findOneByUserIdAndProductSerial(Integer userId, String productSerial);
}
