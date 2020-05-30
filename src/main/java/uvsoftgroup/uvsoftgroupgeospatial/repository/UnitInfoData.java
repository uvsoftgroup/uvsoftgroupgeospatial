package uvsoftgroup.uvsoftgroupgeospatial.repository;

public interface UnitInfoData {
	Long getUnId();
	Long getUnAdId();
	Long getPlId();
	Long getBuId();
	Long getUnFlId();
	Long getGeoId();
	Long getUnNumOfRoom();
	String getUnCode();
	String getUnName();
	String getUnUseType();
	String getUnRemark();
	Double getUnTotalHeight();
	Double getUnNumOfSubUnit();
	Double getUnTotalUnitArea();
	Double getUnTotalBuArea();
	Double getUnSetBackFront();
	Double getUnSetBackBack();
	Double getUnSetBackRight();
	Double getUnSetBackLeft();
	Double getUnCenterLongitude();
	Double getUnCenterLatitude();
	byte[] getUnLayoutPicture();
	
}
