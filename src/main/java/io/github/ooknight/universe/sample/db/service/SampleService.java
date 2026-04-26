package io.github.ooknight.universe.sample.db.service;

import io.github.ooknight.universe.sample.db.domain.Sample;
import io.github.ooknight.universe.sample.db.domain.SampleView;

import java.util.List;

public interface SampleService {

    void insert(Sample sample);

    void update(Sample sample);

    void update(Long id, String name);

    void merge(Sample sample);

    void insert(List<Sample> samples);

    Sample getEntityById(Long id);

    SampleView getViewById(Long id);

    List<Sample> getEntityList(Long id, String name);

    List<SampleView> getViewList(Long id, String name);

}
