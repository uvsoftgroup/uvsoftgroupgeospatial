package uvsoftgroup.uvsoftgroupgeospatial.model;

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
@Table(name="unit_info")
public class UnitInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long unId;
	Long unAdId,plId,buId,flId,geoId;
	Long unNumOfRoom;
	String unCode,unName,unUseType,unRemark;
	Double unTotalHeight,unNumOfSubUnit,unTotalUnitArea,unTotalBuArea;
	Double unSetBackFront,unSetBackBack,unSetBackRight,unSetBackLeft;
	Double unCenterLongitude,unCenterLatitude;
	byte [] unLayoutPicture;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="un_id_id")
	List<GeometryGisInfo> geometryGisInfos=new ArrayList<GeometryGisInfo>();
	// default constructor method
	public UnitInfo() {
		super();
	}
	public Long getUnId() {
		return unId;
	}
	public void setUnId(Long unId) {
		this.unId = unId;
	}
	public Long getUnAdId() {
		return unAdId;
	}
	public void setUnAdId(Long unAdId) {
		this.unAdId = unAdId;
	}
	public Long getPlId() {
		return plId;
	}
	public void setPlId(Long plId) {
		this.plId = plId;
	}
	public Long getBuId() {
		return buId;
	}
	public void setBuId(Long buId) {
		this.buId = buId;
	}
	public Long getFlId() {
		return flId;
	}
	public void setFlId(Long flId) {
		this.flId = flId;
	}
	public Long getGeoId() {
		return geoId;
	}
	public void setGeoId(Long geoId) {
		this.geoId = geoId;
	}
	public Long getUnNumOfRoom() {
		return unNumOfRoom;
	}
	public void setUnNumOfRoom(Long unNumOfRoom) {
		this.unNumOfRoom = unNumOfRoom;
	}
	public String getUnCode() {
		return unCode;
	}
	public void setUnCode(String unCode) {
		this.unCode = unCode;
	}
	public String getUnName() {
		return unName;
	}
	public void setUnName(String unName) {
		this.unName = unName;
	}
	public String getUnUseType() {
		return unUseType;
	}
	public void setUnUseType(String unUseType) {
		this.unUseType = unUseType;
	}
	public String getUnRemark() {
		return unRemark;
	}
	public void setUnRemark(String unRemark) {
		this.unRemark = unRemark;
	}
	public Double getUnTotalHeight() {
		return unTotalHeight;
	}
	public void setUnTotalHeight(Double unTotalHeight) {
		this.unTotalHeight = unTotalHeight;
	}
	public Double getUnNumOfSubUnit() {
		return unNumOfSubUnit;
	}
	public void setUnNumOfSubUnit(Double unNumOfSubUnit) {
		this.unNumOfSubUnit = unNumOfSubUnit;
	}
	public Double getUnTotalUnitArea() {
		return unTotalUnitArea;
	}
	public void setUnTotalUnitArea(Double unTotalUnitArea) {
		this.unTotalUnitArea = unTotalUnitArea;
	}
	public Double getUnTotalBuArea() {
		return unTotalBuArea;
	}
	public void setUnTotalBuArea(Double unTotalBuArea) {
		this.unTotalBuArea = unTotalBuArea;
	}
	public Double getUnSetBackFront() {
		return unSetBackFront;
	}
	public void setUnSetBackFront(Double unSetBackFront) {
		this.unSetBackFront = unSetBackFront;
	}
	public Double getUnSetBackBack() {
		return unSetBackBack;
	}
	public void setUnSetBackBack(Double unSetBackBack) {
		this.unSetBackBack = unSetBackBack;
	}
	public Double getUnSetBackRight() {
		return unSetBackRight;
	}
	public void setUnSetBackRight(Double unSetBackRight) {
		this.unSetBackRight = unSetBackRight;
	}
	public Double getUnSetBackLeft() {
		return unSetBackLeft;
	}
	public void setUnSetBackLeft(Double unSetBackLeft) {
		this.unSetBackLeft = unSetBackLeft;
	}
	public Double getUnCenterLongitude() {
		return unCenterLongitude;
	}
	public void setUnCenterLongitude(Double unCenterLongitude) {
		this.unCenterLongitude = unCenterLongitude;
	}
	public Double getUnCenterLatitude() {
		return unCenterLatitude;
	}
	public void setUnCenterLatitude(Double unCenterLatitude) {
		this.unCenterLatitude = unCenterLatitude;
	}
	public byte[] getUnLayoutPicture() {
		return unLayoutPicture;
	}
	public void setUnLayoutPicture(byte[] unLayoutPicture) {
		this.unLayoutPicture = unLayoutPicture;
	}
	public List<GeometryGisInfo> getGeometryGisInfos() {
		return geometryGisInfos;
	}
	public void setGeometryGisInfos(List<GeometryGisInfo> geometryGisInfos) {
		this.geometryGisInfos = geometryGisInfos;
	}
	
}
