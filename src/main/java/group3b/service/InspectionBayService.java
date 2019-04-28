package group3b.service;
import group3b.domain.InspectionBay;

public interface InspectionBayService extends IService<InspectionBay, String>{
    InspectionBay create(InspectionBay inspectionBay);
}
