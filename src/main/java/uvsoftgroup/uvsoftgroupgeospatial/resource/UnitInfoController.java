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

import uvsoftgroup.uvsoftgroupgeospatial.model.UnitInfo;
import uvsoftgroup.uvsoftgroupgeospatial.repository.UnitInfoData;
import uvsoftgroup.uvsoftgroupgeospatial.service.UnitInfoService;

@RestController
@RequestMapping(value="/unitinfo")
public class UnitInfoController {
	@Autowired
	private UnitInfoService unitInfoService;
	
	@RequestMapping(value = "/saveUnitInfo", method = RequestMethod.POST)
	public UnitInfo saveUnitInfo(@Valid @RequestBody UnitInfo unitInfo){
		return unitInfoService.saveUnitInfo(unitInfo);
	}
	
	@RequestMapping(value = "/updateUnitInfo", method = RequestMethod.PUT)
	public UnitInfo updateUnitInfo(@Valid @RequestBody UnitInfo unitInfo){
		return unitInfoService.updateUnitInfo(unitInfo);
	}
	
	@RequestMapping(value="deleteUnitInfo/{unId}",
			method=RequestMethod.DELETE)
	public void deleteUnitInfo(@PathVariable("unId") Long unId){
		unitInfoService.deleteUnitInfo(unId);	
	}
	
	@RequestMapping(value="findByUnitInfo/{unId}",
			method=RequestMethod.GET)
	public Optional<UnitInfo> findByUnitInfo(@PathVariable("unId") Long unId){
		return unitInfoService.findByUnitInfo(unId);	
	}
	
	@RequestMapping(value = "/getAllUnitInfoWithoutGeo", method = RequestMethod.GET)
	public List<UnitInfoData> getAllUnitInfoWithoutGeo(
			@RequestParam(name = "pageNumber", required = false, defaultValue = "0") int pageNumber,
			@RequestParam(name = "pageSize", required = false, defaultValue = "30") int pageSize) {
		List<UnitInfoData> list =unitInfoService.getAllUnitInfoWithoutGeo(pageNumber, pageSize);
		return list;
	}

	@RequestMapping(value = "/findCounter", method = RequestMethod.GET)
	public long findCounter(
			@RequestParam(name = "pageNumber", required = false, defaultValue = "0") int pageNumber,
			@RequestParam(name = "pageSize", required = false, defaultValue = "30") int pageSize) {
		long counter =unitInfoService.findCounter(pageNumber, pageSize);
		return counter;
	}
	

}
