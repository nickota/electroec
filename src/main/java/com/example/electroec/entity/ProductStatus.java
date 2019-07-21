package com.example.electroec.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * product_status モデルクラス.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Entity
@Table(name = "product_status")
public class ProductStatus implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** id. */
	@Id
	private Integer id;

	/** status. */
	private String status;

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
	public ProductStatus() {
	}

	/**
	 * id を設定します.
	 * 
	 * @param id id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * id を取得します.
	 * 
	 * @return id
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * status を設定します.
	 * 
	 * @param status status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * status を取得します.
	 * 
	 * @return status
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * insert_date を設定します.
	 * 
	 * @param insertDate insert_date
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
	 * @param updateDate update_date
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
	 * @param insertUser insert_user
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
	 * @param updateUser update_user
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

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ProductStatus other = (ProductStatus) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

}
