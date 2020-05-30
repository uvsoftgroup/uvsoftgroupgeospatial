package uvsoftgroup.uvsoftgroupgeospatial.resource;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import uvsoftgroup.uvsoftgroupgeospatial.model.GeometryGisInfo;
import uvsoftgroup.uvsoftgroupgeospatial.repository.GeometryGisInfoData;
import uvsoftgroup.uvsoftgroupgeospatial.service.GeometryGisInfoService;

@RestController
@RequestMapping(value="/geometrygisinfo")
public class GeometryGisInfoController {
	@Autowired
	private GeometryGisInfoService geometryGisInfoService;
	
	@RequestMapping(value = "/saveGeometryGisInfo", method = RequestMethod.POST)
	public GeometryGisInfo saveGeometryGisInfo(@Valid @RequestBody GeometryGisInfo geometryGisInfo){
		return geometryGisInfoService.saveGeometryGisInfo(geometryGisInfo);
	}
	
	@RequestMapping(value = "/updateGeometryGisInfo", method = RequestMethod.PUT)
	public GeometryGisInfo updateGeometryGisInfo(@Valid @RequestBody GeometryGisInfo geometryGisInfo){
		return geometryGisInfoService.updateGeometryGisInfo(geometryGisInfo);
	}
	
	@RequestMapping(value="deleteGeometryGisInfo/{geoId}",
			method=RequestMethod.DELETE)
	public void deleteGeometryGisInfo(@PathVariable("geoId") Long geoId){
		geometryGisInfoService.deleteGeometryGisInfo(geoId);	
	}
	
	@RequestMapping(value="findByGeometryGisInfo/{geoId}",
			method=RequestMethod.GET)
	public Optional<GeometryGisInfo> findByGeometryGisInfo(@PathVariable("geoId") Long geoId){
		return geometryGisInfoService.findByGeometryGisInfo(geoId);	
	}
	
	@RequestMapping(value = "/getAllGeometryGisInfoWithoutGeo", method = RequestMethod.GET)
	public List<GeometryGisInfoData> getAllGeometryGisInfoWithoutGeo(
			@RequestParam(name = "pageNumber", required = false, defaultValue = "0") int pageNumber,
			@RequestParam(name = "pageSize", required = false, defaultValue = "30") int pageSize) {
		List<GeometryGisInfoData> list =geometryGisInfoService.getAllGeometryGisInfoWithoutGeo(pageNumber, pageSize);
		return list;
	}

	@RequestMapping(value = "/findCounter", method = RequestMethod.GET)
	public long findCounter(
			@RequestParam(name = "pageNumber", required = false, defaultValue = "0") int pageNumber,
			@RequestParam(name = "pageSize", required = false, defaultValue = "30") int pageSize) {
		long counter =geometryGisInfoService.findCounter(pageNumber, pageSize);
		return counter;
	}
	
	
	
}
