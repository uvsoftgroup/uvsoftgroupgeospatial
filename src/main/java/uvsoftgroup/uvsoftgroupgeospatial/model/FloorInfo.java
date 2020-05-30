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
@Table(name="floor_info")
public class FloorInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long flId;
	Long flAdId,plId,buId,geoId;
	String flCode,flName,flUseType,flRemark;
	Double flNumberOfFloor,flTotalHeight,flNumberOfFloorUnit,flTotalGroundArea,flTotalFloorArea;
	Double flSetBackFront,flSetBackBack,flSetBackRight,flSetBackLeft,flCenterLongitude,flCenterLatitude;
	byte [] flLayoutPicture;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="fl_id_id")
	List<GeometryGisInfo> geometryGisInfos=new ArrayList<GeometryGisInfo>();
	// default constructor method
	public FloorInfo() {
		super();
	}
	public Long getFlId() {
		return flId;
	}
	public void setFlId(Long flId) {
		this.flId = flId;
	}
	public Long getFlAdId() {
		return flAdId;
	}
	public void setFlAdId(Long flAdId) {
		this.flAdId = flAdId;
	}
	public Long getBuId() {
		return buId;
	}
	public void setBuId(Long buId) {
		this.buId = buId;
	}
	public Long getGeoId() {
		return geoId;
	}
	public void setGeoId(Long geoId) {
		this.geoId = geoId;
	}
	public String getFlCode() {
		return flCode;
	}
	public void setFlCode(String flCode) {
		this.flCode = flCode;
	}
	public String getFlName() {
		return flName;
	}
	public void setFlName(String flName) {
		this.flName = flName;
	}
	public String getFlUseType() {
		return flUseType;
	}
	public void setFlUseType(String flUseType) {
		this.flUseType = flUseType;
	}
	public String getFlRemark() {
		return flRemark;
	}
	public void setFlRemark(String flRemark) {
		this.flRemark = flRemark;
	}
	public Double getFlNumberOfFloor() {
		return flNumberOfFloor;
	}
	public void setFlNumberOfFloor(Double flNumberOfFloor) {
		this.flNumberOfFloor = flNumberOfFloor;
	}
	public Double getFlTotalHeight() {
		return flTotalHeight;
	}
	public void setFlTotalHeight(Double flTotalHeight) {
		this.flTotalHeight = flTotalHeight;
	}
	public Double getFlNumberOfFloorUnit() {
		return flNumberOfFloorUnit;
	}
	public void setFlNumberOfFloorUnit(Double flNumberOfFloorUnit) {
		this.flNumberOfFloorUnit = flNumberOfFloorUnit;
	}
	public Double getFlTotalGroundArea() {
		return flTotalGroundArea;
	}
	public void setFlTotalGroundArea(Double flTotalGroundArea) {
		this.flTotalGroundArea = flTotalGroundArea;
	}
	public Double getFlTotalFloorArea() {
		return flTotalFloorArea;
	}
	public void setFlTotalFloorArea(Double flTotalFloorArea) {
		this.flTotalFloorArea = flTotalFloorArea;
	}
	public Double getFlSetBackFront() {
		return flSetBackFront;
	}
	public void setFlSetBackFront(Double flSetBackFront) {
		this.flSetBackFront = flSetBackFront;
	}
	public Double getFlSetBackBack() {
		return flSetBackBack;
	}
	public void setFlSetBackBack(Double flSetBackBack) {
		this.flSetBackBack = flSetBackBack;
	}
	public Double getFlSetBackRight() {
		return flSetBackRight;
	}
	public void setFlSetBackRight(Double flSetBackRight) {
		this.flSetBackRight = flSetBackRight;
	}
	public Double getFlSetBackLeft() {
		return flSetBackLeft;
	}
	public void setFlSetBackLeft(Double flSetBackLeft) {
		this.flSetBackLeft = flSetBackLeft;
	}
	public Double getFlCenterLongitude() {
		return flCenterLongitude;
	}
	public void setFlCenterLongitude(Double flCenterLongitude) {
		this.flCenterLongitude = flCenterLongitude;
	}
	public Double getFlCenterLatitude() {
		return flCenterLatitude;
	}
	public void setFlCenterLatitude(Double flCenterLatitude) {
		this.flCenterLatitude = flCenterLatitude;
	}
	public byte[] getFlLayoutPicture() {
		return flLayoutPicture;
	}
	public void setFlLayoutPicture(byte[] flLayoutPicture) {
		this.flLayoutPicture = flLayoutPicture;
	}
	public List<GeometryGisInfo> getGeometryGisInfos() {
		return geometryGisInfos;
	}
	public void setGeometryGisInfos(List<GeometryGisInfo> geometryGisInfos) {
		this.geometryGisInfos = geometryGisInfos;
	}
	public Long getPlId() {
		return plId;
	}
	public void setPlId(Long plId) {
		this.plId = plId;
	}
	
}
