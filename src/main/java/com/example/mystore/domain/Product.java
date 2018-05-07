package com.example.mystore.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Blob;
import java.sql.Date;

/**
 * Created by andre on 05/05/2018.
 */
@Entity(name = "PRODUCTS")
public class Product {

    @Id
    private Long pk;

    private Long hjmpts;
    private Date createdts;
    private Date modifiedts;
    private Long typepkstring;
    private Long ownerpkstring;
    private String pCode;
    private Long pUnit;
    private Long pThumbnail;
    private Long pPicture;
    private Long pCatalog;
    private Long pCatalogversion;
    private Date pOnlinedate;
    private Date pOfflinedate;
    private String pEan;
    private String pSupplieralternativeaid;
    private Blob pBuyerids;
    private String pManufactureraid;
    private String pManufacturername;
    private String pErpgroupbuyer;
    private String pErpgroupsupplier;
    private Double pDeliverytime;
    private Blob pSpecialtreatmentclasses;
    private Integer pOrder;
    private Long pApprovalstatus;
    private Long pContentunit;
    private Double pNumbercontentunits;
    private Integer pMinorderquantity;
    private Integer pMaxorderquantity;
    private Integer pOrderquantityinterval;
    private Double pPricequantity;
    private String pNormal;
    private String pThumbnails;
    private String pDetail;
    private String pLogo;
    private String pDataSheet;
    private String pOthers;
    private Integer pStartlinenumber;
    private Integer pEndlinenumber;
    private Long pVarianttype;
    private Long pEurope1PricefactoryPpg;
    private Long pEurope1PricefactoryPtg;
    private Long pEurope1PricefactoryPdg;
    private Long pBand;
    private Long aclts;
    private Long propts;
    private Long pBaseproduct;
    private String pVenue;
    private Date pDate;
    private Long pConcerttype;

    public Product() {

    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getHjmpts() {
        return hjmpts;
    }

    public void setHjmpts(Long hjmpts) {
        this.hjmpts = hjmpts;
    }

    public Date getCreatedts() {
        return createdts;
    }

    public void setCreatedts(Date createdts) {
        this.createdts = createdts;
    }

    public Date getModifiedts() {
        return modifiedts;
    }

    public void setModifiedts(Date modifiedts) {
        this.modifiedts = modifiedts;
    }

    public Long getTypepkstring() {
        return typepkstring;
    }

    public void setTypepkstring(Long typepkstring) {
        this.typepkstring = typepkstring;
    }

    public Long getOwnerpkstring() {
        return ownerpkstring;
    }

    public void setOwnerpkstring(Long ownerpkstring) {
        this.ownerpkstring = ownerpkstring;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public Long getpUnit() {
        return pUnit;
    }

    public void setpUnit(Long pUnit) {
        this.pUnit = pUnit;
    }

    public Long getpThumbnail() {
        return pThumbnail;
    }

    public void setpThumbnail(Long pThumbnail) {
        this.pThumbnail = pThumbnail;
    }

    public Long getpPicture() {
        return pPicture;
    }

    public void setpPicture(Long pPicture) {
        this.pPicture = pPicture;
    }

    public Long getpCatalog() {
        return pCatalog;
    }

    public void setpCatalog(Long pCatalog) {
        this.pCatalog = pCatalog;
    }

    public Long getpCatalogversion() {
        return pCatalogversion;
    }

    public void setpCatalogversion(Long pCatalogversion) {
        this.pCatalogversion = pCatalogversion;
    }

    public Date getpOnlinedate() {
        return pOnlinedate;
    }

    public void setpOnlinedate(Date pOnlinedate) {
        this.pOnlinedate = pOnlinedate;
    }

    public Date getpOfflinedate() {
        return pOfflinedate;
    }

    public void setpOfflinedate(Date pOfflinedate) {
        this.pOfflinedate = pOfflinedate;
    }

    public String getpEan() {
        return pEan;
    }

    public void setpEan(String pEan) {
        this.pEan = pEan;
    }

    public String getpSupplieralternativeaid() {
        return pSupplieralternativeaid;
    }

    public void setpSupplieralternativeaid(String pSupplieralternativeaid) {
        this.pSupplieralternativeaid = pSupplieralternativeaid;
    }

    public Blob getpBuyerids() {
        return pBuyerids;
    }

    public void setpBuyerids(Blob pBuyerids) {
        this.pBuyerids = pBuyerids;
    }

    public String getpManufactureraid() {
        return pManufactureraid;
    }

    public void setpManufactureraid(String pManufactureraid) {
        this.pManufactureraid = pManufactureraid;
    }

    public String getpManufacturername() {
        return pManufacturername;
    }

    public void setpManufacturername(String pManufacturername) {
        this.pManufacturername = pManufacturername;
    }

    public String getpErpgroupbuyer() {
        return pErpgroupbuyer;
    }

    public void setpErpgroupbuyer(String pErpgroupbuyer) {
        this.pErpgroupbuyer = pErpgroupbuyer;
    }

    public String getpErpgroupsupplier() {
        return pErpgroupsupplier;
    }

    public void setpErpgroupsupplier(String pErpgroupsupplier) {
        this.pErpgroupsupplier = pErpgroupsupplier;
    }

    public Double getpDeliverytime() {
        return pDeliverytime;
    }

    public void setpDeliverytime(Double pDeliverytime) {
        this.pDeliverytime = pDeliverytime;
    }

    public Blob getpSpecialtreatmentclasses() {
        return pSpecialtreatmentclasses;
    }

    public void setpSpecialtreatmentclasses(Blob pSpecialtreatmentclasses) {
        this.pSpecialtreatmentclasses = pSpecialtreatmentclasses;
    }

    public Integer getpOrder() {
        return pOrder;
    }

    public void setpOrder(Integer pOrder) {
        this.pOrder = pOrder;
    }

    public Long getpApprovalstatus() {
        return pApprovalstatus;
    }

    public void setpApprovalstatus(Long pApprovalstatus) {
        this.pApprovalstatus = pApprovalstatus;
    }

    public Long getpContentunit() {
        return pContentunit;
    }

    public void setpContentunit(Long pContentunit) {
        this.pContentunit = pContentunit;
    }

    public Double getpNumbercontentunits() {
        return pNumbercontentunits;
    }

    public void setpNumbercontentunits(Double pNumbercontentunits) {
        this.pNumbercontentunits = pNumbercontentunits;
    }

    public Integer getpMinorderquantity() {
        return pMinorderquantity;
    }

    public void setpMinorderquantity(Integer pMinorderquantity) {
        this.pMinorderquantity = pMinorderquantity;
    }

    public Integer getpMaxorderquantity() {
        return pMaxorderquantity;
    }

    public void setpMaxorderquantity(Integer pMaxorderquantity) {
        this.pMaxorderquantity = pMaxorderquantity;
    }

    public Integer getpOrderquantityinterval() {
        return pOrderquantityinterval;
    }

    public void setpOrderquantityinterval(Integer pOrderquantityinterval) {
        this.pOrderquantityinterval = pOrderquantityinterval;
    }

    public Double getpPricequantity() {
        return pPricequantity;
    }

    public void setpPricequantity(Double pPricequantity) {
        this.pPricequantity = pPricequantity;
    }

    public String getpNormal() {
        return pNormal;
    }

    public void setpNormal(String pNormal) {
        this.pNormal = pNormal;
    }

    public String getpThumbnails() {
        return pThumbnails;
    }

    public void setpThumbnails(String pThumbnails) {
        this.pThumbnails = pThumbnails;
    }

    public String getpDetail() {
        return pDetail;
    }

    public void setpDetail(String pDetail) {
        this.pDetail = pDetail;
    }

    public String getpLogo() {
        return pLogo;
    }

    public void setpLogo(String pLogo) {
        this.pLogo = pLogo;
    }

    public String getpDataSheet() {
        return pDataSheet;
    }

    public void setpDataSheet(String pDataSheet) {
        this.pDataSheet = pDataSheet;
    }

    public String getpOthers() {
        return pOthers;
    }

    public void setpOthers(String pOthers) {
        this.pOthers = pOthers;
    }

    public Integer getpStartlinenumber() {
        return pStartlinenumber;
    }

    public void setpStartlinenumber(Integer pStartlinenumber) {
        this.pStartlinenumber = pStartlinenumber;
    }

    public Integer getpEndlinenumber() {
        return pEndlinenumber;
    }

    public void setpEndlinenumber(Integer pEndlinenumber) {
        this.pEndlinenumber = pEndlinenumber;
    }

    public Long getpVarianttype() {
        return pVarianttype;
    }

    public void setpVarianttype(Long pVarianttype) {
        this.pVarianttype = pVarianttype;
    }

    public Long getpEurope1PricefactoryPpg() {
        return pEurope1PricefactoryPpg;
    }

    public void setpEurope1PricefactoryPpg(Long pEurope1PricefactoryPpg) {
        this.pEurope1PricefactoryPpg = pEurope1PricefactoryPpg;
    }

    public Long getpEurope1PricefactoryPtg() {
        return pEurope1PricefactoryPtg;
    }

    public void setpEurope1PricefactoryPtg(Long pEurope1PricefactoryPtg) {
        this.pEurope1PricefactoryPtg = pEurope1PricefactoryPtg;
    }

    public Long getpEurope1PricefactoryPdg() {
        return pEurope1PricefactoryPdg;
    }

    public void setpEurope1PricefactoryPdg(Long pEurope1PricefactoryPdg) {
        this.pEurope1PricefactoryPdg = pEurope1PricefactoryPdg;
    }

    public Long getpBand() {
        return pBand;
    }

    public void setpBand(Long pBand) {
        this.pBand = pBand;
    }

    public Long getAclts() {
        return aclts;
    }

    public void setAclts(Long aclts) {
        this.aclts = aclts;
    }

    public Long getPropts() {
        return propts;
    }

    public void setPropts(Long propts) {
        this.propts = propts;
    }

    public Long getpBaseproduct() {
        return pBaseproduct;
    }

    public void setpBaseproduct(Long pBaseproduct) {
        this.pBaseproduct = pBaseproduct;
    }

    public String getpVenue() {
        return pVenue;
    }

    public void setpVenue(String pVenue) {
        this.pVenue = pVenue;
    }

    public Date getpDate() {
        return pDate;
    }

    public void setpDate(Date pDate) {
        this.pDate = pDate;
    }

    public Long getpConcerttype() {
        return pConcerttype;
    }

    public void setpConcerttype(Long pConcerttype) {
        this.pConcerttype = pConcerttype;
    }
}
