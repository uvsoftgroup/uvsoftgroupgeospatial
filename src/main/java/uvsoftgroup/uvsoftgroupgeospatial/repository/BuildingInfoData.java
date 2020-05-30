package uvsoftgroup.uvsoftgroupgeospatial.repository;

public interface BuildingInfoData {
	Long getBuId();
	Long getBuAdId(); 
	Long getPlId();
	Long getGeoId();
	String getBuCode();
	String getBuName();
	String getBuUseType();
	String getBuRemark();
	Double getBuNumberOfFloor();
	Double getBuTotalHeight();
	Double getBuNumberOfFloorUnit();
	Double getBuTotalGroundArea();
	Double getBuTotalFloorArea();
	Double getBuSetBackFront();
	Double getBuSetBackBack();
	Double getBuSetBackRight();
	Double getBuSetBackLeft();
	Double getBuCenterLongitude();
	Double getBuCenterLatitude();
	byte[] getBuLayoutPicture();
	
}
