package uvsoftgroup.uvsoftgroupgeospatial.repository;

public interface GeometryGisInfoData {
	long getGeoId();
	Long getAdId();
	Long getPlId();
	Long getBuId();
	Long getFlId();
	Long getUnId();
	Long getUserRefNrId();
	Long getAdRefId();
	String getAdType();
	String getAdCat();
	String getAdCity();
	String getAdRoad();
	String getAdRoadType();
	String getAdHouseNumber();
	String getAdPostCode();
	String getAdCountry();
	String getGeoType();
	String getWktToGeometry();
	
}
