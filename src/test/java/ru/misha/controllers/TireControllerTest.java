package ru.misha.controllers;

import com.google.common.collect.ImmutableList;
import org.assertj.core.util.IterableUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import ru.misha.models.Tire;
import ru.misha.service.TireService;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TireControllerTest {

    @Mock
    private TireService tireService;
    @InjectMocks
    private TireController controller;

    @Test
    public void getTires() {
        //prepare
        when(tireService.findAll()).thenReturn(ImmutableList.of());

        //testing
        Iterable<Tire> tires = controller.getTires();

        //validate
        verify(tireService).findAll();
        assertTrue(IterableUtil.isNullOrEmpty(tires));
    }
}