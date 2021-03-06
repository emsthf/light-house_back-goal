package com.jo.goal.service;

import com.jo.goal.model.Doing;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface DoingService {
    Doing addDoing(Doing doing);
    Doing editDoing(Doing doing);
    List<Doing> getAllDoing();
    Optional<Doing> getDoingById(Long id);
    void delDoing(Long id);
    List<Doing> findAllByGoalId(Long goalId);
    List<Doing> findAllByWeek(int week);
    List<Doing> findAllByWeekAndGoalId(int week, Long goalId);
    Doing findByGoalIdAndCheckDate(Long goalId, LocalDate localDate);
    Long countByWeekAndGoalId(int week, Long goalId);
}
