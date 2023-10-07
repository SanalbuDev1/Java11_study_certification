package com.capacitacion;

import modulo6.Building;
import modulo6.Elevator;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.mockito.Mockito.*;

public class BuildingTest {

    Building building;

    @Mock
    Random random;

    @BeforeEach
    public void setUp() {
        building = new Building();
        MockitoAnnotations.openMocks(this); // Initialize the mocks for this test class
        building.setRandom(random);

    }

    @Test
    public void addElevators(){

        List<Elevator> existingElevators = new ArrayList<>();
        existingElevators.add(new Elevator(1, 5));
        existingElevators.add(new Elevator(2, 7));
        building.setListElevators(existingElevators);

        // Mocking Random.nextInt(10) to return a specific value (e.g., 3)
        when(random.nextInt(10)).thenReturn(3);

        building.addElevators();
        building.addElevators();

        Assertions.assertEquals(4,building.getListElevators().size());

    }

}
