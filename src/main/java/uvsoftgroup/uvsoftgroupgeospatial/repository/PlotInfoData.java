package uvsoftgroup.uvsoftgroupgeospatial.repository;

public interface PlotInfoData {
	Long getPlId();
	Long getPlAdId();
	Long getGeoId();
	String getPlCode();
	String getPlName(); 
	String getPlType();
	String getPlNumber();
	String getPlMonzaNumber();
	String getPlCSNumber();
	String getPlMSNumber();
	String getPlRemark();
	Double getPlTotalArea();
	Double getPlTotalBuildingCoverArea();
	Double getPlNumberOfBuilding();
	Double getPlHeightFromMSL();
	Double getPlCenterLongitude();
	Double getPlCenterLatitude();
	byte[] getUtilityLocationMap();
	byte[] getPlLayoutPicture();
}
