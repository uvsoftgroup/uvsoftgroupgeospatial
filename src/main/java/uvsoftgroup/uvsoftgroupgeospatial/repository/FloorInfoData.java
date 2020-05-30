package uvsoftgroup.uvsoftgroupgeospatial.repository;

public interface FloorInfoData {
	Long getFlId();
	Long getFlAdId();
	Long getPlId();
	Long getBuId();
	Long getGeoId();
	String getFlCode();
	String getFlName();
	String getFlUseType();
	String getFlRemark();
	Double getFlNumberOfFloor();
	Double getFlTotalHeight();
	Double getFlNumberOfFloorUnit();
	Double getFlTotalGroundArea();
	Double getFlTotalFloorArea();
	Double getFlSetBackFront();
	Double getFlSetBackBack();
	Double getFlSetBackRight();
	Double getFlSetBackLeft();
	Double getFlCenterLongitude();
	Double getFlCenterLatitude();
    byte[] getFlLayoutPicture();
	
}
