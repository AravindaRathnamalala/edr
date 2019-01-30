package lk.aravinda.cccrm_mvp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by aravinda_r on 9/21/2018.
 */

public class InspectionDataBean {

    @SerializedName("coastalSegment")
    @Expose
    private String coastalSegment;
    @SerializedName("protectedByStrucuture")
    @Expose
    private String protectedByStrucuture;
    @SerializedName("restrictedArea")
    @Expose
    private String restrictedArea;
    @SerializedName("marshStatus")
    @Expose
    private String marshStatus;
    @SerializedName("signOfErosion")
    @Expose
    private String signOfErosion;
    @SerializedName("anyProposals")
    @Expose
    private String anyProposals;
    @SerializedName("statuscode")
    @Expose
    private String statuscode;
    @SerializedName("natureofInspection")
    @Expose
    private String natureofInspection;
    @SerializedName("beachsideLandside")
    @Expose
    private String beachsideLandside;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("totalFloorArea")
    @Expose
    private String totalFloorArea;
    @SerializedName("rockyHeadland")
    @Expose
    private String rockyHeadland;
    @SerializedName("employeeName")
    @Expose
    private String employeeName;
    @SerializedName("coastalErosionRate")
    @Expose
    private String coastalErosionRate;
    @SerializedName("culturalMonuments")
    @Expose
    private String culturalMonuments;
    @SerializedName("setBackNotAvailable")
    @Expose
    private String setBackNotAvailable;
    @SerializedName("postaladdress")
    @Expose
    private String postaladdress;
    @SerializedName("groynesStatus")
    @Expose
    private String groynesStatus;
    @SerializedName("beachLength")
    @Expose
    private String beachLength;
    @SerializedName("reservationArea")
    @Expose
    private String reservationArea;
    @SerializedName("clearancelist")
    @Expose
    private List<ClearanceList> clearanceList = null;
    @SerializedName("waterHolesTidePoolStatus")
    @Expose
    private String waterHolesTidePoolStatus;
    @SerializedName("provinceDesc")
    @Expose
    private String provinceDesc;
    @SerializedName("rockyCliffStatus")
    @Expose
    private String rockyCliffStatus;
    @SerializedName("noOfRooms")
    @Expose
    private String noOfRooms;
    @SerializedName("inspectionGpses")
    @Expose
    private List<InspectionGpse> inspectionGpses = null;
    @SerializedName("permitrequestid")
    @Expose
    private Integer permitrequestid;
    @SerializedName("districtCode")
    @Expose
    private String districtCode;
    @SerializedName("offshoreStatus")
    @Expose
    private String offshoreStatus;
    @SerializedName("marineParks")
    @Expose
    private String marineParks;
    @SerializedName("literatiHeadland")
    @Expose
    private String literatiHeadland;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("reefSandStonesStatus")
    @Expose
    private String reefSandStonesStatus;
    @SerializedName("beachWidth")
    @Expose
    private String beachWidth;
    @SerializedName("otherRemarks")
    @Expose
    private String otherRemarks;
    @SerializedName("statusdesc")
    @Expose
    private String statusdesc;
    @SerializedName("rocky")
    @Expose
    private String rocky;
    @SerializedName("inspectionid")
    @Expose
    private Integer inspectionid;
    @SerializedName("inspectionstatusdesc")
    @Expose
    private String inspectionstatusdesc;
    @SerializedName("totalSetBack")
    @Expose
    private String totalSetBack;
    @SerializedName("presentLandUse")
    @Expose
    private String presentLandUse;
    @SerializedName("seaWallStatus")
    @Expose
    private String seaWallStatus;
    @SerializedName("village")
    @Expose
    private String village;
    @SerializedName("inspectionDate")
    @Expose
    private String inspectionDate;
    @SerializedName("revetmentStatus")
    @Expose
    private String revetmentStatus;
    @SerializedName("nearestLandMark")
    @Expose
    private String nearestLandMark;
    @SerializedName("provinceCode")
    @Expose
    private String provinceCode;
    @SerializedName("districtDesc")
    @Expose
    private String districtDesc;
    @SerializedName("employeeId")
    @Expose
    private String employeeId;
    @SerializedName("requiredDevelopment")
    @Expose
    private String requiredDevelopment;
    @SerializedName("actionTaken")
    @Expose
    private String actionTaken;
    @SerializedName("noOfFloors")
    @Expose
    private String noOfFloors;
    @SerializedName("sandy")
    @Expose
    private String sandy;
    @SerializedName("dunesStatus")
    @Expose
    private String dunesStatus;
    @SerializedName("fullname")
    @Expose
    private String fullname;
    @SerializedName("inspectionstatuscode")
    @Expose
    private String inspectionstatuscode;
    @SerializedName("availableSetBack")
    @Expose
    private String availableSetBack;
    @SerializedName("documentdetails")
    @Expose
    private List<DocumentsDetails> documentsDetails = null;
    @SerializedName("documentid")
    @Expose
    private Integer documentid;
    @SerializedName("protectedByStrucutureDeviate")
    @Expose
    private String protectedByStrucutureDeviate;
    @SerializedName("signOfErosionNewValue")
    @Expose
    private String signOfErosionNewValue;
    @SerializedName("coastalErosionRateNewValue")
    @Expose
    private String coastalErosionRateNewValue;
    @SerializedName("rockyHeadlandDeviate")
    @Expose
    private String rockyHeadlandDeviate;
    @SerializedName("coastalErosionRateDeviate")
    @Expose
    private String coastalErosionRateDeviate;
    @SerializedName("beachLengthDeviate")
    @Expose
    private String beachLengthDeviate;
    @SerializedName("dunesStatusDeviate")
    @Expose
    private String dunesStatusDeviate;
    @SerializedName("availableSetBackDeviate")
    @Expose
    private String availableSetBackDeviate;
    @SerializedName("rockyDeviate")
    @Expose
    private String rockyDeviate;
    @SerializedName("totalSetBackDeviate")
    @Expose
    private String totalSetBackDeviate;
    @SerializedName("offshoreStatusDeviate")
    @Expose
    private String offshoreStatusDeviate;
    @SerializedName("literatiHeadlandNewValue")
    @Expose
    private String literatiHeadlandNewValue;
    @SerializedName("beachWidthDeviate")
    @Expose
    private String beachWidthDeviate;
    @SerializedName("setBackNotAvailableNewValue")
    @Expose
    private String setBackNotAvailableNewValue;
    @SerializedName("noOfRoomsDeviate")
    @Expose
    private String noOfRoomsDeviate;
    @SerializedName("revetmentStatusNewValue")
    @Expose
    private String revetmentStatusNewValue;
    @SerializedName("dunesStatusNewValue")
    @Expose
    private String dunesStatusNewValue;
    @SerializedName("groynesStatusDeviate")
    @Expose
    private String groynesStatusDeviate;
    @SerializedName("coastalSegmentDeviate")
    @Expose
    private String coastalSegmentDeviate;
    @SerializedName("totalSetBackNewValue")
    @Expose
    private String totalSetBackNewValue;
    @SerializedName("reservationAreaDeviate")
    @Expose
    private String reservationAreaDeviate;
    @SerializedName("seaWallStatusDeviate")
    @Expose
    private String seaWallStatusDeviate;
    @SerializedName("presentLandUseDeviate")
    @Expose
    private String presentLandUseDeviate;
    @SerializedName("restrictedAreaNewValue")
    @Expose
    private String restrictedAreaNewValue;
    @SerializedName("reefSandStonesStatusNewValue")
    @Expose
    private String reefSandStonesStatusNewValue;
    @SerializedName("noOfFloorsDeviate")
    @Expose
    private String noOfFloorsDeviate;
    @SerializedName("groynesStatusNewValue")
    @Expose
    private String groynesStatusNewValue;
    @SerializedName("reefSandStonesStatusDeviate")
    @Expose
    private String reefSandStonesStatusDeviate;
    @SerializedName("protectedByStrucutureNewValue")
    @Expose
    private String protectedByStrucutureNewValue;
    @SerializedName("waterHolesTidePoolStatusDeviate")
    @Expose
    private String waterHolesTidePoolStatusDeviate;
    @SerializedName("waterHolesTidePoolStatusNewValue")
    @Expose
    private String waterHolesTidePoolStatusNewValue;
    @SerializedName("setBackNotAvailableDeviate")
    @Expose
    private String setBackNotAvailableDeviate;
    @SerializedName("offshoreStatusNewValue")
    @Expose
    private String offshoreStatusNewValue;
    @SerializedName("availableSetBackNewValue")
    @Expose
    private String availableSetBackNewValue;
    @SerializedName("coastalSegmentNewValue")
    @Expose
    private String coastalSegmentNewValue;
    @SerializedName("sandyNewValue")
    @Expose
    private String sandyNewValue;
    @SerializedName("culturalMonumentsDeviate")
    @Expose
    private String culturalMonumentsDeviate;
    @SerializedName("sandyDeviate")
    @Expose
    private String sandyDeviate;
    @SerializedName("restrictedAreaDeviate")
    @Expose
    private String restrictedAreaDeviate;
    @SerializedName("beachWidthNewValue")
    @Expose
    private String beachWidthNewValue;
    @SerializedName("revetmentStatusDeviate")
    @Expose
    private String revetmentStatusDeviate;
    @SerializedName("seaWallStatusNewValue")
    @Expose
    private String seaWallStatusNewValue;
    @SerializedName("rockyNewValue")
    @Expose
    private String rockyNewValue;
    @SerializedName("marshStatusNewValue")
    @Expose
    private String marshStatusNewValue;
    @SerializedName("rockyCliffStatusDeviate")
    @Expose
    private String rockyCliffStatusDeviate;
    @SerializedName("marineParksDeviate")
    @Expose
    private String marineParksDeviate;
    @SerializedName("rockyCliffStatusNewValue")
    @Expose
    private String rockyCliffStatusNewValue;
    @SerializedName("signOfErosionDeviate")
    @Expose
    private String signOfErosionDeviate;
    @SerializedName("noOfRoomsNewValue")
    @Expose
    private String noOfRoomsNewValue;
    @SerializedName("literatiHeadlandDeviate")
    @Expose
    private String literatiHeadlandDeviate;
    @SerializedName("totalFloorAreaNewValue")
    @Expose
    private String totalFloorAreaNewValue;
    @SerializedName("beachLengthNewValue")
    @Expose
    private String beachLengthNewValue;
    @SerializedName("noOfFloorsNewValue")
    @Expose
    private String noOfFloorsNewValue;
    @SerializedName("presentLandUseNewValue")
    @Expose
    private String presentLandUseNewValue;
    @SerializedName("marineParksNewValue")
    @Expose
    private String marineParksNewValue;
    @SerializedName("culturalMonumentsNewValue")
    @Expose
    private String culturalMonumentsNewValue;
    @SerializedName("totalFloorAreaDeviate")
    @Expose
    private String totalFloorAreaDeviate;
    @SerializedName("marshStatusDeviate")
    @Expose
    private String marshStatusDeviate;
    @SerializedName("reservationAreaNewValue")
    @Expose
    private String reservationAreaNewValue;
    @SerializedName("rockyHeadlandNewValue")
    @Expose
    private String rockyHeadlandNewValue;

    public String getCoastalSegment() {
        return coastalSegment;
    }

    public void setCoastalSegment(String coastalSegment) {
        this.coastalSegment = coastalSegment;
    }

    public String getProtectedByStrucuture() {
        return protectedByStrucuture;
    }

    public void setProtectedByStrucuture(String protectedByStrucuture) {
        this.protectedByStrucuture = protectedByStrucuture;
    }

    public String getRestrictedArea() {
        return restrictedArea;
    }

    public void setRestrictedArea(String restrictedArea) {
        this.restrictedArea = restrictedArea;
    }

    public String getMarshStatus() {
        return marshStatus;
    }

    public void setMarshStatus(String marshStatus) {
        this.marshStatus = marshStatus;
    }

    public String getSignOfErosion() {
        return signOfErosion;
    }

    public void setSignOfErosion(String signOfErosion) {
        this.signOfErosion = signOfErosion;
    }

    public String getAnyProposals() {
        return anyProposals;
    }

    public void setAnyProposals(String anyProposals) {
        this.anyProposals = anyProposals;
    }

    public String getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

    public String getNatureofInspection() {
        return natureofInspection;
    }

    public void setNatureofInspection(String natureofInspection) {
        this.natureofInspection = natureofInspection;
    }

    public String getBeachsideLandside() {
        return beachsideLandside;
    }

    public void setBeachsideLandside(String beachsideLandside) {
        this.beachsideLandside = beachsideLandside;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getTotalFloorArea() {
        return totalFloorArea;
    }

    public void setTotalFloorArea(String totalFloorArea) {
        this.totalFloorArea = totalFloorArea;
    }

    public String getRockyHeadland() {
        return rockyHeadland;
    }

    public void setRockyHeadland(String rockyHeadland) {
        this.rockyHeadland = rockyHeadland;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getCoastalErosionRate() {
        return coastalErosionRate;
    }

    public void setCoastalErosionRate(String coastalErosionRate) {
        this.coastalErosionRate = coastalErosionRate;
    }

    public String getCulturalMonuments() {
        return culturalMonuments;
    }

    public void setCulturalMonuments(String culturalMonuments) {
        this.culturalMonuments = culturalMonuments;
    }

    public String getSetBackNotAvailable() {
        return setBackNotAvailable;
    }

    public void setSetBackNotAvailable(String setBackNotAvailable) {
        this.setBackNotAvailable = setBackNotAvailable;
    }

    public String getPostaladdress() {
        return postaladdress;
    }

    public void setPostaladdress(String postaladdress) {
        this.postaladdress = postaladdress;
    }

    public String getGroynesStatus() {
        return groynesStatus;
    }

    public void setGroynesStatus(String groynesStatus) {
        this.groynesStatus = groynesStatus;
    }

    public String getBeachLength() {
        return beachLength;
    }

    public void setBeachLength(String beachLength) {
        this.beachLength = beachLength;
    }

    public String getReservationArea() {
        return reservationArea;
    }

    public void setReservationArea(String reservationArea) {
        this.reservationArea = reservationArea;
    }

    public List<ClearanceList> getClearancelist() {
        return clearanceList;
    }

    public void setClearancelist(List<ClearanceList> clearancelist) {
        this.clearanceList = clearancelist;
    }

    public String getWaterHolesTidePoolStatus() {
        return waterHolesTidePoolStatus;
    }

    public void setWaterHolesTidePoolStatus(String waterHolesTidePoolStatus) {
        this.waterHolesTidePoolStatus = waterHolesTidePoolStatus;
    }

    public String getProvinceDesc() {
        return provinceDesc;
    }

    public void setProvinceDesc(String provinceDesc) {
        this.provinceDesc = provinceDesc;
    }

    public String getRockyCliffStatus() {
        return rockyCliffStatus;
    }

    public void setRockyCliffStatus(String rockyCliffStatus) {
        this.rockyCliffStatus = rockyCliffStatus;
    }

    public String getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(String noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public List<InspectionGpse> getInspectionGpses() {
        return inspectionGpses;
    }

    public void setInspectionGpses(List<InspectionGpse> inspectionGpses) {
        this.inspectionGpses = inspectionGpses;
    }

    public Integer getPermitrequestid() {
        return permitrequestid;
    }

    public void setPermitrequestid(Integer permitrequestid) {
        this.permitrequestid = permitrequestid;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getOffshoreStatus() {
        return offshoreStatus;
    }

    public void setOffshoreStatus(String offshoreStatus) {
        this.offshoreStatus = offshoreStatus;
    }

    public String getMarineParks() {
        return marineParks;
    }

    public void setMarineParks(String marineParks) {
        this.marineParks = marineParks;
    }

    public String getLiteratiHeadland() {
        return literatiHeadland;
    }

    public void setLiteratiHeadland(String literatiHeadland) {
        this.literatiHeadland = literatiHeadland;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getReefSandStonesStatus() {
        return reefSandStonesStatus;
    }

    public void setReefSandStonesStatus(String reefSandStonesStatus) {
        this.reefSandStonesStatus = reefSandStonesStatus;
    }

    public String getBeachWidth() {
        return beachWidth;
    }

    public void setBeachWidth(String beachWidth) {
        this.beachWidth = beachWidth;
    }

    public String getOtherRemarks() {
        return otherRemarks;
    }

    public void setOtherRemarks(String otherRemarks) {
        this.otherRemarks = otherRemarks;
    }

    public String getStatusdesc() {
        return statusdesc;
    }

    public void setStatusdesc(String statusdesc) {
        this.statusdesc = statusdesc;
    }

    public String getRocky() {
        return rocky;
    }

    public void setRocky(String rocky) {
        this.rocky = rocky;
    }

    public Integer getInspectionid() {
        return inspectionid;
    }

    public void setInspectionid(Integer inspectionid) {
        this.inspectionid = inspectionid;
    }

    public String getInspectionstatusdesc() {
        return inspectionstatusdesc;
    }

    public void setInspectionstatusdesc(String inspectionstatusdesc) {
        this.inspectionstatusdesc = inspectionstatusdesc;
    }

    public String getTotalSetBack() {
        return totalSetBack;
    }

    public void setTotalSetBack(String totalSetBack) {
        this.totalSetBack = totalSetBack;
    }

    public String getPresentLandUse() {
        return presentLandUse;
    }

    public void setPresentLandUse(String presentLandUse) {
        this.presentLandUse = presentLandUse;
    }

    public String getSeaWallStatus() {
        return seaWallStatus;
    }

    public void setSeaWallStatus(String seaWallStatus) {
        this.seaWallStatus = seaWallStatus;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(String inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public String getRevetmentStatus() {
        return revetmentStatus;
    }

    public void setRevetmentStatus(String revetmentStatus) {
        this.revetmentStatus = revetmentStatus;
    }

    public String getNearestLandMark() {
        return nearestLandMark;
    }

    public void setNearestLandMark(String nearestLandMark) {
        this.nearestLandMark = nearestLandMark;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getDistrictDesc() {
        return districtDesc;
    }

    public void setDistrictDesc(String districtDesc) {
        this.districtDesc = districtDesc;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getRequiredDevelopment() {
        return requiredDevelopment;
    }

    public void setRequiredDevelopment(String requiredDevelopment) {
        this.requiredDevelopment = requiredDevelopment;
    }

    public String getActionTaken() {
        return actionTaken;
    }

    public void setActionTaken(String actionTaken) {
        this.actionTaken = actionTaken;
    }

    public String getNoOfFloors() {
        return noOfFloors;
    }

    public void setNoOfFloors(String noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    public String getSandy() {
        return sandy;
    }

    public void setSandy(String sandy) {
        this.sandy = sandy;
    }

    public String getDunesStatus() {
        return dunesStatus;
    }

    public void setDunesStatus(String dunesStatus) {
        this.dunesStatus = dunesStatus;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getInspectionstatuscode() {
        return inspectionstatuscode;
    }

    public void setInspectionstatuscode(String inspectionstatuscode) {
        this.inspectionstatuscode = inspectionstatuscode;
    }

    public String getAvailableSetBack() {
        return availableSetBack;
    }

    public void setAvailableSetBack(String availableSetBack) {
        this.availableSetBack = availableSetBack;
    }

    public List<DocumentsDetails> getDocumentsDetails() {
        return documentsDetails;
    }

    public void setDocumentsDetails(List<DocumentsDetails> documentsDetails) {
        this.documentsDetails = documentsDetails;
    }

    public Integer getDocumentid() {
        return documentid;
    }

    public void setDocumentid(Integer documentid) {
        this.documentid = documentid;
    }

    public String getProtectedByStrucutureDeviate() {
        return protectedByStrucutureDeviate;
    }

    public void setProtectedByStrucutureDeviate(String protectedByStrucutureDeviate) {
        this.protectedByStrucutureDeviate = protectedByStrucutureDeviate;
    }

    public String getSignOfErosionNewValue() {
        return signOfErosionNewValue;
    }

    public void setSignOfErosionNewValue(String signOfErosionNewValue) {
        this.signOfErosionNewValue = signOfErosionNewValue;
    }

    public String getCoastalErosionRateNewValue() {
        return coastalErosionRateNewValue;
    }

    public void setCoastalErosionRateNewValue(String coastalErosionRateNewValue) {
        this.coastalErosionRateNewValue = coastalErosionRateNewValue;
    }

    public String getRockyHeadlandDeviate() {
        return rockyHeadlandDeviate;
    }

    public void setRockyHeadlandDeviate(String rockyHeadlandDeviate) {
        this.rockyHeadlandDeviate = rockyHeadlandDeviate;
    }

    public String getCoastalErosionRateDeviate() {
        return coastalErosionRateDeviate;
    }

    public void setCoastalErosionRateDeviate(String coastalErosionRateDeviate) {
        this.coastalErosionRateDeviate = coastalErosionRateDeviate;
    }

    public String getBeachLengthDeviate() {
        return beachLengthDeviate;
    }

    public void setBeachLengthDeviate(String beachLengthDeviate) {
        this.beachLengthDeviate = beachLengthDeviate;
    }

    public String getDunesStatusDeviate() {
        return dunesStatusDeviate;
    }

    public void setDunesStatusDeviate(String dunesStatusDeviate) {
        this.dunesStatusDeviate = dunesStatusDeviate;
    }

    public String getAvailableSetBackDeviate() {
        return availableSetBackDeviate;
    }

    public void setAvailableSetBackDeviate(String availableSetBackDeviate) {
        this.availableSetBackDeviate = availableSetBackDeviate;
    }

    public String getRockyDeviate() {
        return rockyDeviate;
    }

    public void setRockyDeviate(String rockyDeviate) {
        this.rockyDeviate = rockyDeviate;
    }

    public String getTotalSetBackDeviate() {
        return totalSetBackDeviate;
    }

    public void setTotalSetBackDeviate(String totalSetBackDeviate) {
        this.totalSetBackDeviate = totalSetBackDeviate;
    }

    public String getOffshoreStatusDeviate() {
        return offshoreStatusDeviate;
    }

    public void setOffshoreStatusDeviate(String offshoreStatusDeviate) {
        this.offshoreStatusDeviate = offshoreStatusDeviate;
    }

    public String getLiteratiHeadlandNewValue() {
        return literatiHeadlandNewValue;
    }

    public void setLiteratiHeadlandNewValue(String literatiHeadlandNewValue) {
        this.literatiHeadlandNewValue = literatiHeadlandNewValue;
    }

    public String getBeachWidthDeviate() {
        return beachWidthDeviate;
    }

    public void setBeachWidthDeviate(String beachWidthDeviate) {
        this.beachWidthDeviate = beachWidthDeviate;
    }

    public String getSetBackNotAvailableNewValue() {
        return setBackNotAvailableNewValue;
    }

    public void setSetBackNotAvailableNewValue(String setBackNotAvailableNewValue) {
        this.setBackNotAvailableNewValue = setBackNotAvailableNewValue;
    }

    public String getNoOfRoomsDeviate() {
        return noOfRoomsDeviate;
    }

    public void setNoOfRoomsDeviate(String noOfRoomsDeviate) {
        this.noOfRoomsDeviate = noOfRoomsDeviate;
    }

    public String getRevetmentStatusNewValue() {
        return revetmentStatusNewValue;
    }

    public void setRevetmentStatusNewValue(String revetmentStatusNewValue) {
        this.revetmentStatusNewValue = revetmentStatusNewValue;
    }

    public String getDunesStatusNewValue() {
        return dunesStatusNewValue;
    }

    public void setDunesStatusNewValue(String dunesStatusNewValue) {
        this.dunesStatusNewValue = dunesStatusNewValue;
    }

    public String getGroynesStatusDeviate() {
        return groynesStatusDeviate;
    }

    public void setGroynesStatusDeviate(String groynesStatusDeviate) {
        this.groynesStatusDeviate = groynesStatusDeviate;
    }

    public String getCoastalSegmentDeviate() {
        return coastalSegmentDeviate;
    }

    public void setCoastalSegmentDeviate(String coastalSegmentDeviate) {
        this.coastalSegmentDeviate = coastalSegmentDeviate;
    }

    public String getTotalSetBackNewValue() {
        return totalSetBackNewValue;
    }

    public void setTotalSetBackNewValue(String totalSetBackNewValue) {
        this.totalSetBackNewValue = totalSetBackNewValue;
    }

    public String getReservationAreaDeviate() {
        return reservationAreaDeviate;
    }

    public void setReservationAreaDeviate(String reservationAreaDeviate) {
        this.reservationAreaDeviate = reservationAreaDeviate;
    }

    public String getSeaWallStatusDeviate() {
        return seaWallStatusDeviate;
    }

    public void setSeaWallStatusDeviate(String seaWallStatusDeviate) {
        this.seaWallStatusDeviate = seaWallStatusDeviate;
    }

    public String getPresentLandUseDeviate() {
        return presentLandUseDeviate;
    }

    public void setPresentLandUseDeviate(String presentLandUseDeviate) {
        this.presentLandUseDeviate = presentLandUseDeviate;
    }

    public String getRestrictedAreaNewValue() {
        return restrictedAreaNewValue;
    }

    public void setRestrictedAreaNewValue(String restrictedAreaNewValue) {
        this.restrictedAreaNewValue = restrictedAreaNewValue;
    }

    public String getReefSandStonesStatusNewValue() {
        return reefSandStonesStatusNewValue;
    }

    public void setReefSandStonesStatusNewValue(String reefSandStonesStatusNewValue) {
        this.reefSandStonesStatusNewValue = reefSandStonesStatusNewValue;
    }

    public String getNoOfFloorsDeviate() {
        return noOfFloorsDeviate;
    }

    public void setNoOfFloorsDeviate(String noOfFloorsDeviate) {
        this.noOfFloorsDeviate = noOfFloorsDeviate;
    }

    public String getGroynesStatusNewValue() {
        return groynesStatusNewValue;
    }

    public void setGroynesStatusNewValue(String groynesStatusNewValue) {
        this.groynesStatusNewValue = groynesStatusNewValue;
    }

    public String getReefSandStonesStatusDeviate() {
        return reefSandStonesStatusDeviate;
    }

    public void setReefSandStonesStatusDeviate(String reefSandStonesStatusDeviate) {
        this.reefSandStonesStatusDeviate = reefSandStonesStatusDeviate;
    }

    public String getProtectedByStrucutureNewValue() {
        return protectedByStrucutureNewValue;
    }

    public void setProtectedByStrucutureNewValue(String protectedByStrucutureNewValue) {
        this.protectedByStrucutureNewValue = protectedByStrucutureNewValue;
    }

    public String getWaterHolesTidePoolStatusDeviate() {
        return waterHolesTidePoolStatusDeviate;
    }

    public void setWaterHolesTidePoolStatusDeviate(String waterHolesTidePoolStatusDeviate) {
        this.waterHolesTidePoolStatusDeviate = waterHolesTidePoolStatusDeviate;
    }

    public String getWaterHolesTidePoolStatusNewValue() {
        return waterHolesTidePoolStatusNewValue;
    }

    public void setWaterHolesTidePoolStatusNewValue(String waterHolesTidePoolStatusNewValue) {
        this.waterHolesTidePoolStatusNewValue = waterHolesTidePoolStatusNewValue;
    }

    public String getSetBackNotAvailableDeviate() {
        return setBackNotAvailableDeviate;
    }

    public void setSetBackNotAvailableDeviate(String setBackNotAvailableDeviate) {
        this.setBackNotAvailableDeviate = setBackNotAvailableDeviate;
    }

    public String getOffshoreStatusNewValue() {
        return offshoreStatusNewValue;
    }

    public void setOffshoreStatusNewValue(String offshoreStatusNewValue) {
        this.offshoreStatusNewValue = offshoreStatusNewValue;
    }

    public String getAvailableSetBackNewValue() {
        return availableSetBackNewValue;
    }

    public void setAvailableSetBackNewValue(String availableSetBackNewValue) {
        this.availableSetBackNewValue = availableSetBackNewValue;
    }

    public String getCoastalSegmentNewValue() {
        return coastalSegmentNewValue;
    }

    public void setCoastalSegmentNewValue(String coastalSegmentNewValue) {
        this.coastalSegmentNewValue = coastalSegmentNewValue;
    }

    public String getSandyNewValue() {
        return sandyNewValue;
    }

    public void setSandyNewValue(String sandyNewValue) {
        this.sandyNewValue = sandyNewValue;
    }

    public String getCulturalMonumentsDeviate() {
        return culturalMonumentsDeviate;
    }

    public void setCulturalMonumentsDeviate(String culturalMonumentsDeviate) {
        this.culturalMonumentsDeviate = culturalMonumentsDeviate;
    }

    public String getSandyDeviate() {
        return sandyDeviate;
    }

    public void setSandyDeviate(String sandyDeviate) {
        this.sandyDeviate = sandyDeviate;
    }

    public String getRestrictedAreaDeviate() {
        return restrictedAreaDeviate;
    }

    public void setRestrictedAreaDeviate(String restrictedAreaDeviate) {
        this.restrictedAreaDeviate = restrictedAreaDeviate;
    }

    public String getBeachWidthNewValue() {
        return beachWidthNewValue;
    }

    public void setBeachWidthNewValue(String beachWidthNewValue) {
        this.beachWidthNewValue = beachWidthNewValue;
    }

    public String getRevetmentStatusDeviate() {
        return revetmentStatusDeviate;
    }

    public void setRevetmentStatusDeviate(String revetmentStatusDeviate) {
        this.revetmentStatusDeviate = revetmentStatusDeviate;
    }

    public String getSeaWallStatusNewValue() {
        return seaWallStatusNewValue;
    }

    public void setSeaWallStatusNewValue(String seaWallStatusNewValue) {
        this.seaWallStatusNewValue = seaWallStatusNewValue;
    }

    public String getRockyNewValue() {
        return rockyNewValue;
    }

    public void setRockyNewValue(String rockyNewValue) {
        this.rockyNewValue = rockyNewValue;
    }

    public String getMarshStatusNewValue() {
        return marshStatusNewValue;
    }

    public void setMarshStatusNewValue(String marshStatusNewValue) {
        this.marshStatusNewValue = marshStatusNewValue;
    }

    public String getRockyCliffStatusDeviate() {
        return rockyCliffStatusDeviate;
    }

    public void setRockyCliffStatusDeviate(String rockyCliffStatusDeviate) {
        this.rockyCliffStatusDeviate = rockyCliffStatusDeviate;
    }

    public String getMarineParksDeviate() {
        return marineParksDeviate;
    }

    public void setMarineParksDeviate(String marineParksDeviate) {
        this.marineParksDeviate = marineParksDeviate;
    }

    public String getRockyCliffStatusNewValue() {
        return rockyCliffStatusNewValue;
    }

    public void setRockyCliffStatusNewValue(String rockyCliffStatusNewValue) {
        this.rockyCliffStatusNewValue = rockyCliffStatusNewValue;
    }

    public String getSignOfErosionDeviate() {
        return signOfErosionDeviate;
    }

    public void setSignOfErosionDeviate(String signOfErosionDeviate) {
        this.signOfErosionDeviate = signOfErosionDeviate;
    }

    public String getNoOfRoomsNewValue() {
        return noOfRoomsNewValue;
    }

    public void setNoOfRoomsNewValue(String noOfRoomsNewValue) {
        this.noOfRoomsNewValue = noOfRoomsNewValue;
    }

    public String getLiteratiHeadlandDeviate() {
        return literatiHeadlandDeviate;
    }

    public void setLiteratiHeadlandDeviate(String literatiHeadlandDeviate) {
        this.literatiHeadlandDeviate = literatiHeadlandDeviate;
    }

    public String getTotalFloorAreaNewValue() {
        return totalFloorAreaNewValue;
    }

    public void setTotalFloorAreaNewValue(String totalFloorAreaNewValue) {
        this.totalFloorAreaNewValue = totalFloorAreaNewValue;
    }

    public String getBeachLengthNewValue() {
        return beachLengthNewValue;
    }

    public void setBeachLengthNewValue(String beachLengthNewValue) {
        this.beachLengthNewValue = beachLengthNewValue;
    }

    public String getNoOfFloorsNewValue() {
        return noOfFloorsNewValue;
    }

    public void setNoOfFloorsNewValue(String noOfFloorsNewValue) {
        this.noOfFloorsNewValue = noOfFloorsNewValue;
    }

    public String getPresentLandUseNewValue() {
        return presentLandUseNewValue;
    }

    public void setPresentLandUseNewValue(String presentLandUseNewValue) {
        this.presentLandUseNewValue = presentLandUseNewValue;
    }

    public String getMarineParksNewValue() {
        return marineParksNewValue;
    }

    public void setMarineParksNewValue(String marineParksNewValue) {
        this.marineParksNewValue = marineParksNewValue;
    }

    public String getCulturalMonumentsNewValue() {
        return culturalMonumentsNewValue;
    }

    public void setCulturalMonumentsNewValue(String culturalMonumentsNewValue) {
        this.culturalMonumentsNewValue = culturalMonumentsNewValue;
    }

    public String getTotalFloorAreaDeviate() {
        return totalFloorAreaDeviate;
    }

    public void setTotalFloorAreaDeviate(String totalFloorAreaDeviate) {
        this.totalFloorAreaDeviate = totalFloorAreaDeviate;
    }

    public String getMarshStatusDeviate() {
        return marshStatusDeviate;
    }

    public void setMarshStatusDeviate(String marshStatusDeviate) {
        this.marshStatusDeviate = marshStatusDeviate;
    }

    public String getReservationAreaNewValue() {
        return reservationAreaNewValue;
    }

    public void setReservationAreaNewValue(String reservationAreaNewValue) {
        this.reservationAreaNewValue = reservationAreaNewValue;
    }

    public String getRockyHeadlandNewValue() {
        return rockyHeadlandNewValue;
    }

    public void setRockyHeadlandNewValue(String rockyHeadlandNewValue) {
        this.rockyHeadlandNewValue = rockyHeadlandNewValue;
    }

}

