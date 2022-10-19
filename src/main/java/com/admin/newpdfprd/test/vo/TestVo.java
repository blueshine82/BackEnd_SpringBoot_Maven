package com.admin.newpdfprd.test.vo;

public class TestVo {

	private Long mbrNo;
	private String id;
	private String name;
		
	public TestVo() {
//		super();
	}
	
	public TestVo(String id, String name) {
//		super();
		this.id = id;
		this.name = name;
	}
	public Long getMbrNo() {
		return mbrNo;
	}
	public void setMbrNo(Long mbrNo) {
		this.mbrNo = mbrNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
