package demo.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Point {
    private Double latitude;
    private Double longitude;
//    private RunnerStatus runnerStatus = RunnerStatus.NONE;
//    private double speed;
//    private double heading;
//    private MedicalInfo medicalInfo;

}
