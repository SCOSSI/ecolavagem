package com.ecolavagem.ecolavagem;

import com.ecolavagem.ecolavagem.model.entity.Localization;
import com.ecolavagem.ecolavagem.service.DistanceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DistanceTest {

    @Test
    public void testDistance() {
        Localization localization1 = new Localization(-30.0115794, -51.14611);
        Localization localization2 = new Localization(-35.0836444, -48.12201);

        Double distance = DistanceService.distance(localization1, localization2);

        assertTrue(distance == 100);

    }

}
