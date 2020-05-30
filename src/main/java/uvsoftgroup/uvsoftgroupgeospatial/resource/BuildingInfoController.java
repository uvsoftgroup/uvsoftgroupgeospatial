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

import uvsoftgroup.uvsoftgroupgeospatial.model.BuildingInfo;
import uvsoftgroup.uvsoftgroupgeospatial.repository.BuildingInfoData;
import uvsoftgroup.uvsoftgroupgeospatial.service.BuildingInfoService;

@RestController
@RequestMapping(value="/buildinginfo")
public class BuildingInfoController {
	@Autowired
	private BuildingInfoService buildingInfoService;
	
	@RequestMapping(value = "/saveBuildingInfo", method = RequestMethod.POST)
	public BuildingInfo saveBuildingInfo(@Valid @RequestBody BuildingInfo buildingInfo){
		return buildingInfoService.saveBuildingInfo(buildingInfo);
	}
	
	@RequestMapping(value = "/updateBuildingInfo", method = RequestMethod.PUT)
	public BuildingInfo updateBuildingInfo(@Valid @RequestBody BuildingInfo buildingInfo){
		return buildingInfoService.updateBuildingInfo(buildingInfo);
	}
	
	@RequestMapping(value="deleteBuildingInfo/{buId}",
			method=RequestMethod.DELETE)
	public void deleteBuildingInfo(@PathVariable("buId") Long buId){
		buildingInfoService.deleteBuildingInfo(buId);	
	}
	
	@RequestMapping(value="findByBuildingInfo/{buId}",
			method=RequestMethod.GET)
	public Optional<BuildingInfo> findByBuildingInfo(@PathVariable("buId") Long buId){
		return buildingInfoService.findByBuildingInfo(buId);	
	}
	
	@RequestMapping(value = "/getAllBuildingInfoWithoutGeo", method = RequestMethod.GET)
	public List<BuildingInfoData> getAllBuildingInfoWithoutGeo(
			@RequestParam(name = "pageNumber", required = false, defaultValue = "0") int pageNumber,
			@RequestParam(name = "pageSize", required = false, defaultValue = "30") int pageSize) {
		List<BuildingInfoData> list =buildingInfoService.getAllBuildingInfoWithoutGeo(pageNumber, pageSize);
		return list;
	}

	@RequestMapping(value = "/findCounter", method = RequestMethod.GET)
	public long findCounter(
			@RequestParam(name = "pageNumber", required = false, defaultValue = "0") int pageNumber,
			@RequestParam(name = "pageSize", required = false, defaultValue = "30") int pageSize) {
		long counter =buildingInfoService.findCounter(pageNumber, pageSize);
		return counter;
	}
	

}
