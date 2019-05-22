package group3b.service;
import group3b.domain.InspectionBay;

import java.util.Set;

public interface InspectionBayService extends IService<InspectionBay, String>{
    Set<InspectionBay> getAll();
}
