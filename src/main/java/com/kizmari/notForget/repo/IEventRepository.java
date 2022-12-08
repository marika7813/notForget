package com.kizmari.notForget.repo;

import com.kizmari.notForget.models.Event;
import org.springframework.data.repository.CrudRepository;

public interface IEventRepository extends CrudRepository <Event, Long>{
}
