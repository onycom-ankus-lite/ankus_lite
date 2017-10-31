package com.ankus.web.lite.faultCauseList;

import java.io.Serializable;

/**
 * Assign Domain Object.
 *
 * @author Jaesung Ahn
 * @since 0.1
 */
public class FaultCauseList implements Serializable {

    /**
     * Serialization UID
     */
    private static final long serialVersionUID = 1;

    private String prdt_strt_dt;
    private String prdt_term_dt;
    private String cause_ptrn;		
    private String max_fault_ty;   
    private String fault_ty_freq;
    private Integer tot_num_data;
    private Integer num_data;
    private String anal_dt;
    
    private String str_year;
    private String str_term;
    private String item;
    
    /* paging 처리용*/
    private boolean paging = false;
    private Integer page = 1;
    private Integer rows = 20;
    private String sidx;
    private String sord;
    private Integer startRow;
    private Integer endRow;
    
	public String getPrdt_strt_dt() {
		return prdt_strt_dt;
	}
	public void setPrdt_strt_dt(String prdt_strt_dt) {
		this.prdt_strt_dt = prdt_strt_dt;
	}
	public String getPrdt_term_dt() {
		return prdt_term_dt;
	}
	public void setPrdt_term_dt(String prdt_term_dt) {
		this.prdt_term_dt = prdt_term_dt;
	}
	public String getCause_ptrn() {
		return cause_ptrn;
	}
	public void setCause_ptrn (String cause_ptrn) {
		this.cause_ptrn = cause_ptrn;
	}
	public String getMax_fault_ty() {
		return max_fault_ty;
	}
	public void setMax_fault_ty(String max_fault_ty) {
		this.max_fault_ty = max_fault_ty;
	}
	public String getFault_ty_freq() {
		return fault_ty_freq;
	}
	public void setFault_ty_freq(String fault_ty_freq) {
		this.fault_ty_freq = fault_ty_freq;
	}
	public Integer getTot_num_data() {
		return tot_num_data;
	}
	public void setTot_num_data(Integer tot_num_data) {
		this.tot_num_data = tot_num_data;
	}
	public Integer getNum_data() {
		return num_data;
	}
	public void setNum_data(Integer num_data) {
		this.num_data = num_data;
	}
	public String getAnal_dt() {
		return anal_dt;
	}
	public void setAnal_dt(String anal_dt) {
		this.anal_dt = anal_dt;
	}
	
	public String getStr_year() {
		return str_year;
	}
	public void setStr_year(String str_year) {
		this.str_year = str_year;
	}
	public String getStr_term() {
		return str_term;
	}
	public void setStr_term(String str_term) {
		this.str_term = str_term;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}

	public boolean isPaging() {
		return paging;
	}
	public void setPaging(boolean paging) {
		this.paging = paging;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public String getSidx() {
		return sidx;
	}
	public void setSidx(String sidx) {
		this.sidx = sidx;
	}
	public String getSord() {
		return sord;
	}
	public void setSord(String sord) {
		this.sord = sord;
	}
	public Integer getStartRow() {
		return startRow;
	}
	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
	public Integer getEndRow() {
		return endRow;
	}
	public void setEndRow(Integer endRow) {
		this.endRow = endRow;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((prdt_strt_dt == null) ? 0 : prdt_strt_dt.hashCode());
		result = prime * result + ((prdt_term_dt == null) ? 0 : prdt_term_dt.hashCode());
		result = prime * result + ((cause_ptrn == null) ? 0 : cause_ptrn.hashCode());
		result = prime * result + ((max_fault_ty == null) ? 0 : max_fault_ty.hashCode());
		result = prime * result + ((fault_ty_freq == null) ? 0 : fault_ty_freq.hashCode());		
		result = prime * result + ((tot_num_data == null) ? 0 : tot_num_data.hashCode());
		result = prime * result + ((num_data == null) ? 0 : num_data.hashCode());
		result = prime * result + ((anal_dt == null) ? 0 : anal_dt.hashCode());		
		result = prime * result + ((str_year == null) ? 0 : str_year.hashCode());
		result = prime * result + ((str_term == null) ? 0 : str_term.hashCode());
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + ((page == null) ? 0 : page.hashCode());
		result = prime * result + (paging ? 1231 : 1237);
		result = prime * result + ((rows == null) ? 0 : rows.hashCode());
		result = prime * result + ((sidx == null) ? 0 : sidx.hashCode());
		result = prime * result + ((sord == null) ? 0 : sord.hashCode());
		result = prime * result + ((startRow == null) ? 0 : startRow.hashCode());
		result = prime * result + ((endRow == null) ? 0 : endRow.hashCode());	
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FaultCauseList other = (FaultCauseList) obj;
		if (prdt_strt_dt == null) {
			if (other.prdt_strt_dt != null)
				return false;
		} else if (!prdt_strt_dt.equals(other.prdt_strt_dt))
			return false;
		if (prdt_term_dt == null) {
			if (other.prdt_term_dt != null)
				return false;
		} else if (!prdt_term_dt.equals(other.prdt_term_dt))
			return false;
		if (cause_ptrn == null) {
			if (other.cause_ptrn != null)
				return false;
		} else if (!cause_ptrn.equals(other.cause_ptrn))
			return false;
		if (max_fault_ty == null) {
			if (other.max_fault_ty != null)
				return false;
		} else if (!max_fault_ty.equals(other.max_fault_ty))
			return false;
		if (fault_ty_freq == null) {
			if (other.fault_ty_freq != null)
				return false;
		} else if (!fault_ty_freq.equals(other.fault_ty_freq))
			return false;
		if (tot_num_data == null) {
			if (other.tot_num_data != null)
				return false;
		} else if (!tot_num_data.equals(other.tot_num_data))
			return false;
		if (num_data == null) {
			if (other.num_data != null)
				return false;
		} else if (!num_data.equals(other.num_data))
			return false;
		if (anal_dt == null) {
			if (other.anal_dt != null)
				return false;
		} else if (!anal_dt.equals(other.anal_dt))
			return false;
		if (str_year == null) {
			if (other.str_year != null)
				return false;
		} else if (!str_year.equals(other.str_year))
			return false;
		if (str_term == null) {
			if (other.str_term != null)
				return false;
		} else if (!str_term.equals(other.str_term))
			return false;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (endRow == null) {
			if (other.endRow != null)
				return false;
		} else if (!endRow.equals(other.endRow))
			return false;		
		if (page == null) {
			if (other.page != null)
				return false;
		} else if (!page.equals(other.page))
			return false;
		if (paging != other.paging)
			return false;
		if (rows == null) {
			if (other.rows != null)
				return false;
		} else if (!rows.equals(other.rows))
			return false;
		if (sidx == null) {
			if (other.sidx != null)
				return false;
		} else if (!sidx.equals(other.sidx))
			return false;
		if (sord == null) {
			if (other.sord != null)
				return false;
		} else if (!sord.equals(other.sord))
			return false;
		if (startRow == null) {
			if (other.startRow != null)
				return false;
		} else if (!startRow.equals(other.startRow))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return ""
				+ "FaultCauseList [prdt_strt_dt=" + prdt_strt_dt + ", prdt_term_dt=" + prdt_term_dt + ", cause_ptrn=" + cause_ptrn + ", max_fault_ty=" + max_fault_ty 
				+ ", fault_ty_freq=" + fault_ty_freq + ", tot_num_data=" + tot_num_data + ", num_data=" + num_data + ", anal_dt=" + anal_dt + ", str_year=" + str_year
				+ ", str_term=" + str_term + ", item=" + item
				+ ", paging=" + paging + ", page=" + page + ", rows=" + rows + ", sidx=" + sidx + ", sord=" + sord + ", startRow=" + startRow + ", endRow=" + endRow + "]";
	}
}