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
@Table(name="building_info")
public class BuildingInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long buId;
	Long buAdId,plId, geoId;
	String buCode,buName,buUseType,buRemark;
	Double buNumberOfFloor,buTotalHeight,buNumberOfFloorUnit,buTotalGroundArea,buTotalFloorArea;
	Double buSetBackFront,buSetBackBack,buSetBackRight,buSetBackLeft,buCenterLongitude,buCenterLatitude;
	byte [] buLayoutPicture;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="bu_id_id")
	List<GeometryGisInfo> geometryGisInfos=new ArrayList<GeometryGisInfo>();
	
	// default constructor method
	public BuildingInfo() {
		super();
	}

	public Long getBuId() {
		return buId;
	}

	public void setBuId(Long buId) {
		this.buId = buId;
	}

	public Long getBuAdId() {
		return buAdId;
	}

	public void setBuAdId(Long buAdId) {
		this.buAdId = buAdId;
	}

	public Long getPlId() {
		return plId;
	}

	public void setPlId(Long plId) {
		this.plId = plId;
	}

	public Long getGeoId() {
		return geoId;
	}

	public void setGeoId(Long geoId) {
		this.geoId = geoId;
	}

	public String getBuCode() {
		return buCode;
	}

	public void setBuCode(String buCode) {
		this.buCode = buCode;
	}

	public String getBuName() {
		return buName;
	}

	public void setBuName(String buName) {
		this.buName = buName;
	}

	public String getBuUseType() {
		return buUseType;
	}

	public void setBuUseType(String buUseType) {
		this.buUseType = buUseType;
	}

	public String getBuRemark() {
		return buRemark;
	}

	public void setBuRemark(String buRemark) {
		this.buRemark = buRemark;
	}

	public Double getBuNumberOfFloor() {
		return buNumberOfFloor;
	}

	public void setBuNumberOfFloor(Double buNumberOfFloor) {
		this.buNumberOfFloor = buNumberOfFloor;
	}

	public Double getBuTotalHeight() {
		return buTotalHeight;
	}

	public void setBuTotalHeight(Double buTotalHeight) {
		this.buTotalHeight = buTotalHeight;
	}

	public Double getBuNumberOfFloorUnit() {
		return buNumberOfFloorUnit;
	}

	public void setBuNumberOfFloorUnit(Double buNumberOfFloorUnit) {
		this.buNumberOfFloorUnit = buNumberOfFloorUnit;
	}

	public Double getBuTotalGroundArea() {
		return buTotalGroundArea;
	}

	public void setBuTotalGroundArea(Double buTotalGroundArea) {
		this.buTotalGroundArea = buTotalGroundArea;
	}

	public Double getBuTotalFloorArea() {
		return buTotalFloorArea;
	}

	public void setBuTotalFloorArea(Double buTotalFloorArea) {
		this.buTotalFloorArea = buTotalFloorArea;
	}

	public Double getBuSetBackFront() {
		return buSetBackFront;
	}

	public void setBuSetBackFront(Double buSetBackFront) {
		this.buSetBackFront = buSetBackFront;
	}

	public Double getBuSetBackBack() {
		return buSetBackBack;
	}

	public void setBuSetBackBack(Double buSetBackBack) {
		this.buSetBackBack = buSetBackBack;
	}

	public Double getBuSetBackRight() {
		return buSetBackRight;
	}

	public void setBuSetBackRight(Double buSetBackRight) {
		this.buSetBackRight = buSetBackRight;
	}

	public Double getBuSetBackLeft() {
		return buSetBackLeft;
	}

	public void setBuSetBackLeft(Double buSetBackLeft) {
		this.buSetBackLeft = buSetBackLeft;
	}

	public Double getBuCenterLongitude() {
		return buCenterLongitude;
	}

	public void setBuCenterLongitude(Double buCenterLongitude) {
		this.buCenterLongitude = buCenterLongitude;
	}

	public Double getBuCenterLatitude() {
		return buCenterLatitude;
	}

	public void setBuCenterLatitude(Double buCenterLatitude) {
		this.buCenterLatitude = buCenterLatitude;
	}

	public byte[] getBuLayoutPicture() {
		return buLayoutPicture;
	}

	public void setBuLayoutPicture(byte[] buLayoutPicture) {
		this.buLayoutPicture = buLayoutPicture;
	}

	public List<GeometryGisInfo> getGeometryGisInfos() {
		return geometryGisInfos;
	}

	public void setGeometryGisInfos(List<GeometryGisInfo> geometryGisInfos) {
		this.geometryGisInfos = geometryGisInfos;
	}

	
}
