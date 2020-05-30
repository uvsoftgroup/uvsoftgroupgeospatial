package uvsoftgroup.uvsoftgroupgeospatial;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlotInfoServiceTest {

	 /*
	@Autowired
	private PlotInfoService plotInfoService;

	@Test
	public void savePlotInfoTestCase() {
		String pointCoordinate = "POINT(90.4056285 23.7936486)";
		String lineStringCoordinate = "LINESTRING(91.8260383 22.3350247,91.826177 22.3355788)";
		String multilineStringCoordinate = "MULTILINESTRING((89.0502969 26.1757997,89.0551786 26.1796252))";
		String multiPolygonCoordinate = "MULTIPOLYGON(((90.4048766 23.72359,90.4048648 23.7234267,90.4049919 23.7234214,90.4048766 23.72359)),"
				+ "((90.4048767 23.72360,90.4048648 23.7234267,90.4049919 23.7234214,90.4048767 23.72360)))";
		
		String geometryCollection="GEOMETRYCOLLECTION(POINT(90.4048766 23.72359),POLYGON((90.4048766 23.72359,90.4048648 23.7234267,90.4049919 23.7234214,90.4048766 23.72359)))";
	
		//Geometry geom = WktToGeometry.wktToGeometry(multiPolygonCoordinate);
		
		List<GeometryGisInfo> addGeometryGisInfos = new ArrayList<GeometryGisInfo>();
		
		GeometryGisData gdataPoint=new GeometryGisData();
		gdataPoint.setWktToGeometry(pointCoordinate);
		
		GeometryGisData gdataLine=new GeometryGisData();
		gdataLine.setWktToGeometry(lineStringCoordinate);
		
		GeometryGisData gdataMultiLine=new GeometryGisData();
		gdataMultiLine.setWktToGeometry(multilineStringCoordinate);
		
		
		
		GeometryGisData gdataMultiPolygon=new GeometryGisData();
		gdataMultiPolygon.setWktToGeometry(multiPolygonCoordinate);
	
		
		GeometryGisData gdataGeometryCollection=new GeometryGisData();
		gdataGeometryCollection.setWktToGeometry(geometryCollection);
		
		
		GeometryGisInfo geometryGisInfoPoint=new GeometryGisInfo();
		geometryGisInfoPoint.setGeometryGisData(gdataPoint);
		
		GeometryGisInfo geometryGisInfoLine=new GeometryGisInfo();
		geometryGisInfoLine.setGeometryGisData(gdataLine);
		
		GeometryGisInfo geometryGisInfoMultiLine=new GeometryGisInfo();
		geometryGisInfoMultiLine.setGeometryGisData(gdataMultiLine);
	
		GeometryGisInfo geometryGisInfoMultiPolygon=new GeometryGisInfo();
		geometryGisInfoMultiPolygon.setGeometryGisData(gdataMultiPolygon);
		
		GeometryGisInfo geometryGisInfoGeometryCollection=new GeometryGisInfo();
		geometryGisInfoGeometryCollection.setGeometryGisData(gdataGeometryCollection);
		

		//addGeometryGisInfos.add(geometryGisInfoPoint);
		//addGeometryGisInfos.add(geometryGisInfoLine);
		//addGeometryGisInfos.add(geometryGisInfoMultiLine);
		GeometryGisData gdataPolygon=new GeometryGisData();
		GeometryGisInfo geometryGisInfoPolygon=new GeometryGisInfo();
		PlotInfo plotInfopl = new PlotInfo();
		
		String polygonCoordinate="POLYGON((90.36 23.82,90.3644886 23.8228789,90.3623213 23.8227219,90.3623103 23.8237719,90.36 23.82))";
		
		String polygonCoordinate1="POLYGON((90.3649852 23.8232855,90.3649852 23.8232855,90.3649852 23.8232855,90.3649175 23.8233061,90.3649852 23.8232855))";
		
		String polygonCoordinate2="POLYGON((90.3646018 23.8239791,90.3660448 23.8241642,90.3662838 23.8231102,90.3652508 23.8228932,90.3646018 23.8239791))";
		
		String polygonCoordinate3="POLYGON((90.3664338 23.8244122,90.3666693 23.8244785,90.3672118 23.8231702,90.3670656 23.8231812,90.3664338 23.8244122))";
		String polygonCoordinate4="POLYGON((.............))";
		String polygonCoordinate5="POLYGON((...........))";
		String polygonCoordinate6="POLYGON((......................))";
		String polygonCoordinate7="POLYGON((90.36 23.82,90.3644886 23.8228789,90.3623213 23.8227219,90.3623103 23.8237719,90.36 23.82))";
		String polygonCoordinate8="POLYGON((90.36 23.82,90.3644886 23.8228789,90.3623213 23.8227219,90.3623103 23.8237719,90.36 23.82))";
		String polygonCoordinate9="POLYGON((90.36 23.82,90.3644886 23.8228789,90.3623213 23.8227219,90.3623103 23.8237719,90.36 23.82))";
		String polygonCoordinate10="POLYGON((90.36 23.82,90.3644886 23.8228789,90.3623213 23.8227219,90.3623103 23.8237719,90.36 23.82))";
		
		
			gdataPolygon=new GeometryGisData();
			gdataPolygon.setWktToGeometry(polygonCoordinate3);
			
			geometryGisInfoPolygon=new GeometryGisInfo();
			geometryGisInfoPolygon.setGeometryGisData(gdataPolygon);
			
			 addGeometryGisInfos.add(geometryGisInfoPolygon);
			 
			    plotInfopl = new PlotInfo();
				plotInfopl.setPlName("Final Test");
				plotInfopl.setPlType("Govt");
				plotInfopl.setGeometryGisInfos(addGeometryGisInfos);
				
				savePlotInfoTestCase(plotInfopl);
		
		
			
		 
		// addGeometryGisInfos.add(geometryGisInfoMultiPolygon);
		// addGeometryGisInfos.add(geometryGisInfoGeometryCollection);
		
		
		PlotInfo plotInfo = new PlotInfo();
		plotInfo.setPlName("Test");
	
		PlotInfo plotInfomp = new PlotInfo();
		plotInfomp.setPlName("Test");
		
		PlotInfo plotInfols = new PlotInfo();
		plotInfols.setPlName("Test");
		
	
		// savePlotInfoTestCase(plotInfo);
		//savePlotInfoTestCase(plotInfomp);
		//savePlotInfoTestCase(plotInfols);
		
	}

	public void savePlotInfoTestCase(PlotInfo plotInfo) {
		plotInfoService.savePlotInfo(plotInfo);
	}

	*/

}
