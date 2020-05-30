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

import uvsoftgroup.uvsoftgroupgeospatial.model.FloorInfo;
import uvsoftgroup.uvsoftgroupgeospatial.repository.FloorInfoData;
import uvsoftgroup.uvsoftgroupgeospatial.service.FloorInfoService;


@RestController
@RequestMapping(value="/floorinfo")
public class FloorInfoServiceController {
	@Autowired
	private FloorInfoService floorInfoService;
	
	@RequestMapping(value = "/saveFloorInfo", method = RequestMethod.POST)
	public FloorInfo saveFloorInfo(@Valid @RequestBody FloorInfo floorInfo){
		return floorInfoService.saveFloorInfo(floorInfo);
	}
	
	@RequestMapping(value = "/updateFloorInfo", method = RequestMethod.PUT)
	public FloorInfo updateFloorInfo(@Valid @RequestBody FloorInfo floorInfo){
		return floorInfoService.updateFloorInfo(floorInfo);
	}
	
	@RequestMapping(value="deleteFloorInfo/{flId}",
			method=RequestMethod.DELETE)
	public void deleteFloorInfo(@PathVariable("flId") Long flId){
		floorInfoService.deleteFloorInfo(flId);	
	}
	
	@RequestMapping(value="findByFloorInfo/{flId}",
			method=RequestMethod.GET)
	public Optional<FloorInfo> findByFloorInfo(@PathVariable("flId") Long flId){
		return floorInfoService.findByFloorInfo(flId);	
	}
	
	@RequestMapping(value = "/getAllFloorInfoWithoutGeo", method = RequestMethod.GET)
	public List<FloorInfoData> getAllFloorInfoWithoutGeo(
			@RequestParam(name = "pageNumber", required = false, defaultValue = "0") int pageNumber,
			@RequestParam(name = "pageSize", required = false, defaultValue = "30") int pageSize) {
		List<FloorInfoData> list =floorInfoService.getAllFloorInfoWithoutGeo(pageNumber, pageSize);
		return list;
	}

	@RequestMapping(value = "/findCounter", method = RequestMethod.GET)
	public long findCounter(
			@RequestParam(name = "pageNumber", required = false, defaultValue = "0") int pageNumber,
			@RequestParam(name = "pageSize", required = false, defaultValue = "30") int pageSize) {
		long counter =floorInfoService.findCounter(pageNumber, pageSize);
		return counter;
	}	
	
}
