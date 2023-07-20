package com.ec.pintulac.response;

import java.util.ArrayList;

public class SDDescuentosXItem {
	  public String tableId;
	    public ArrayList<Rowset> rowset;
	    public int records;
	    public boolean moreRecords;
		public String getTableId() {
			return tableId;
		}
		public void setTableId(String tableId) {
			this.tableId = tableId;
		}
		public ArrayList<Rowset> getRowset() {
			return rowset;
		}
		public void setRowset(ArrayList<Rowset> rowset) {
			this.rowset = rowset;
		}
		public int getRecords() {
			return records;
		}
		public void setRecords(int records) {
			this.records = records;
		}
		public boolean isMoreRecords() {
			return moreRecords;
		}
		public void setMoreRecords(boolean moreRecords) {
			this.moreRecords = moreRecords;
		}
	    
	    
}
