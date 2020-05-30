package uvsoftgroup.uvsoftgroupgeospatial.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uvsoftgroup.uvsoftgroupgeospatial.model.FloorInfo;
import uvsoftgroup.uvsoftgroupgeospatial.repository.FloorInfoRepositoryCustom;

@Service
public class FloorInfoRepositoryCustomImpl implements FloorInfoRepositoryCustom {
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<FloorInfo> findFloorInfoByFlUseType(Set<String> flUseTypes) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<FloorInfo> query = cb.createQuery(FloorInfo.class);
        Root<FloorInfo> user = query.from(FloorInfo.class);
 
        Path<String> flUseTypePath = user.get("flUseType");
 
        List<Predicate> predicates = new ArrayList<>();
        for (String flUseType : flUseTypes) {
            predicates.add(cb.like(flUseTypePath, flUseType));
        }
        query.select(user)
            .where(cb.or(predicates.toArray(new Predicate[predicates.size()])));
 
        return entityManager.createQuery(query).getResultList();
	}

}
