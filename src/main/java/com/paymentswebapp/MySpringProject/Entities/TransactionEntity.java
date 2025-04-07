package com.paymentswebapp.MySpringProject.Entities;

import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
	
	@Table(name="txn_details")
	public class TransactionEntity 
	{
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="txn_id")
		private int transactionid;
		@Column(name="txn_date_time")
		private Timestamp datetime;
		@Column(name="source_id")
		private String sourseid;
		@Column(name="dest_id")
		private String destid;
		@Column(name="source_type")
		private String soursetype;
		@Column(name="dest_type")
		private String desttype;
		@Column(name="txn_amount")
		private String transactionamount;
		@Override
		public String toString() {
			return "TransactionDetailsEntity [transactionid=" + transactionid + ", datetime=" + datetime + ", sourseid="
					+ sourseid + ", destid=" + destid + ", soursetype=" + soursetype + ", desttype=" + desttype
					+ ", transactionamount=" + transactionamount + "]";
		}
		
		
	}


