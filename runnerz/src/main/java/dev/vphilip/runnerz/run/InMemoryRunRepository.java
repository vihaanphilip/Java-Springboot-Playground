package dev.vphilip.runnerz.run;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryRunRepository {

    public static final Logger log = LoggerFactory.getLogger(InMemoryRunRepository.class);
    private final List<Run> runs = new ArrayList<>();


    List<Run> findAll(){
        return runs;
    }

//    public Optional<Run> findById(int id){
//        return runs.stream()
//                .filter(run -> run.id() == id)
//                .findFirst()
//                .orElseThrow(RunNotFoundException::new);
//    }

    void create(Run run){
        Run newRun = new Run(
                runs.size() + 1,
                run.title(),
                run.startedOn(),
                run.completedOn(),
                run.miles(),
                run.location(),
                null
        );

        runs.add(newRun);
    };
//
//    void update(Run run, Integer id){
//        Optional<Run> existingRun = findById(id);
//        existingRun.ifPresent(value -> runs.set(runs.indexOf(value), run));
//    };
//
//    void delete(Integer id){
//        runs.removeIf(run -> run.id().equals(id));
//    };
//
//
//    @PostConstruct
//    private void init(){
//        runs.add(new Run(1,
//                "Monday Morning Run",
//                LocalDateTime.now(),
//                LocalDateTime.now().plus(30, ChronoUnit.MINUTES),
//                5,
//                Location.OUTDOOR)
//        );
//
//        runs.add(new Run(2,
//                "Wednesday Morning Run",
//                LocalDateTime.now(),
//                LocalDateTime.now().plus(60, ChronoUnit.MINUTES),
//                10,
//                Location.INDOOR)
//        );
//    }


}
