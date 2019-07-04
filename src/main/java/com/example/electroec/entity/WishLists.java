package com.example.electroec.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * wish_lists モデルクラス.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class WishLists implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** customer_id. */
	private Integer customerId;

	/** product_id. */
	private Integer productId;

	/** insert_date. */
	private Date insertDate;

	/** update_date. */
	private Date updateDate;

	/** insert_user. */
	private String insertUser;

	/** update_user. */
	private String updateUser;

	/**
	 * コンストラクタ.
	 */
	public WishLists() {
	}

	/**
	 * customer_id を設定します.
	 * 
	 * @param customerId
	 *            customer_id
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	/**
	 * customer_id を取得します.
	 * 
	 * @return customer_id
	 */
	public Integer getCustomerId() {
		return this.customerId;
	}

	/**
	 * product_id を設定します.
	 * 
	 * @param productId
	 *            product_id
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	/**
	 * product_id を取得します.
	 * 
	 * @return product_id
	 */
	public Integer getProductId() {
		return this.productId;
	}

	/**
	 * insert_date を設定します.
	 * 
	 * @param insertDate
	 *            insert_date
	 */
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	/**
	 * insert_date を取得します.
	 * 
	 * @return insert_date
	 */
	public Date getInsertDate() {
		return this.insertDate;
	}

	/**
	 * update_date を設定します.
	 * 
	 * @param updateDate
	 *            update_date
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * update_date を取得します.
	 * 
	 * @return update_date
	 */
	public Date getUpdateDate() {
		return this.updateDate;
	}

	/**
	 * insert_user を設定します.
	 * 
	 * @param insertUser
	 *            insert_user
	 */
	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
	}

	/**
	 * insert_user を取得します.
	 * 
	 * @return insert_user
	 */
	public String getInsertUser() {
		return this.insertUser;
	}

	/**
	 * update_user を設定します.
	 * 
	 * @param updateUser
	 *            update_user
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * update_user を取得します.
	 * 
	 * @return update_user
	 */
	public String getUpdateUser() {
		return this.updateUser;
	}


}
