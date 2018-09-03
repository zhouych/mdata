package com.zyc.mdata.data;

import java.util.HashMap;
import java.util.Map;

public enum DimensionCategory {
	ORGANIZATION("Organization", "组织机构"),
	EXPENSEACCOUNT("ExpenseAccount", "费用科目"),
	PROJECT("Project", "项目"),
	YEAR("Year", "年度"),
	CURRENCY("Currency", "币种"),
	POST("Post", "岗位"),
	RANK("Rank", "职级"),
	CUSTOMIZE("Customize", "自定义");
	
	private String value;
	private String text;
	
	private DimensionCategory(String value, String text) {
		this.value = value;
		this.text = text;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public static Map<String, String> toMap() {
		Map<String, String> map = new HashMap<String, String>();
		for (DimensionCategory dc : DimensionCategory.values()) {
			map.put(dc.getValue(), dc.getText());
		}
		return map;
	}
}
