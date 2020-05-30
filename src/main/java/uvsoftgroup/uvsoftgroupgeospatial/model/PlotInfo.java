package uvsoftgroup.uvsoftgroupgeospatial.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="plot_info")
public class PlotInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long plId;
	Long plAdId,geoId;
	String plCode, plName, plType, plNumber, plMonzaNumber, plCSNumber, plMSNumber, plRemark;
	Double plTotalArea, plTotalBuildingCoverArea, plNumberOfBuilding, plHeightFromMSL;
	Double plCenterLongitude,plCenterLatitude;
	byte[] plLayoutPicture, utilityLocationMap;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="pl_id_id")
	List<GeometryGisInfo> geometryGisInfos=new ArrayList<GeometryGisInfo>();
	
	// default constructor method
	public PlotInfo() {
		super();
	}

	public Long getPlId() {
		return plId;
	}

	public void setPlId(Long plId) {
		this.plId = plId;
	}

	public Long getPlAdId() {
		return plAdId;
	}

	public void setPlAdId(Long plAdId) {
		this.plAdId = plAdId;
	}

	public Long getGeoId() {
		return geoId;
	}

	public void setGeoId(Long geoId) {
		this.geoId = geoId;
	}

	public String getPlCode() {
		return plCode;
	}

	public void setPlCode(String plCode) {
		this.plCode = plCode;
	}

	public String getPlName() {
		return plName;
	}

	public void setPlName(String plName) {
		this.plName = plName;
	}

	public String getPlType() {
		return plType;
	}

	public void setPlType(String plType) {
		this.plType = plType;
	}

	public String getPlNumber() {
		return plNumber;
	}

	public void setPlNumber(String plNumber) {
		this.plNumber = plNumber;
	}

	public String getPlMonzaNumber() {
		return plMonzaNumber;
	}

	public void setPlMonzaNumber(String plMonzaNumber) {
		this.plMonzaNumber = plMonzaNumber;
	}

	public String getPlCSNumber() {
		return plCSNumber;
	}

	public void setPlCSNumber(String plCSNumber) {
		this.plCSNumber = plCSNumber;
	}

	public String getPlMSNumber() {
		return plMSNumber;
	}

	public void setPlMSNumber(String plMSNumber) {
		this.plMSNumber = plMSNumber;
	}

	public String getPlRemark() {
		return plRemark;
	}

	public void setPlRemark(String plRemark) {
		this.plRemark = plRemark;
	}

	public Double getPlTotalArea() {
		return plTotalArea;
	}

	public void setPlTotalArea(Double plTotalArea) {
		this.plTotalArea = plTotalArea;
	}

	public Double getPlTotalBuildingCoverArea() {
		return plTotalBuildingCoverArea;
	}

	public void setPlTotalBuildingCoverArea(Double plTotalBuildingCoverArea) {
		this.plTotalBuildingCoverArea = plTotalBuildingCoverArea;
	}

	public Double getPlNumberOfBuilding() {
		return plNumberOfBuilding;
	}

	public void setPlNumberOfBuilding(Double plNumberOfBuilding) {
		this.plNumberOfBuilding = plNumberOfBuilding;
	}

	public Double getPlHeightFromMSL() {
		return plHeightFromMSL;
	}

	public void setPlHeightFromMSL(Double plHeightFromMSL) {
		this.plHeightFromMSL = plHeightFromMSL;
	}

	public Double getPlCenterLongitude() {
		return plCenterLongitude;
	}

	public void setPlCenterLongitude(Double plCenterLongitude) {
		this.plCenterLongitude = plCenterLongitude;
	}

	public Double getPlCenterLatitude() {
		return plCenterLatitude;
	}

	public void setPlCenterLatitude(Double plCenterLatitude) {
		this.plCenterLatitude = plCenterLatitude;
	}

	public byte[] getPlLayoutPicture() {
		return plLayoutPicture;
	}

	public void setPlLayoutPicture(byte[] plLayoutPicture) {
		this.plLayoutPicture = plLayoutPicture;
	}

	public byte[] getUtilityLocationMap() {
		return utilityLocationMap;
	}

	public void setUtilityLocationMap(byte[] utilityLocationMap) {
		this.utilityLocationMap = utilityLocationMap;
	}

	public List<GeometryGisInfo> getGeometryGisInfos() {
		return geometryGisInfos;
	}

	public void setGeometryGisInfos(List<GeometryGisInfo> geometryGisInfos) {
		this.geometryGisInfos = geometryGisInfos;
	}
    
}
