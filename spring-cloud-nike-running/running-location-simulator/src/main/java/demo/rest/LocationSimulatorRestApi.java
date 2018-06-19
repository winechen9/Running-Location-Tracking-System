package demo.rest;

import demo.model.SimulatorInitLocation;
import demo.service.GpsSimulatorFactory;
import demo.task.LocationSimulatorInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class LocationSimulatorRestApi {

    @Autowired
    private GpsSimulatorFactory gpsSimulatorFactory;

    @Autowired
    private AsyncTaskExecutor taskExecutor;
    //do async task submission

    private Map<Long, LocationSimulatorInstance> taskFutures = new HashMap<>();

    //1. LoadSimulatorInitLocations
    //2. Transform domain model simulator request to a class that can be executed by task executor
    //3. taskExecutor.submit(simulator);
    //4. simulation starts

    public List<LocationSimulatorInstance> simulation(){
        final SimulatorInitLocation fixture = PathService
    }
}
