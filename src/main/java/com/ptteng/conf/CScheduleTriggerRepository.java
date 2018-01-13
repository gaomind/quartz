package com.ptteng.conf;

import com.ptteng.pojo.CScheduleTrigger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ${MIND-ZR} on 2018/1/13.
 */
@Service
public interface CScheduleTriggerRepository  extends JpaRepository {
    List<CScheduleTrigger> queryAll();
}
