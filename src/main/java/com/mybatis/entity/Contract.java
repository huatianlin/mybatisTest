package com.mybatis.entity;

import org.apache.ibatis.type.Alias;

/**
 * @author JinKai
 *
 * @描述 框架协议/采购订单基础信息
 * @创建时间 2018年9月11日 下午3:32:14
 */
@Alias("contract")
public class Contract extends AbstractEntity {

	private static final long serialVersionUID = -4165015640437633304L;

	/** 平台主体 */
	private Long platformId;
	/** 业务模式 */
	private String businessCode; 
	/**买断合同父合同ID */
	private Long parentId;
	/** 类型(1-框架协议 2-采购订单) */
	private Integer type;
	/** 采购来源（1-供应商 2-商家 3-平台） */
	private Integer source; 	
	/** 审核状态(1-草稿 0-审核中 1-审核通过 5-审核驳回 10-取消作废：由草稿状态取消) */
	private Integer auditStatus; 
	/** 状态(0-待执行 1-执行中 2-货齐 3-结算中 4-已结算 5-票齐（货款、运费都票齐） 6-完成 7-终止 10-作废) */
	private Integer status; 
	/** 货款已票齐（0-否 1-是） */
	private Boolean statusPaymentInvoice;
	/** 运费已票齐（0-否 1-是） */
	private Boolean statusFreightInvoice;
	/** 合同号 */
	private String code;
	/** 供应商合同号 */
	private String supplierCode;
	/** 会员ID */
	private Long memberId;  
	/** 供应商ID */
	private Long supplierId;  
	/** 会员 */
	private String member;  
	/** 店铺ID */
	private Long shopId;
	/** 原会员ID */
	private Long fromMemberId;
	/** 原会员 */
	private String fromMember;
	/** 原会员模式 */
	private String fromBusinessCode;
	/** 钢厂ID */
	private Long factoryId; 
	/** 钢厂 */
	private String factory;
	/** 采购政策ID */
	private Long policyId; 
	/** 采购政策编号 */
	private String policyCode;
	/** 预付款频度(1-每旬预付 2-每月预付 3-一单一付 4-固定预付) */
	private Integer prepayFrequency; 
	/** 指导价模式(1-指导基价+级差 2-挂牌时导入) */
	private Integer guidePriceMode; 
	/** 结算价模式(1:结算基价+级差, 2:同指导价, 3:一口价结算) */
	private Integer settlePriceMode; 
	/** 团队类型（1-提报单位 2-管理团队） */
	private Integer teamType;   
	/** 团队ID（类型是1-提报单位，保存提报单位ID ,类型是2-创建，保存管理团队ID） */
	private Long teamId; 
	/** 提报单位 */
	private String reportingUnit;
	/** 品种ID(大类) */
	private Long breedId; 
	/** 品种CODE */
	private String breedCode; 
	/** 品名 */
	private String breed; 
	/** 货主ID */
	private Long ownerId; 
	/** 货主 */
	private String owner; 
	/** 签订日期 */
	private Long signDate; 				
	/** 生效日期 */
	private Long effeDate; 				
	/** 失效日期 */
	private Long expiDate; 				
	/** 采购员ID */
	private Long buyerId;  
	/** 采购员 */
	private String buyer;
	/** 月协议量*/
	private Long monthWeight; 		
	/** 合同重量/计划量 */
	private Long weight;
	/** 合同金额/提报金额（元） */
	private Long amount;
	/** 合同附件 */
	private String attach; 
	/** 合同补充附件：多个@@间隔 */
	private String addAttach; 
	/** 备注 */
	private String remark;
	/** 创建人ID */
	private Long creatorId; 
	/** 创建人 */
	private String creator; 
	/** 创建时间 */
	private Long createTime; 
	/** 修改人ID */
	private Long updaterId; 
	/** 修改人 */
	private String updater;
//	/** 采购合同管理团队 */
//	private ContractTeam contractTeam;
//	/** 合同终止申请*/
//	private ContractTerminate terminate;
	
	public Long getPlatformId() {
		return platformId;
	}
	public void setPlatformId(Long platformId) {
		this.platformId = platformId;
	}
	public String getBusinessCode() {
		return businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getSource() {
		return source;
	}
	public void setSource(Integer source) {
		this.source = source;
	}
	public Integer getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Boolean getStatusPaymentInvoice() {
		return statusPaymentInvoice;
	}
	public void setStatusPaymentInvoice(Boolean statusPaymentInvoice) {
		this.statusPaymentInvoice = statusPaymentInvoice;
	}
	public Boolean getStatusFreightInvoice() {
		return statusFreightInvoice;
	}
	public void setStatusFreightInvoice(Boolean statusFreightInvoice) {
		this.statusFreightInvoice = statusFreightInvoice;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSupplierCode() {
		return supplierCode;
	}
	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public Long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public Long getFromMemberId() {
		return fromMemberId;
	}
	public void setFromMemberId(Long fromMemberId) {
		this.fromMemberId = fromMemberId;
	}
	public String getFromMember() {
		return fromMember;
	}
	public void setFromMember(String fromMember) {
		this.fromMember = fromMember;
	}
	public String getFromBusinessCode() {
		return fromBusinessCode;
	}
	public void setFromBusinessCode(String fromBusinessCode) {
		this.fromBusinessCode = fromBusinessCode;
	}
	public Long getFactoryId() {
		return factoryId;
	}
	public void setFactoryId(Long factoryId) {
		this.factoryId = factoryId;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public Long getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
	}
	public String getPolicyCode() {
		return policyCode;
	}
	public void setPolicyCode(String policyCode) {
		this.policyCode = policyCode;
	}
	public Integer getPrepayFrequency() {
		return prepayFrequency;
	}
	public void setPrepayFrequency(Integer prepayFrequency) {
		this.prepayFrequency = prepayFrequency;
	}
	public Integer getGuidePriceMode() {
		return guidePriceMode;
	}
	public void setGuidePriceMode(Integer guidePriceMode) {
		this.guidePriceMode = guidePriceMode;
	}
	public Integer getSettlePriceMode() {
		return settlePriceMode;
	}
	public void setSettlePriceMode(Integer settlePriceMode) {
		this.settlePriceMode = settlePriceMode;
	}
	public Integer getTeamType() {
		return teamType;
	}
	public void setTeamType(Integer teamType) {
		this.teamType = teamType;
	}
	public Long getTeamId() {
		return teamId;
	}
	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}
	public String getReportingUnit() {
		return reportingUnit;
	}
	public void setReportingUnit(String reportingUnit) {
		this.reportingUnit = reportingUnit;
	}
	public Long getBreedId() {
		return breedId;
	}
	public void setBreedId(Long breedId) {
		this.breedId = breedId;
	}
	public String getBreedCode() {
		return breedCode;
	}
	public void setBreedCode(String breedCode) {
		this.breedCode = breedCode;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public Long getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public Long getSignDate() {
		return signDate;
	}
	public void setSignDate(Long signDate) {
		this.signDate = signDate;
	}
	public Long getEffeDate() {
		return effeDate;
	}
	public void setEffeDate(Long effeDate) {
		this.effeDate = effeDate;
	}
	public Long getExpiDate() {
		return expiDate;
	}
	public void setExpiDate(Long expiDate) {
		this.expiDate = expiDate;
	}
	public Long getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Long buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public Long getMonthWeight() {
		return monthWeight;
	}
	public void setMonthWeight(Long monthWeight) {
		this.monthWeight = monthWeight;
	}
	public Long getWeight() {
		return weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getAttach() {
		return attach;
	}
	public void setAttach(String attach) {
		this.attach = attach;
	}
	public String getAddAttach() {
		return addAttach;
	}
	public void setAddAttach(String addAttach) {
		this.addAttach = addAttach;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Long getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public Long getUpdaterId() {
		return updaterId;
	}
	public void setUpdaterId(Long updaterId) {
		this.updaterId = updaterId;
	}
	public String getUpdater() {
		return updater;
	}
	public void setUpdater(String updater) {
		this.updater = updater;
	}
//	public ContractTeam getContractTeam() {
//		return contractTeam;
//	}
//	public void setContractTeam(ContractTeam contractTeam) {
//		this.contractTeam = contractTeam;
//	}
//	public ContractTerminate getTerminate() {
//		return terminate;
//	}
//	public void setTerminate(ContractTerminate terminate) {
//		this.terminate = terminate;
//	}
}
